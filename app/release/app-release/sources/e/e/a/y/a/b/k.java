package e.e.a.y.a.b;

import android.content.Context;
import com.didi.hummer.render.style.HummerLayout;
import e.e.a.p.b;
import e.e.a.q.b.c;
import e.e.a.y.a.b.j;
import e.e.a.y.c.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class k extends j<HummerLayout> implements j.f, j.e {
    public List<j> children = new LinkedList();
    public Map<j, i> fixedNoneBoxMap = new HashMap();
    public b hummerContext;
    public List<l> inlineBoxes = new ArrayList();

    public class a implements Comparator<l> {
        public a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(l lVar, l lVar2) {
            return k.this.getYogaNode().indexOf(lVar.getYogaNode()) - k.this.getYogaNode().indexOf(lVar2.getYogaNode());
        }
    }

    public k(b bVar, c cVar, String str) {
        super(bVar, cVar, str);
        this.hummerContext = bVar;
    }

    private void mergeInlineBox() {
        Collections.sort(this.inlineBoxes, new a());
        Iterator<l> it = this.inlineBoxes.iterator();
        while (it.hasNext()) {
            l next = it.next();
            if (next.a()) {
                ((HummerLayout) getView()).a(next);
                it.remove();
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(arrayList2);
        int i = 1073741823;
        for (l lVar : this.inlineBoxes) {
            int indexOf = getYogaNode().indexOf(lVar.getYogaNode());
            if (indexOf - i == 1) {
                arrayList2.add(lVar);
            } else {
                arrayList2 = new ArrayList();
                arrayList.add(arrayList2);
                arrayList2.add(lVar);
            }
            i = indexOf;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            List list = (List) it2.next();
            if (list.size() >= 2) {
                l lVar2 = new l(this.hummerContext);
                this.inlineBoxes.add(lVar2);
                for (int i2 = 0; i2 < list.size(); i2++) {
                    l lVar3 = (l) list.get(i2);
                    if (i2 == 0) {
                        ((HummerLayout) getView()).a(lVar2, lVar3);
                    }
                    while (!lVar3.a()) {
                        j jVar = lVar3.f4593a.get(0);
                        lVar3.c(jVar);
                        lVar2.b(jVar);
                        jVar.setInlineBox(lVar2);
                    }
                    this.inlineBoxes.remove(lVar3);
                    ((HummerLayout) getView()).a(lVar3);
                }
            }
        }
    }

    public /* synthetic */ float[] a() {
        return this.backgroundHelper.b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        if (r5.getDisplay() == e.e.a.y.c.a.EnumC0138a.INLINE_BLOCK) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void appendChild(e.e.a.y.a.b.j r5) {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.a.y.a.b.k.appendChild(e.e.a.y.a.b.j):void");
    }

    @Override // e.e.a.y.a.b.j
    public HummerLayout createViewInstance(Context context) {
        return new HummerLayout(context);
    }

    @Override // e.e.a.y.a.b.j.e
    public void dispatchChildDisplayChanged(j jVar, a.EnumC0138a aVar, a.EnumC0138a aVar2) {
        a.EnumC0138a display = getDisplay();
        a.EnumC0138a aVar3 = a.EnumC0138a.BLOCK;
        if (display == aVar3) {
            if ((aVar == aVar3 || aVar == a.EnumC0138a.YOGA) && (aVar2 == a.EnumC0138a.INLINE || aVar2 == a.EnumC0138a.INLINE_BLOCK)) {
                l lVar = new l(this.hummerContext);
                this.inlineBoxes.add(lVar);
                ((HummerLayout) getView()).b(lVar, jVar);
                jVar.setInlineBox(lVar);
                lVar.b(jVar);
            } else if ((aVar == a.EnumC0138a.INLINE || aVar == a.EnumC0138a.INLINE_BLOCK) && ((aVar2 == a.EnumC0138a.BLOCK || aVar2 == a.EnumC0138a.YOGA) && jVar.getInlineBox() != null)) {
                l inlineBox = jVar.getInlineBox();
                int indexOf = inlineBox.f4593a.indexOf(jVar);
                l lVar2 = new l(this.hummerContext);
                l lVar3 = new l(this.hummerContext);
                int i = 0;
                while (!inlineBox.a()) {
                    j jVar2 = inlineBox.f4593a.get(0);
                    inlineBox.c(jVar2);
                    if (i < indexOf) {
                        lVar2.b(jVar2);
                        jVar2.setInlineBox(lVar2);
                    } else if (i > indexOf) {
                        lVar3.b(jVar2);
                        jVar2.setInlineBox(lVar3);
                    }
                    i++;
                }
                int indexOf2 = getYogaNode().indexOf(inlineBox.getYogaNode());
                ((HummerLayout) getView()).a(inlineBox);
                ((HummerLayout) getView()).a(lVar3, indexOf2);
                ((HummerLayout) getView()).a(jVar, indexOf2);
                ((HummerLayout) getView()).a(lVar2, indexOf2);
                this.inlineBoxes.add(lVar2);
                this.inlineBoxes.add(lVar3);
            }
        }
        if (getDisplay() == a.EnumC0138a.BLOCK) {
            mergeInlineBox();
        }
    }

    @Override // e.e.a.y.a.b.j.f
    public void dispatchChildPositionChanged(j jVar, a.b bVar, a.b bVar2) {
        if (bVar == a.b.FIXED && bVar2 == a.b.YOGA && this.fixedNoneBoxMap.containsKey(jVar)) {
            this.hummerContext.f4443d.a(jVar);
            ((HummerLayout) getView()).b(jVar, this.fixedNoneBoxMap.remove(jVar));
        }
        if (bVar == a.b.YOGA && bVar2 == a.b.FIXED) {
            i iVar = new i(this.hummerContext);
            this.fixedNoneBoxMap.put(jVar, iVar);
            ((HummerLayout) getView()).b(iVar, jVar);
            this.hummerContext.f4443d.a(jVar, -1);
        }
        if (getDisplay() == a.EnumC0138a.BLOCK) {
            mergeInlineBox();
        }
    }

    public List<j> getChildren() {
        return this.children;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e.e.a.y.a.b.j getElementById(java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.a.y.a.b.k.getElementById(java.lang.String):e.e.a.y.a.b.j");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
        if (r8.getDisplay() == e.e.a.y.c.a.EnumC0138a.INLINE_BLOCK) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void insertBefore(e.e.a.y.a.b.j r8, e.e.a.y.a.b.j r9) {
        /*
        // Method dump skipped, instructions count: 335
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.a.y.a.b.k.insertBefore(e.e.a.y.a.b.j, e.e.a.y.a.b.j):void");
    }

    @Override // e.e.a.y.a.b.j, e.e.a.u.b
    public void onCreate() {
        super.onCreate();
        ((HummerLayout) getView()).setCornerRadiiGetter(new e(this));
    }

    public void removeAll() {
        this.inlineBoxes.clear();
        for (Map.Entry<j, i> entry : this.fixedNoneBoxMap.entrySet()) {
            this.hummerContext.f4443d.a(entry.getKey());
            ((HummerLayout) getView()).a(entry.getValue());
        }
        this.fixedNoneBoxMap.clear();
        for (j jVar : this.children) {
            jVar.getJSValue().k();
            jVar.setPositionChangedListener(null);
            jVar.setDisplayChangedListener(null);
        }
        this.children.clear();
        ((HummerLayout) getView()).removeAllViews();
    }

    public void removeChild(j jVar) {
        if (jVar != null) {
            jVar.getJSValue().k();
            jVar.setPositionChangedListener(null);
            jVar.setDisplayChangedListener(null);
            this.children.remove(jVar);
            if (jVar.getInlineBox() != null) {
                l inlineBox = jVar.getInlineBox();
                ((HummerLayout) inlineBox.getView()).a(jVar);
                inlineBox.f4593a.remove(jVar);
                if (inlineBox.a()) {
                    this.inlineBoxes.remove(inlineBox);
                    ((HummerLayout) getView()).a(inlineBox);
                }
            } else if (this.fixedNoneBoxMap.containsKey(jVar)) {
                this.hummerContext.f4443d.a(jVar);
                ((HummerLayout) getView()).a(this.fixedNoneBoxMap.remove(jVar));
            } else {
                ((HummerLayout) getView()).a(jVar);
                if (getDisplay() == a.EnumC0138a.BLOCK) {
                    mergeInlineBox();
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v16, resolved type: java.util.Map<e.e.a.y.a.b.j, e.e.a.y.a.b.i> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void replaceChild(e.e.a.y.a.b.j r9, e.e.a.y.a.b.j r10) {
        /*
        // Method dump skipped, instructions count: 366
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.a.y.a.b.k.replaceChild(e.e.a.y.a.b.j, e.e.a.y.a.b.j):void");
    }
}
