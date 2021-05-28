package d.j.d;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import d.g.b;
import d.g.l.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
public abstract class p0 {
    public static boolean a(List list) {
        return list == null || list.isEmpty();
    }

    public static boolean a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public abstract Object a(Object obj);

    public void a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    public abstract void a(Object obj, View view, ArrayList<View> arrayList);

    public abstract void a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void a(Object obj, ArrayList<View> arrayList);

    public abstract void a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0038 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.ArrayList<android.view.View> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.view.View, android.view.ViewGroup] */
    public void a(ArrayList<View> arrayList, View view) {
        boolean z;
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                view = (ViewGroup) view;
                if (Build.VERSION.SDK_INT >= 21) {
                    z = view.isTransitionGroup();
                } else {
                    Boolean bool = (Boolean) view.getTag(b.tag_transition_group);
                    z = ((bool == null || !bool.booleanValue()) && view.getBackground() == null && p.k(view) == null) ? false : true;
                }
                if (!z) {
                    int childCount = view.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        a(arrayList, view.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(view == true ? 1 : 0);
        }
    }

    public void a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String k = p.k(view);
            if (k != null) {
                map.put(k, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }
}
