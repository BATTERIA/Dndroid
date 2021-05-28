package e.e.a.o.n;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

public class b {
    public static final String[] b = {"", "_bold", "_italic", "_bold_italic"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f4414c = {".ttf", ".otf"};

    /* renamed from: d  reason: collision with root package name */
    public static b f4415d;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, C0136b> f4416a = new HashMap();

    /* renamed from: e.e.a.o.n.b$b  reason: collision with other inner class name */
    public static class C0136b {

        /* renamed from: a  reason: collision with root package name */
        public SparseArray<Typeface> f4417a = new SparseArray<>(4);

        public C0136b() {
        }

        public /* synthetic */ C0136b(a aVar) {
        }
    }

    public static b a() {
        if (f4415d == null) {
            f4415d = new b();
        }
        return f4415d;
    }

    public Typeface a(String str, int i, AssetManager assetManager) {
        C0136b bVar = this.f4416a.get(str);
        Typeface typeface = null;
        if (bVar == null) {
            bVar = new C0136b(null);
            this.f4416a.put(str, bVar);
        }
        Typeface typeface2 = bVar.f4417a.get(i);
        if (typeface2 != null) {
            return typeface2;
        }
        String str2 = b[i];
        String[] strArr = f4414c;
        for (String str3 : strArr) {
            try {
                typeface = Typeface.createFromAsset(assetManager, "fonts/" + str + str2 + str3);
                break;
            } catch (RuntimeException unused) {
            }
        }
        if (typeface != null) {
            bVar.f4417a.put(i, typeface);
        }
        return typeface;
    }
}
