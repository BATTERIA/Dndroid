package d.b.l.a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import d.b.o.i;
import java.util.WeakHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f2715a = new ThreadLocal<>();
    public static final WeakHashMap<Context, SparseArray<C0087a>> b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f2716c = new Object();

    /* renamed from: d.b.l.a.a$a  reason: collision with other inner class name */
    public static class C0087a {

        /* renamed from: a  reason: collision with root package name */
        public final ColorStateList f2717a;
        public final Configuration b;

        public C0087a(ColorStateList colorStateList, Configuration configuration) {
            this.f2717a = colorStateList;
            this.b = configuration;
        }
    }

    public static ColorStateList a(Context context, int i) {
        C0087a aVar;
        synchronized (f2716c) {
            SparseArray<C0087a> sparseArray = b.get(context);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (aVar = sparseArray.get(i)) == null)) {
                if (aVar.b.equals(context.getResources().getConfiguration())) {
                    return aVar.f2717a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    public static void a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f2716c) {
            SparseArray<C0087a> sparseArray = b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0087a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b A[Catch:{ Exception -> 0x0068 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0060 A[Catch:{ Exception -> 0x0068 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList b(android.content.Context r8, int r9) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.l.a.a.b(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static Drawable c(Context context, int i) {
        return i.a().c(context, i);
    }
}
