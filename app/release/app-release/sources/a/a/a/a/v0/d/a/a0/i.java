package a.a.a.a.v0.d.a.a0;

import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.d.a.a0.n.s;
import a.a.a.a.v0.d.a.c0.w;
import a.a.a.a.v0.d.a.c0.x;
import a.a.a.a.v0.l.e;
import a.w.b.l;
import a.w.c.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class i implements m {

    /* renamed from: a  reason: collision with root package name */
    public final Map<w, Integer> f565a;
    public final e<w, s> b;

    /* renamed from: c  reason: collision with root package name */
    public final h f566c;

    /* renamed from: d  reason: collision with root package name */
    public final k f567d;

    /* renamed from: e  reason: collision with root package name */
    public final int f568e;

    public static final class a extends j implements l<w, s> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ i f569c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(i iVar) {
            super(1);
            this.f569c = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public s a(w wVar) {
            w wVar2 = wVar;
            if (wVar2 != null) {
                Integer num = this.f569c.f565a.get(wVar2);
                if (num == null) {
                    return null;
                }
                int intValue = num.intValue();
                i iVar = this.f569c;
                h hVar = iVar.f566c;
                if (hVar != null) {
                    h hVar2 = new h(hVar.f562c, iVar, hVar.f564e);
                    i iVar2 = this.f569c;
                    return new s(hVar2, wVar2, iVar2.f568e + intValue, iVar2.f567d);
                }
                a.w.c.i.a("$this$child");
                throw null;
            }
            a.w.c.i.a("typeParameter");
            throw null;
        }
    }

    public i(h hVar, k kVar, x xVar, int i) {
        if (hVar == null) {
            a.w.c.i.a("c");
            throw null;
        } else if (kVar == null) {
            a.w.c.i.a("containingDeclaration");
            throw null;
        } else if (xVar != null) {
            this.f566c = hVar;
            this.f567d = kVar;
            this.f568e = i;
            List<w> k = xVar.k();
            if (k != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int i2 = 0;
                Iterator<T> it = k.iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(it.next(), Integer.valueOf(i2));
                    i2++;
                }
                this.f565a = linkedHashMap;
                this.b = this.f566c.f562c.f545a.b(new a(this));
                return;
            }
            a.w.c.i.a("$this$mapToIndex");
            throw null;
        } else {
            a.w.c.i.a("typeParameterOwner");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.d.a.a0.m
    public r0 a(w wVar) {
        if (wVar != null) {
            s a2 = this.b.a(wVar);
            return a2 != null ? a2 : this.f566c.f563d.a(wVar);
        }
        a.w.c.i.a("javaTypeParameter");
        throw null;
    }
}
