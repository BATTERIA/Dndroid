package a.a.a.a.v0.i;

import a.t.f;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Set;

public enum i {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true);
    
    public static final Set<i> q;
    public static final Set<i> r = g.l(values());

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1506c;

    /* access modifiers changed from: public */
    static {
        i[] values = values();
        ArrayList arrayList = new ArrayList();
        for (i iVar : values) {
            if (iVar.f1506c) {
                arrayList.add(iVar);
            }
        }
        q = f.k(arrayList);
    }

    /* access modifiers changed from: public */
    i(boolean z) {
        this.f1506c = z;
    }
}
