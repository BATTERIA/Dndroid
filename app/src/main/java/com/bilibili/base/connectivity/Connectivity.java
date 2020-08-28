/*
 * Copyright (c) 2015-2016 BiliBili Inc.
 */

package com.bilibili.base.connectivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.Nullable;
import android.telephony.TelephonyManager;


/**
 * <p>ThreadSafe.</p>
 * <p>网络连接相关的定义和帮助函数。</p>
 */
public class Connectivity {
    private static final String TAG = "Connectivity";

    // 各种网络非主类型之外的类型 ---------------------------------------------------
    private static final int[] s_WifiSecondaryTypes = {
//            ConnectivityManager.TYPE_WIFI_P2P,
    };
    private static final int[] s_MobileSecondaryTypes = {
            ConnectivityManager.TYPE_MOBILE_MMS,
            ConnectivityManager.TYPE_MOBILE_SUPL,
            ConnectivityManager.TYPE_MOBILE_DUN,
            ConnectivityManager.TYPE_MOBILE_HIPRI,
//            ConnectivityManager.TYPE_MOBILE_FOTA,
//            ConnectivityManager.TYPE_MOBILE_IMS,
//            ConnectivityManager.TYPE_MOBILE_CBS
    };

    // TelephonyManager.NETWORK_TYPE_XXX 网速定义 -------------------------------
    private static final TelephonyTypeDefine[] s_TelephonyTypeDefines = {
            new TelephonyTypeDefine(TelephonyManager.NETWORK_TYPE_UNKNOWN,
                    false, "Unknown", ConnectivityMonitor.NET_OTHER),
            new TelephonyTypeDefine(TelephonyManager.NETWORK_TYPE_GPRS,
                    false, "0 ~ 100 kbps", ConnectivityMonitor.NET_MOBILE_2G),
            new TelephonyTypeDefine(TelephonyManager.NETWORK_TYPE_EDGE,
                    false, "0 ~ 50-100 kbps", ConnectivityMonitor.NET_MOBILE_2G),
            new TelephonyTypeDefine(TelephonyManager.NETWORK_TYPE_UMTS,
                    true, "0 ~ 400-7000 kbps", ConnectivityMonitor.NET_MOBILE_3G),
            new TelephonyTypeDefine(TelephonyManager.NETWORK_TYPE_CDMA,
                    false, "0 ~ 14-64 kbps", ConnectivityMonitor.NET_MOBILE_2G),
            new TelephonyTypeDefine(TelephonyManager.NETWORK_TYPE_EVDO_0,
                    true, "0 ~ 400-1000 kbps", ConnectivityMonitor.NET_MOBILE_3G),
            new TelephonyTypeDefine(TelephonyManager.NETWORK_TYPE_EVDO_A,
                    true, "0 ~ 600-1400 kbps", ConnectivityMonitor.NET_MOBILE_3G),
            new TelephonyTypeDefine(TelephonyManager.NETWORK_TYPE_1xRTT,
                    false, "0 ~ 50 - 100 kbps", ConnectivityMonitor.NET_MOBILE_2G),
            new TelephonyTypeDefine(TelephonyManager.NETWORK_TYPE_HSDPA,
                    true, "0 ~ 2-14 Mbps", ConnectivityMonitor.NET_MOBILE_3G),
            new TelephonyTypeDefine(TelephonyManager.NETWORK_TYPE_HSUPA,
                    true, "0 ~ 1-23 Mbps", ConnectivityMonitor.NET_MOBILE_3G),
            new TelephonyTypeDefine(TelephonyManager.NETWORK_TYPE_HSPA,
                    true, "0 ~ 700-1700 kbps", ConnectivityMonitor.NET_MOBILE_3G),
            // API level 8
            new TelephonyTypeDefine(TelephonyManager.NETWORK_TYPE_IDEN,
                    false, "0 ~ 25 kbps", ConnectivityMonitor.NET_MOBILE_2G),
            // API level 9
            new TelephonyTypeDefine(TelephonyManager.NETWORK_TYPE_EVDO_B,
                    true, "0 ~ 5 Mbps", ConnectivityMonitor.NET_MOBILE_3G),
            // API level 11
            new TelephonyTypeDefine(TelephonyManager.NETWORK_TYPE_LTE,
                    true, "0 ~ 10+ Mbps", ConnectivityMonitor.NET_MOBILE_4G),
            new TelephonyTypeDefine(TelephonyManager.NETWORK_TYPE_EHRPD,
                    true, "0 ~ 1-2 Mbps", ConnectivityMonitor.NET_MOBILE_3G),
            // API level 13
            new TelephonyTypeDefine(TelephonyManager.NETWORK_TYPE_HSPAP,
                    true, "0 ~ 10-20 Mbps", ConnectivityMonitor.NET_MOBILE_3G),
            // API level 29 5G
            new TelephonyTypeDefine(20, // TelephonyManager.NETWORK_TYPE_NR
                    true, "0 ~ 10-20 Gbps", ConnectivityMonitor.NET_MOBILE_5G),
    };

    /**
     * 获取网络状态信息
     * @param context
     * @param networkType
     * @return
     */
    @SuppressLint("MissingPermission")
    @Nullable
    public static NetworkInfo getNetworkInfos(Context context,
                                              int networkType) {
        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(
                        Context.CONNECTIVITY_SERVICE);
        try {
            return cm != null ? cm.getNetworkInfo(networkType) : null;
        } catch (Exception e) {
            return null;
        }
    }
    @SuppressLint("MissingPermission")
    @SuppressWarnings("NullAway")
    public static NetworkInfo getActiveNetworkInfo(@Nullable Context context) {

        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(
                    Context.CONNECTIVITY_SERVICE);
            return connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 获取以太网连接状态信息
     * @param context
     * @return
     */
    @Nullable
    public static NetworkInfo getEthernetNetworkInfo(Context context) {
        return getNetworkInfos(context, ConnectivityManager.TYPE_ETHERNET);
    }

    /**
     * 获取wifi连接状态信息
     * @param context
     * @return
     */
    @Nullable
    public static NetworkInfo getWifiNetworkInfo(Context context) {
        return getNetworkInfoFromList(context, ConnectivityManager.TYPE_WIFI,
                s_WifiSecondaryTypes);
    }

    /**
     * 获取mobile连接状态信息
     * @param context
     * @return
     */
    @Nullable
    public static NetworkInfo getMobileNetworkInfo(Context context) {
        return getNetworkInfoFromList(context, ConnectivityManager.TYPE_MOBILE,
                s_MobileSecondaryTypes);
    }

    /**
     * 检查是否有连接
     * @param info
     * @return
     */
    @SuppressWarnings("NullablePrimitive")
    public static boolean isConnected(NetworkInfo info) {
        return null != info && info.isConnected();
    }

    public static boolean isConnectedOrConnecting(NetworkInfo info){
        return null != info && info.isConnectedOrConnecting();
    }

    /**
     * 检查是否是ethernet连接
     * @param info
     * @return
     */
    public static boolean isConnectedEthernet(NetworkInfo info) {
        return null != info
                && info.isConnected()
                && ConnectivityManager.TYPE_ETHERNET == info.getType();
    }

    /**
     * 检查是否是wifi连接
     * @param info
     * @return
     */
    public static boolean isConnectedWifi(NetworkInfo info) {
        return null != info
                && info.isConnected()
                && isNetworkTypeWifi(info.getType());
    }

    /**
     * 检查是否是mobile连接
     * @param info
     * @return
     */
    @SuppressWarnings("NullAway")
    public static boolean isConnectedMobile(NetworkInfo info) {
        return null != info
                && info.isConnected()
                && isNetworkTypeMobile(info.getType());
    }

    /**
     * 检查是否高速网络
     * @param info
     * @return
     */
    public static boolean isConnectedFast(NetworkInfo info) {
        return null != info
                && info.isConnected()
                && Connectivity.isConnectedFast(info.getType(), info.getSubtype());
    }

    public static boolean isConnectedFast(int type, int subtype) {
        switch (type) {
            case ConnectivityManager.TYPE_ETHERNET:
            case ConnectivityManager.TYPE_WIFI:
//            case ConnectivityManager.TYPE_WIFI_P2P:
                return true;
        }

        if (ConnectivityManager.TYPE_MOBILE != type)
            return false;

        for (TelephonyTypeDefine typeDef : s_TelephonyTypeDefines) {
            if (typeDef.networkType != subtype)
                continue;
            return typeDef.fast;
        }
        return false;
    }


    public static boolean isNetworkRoaming(Context context, NetworkInfo activeNetworkInfo) {
        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity == null) {
            return false;
        }

        boolean isMobile = (activeNetworkInfo != null && activeNetworkInfo.getType() == ConnectivityManager.TYPE_MOBILE);
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        if (telephonyManager == null) {
            return false;
        }
        boolean isRoaming = isMobile && telephonyManager.isNetworkRoaming();
        if (isRoaming) {
        }
        return isRoaming;
    }

    /**
     * 获取网络理论速度描述
     * @param type
     * @param subtype
     * @return
     */
    public static String getNetworkSpeed(int type, int subtype) {
        switch (type) {
            case ConnectivityManager.TYPE_ETHERNET:
            case ConnectivityManager.TYPE_WIFI:
//            case ConnectivityManager.TYPE_WIFI_P2P:
                return "Fast";
        }

        if (ConnectivityManager.TYPE_MOBILE != type)
            return "Unknown";

        for (TelephonyTypeDefine typeDef : s_TelephonyTypeDefines) {
            if (typeDef.networkType != subtype)
                continue;
            return typeDef.speedDesc;
        }
        return "Unknown";
    }

    /**
     * 获取网络详细类型
     * @param type
     * @param subtype
     * @return
     */
    public static int getNetworkDetail(int type, int subtype) {
        switch (type) {
            case ConnectivityManager.TYPE_ETHERNET:
                return ConnectivityMonitor.NET_ETHERNET;
            case ConnectivityManager.TYPE_WIFI:
//            case ConnectivityManager.TYPE_WIFI_P2P:
                return ConnectivityMonitor.NET_WIFI;
        }

        if (ConnectivityManager.TYPE_MOBILE != type)
            return ConnectivityMonitor.NET_OTHER;

        for (TelephonyTypeDefine typeDef : s_TelephonyTypeDefines) {
            if (typeDef.networkType != subtype)
                continue;
            return typeDef.networkTypeDetail;
        }
        return ConnectivityMonitor.NET_OTHER;
    }

    /**
     * Checks if a given type uses the cellular data connection.
     * This should be replaced in the future by a network property.
     * @param networkType the type to check
     * @return a boolean - {@code true} if uses cellular network,
     *  else {@code false}
     */
    private static boolean isNetworkTypeMobile(int networkType) {
        switch (networkType) {
            case ConnectivityManager.TYPE_MOBILE:
            case ConnectivityManager.TYPE_MOBILE_MMS:
            case ConnectivityManager.TYPE_MOBILE_SUPL:
            case ConnectivityManager.TYPE_MOBILE_DUN:
            case ConnectivityManager.TYPE_MOBILE_HIPRI:
//            case ConnectivityManager.TYPE_MOBILE_FOTA:
//            case ConnectivityManager.TYPE_MOBILE_IMS:
//            case ConnectivityManager.TYPE_MOBILE_CBS:
                // case ConnectivityManager.TYPE_MOBILE_IA:
                return true;
            default:
                return false;
        }
    }

    /**
     * Checks if the given network type is backed by a Wi-Fi radio.
     */
    private static boolean isNetworkTypeWifi(int networkType) {
        switch (networkType) {
            case ConnectivityManager.TYPE_WIFI:
//            case ConnectivityManager.TYPE_WIFI_P2P:
                return true;
            default:
                return false;
        }
    }
    @SuppressWarnings("NullAway")
    private static NetworkInfo getNetworkInfoFromList(Context context,
                                                      int mainType, int[] secondaryTypes) {
        NetworkInfo mainInfo = getNetworkInfos(context, mainType);
        if (isConnected(mainInfo))
            return mainInfo;

        for (int secondaryType : secondaryTypes) {
            NetworkInfo secondaryInfo = getNetworkInfos(context, secondaryType);
            if (isConnected(secondaryInfo))
                return secondaryInfo;
        }

        return mainInfo;
    }

//    编译不过，看代码没人用
//    /**
//     * 获取网络运营商type
//     * @param context context
//     * @return 运营商type
//     */
//    @SuppressLint("HardwareIds")
//    @SuppressWarnings("NullAway")
//    public static SIMCARD_OPERATE getSIMCardOperateType(Context context) {
//
//        SIMCARD_OPERATE operate = SIMCARD_OPERATE.OPERATE_UNKNOWN;
//        try {
//            String imsi = null;
//            int grant = ContextCompat.checkSelfPermission(context, android.Manifest.permission.READ_PHONE_STATE);
//            if (grant == PackageManager.PERMISSION_GRANTED) {
//                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
//                imsi = telephonyManager != null ? telephonyManager.getSubscriberId() : null;
//            }
//            if (!TextUtils.isEmpty(imsi)) {
//                if (imsi.startsWith("46000") || imsi.startsWith("46002") || imsi.startsWith("46007")) {
//                    operate = SIMCARD_OPERATE.OPERATE_MOBILE;//移动
//                } else if (imsi.startsWith("46001")) {
//                    operate = SIMCARD_OPERATE.OPERATE_UNICOM;//
//                } else if (imsi.startsWith("46003")) {
//                    operate = SIMCARD_OPERATE.OPERATE_TELECOM;
//                }
//            }
//        } catch (Exception ignore) {}
//        return operate;
//    }

    static class TelephonyTypeDefine {
        final int        networkType;
        /** 是否高速网 */
        final boolean    fast;
        /** 理论速度描述信息 */
        final String speedDesc;
        /** 网络详细类型 */
        final int        networkTypeDetail;

        TelephonyTypeDefine(int networkType, boolean fast,
                            String speedDesc, int networkTypeDetail) {
            super();
            this.networkType = networkType;
            this.fast = fast;
            this.speedDesc = speedDesc;
            this.networkTypeDetail = networkTypeDetail;
        }
    }

    /**
     * OPERATE_MOBILE 移动
     * OPERATE_UNICOM 联通
     * OPERATE_TELECOM 电信
     * OPERATE_UNKNOWN 未知
     */
    public enum SIMCARD_OPERATE {
        OPERATE_MOBILE, OPERATE_UNICOM, OPERATE_TELECOM, OPERATE_UNKNOWN
    }

}
