package a.a.a.a.v0.k.b;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.e.g0;
import a.w.b.l;
import a.w.c.h;
import a.w.c.i;
import a.w.c.j;
import a.w.c.s;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d0 extends j implements l<Integer, e> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b0 f1669c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g0 f1670d;

    public static final /* synthetic */ class a extends h implements l<a.a.a.a.v0.f.a, a.a.a.a.v0.f.a> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f1671f = new a();

        public a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public a.a.a.a.v0.f.a a(a.a.a.a.v0.f.a aVar) {
            a.a.a.a.v0.f.a aVar2 = aVar;
            if (aVar2 != null) {
                return aVar2.c();
            }
            i.a("p1");
            throw null;
        }

        @Override // a.w.c.b
        public final a.a.e c() {
            return s.a(a.a.a.a.v0.f.a.class);
        }

        @Override // a.a.b, a.w.c.b
        public final String d() {
            return "getOuterClassId";
        }

        @Override // a.w.c.b
        public final String f() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }
    }

    public static final class b extends j implements l<g0, g0> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d0 f1672c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d0 d0Var) {
            super(1);
            this.f1672c = d0Var;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public g0 a(g0 g0Var) {
            g0 g0Var2 = g0Var;
            if (g0Var2 != null) {
                return g.a(g0Var2, this.f1672c.f1669c.f1659d.f1743f);
            }
            i.a("it");
            throw null;
        }
    }

    public static final class c extends j implements l<g0, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f1673c = new c();

        public c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public Integer a(g0 g0Var) {
            g0 g0Var2 = g0Var;
            if (g0Var2 != null) {
                return Integer.valueOf(g0Var2.f1034f.size());
            }
            i.a("it");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(b0 b0Var, g0 g0Var) {
        super(1);
        this.f1669c = b0Var;
        this.f1670d = g0Var;
    }

    public final e a(int i) {
        a.a.a.a.v0.f.a a2 = g.a(this.f1669c.f1659d.f1741d, i);
        List<Integer> c2 = a.a.a.a.v0.m.l1.a.c(a.a.a.a.v0.m.l1.a.d(a.a.a.a.v0.m.l1.a.a(this.f1670d, new b(this)), c.f1673c));
        a.z.h a3 = a.a.a.a.v0.m.l1.a.a(a2, a.f1671f);
        if (a3 != null) {
            Iterator it = a3.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                it.next();
                i2++;
                if (i2 < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
            while (true) {
                ArrayList arrayList = (ArrayList) c2;
                if (arrayList.size() >= i2) {
                    return this.f1669c.f1659d.f1740c.m.a(a2, c2);
                }
                arrayList.add(0);
            }
        } else {
            i.a("$this$count");
            throw null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public /* bridge */ /* synthetic */ e a(Integer num) {
        return a(num.intValue());
    }
}
