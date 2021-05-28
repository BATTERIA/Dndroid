package d.j.d;

import android.graphics.Rect;
import android.os.Build;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import d.d.g;
import d.g.l.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f3447a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    public static final p0 b = (Build.VERSION.SDK_INT >= 21 ? new j0() : null);

    /* renamed from: c  reason: collision with root package name */
    public static final p0 f3448c;

    public interface a {
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public Fragment f3449a;
        public boolean b;

        /* renamed from: c  reason: collision with root package name */
        public a f3450c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f3451d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3452e;

        /* renamed from: f  reason: collision with root package name */
        public a f3453f;
    }

    static {
        p0 p0Var = null;
        try {
            p0Var = (p0) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
        }
        f3448c = p0Var;
    }

    public static View a(d.d.a<String, View> aVar, b bVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        a aVar2 = bVar.f3450c;
        if (obj == null || aVar == null || (arrayList = aVar2.m) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar2.m : aVar2.n).get(0));
    }

    public static void a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    public static void a(ArrayList<View> arrayList, d.d.a<String, View> aVar, Collection<String> collection) {
        for (int i = aVar.f3101e - 1; i >= 0; i--) {
            View d2 = aVar.d(i);
            if (collection.contains(p.k(d2))) {
                arrayList.add(d2);
            }
        }
    }

    public static d.d.a<String, View> b(p0 p0Var, d.d.a<String, String> aVar, Object obj, b bVar) {
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = bVar.f3451d;
        d.d.a<String, View> aVar2 = new d.d.a<>();
        p0Var.a(aVar2, fragment.y());
        a aVar3 = bVar.f3453f;
        ArrayList<String> arrayList = bVar.f3452e ? aVar3.n : aVar3.m;
        if (arrayList != null) {
            g.a((Map) aVar2, (Collection<?>) arrayList);
        }
        g.a((Map) aVar, (Collection<?>) aVar2.keySet());
        return aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0038, code lost:
        if (r0.m != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0074, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0086, code lost:
        if (r0.A == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0088, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x00e4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(d.j.d.a r8, d.j.d.z.a r9, android.util.SparseArray<d.j.d.g0.b> r10, boolean r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 239
        */
        throw new UnsupportedOperationException("Method not decompiled: d.j.d.g0.a(d.j.d.a, d.j.d.z$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static Object b(p0 p0Var, Fragment fragment, boolean z) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            Fragment.b bVar = fragment.L;
            if (bVar != null && (obj = bVar.f2404g) == Fragment.W) {
                obj = fragment.j();
            }
        } else {
            obj = fragment.k();
        }
        return p0Var.a(obj);
    }

    public static void a(Fragment fragment, Fragment fragment2, boolean z, d.d.a<String, View> aVar, boolean z2) {
        if (z) {
            Fragment.b bVar = fragment2.L;
        } else {
            Fragment.b bVar2 = fragment.L;
        }
    }

    public static boolean a(p0 p0Var, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (((j0) p0Var) == null) {
                throw null;
            } else if (!(obj instanceof Transition)) {
                return false;
            }
        }
        return true;
    }

    public static d.d.a<String, View> a(p0 p0Var, d.d.a<String, String> aVar, Object obj, b bVar) {
        View view = bVar.f3449a.I;
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        d.d.a<String, View> aVar2 = new d.d.a<>();
        p0Var.a(aVar2, view);
        a aVar3 = bVar.f3450c;
        ArrayList<String> arrayList = bVar.b ? aVar3.m : aVar3.n;
        if (arrayList != null) {
            g.a((Map) aVar2, (Collection<?>) arrayList);
            g.a((Map) aVar2, (Collection<?>) aVar.values());
        }
        int i = aVar.f3101e;
        while (true) {
            i--;
            if (i < 0) {
                return aVar2;
            }
            if (!aVar2.containsKey(aVar.d(i))) {
                aVar.c(i);
            }
        }
    }

    public static p0 a(Fragment fragment, Fragment fragment2) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object k = fragment.k();
            if (k != null) {
                arrayList.add(k);
            }
            Fragment.b bVar = fragment.L;
            if (bVar == null) {
                obj2 = null;
            } else {
                obj2 = bVar.f2404g;
                if (obj2 == Fragment.W) {
                    obj2 = fragment.j();
                }
            }
            if (obj2 != null) {
                arrayList.add(obj2);
            }
            Fragment.b bVar2 = fragment.L;
            if (bVar2 == null) {
                obj3 = null;
            } else {
                obj3 = bVar2.k;
                if (obj3 == Fragment.W) {
                    obj3 = fragment.n();
                }
            }
            if (obj3 != null) {
                arrayList.add(obj3);
            }
        }
        if (fragment2 != null) {
            Object j = fragment2.j();
            if (j != null) {
                arrayList.add(j);
            }
            Fragment.b bVar3 = fragment2.L;
            if (bVar3 == null) {
                obj = null;
            } else {
                obj = bVar3.i;
                if (obj == Fragment.W) {
                    obj = fragment2.k();
                }
            }
            if (obj != null) {
                arrayList.add(obj);
            }
            Object n = fragment2.n();
            if (n != null) {
                arrayList.add(n);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        p0 p0Var = b;
        if (p0Var != null && a(p0Var, arrayList)) {
            return b;
        }
        p0 p0Var2 = f3448c;
        if (p0Var2 != null && a(p0Var2, arrayList)) {
            return f3448c;
        }
        if (b == null && f3448c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    public static ArrayList<View> a(p0 p0Var, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.I;
        if (view2 != null) {
            p0Var.a(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        p0Var.a(obj, arrayList2);
        return arrayList2;
    }

    public static Object a(p0 p0Var, Fragment fragment, boolean z) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            Fragment.b bVar = fragment.L;
            if (bVar != null && (obj = bVar.i) == Fragment.W) {
                obj = fragment.k();
            }
        } else {
            obj = fragment.j();
        }
        return p0Var.a(obj);
    }

    public static Object a(p0 p0Var, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            Fragment.b bVar = fragment2.L;
            if (bVar == null) {
                obj = null;
            } else {
                obj = bVar.k;
                if (obj == Fragment.W) {
                    obj = fragment2.n();
                }
            }
        } else {
            obj = fragment.n();
        }
        Object a2 = p0Var.a(obj);
        if (a2 == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) a2);
        return transitionSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object a(d.j.d.p0 r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, androidx.fragment.app.Fragment r5, boolean r6) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: d.j.d.g0.a(d.j.d.p0, java.lang.Object, java.lang.Object, java.lang.Object, androidx.fragment.app.Fragment, boolean):java.lang.Object");
    }

    public static void a(p0 p0Var, Object obj, Object obj2, d.d.a<String, View> aVar, boolean z, a aVar2) {
        ArrayList<String> arrayList = aVar2.m;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = aVar.get((z ? aVar2.n : aVar2.m).get(0));
            j0 j0Var = (j0) p0Var;
            if (j0Var != null) {
                if (view != null) {
                    Rect rect = new Rect();
                    j0Var.a(view, rect);
                    ((Transition) obj).setEpicenterCallback(new h0(j0Var, rect));
                }
                if (obj2 != null && view != null) {
                    Rect rect2 = new Rect();
                    j0Var.a(view, rect2);
                    ((Transition) obj2).setEpicenterCallback(new h0(j0Var, rect2));
                    return;
                }
                return;
            }
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x04ed A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0260 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(d.j.d.q r39, java.util.ArrayList<d.j.d.a> r40, java.util.ArrayList<java.lang.Boolean> r41, int r42, int r43, boolean r44, d.j.d.g0.a r45) {
        /*
        // Method dump skipped, instructions count: 1282
        */
        throw new UnsupportedOperationException("Method not decompiled: d.j.d.g0.a(d.j.d.q, java.util.ArrayList, java.util.ArrayList, int, int, boolean, d.j.d.g0$a):void");
    }
}
