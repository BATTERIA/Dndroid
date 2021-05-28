package d.g.l;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import d.g.l.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class p {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap<View, String> f3345a;
    public static WeakHashMap<View, u> b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Field f3346c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f3347d = false;

    public static class a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f3348a;

        public a(l lVar) {
            this.f3348a = lVar;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return (WindowInsets) y.a(this.f3348a.a(view, y.a(windowInsets)));
        }
    }

    public static abstract class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f3349a;
        public final Class<T> b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3350c;

        public b(int i, Class<T> cls, int i2) {
            this.f3349a = i;
            this.b = cls;
            this.f3350c = i2;
        }

        public b(int i, Class<T> cls, int i2, int i3) {
            this.f3349a = i;
            this.b = cls;
            this.f3350c = i3;
        }

        public abstract T a(View view);

        public T b(View view) {
            if (Build.VERSION.SDK_INT >= this.f3350c) {
                return a(view);
            }
            T t = (T) view.getTag(this.f3349a);
            if (this.b.isInstance(t)) {
                return t;
            }
            return null;
        }
    }

    public interface c {
        boolean a(View view, KeyEvent keyEvent);
    }

    public static class d {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f3351d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        public WeakHashMap<View, Boolean> f3352a = null;
        public SparseArray<WeakReference<View>> b = null;

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<KeyEvent> f3353c = null;

        public static d a(View view) {
            d dVar = (d) view.getTag(d.g.b.tag_unhandled_key_event_manager);
            if (dVar != null) {
                return dVar;
            }
            d dVar2 = new d();
            view.setTag(d.g.b.tag_unhandled_key_event_manager, dVar2);
            return dVar2;
        }

        public final View a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f3352a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View a2 = a(viewGroup.getChildAt(childCount), keyEvent);
                        if (a2 != null) {
                            return a2;
                        }
                    }
                }
                if (b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final void a() {
            WeakHashMap<View, Boolean> weakHashMap = this.f3352a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!f3351d.isEmpty()) {
                synchronized (f3351d) {
                    if (this.f3352a == null) {
                        this.f3352a = new WeakHashMap<>();
                    }
                    for (int size = f3351d.size() - 1; size >= 0; size--) {
                        View view = f3351d.get(size).get();
                        if (view == null) {
                            f3351d.remove(size);
                        } else {
                            this.f3352a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f3352a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        public final boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(d.g.b.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((c) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        new AtomicInteger(1);
        new WeakHashMap();
    }

    public static u a(View view) {
        if (b == null) {
            b = new WeakHashMap<>();
        }
        u uVar = b.get(view);
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(view);
        b.put(view, uVar2);
        return uVar2;
    }

    public static y a(View view, y yVar) {
        if (Build.VERSION.SDK_INT < 21) {
            return yVar;
        }
        WindowInsets windowInsets = (WindowInsets) y.a(yVar);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (!onApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return y.a(windowInsets);
    }

    public static void a(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f2);
        }
    }

    public static void a(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    public static void a(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    public static void a(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof o) {
            ((o) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    public static void a(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof o) {
            ((o) view).setSupportBackgroundTintMode(mode);
        }
    }

    public static void a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void a(View view, l lVar) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (lVar == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new a(lVar));
        }
    }

    public static void a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void a(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    public static void a(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f3345a == null) {
            f3345a = new WeakHashMap<>();
        }
        f3345a.put(view, str);
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        d a2 = d.a(view);
        if (a2 != null) {
            if (keyEvent.getAction() == 0) {
                a2.a();
            }
            View a3 = a2.a(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a3 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (a2.b == null) {
                        a2.b = new SparseArray<>();
                    }
                    a2.b.put(keyCode, new WeakReference<>(a3));
                }
            }
            if (a3 != null) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public static View.AccessibilityDelegate b(View view) {
        if (f3347d) {
            return null;
        }
        if (f3346c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3346c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3347d = true;
                return null;
            }
        }
        try {
            Object obj = f3346c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f3347d = true;
            return null;
        }
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        int indexOfKey;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        d a2 = d.a(view);
        WeakReference<KeyEvent> weakReference = a2.f3353c;
        if (weakReference != null && weakReference.get() == keyEvent) {
            return false;
        }
        a2.f3353c = new WeakReference<>(keyEvent);
        WeakReference<View> weakReference2 = null;
        if (a2.b == null) {
            a2.b = new SparseArray<>();
        }
        SparseArray<WeakReference<View>> sparseArray = a2.b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference2 = sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference2 == null) {
            weakReference2 = sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference2 == null) {
            return false;
        }
        View view2 = weakReference2.get();
        if (view2 != null && p(view2)) {
            a2.b(view2, keyEvent);
        }
        return true;
    }

    public static ColorStateList c(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof o) {
            return ((o) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static Display d(View view) {
        return view.getDisplay();
    }

    public static boolean e(View view) {
        return view.getFitsSystemWindows();
    }

    public static int f(View view) {
        return view.getImportantForAccessibility();
    }

    @SuppressLint({"InlinedApi"})
    public static int g(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static int h(View view) {
        return view.getLayoutDirection();
    }

    public static int i(View view) {
        return view.getMinimumHeight();
    }

    public static int j(View view) {
        return view.getMinimumWidth();
    }

    public static String k(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f3345a;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static int l(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static float m(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static boolean n(View view) {
        return view.hasOnClickListeners();
    }

    public static boolean o(View view) {
        return view.hasTransientState();
    }

    public static boolean p(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean q(View view) {
        return view.isLaidOut();
    }

    public static boolean r(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof f) {
            return ((f) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static boolean s(View view) {
        Boolean bool = (Boolean) new q(d.g.b.tag_screen_reader_focusable, Boolean.class, 28).b(view);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static void t(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void u(View view) {
        if (Build.VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
        } else {
            view.requestFitSystemWindows();
        }
    }

    public static void v(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof f) {
            ((f) view).stopNestedScroll();
        }
    }

    public static void a(View view, a aVar) {
        if (aVar == null && (b(view) instanceof a.C0104a)) {
            aVar = new a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.b);
    }
}
