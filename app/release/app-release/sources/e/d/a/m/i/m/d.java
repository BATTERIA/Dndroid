package e.d.a.m.i.m;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class d implements b {
    public static final Bitmap.Config j = Bitmap.Config.ARGB_8888;

    /* renamed from: a  reason: collision with root package name */
    public final e f4013a;
    public final Set<Bitmap.Config> b;

    /* renamed from: c  reason: collision with root package name */
    public final b f4014c = new c(null);

    /* renamed from: d  reason: collision with root package name */
    public int f4015d;

    /* renamed from: e  reason: collision with root package name */
    public int f4016e;

    /* renamed from: f  reason: collision with root package name */
    public int f4017f;

    /* renamed from: g  reason: collision with root package name */
    public int f4018g;

    /* renamed from: h  reason: collision with root package name */
    public int f4019h;
    public int i;

    public interface b {
    }

    public static class c implements b {
        public c() {
        }

        public /* synthetic */ c(a aVar) {
        }
    }

    public d(int i2) {
        g gVar = new g();
        HashSet hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f4015d = i2;
        this.f4013a = gVar;
        this.b = unmodifiableSet;
    }

    @Override // e.d.a.m.i.m.b
    public synchronized Bitmap a(int i2, int i3, Bitmap.Config config) {
        Bitmap b2;
        b2 = b(i2, i3, config);
        if (b2 != null) {
            b2.eraseColor(0);
        }
        return b2;
    }

    @Override // e.d.a.m.i.m.b
    public void a() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        b(0);
    }

    @Override // e.d.a.m.i.m.b
    public synchronized boolean a(Bitmap bitmap) {
        if (bitmap != null) {
            if (bitmap.isMutable() && this.f4013a.b(bitmap) <= this.f4015d) {
                if (this.b.contains(bitmap.getConfig())) {
                    int b2 = this.f4013a.b(bitmap);
                    this.f4013a.a(bitmap);
                    if (((c) this.f4014c) != null) {
                        this.f4019h++;
                        this.f4016e += b2;
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f4013a.c(bitmap));
                        }
                        b();
                        b(this.f4015d);
                        return true;
                    }
                    throw null;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f4013a.c(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.b.contains(bitmap.getConfig()));
            }
            return false;
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    @Override // e.d.a.m.i.m.b
    @TargetApi(12)
    public synchronized Bitmap b(int i2, int i3, Bitmap.Config config) {
        Bitmap a2;
        a2 = this.f4013a.a(i2, i3, config != null ? config : j);
        if (a2 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f4013a.b(i2, i3, config));
            }
            this.f4018g++;
        } else {
            this.f4017f++;
            this.f4016e -= this.f4013a.b(a2);
            if (((c) this.f4014c) != null) {
                a2.setHasAlpha(true);
            } else {
                throw null;
            }
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f4013a.b(i2, i3, config));
        }
        b();
        return a2;
    }

    public final void b() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            c();
        }
    }

    public final void c() {
        StringBuilder a2 = e.a.a.a.a.a("Hits=");
        a2.append(this.f4017f);
        a2.append(", misses=");
        a2.append(this.f4018g);
        a2.append(", puts=");
        a2.append(this.f4019h);
        a2.append(", evictions=");
        a2.append(this.i);
        a2.append(", currentSize=");
        a2.append(this.f4016e);
        a2.append(", maxSize=");
        a2.append(this.f4015d);
        a2.append("\nStrategy=");
        a2.append(this.f4013a);
        Log.v("LruBitmapPool", a2.toString());
    }

    public final synchronized void b(int i2) {
        while (this.f4016e > i2) {
            Bitmap a2 = this.f4013a.a();
            if (a2 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    c();
                }
                this.f4016e = 0;
                return;
            } else if (((c) this.f4014c) != null) {
                this.f4016e -= this.f4013a.b(a2);
                a2.recycle();
                this.i++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.f4013a.c(a2));
                }
                b();
            } else {
                throw null;
            }
        }
    }

    @Override // e.d.a.m.i.m.b
    @SuppressLint({"InlinedApi"})
    public void a(int i2) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i2);
        }
        if (i2 >= 60) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "clearMemory");
            }
            b(0);
        } else if (i2 >= 40) {
            b(this.f4015d / 2);
        }
    }
}
