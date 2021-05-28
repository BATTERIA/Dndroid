package e.b.a.a.f.d;

import a.g;
import a.w.c.i;
import android.graphics.Bitmap;
import android.util.Log;
import android.util.LruCache;

@g(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bilibili/bililive/batteria/imageloader/cache/MemoryCache;", "Lcom/bilibili/bililive/batteria/imageloader/cache/ImageCache;", "()V", "cache", "Landroid/util/LruCache;", "", "Landroid/graphics/Bitmap;", "get", "url", "put", "", "bitmap", "Companion", "app_release"}, mv = {1, 1, 16})
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public final LruCache<String, Bitmap> f3754a;

    public static final class a extends LruCache<String, Bitmap> {
        public a(int i, int i2) {
            super(i2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.LruCache
        public int sizeOf(String str, Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            return (bitmap2 != null ? bitmap2.getAllocationByteCount() : 0) / 1024;
        }
    }

    public d() {
        int maxMemory = (int) (Runtime.getRuntime().maxMemory() / ((long) 1024));
        this.f3754a = new a(maxMemory, maxMemory);
    }

    @Override // e.b.a.a.f.d.c
    public Bitmap a(String str) {
        if (str != null) {
            Bitmap bitmap = this.f3754a.get(str);
            if (bitmap != null) {
                Log.d("MemoryCache", "got bitmap from memory cache");
            }
            return bitmap;
        }
        i.a("url");
        throw null;
    }

    @Override // e.b.a.a.f.d.c
    public void a(String str, Bitmap bitmap) {
        if (str == null) {
            i.a("url");
            throw null;
        } else if (bitmap != null) {
            this.f3754a.put(str, bitmap);
        } else {
            i.a("bitmap");
            throw null;
        }
    }
}
