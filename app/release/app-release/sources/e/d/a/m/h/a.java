package e.d.a.m.h;

import android.content.res.AssetManager;
import android.util.Log;
import e.d.a.g;
import java.io.IOException;

public abstract class a<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f3941a;
    public final AssetManager b;

    /* renamed from: c  reason: collision with root package name */
    public T f3942c;

    public a(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.f3941a = str;
    }

    public abstract T a(AssetManager assetManager, String str);

    @Override // e.d.a.m.h.c
    public T a(g gVar) {
        T a2 = a(this.b, this.f3941a);
        this.f3942c = a2;
        return a2;
    }

    @Override // e.d.a.m.h.c
    public String a() {
        return this.f3941a;
    }

    public abstract void a(T t);

    @Override // e.d.a.m.h.c
    public void b() {
        T t = this.f3942c;
        if (t != null) {
            try {
                a((Object) t);
            } catch (IOException e2) {
                if (Log.isLoggable("AssetUriFetcher", 2)) {
                    Log.v("AssetUriFetcher", "Failed to close data", e2);
                }
            }
        }
    }

    @Override // e.d.a.m.h.c
    public void cancel() {
    }
}
