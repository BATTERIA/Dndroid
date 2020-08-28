/*
 * Copyright (c) 2015-2016 BiliBili Inc.
 */

package com.bilibili.base.connectivity;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.UiThread;

//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.annotation.UiThread;

import com.bilibili.droid.thread.HandlerThreads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * <p>ThreadSafe.</p>
 * <p>网络连接状态监控器。</p>
 * <p>产品层面上，关于各种网络类型的定义和称呼：</br>
 * 当前认为Ethernet和wifi网络连接都是免费连接，因此都定义为产品需求意义上的wifi连接；
 * 当前认为所有mobile网络连接都是收费连接，因此都定义为产品需求意义上的mobile连接；
 * 当前认为除了Ethernet、wifi和mobile之外的网络连接，都无法访问外网，因此都定义为产品需求意义上
 * 的无连接。</p>
 */
@SuppressWarnings({"unused", "WeakerAccess"})
@SuppressLint("MissingPermission")
public final class ConnectivityMonitor {
    private static final String TAG = "ConnectivityMonitor";

    // net define ----------------------------------------------------------------------------------
    public static final int NET_WIFI            = 1;
    public static final int NET_MOBILE          = 2;
    public static final int NET_NO_CONNECTIVITY = 3;
    public static final int NET_OTHER           = 4;
    public static final int NET_ETHERNET        = 5;

    public static final int NET_MOBILE_2G          = 22;
    public static final int NET_MOBILE_3G          = 32;
    public static final int NET_MOBILE_4G          = 42;
    public static final int NET_MOBILE_5G          = 52;

    IntentFilter mIntentFilter;
    BroadcastReceiver mBroadcastReceiver;
    Context mContext;

    // Guard by ConnectivityMonitor.class ----------------------------------------------------------
    private int    mNetwork = NET_NO_CONNECTIVITY;
    private String mType;
    private String mSubtype;
    private String mSpeedDesc;
    private int    mNetworkDetail = NET_NO_CONNECTIVITY;
    private long   mCachedTime = 0;

    private int mLastNetwork = NET_NO_CONNECTIVITY;
    private NetworkInfo mRaw = null;

    @SuppressWarnings("NullAway")
    private ConnectivityMonitor() {
        this.mIntentFilter = new IntentFilter();
        this.mIntentFilter.setPriority(IntentFilter.SYSTEM_HIGH_PRIORITY - 10);
        this.mIntentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
    }

    @SuppressLint("StaticFieldLeak")
    private static volatile
    ConnectivityMonitor INSTANCE;

    public static ConnectivityMonitor getInstance() {
        if (null == INSTANCE) {
            synchronized (ConnectivityMonitor.class) {
                if (null == INSTANCE) {
                    INSTANCE = new ConnectivityMonitor();
                }
            }
        }
        return INSTANCE;
    }

    public void startup(Context context) {
        mContext = context.getApplicationContext();
        updateNetworkInfo();
        mBroadcastReceiver = new MyBroadcastReceiver();
        mContext.registerReceiver(mBroadcastReceiver, mIntentFilter);
    }

    public void teardown() {
        if (null == mContext || null == mBroadcastReceiver)
            return;

        try {
            mContext.unregisterReceiver(mBroadcastReceiver);
        } catch (Exception e) {
        }

        mContext = null;
        mBroadcastReceiver = null;
        mIntentFilter = null;
    }

    public String getSpeedDesc() {
        refreshIfNeed();
        synchronized (ConnectivityMonitor.class) {
            return mSpeedDesc;
        }
    }

    public String getTypeString() {
        refreshIfNeed();
        synchronized (ConnectivityMonitor.class) {
            return mType;
        }
    }

    public String getSubtypeString() {
        refreshIfNeed();
        synchronized (ConnectivityMonitor.class) {
            return mSubtype;
        }
    }

    private void refreshIfNeed() {
        if (SystemClock.elapsedRealtime() - mCachedTime < 1000) {
            return;
        }
        fillNetworkInfo();
    }
    private void updateNetworkInfo() {
        if (null == mContext) {
            resetNetworkInfo();
            return;
        }

        fillNetworkInfo();
    }

    private void resetNetworkInfo() {
        synchronized (ConnectivityMonitor.class) {
            mCachedTime = 0;
            mNetwork = NET_NO_CONNECTIVITY;
            mType = "";
            mSubtype = "";
            mSpeedDesc = "";

            mLastNetwork = NET_NO_CONNECTIVITY;
            mRaw = null;
        }
    }

    private void setActiveNetworkInfo(NetworkInfo info) {
        int network;
        if (info == null || !Connectivity.isConnected(info)) {
            network = NET_NO_CONNECTIVITY;
        } else if (Connectivity.isConnectedWifi(info)) {
            network = NET_WIFI;
        } else if (Connectivity.isConnectedMobile(info)) {
            network = NET_MOBILE;
        } else if (Connectivity.isConnectedEthernet(info)) {
            network = NET_ETHERNET;
        } else {
            network = NET_OTHER;
        }
        // update time as 'network' set
        mCachedTime = SystemClock.elapsedRealtime();
        if (mNetwork == network) {
            return;
        }
        synchronized (ConnectivityMonitor.class) {
            if (mNetwork == network) {
                return;
            }
            String type = info == null ? "" : info.getTypeName();
            String subtype = info == null ? "" : info.getSubtypeName();
            String speed = info == null ? "" : Connectivity.getNetworkSpeed(info.getType(), info.getSubtype());
            int networkDetail = info == null ? NET_OTHER : Connectivity.getNetworkDetail(info.getType(), info.getSubtype());
            mLastNetwork = mNetwork;
            mNetwork = network;
            mType = type;
            mSubtype = subtype;
            mSpeedDesc = speed;
            mNetworkDetail = networkDetail;
            mRaw = info;
            notifyChanged();
        }
    }
    @SuppressWarnings("NullAway")
    private void fillNetworkInfo() {
        NetworkInfo networkInfo = Connectivity.getActiveNetworkInfo(mContext);
        setActiveNetworkInfo(networkInfo);
    }

    public int getNetwork() {
        refreshIfNeed();
        synchronized (ConnectivityMonitor.class) {
            return mNetwork;
        }
    }

    public int getNetworkWithoutCache() {
        fillNetworkInfo();
        return mNetwork;
    }

    public int getNetworkDetail() {
        refreshIfNeed();
        synchronized (ConnectivityMonitor.class) {
            return mNetworkDetail;
        }
    }

    public boolean isWifiActive() {
        refreshIfNeed();
        synchronized (ConnectivityMonitor.class) {
            return NET_WIFI == mNetwork;
        }
    }

    public boolean isMobileActive() {
        refreshIfNeed();
        synchronized (ConnectivityMonitor.class) {
            return NET_MOBILE == mNetwork;
        }
    }

    public boolean isNetworkActive() {
        refreshIfNeed();
        synchronized (ConnectivityMonitor.class) {
            return NET_WIFI == mNetwork || NET_MOBILE == mNetwork || NET_ETHERNET == mNetwork;
        }
    }

    private final class MyBroadcastReceiver extends BroadcastReceiver {
        final Runnable mAction = new Runnable() {
            @Override
            public void run() {
                updateNetworkInfo();
            }
        };
        @Override
        public void onReceive(Context context, Intent intent) {
            HandlerThreads.post(HandlerThreads.THREAD_BACKGROUND, mAction);
        }
    }

    private final List<OnNetworkChangedListener> mListeners
            = Collections.synchronizedList(new ArrayList<OnNetworkChangedListener>(4));

    public void register(OnNetworkChangedListener listener) {
        synchronized (mListeners) {
            if (mListeners.contains(listener)) {
                throw new IllegalStateException("already exists");
            }
            mListeners.add(listener);
        }
    }

    /**
     * since 5.52
     */
    public boolean hasListener(@NonNull OnNetworkChangedListener listener) {
        synchronized (mListeners) {
            return mListeners.contains(listener);
        }
    }

    public void unregister(OnNetworkChangedListener listener) {
        synchronized (mListeners) {
            if (mListeners.isEmpty()) {
                return;
            }
            mListeners.remove(listener);
        }
    }

    private void notifyChanged() {
        synchronized (mListeners) {
            if (mListeners.isEmpty()) {
                return;
            }
        }
        synchronized (mListeners) {
            final int net = mNetwork;
            for (OnNetworkChangedListener listener : mListeners) {
                // wtf!?
                if (listener != null) {
                    HandlerThreads.post(HandlerThreads.THREAD_UI, new Notify(listener, net, mLastNetwork, mRaw));
                }
            }
        }
    }

    private static class Notify implements Runnable {
        OnNetworkChangedListener listener;
        int net;
        int lastNet;
        @Nullable
        NetworkInfo raw;

        Notify(OnNetworkChangedListener listener, int net, int lastNet, @Nullable NetworkInfo raw) {
            this.listener = listener;
            this.net = net;
            this.lastNet = lastNet;
            this.raw = raw;
        }

        @Override
        public void run() {
            listener.onChanged(net);
            listener.onChanged(net, lastNet, raw);
        }
    }

    public interface OnNetworkChangedListener {
        /**
         * receive networkchanged event on UI thread
         *
         * @param net {@link #NET_WIFI}, {@link #NET_NO_CONNECTIVITY}...
         */
        @UiThread
        @Deprecated
        void onChanged(int net);

        /**
         * Open raw info
         */
        @RequiresApi(api = Build.VERSION_CODES.N)
        @UiThread
        default void onChanged(int newNet, int preNet, @Nullable NetworkInfo details) {
        }
    }
}
