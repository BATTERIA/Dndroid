package e.f.a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;

public class b extends m {

    /* renamed from: a  reason: collision with root package name */
    public Context f4620a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public c f4621c;

    public b(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        this.f4620a = applicationContext;
        if (applicationContext == null) {
            Log.w("SoLoader", "context.getApplicationContext returned null, holding reference to original context.");
            this.f4620a = context;
        }
        this.b = i;
        this.f4621c = new c(new File(this.f4620a.getApplicationInfo().nativeLibraryDir), i);
    }

    public static File a(Context context) {
        return new File(context.getApplicationInfo().nativeLibraryDir);
    }

    @Override // e.f.a.m
    public int a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return this.f4621c.a(str, i, threadPolicy);
    }

    @Override // e.f.a.m
    public void a(int i) {
        this.f4621c.a(i);
    }

    public boolean a() {
        File file = this.f4621c.f4622a;
        Context b2 = b();
        File a2 = a(b2);
        if (file.equals(a2)) {
            return false;
        }
        Log.d("SoLoader", "Native library directory updated from " + file + " to " + a2);
        int i = this.b | 1;
        this.b = i;
        this.f4621c = new c(a2, i);
        this.f4620a = b2;
        return true;
    }

    public Context b() {
        try {
            return this.f4620a.createPackageContext(this.f4620a.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // e.f.a.m
    public String toString() {
        return this.f4621c.toString();
    }
}
