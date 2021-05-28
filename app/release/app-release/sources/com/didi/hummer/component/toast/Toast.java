package com.didi.hummer.component.toast;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.didi.hummer.annotation.Component;
import com.didi.hummer.annotation.JsMethod;
import e.e.a.k;
import e.e.a.y.a.b.j;
import java.lang.reflect.Field;

@Component
public class Toast {

    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public Handler f2634a;

        public a(Handler handler) {
            this.f2634a = handler;
        }

        public void dispatchMessage(Message message) {
            try {
                this.f2634a.dispatchMessage(message);
            } catch (Exception unused) {
            }
        }

        public void handleMessage(Message message) {
            this.f2634a.handleMessage(message);
        }
    }

    @JsMethod
    public static void custom(j jVar, int i) {
        android.widget.Toast toast = new android.widget.Toast(k.f4312a);
        hook(toast);
        toast.setDuration(i <= 2000 ? 0 : 1);
        toast.setView(jVar.getView());
        toast.show();
    }

    public static void hook(android.widget.Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                Field declaredField = Toast.class.getDeclaredField("mTN");
                declaredField.setAccessible(true);
                Field declaredField2 = declaredField.getType().getDeclaredField("mHandler");
                declaredField2.setAccessible(true);
                Object obj = declaredField.get(toast);
                declaredField2.set(obj, new a((Handler) declaredField2.get(obj)));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @JsMethod
    public static void show(String str, int i) {
        android.widget.Toast makeText = android.widget.Toast.makeText(k.f4312a, str, i <= 2000 ? 0 : 1);
        hook(makeText);
        makeText.show();
    }
}
