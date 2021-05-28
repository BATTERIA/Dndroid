package com.bilibili.bililive.batteria;

import a.g;
import a.w.c.i;
import android.app.Application;
import android.util.Log;
import e.e.a.a0.e;
import e.e.a.g;

@g(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/bilibili/bililive/batteria/MainApplication;", "Landroid/app/Application;", "()V", "onCreate", "", "app_release"}, mv = {1, 1, 16})
public final class MainApplication extends Application {

    public static final class a implements e {

        /* renamed from: a  reason: collision with root package name */
        public static final a f2592a = new a();

        @Override // e.e.a.a0.e
        public final void a(int i, String str) {
            if (str != null) {
                Log.d("HummerJS", str);
            } else {
                i.a("msg");
                throw null;
            }
        }
    }

    public static final class b implements e.e.a.q.c.a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f2593a = new b();

        @Override // e.e.a.q.c.a
        public final void a(Exception exc) {
            Log.e("HummerException", "Hummer Exception", exc);
        }
    }

    public void onCreate() {
        super.onCreate();
        g.b bVar = new g.b();
        bVar.a(a.f2592a);
        bVar.a(b.f2593a);
        e.e.a.e.a(this, bVar.a());
    }
}
