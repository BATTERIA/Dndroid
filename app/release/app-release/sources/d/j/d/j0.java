package d.j.d;

import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class j0 extends p0 {

    public class a implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f3462a;
        public final /* synthetic */ ArrayList b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f3463c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3464d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f3465e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3466f;

        public a(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3462a = obj;
            this.b = arrayList;
            this.f3463c = obj2;
            this.f3464d = arrayList2;
            this.f3465e = obj3;
            this.f3466f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f3462a;
            if (obj != null) {
                j0.this.a(obj, this.b, (ArrayList<View>) null);
            }
            Object obj2 = this.f3463c;
            if (obj2 != null) {
                j0.this.a(obj2, this.f3464d, (ArrayList<View>) null);
            }
            Object obj3 = this.f3465e;
            if (obj3 != null) {
                j0.this.a(obj3, this.f3466f, (ArrayList<View>) null);
            }
        }
    }

    public static boolean a(Transition transition) {
        return !p0.a(transition.getTargetIds()) || !p0.a(transition.getTargetNames()) || !p0.a(transition.getTargetTypes());
    }

    @Override // d.j.d.p0
    public Object a(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // d.j.d.p0
    public void a(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            int size2 = targets.size();
            if (!p0.a(targets, view2, size2)) {
                targets.add(view2);
                for (int i2 = size2; i2 < targets.size(); i2++) {
                    View view3 = targets.get(i2);
                    if (view3 instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view3;
                        int childCount = viewGroup.getChildCount();
                        for (int i3 = 0; i3 < childCount; i3++) {
                            View childAt = viewGroup.getChildAt(i3);
                            if (!p0.a(targets, childAt, size2)) {
                                targets.add(childAt);
                            }
                        }
                    }
                }
            }
        }
        targets.add(view);
        arrayList.add(view);
        a(transitionSet, arrayList);
    }

    @Override // d.j.d.p0
    public void a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new a(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // d.j.d.p0
    public void a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    a(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!a(transition) && p0.a((List) transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    @Override // d.j.d.p0
    public void a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                a(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!a(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }
}
