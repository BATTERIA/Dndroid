package e.d.a.m.h;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;

public abstract class g<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f3949a;
    public final Context b;

    /* renamed from: c  reason: collision with root package name */
    public T f3950c;

    public g(Context context, Uri uri) {
        this.b = context.getApplicationContext();
        this.f3949a = uri;
    }

    public abstract T a(Uri uri, ContentResolver contentResolver);

    @Override // e.d.a.m.h.c
    public final T a(e.d.a.g gVar) {
        T a2 = a(this.f3949a, this.b.getContentResolver());
        this.f3950c = a2;
        return a2;
    }

    @Override // e.d.a.m.h.c
    public String a() {
        return this.f3949a.toString();
    }

    public abstract void a(T t);

    @Override // e.d.a.m.h.c
    public void b() {
        T t = this.f3950c;
        if (t != null) {
            try {
                a((Object) t);
            } catch (IOException e2) {
                if (Log.isLoggable("LocalUriFetcher", 2)) {
                    Log.v("LocalUriFetcher", "failed to close data", e2);
                }
            }
        }
    }

    @Override // e.d.a.m.h.c
    public void cancel() {
    }
}
