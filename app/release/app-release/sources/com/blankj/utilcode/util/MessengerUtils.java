package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class MessengerUtils {

    /* renamed from: a  reason: collision with root package name */
    public static ConcurrentHashMap<String, a> f2611a = new ConcurrentHashMap<>();

    public static class ServerService extends Service {

        /* renamed from: c  reason: collision with root package name */
        public final ConcurrentHashMap<Integer, Messenger> f2612c = new ConcurrentHashMap<>();
        @SuppressLint({"HandlerLeak"})

        /* renamed from: d  reason: collision with root package name */
        public final Handler f2613d = new a();

        /* renamed from: e  reason: collision with root package name */
        public final Messenger f2614e = new Messenger(this.f2613d);

        public class a extends Handler {
            public a() {
            }

            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 0) {
                    ServerService.this.f2612c.put(Integer.valueOf(message.arg1), message.replyTo);
                } else if (i == 1) {
                    ServerService.this.f2612c.remove(Integer.valueOf(message.arg1));
                } else if (i != 2) {
                    super.handleMessage(message);
                } else {
                    ServerService.this.b(message);
                    ServerService.this.a(message);
                }
            }
        }

        public final void a(Message message) {
            String string;
            a aVar;
            Bundle data = message.getData();
            if (data != null && (string = data.getString("MESSENGER_UTILS")) != null && (aVar = MessengerUtils.f2611a.get(string)) != null) {
                aVar.a(data);
            }
        }

        public final void b(Message message) {
            for (Messenger messenger : this.f2612c.values()) {
                if (messenger != null) {
                    try {
                        messenger.send(message);
                    } catch (RemoteException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }

        public IBinder onBind(Intent intent) {
            return this.f2614e.getBinder();
        }

        public int onStartCommand(Intent intent, int i, int i2) {
            Bundle extras;
            if (!(intent == null || (extras = intent.getExtras()) == null)) {
                Message obtain = Message.obtain(this.f2613d, 2);
                obtain.replyTo = this.f2614e;
                obtain.setData(extras);
                b(obtain);
                a(obtain);
            }
            return 2;
        }
    }

    public interface a {
        void a(Bundle bundle);
    }

    static {
        new HashMap();
    }
}
