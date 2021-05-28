package a.a.a.a.v0.d.a.a0.o;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.h;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.f1;
import a.a.a.a.v0.m.i1.d;
import a.a.a.a.v0.m.i1.f;
import a.a.a.a.v0.m.j0;
import a.a.a.a.v0.m.k0;
import a.a.a.a.v0.m.v0;
import a.a.a.a.v0.m.x;
import a.n;
import a.s;
import a.w.b.l;
import a.w.b.p;
import a.w.c.j;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class i extends x implements j0 {

    public static final class a extends j implements l<d0, List<? extends String>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a.a.a.a.v0.i.c f673c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(a.a.a.a.v0.i.c cVar) {
            super(1);
            this.f673c = cVar;
        }

        public final List<String> a(d0 d0Var) {
            if (d0Var != null) {
                List<v0> H0 = d0Var.H0();
                ArrayList arrayList = new ArrayList(g.a((Iterable) H0, 10));
                Iterator<T> it = H0.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f673c.a((v0) it.next()));
                }
                return arrayList;
            }
            a.w.c.i.a("type");
            throw null;
        }
    }

    public static final class b extends j implements p<String, String, String> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f674c = new b();

        public b() {
            super(2);
        }

        public final String a(String str, String str2) {
            String str3;
            if (str == null) {
                a.w.c.i.a("$this$replaceArgs");
                throw null;
            } else if (str2 == null) {
                a.w.c.i.a("newArgs");
                throw null;
            } else if (!a.a0.i.a((CharSequence) str, '<', false, 2)) {
                return str;
            } else {
                StringBuilder sb = new StringBuilder();
                if (str != null) {
                    int a2 = a.a0.i.a((CharSequence) str, '<', 0, false, 6);
                    if (a2 == -1) {
                        str3 = str;
                    } else {
                        str3 = str.substring(0, a2);
                        a.w.c.i.a((Object) str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    sb.append(str3);
                    sb.append('<');
                    sb.append(str2);
                    sb.append('>');
                    sb.append(a.a0.i.a(str, '>', (String) null, 2));
                    return sb.toString();
                }
                a.w.c.i.a("missingDelimiterValue");
                throw null;
            }
        }
    }

    public static final class c extends j implements l<String, String> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f675c = new c();

        public c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public String a(String str) {
            String str2 = str;
            if (str2 != null) {
                return e.a.a.a.a.b("(raw) ", str2);
            }
            a.w.c.i.a("it");
            throw null;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public i(k0 k0Var, k0 k0Var2) {
        this(k0Var, k0Var2, false);
        if (k0Var == null) {
            a.w.c.i.a("lowerBound");
            throw null;
        } else if (k0Var2 != null) {
        } else {
            a.w.c.i.a("upperBound");
            throw null;
        }
    }

    public i(k0 k0Var, k0 k0Var2, boolean z) {
        super(k0Var, k0Var2);
        if (!z) {
            boolean b2 = d.f1870a.b(k0Var, k0Var2);
            if (s.f2103a && !b2) {
                throw new AssertionError("Lower bound " + k0Var + " of a flexible type must be a subtype of the upper bound " + k0Var2);
            }
        }
    }

    @Override // a.a.a.a.v0.m.x
    public k0 L0() {
        return this.f1956d;
    }

    @Override // a.a.a.a.v0.m.f1
    public f1 a(boolean z) {
        return new i(this.f1956d.a(z), this.f1957e.a(z));
    }

    @Override // a.a.a.a.v0.m.d0, a.a.a.a.v0.m.x
    public a.a.a.a.v0.j.w.i u() {
        h c2 = I0().c();
        if (!(c2 instanceof e)) {
            c2 = null;
        }
        e eVar = (e) c2;
        if (eVar != null) {
            a.a.a.a.v0.j.w.i a2 = eVar.a(h.f669d);
            a.w.c.i.a((Object) a2, "classDescriptor.getMemberScope(RawSubstitution)");
            return a2;
        }
        StringBuilder a3 = e.a.a.a.a.a("Incorrect classifier: ");
        a3.append(I0().c());
        throw new IllegalStateException(a3.toString().toString());
    }

    @Override // a.a.a.a.v0.m.d0, a.a.a.a.v0.m.f1
    public x a(f fVar) {
        if (fVar != null) {
            k0 k0Var = this.f1956d;
            fVar.a(k0Var);
            if (k0Var != null) {
                k0 k0Var2 = k0Var;
                k0 k0Var3 = this.f1957e;
                fVar.a(k0Var3);
                if (k0Var3 != null) {
                    return new i(k0Var2, k0Var3, true);
                }
                throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            }
            throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        }
        a.w.c.i.a("kotlinTypeRefiner");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ce A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cf  */
    @Override // a.a.a.a.v0.m.x
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(a.a.a.a.v0.i.c r14, a.a.a.a.v0.i.j r15) {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.d.a.a0.o.i.a(a.a.a.a.v0.i.c, a.a.a.a.v0.i.j):java.lang.String");
    }

    @Override // a.a.a.a.v0.m.f1
    public f1 a(a.a.a.a.v0.b.b1.h hVar) {
        if (hVar != null) {
            return new i(this.f1956d.a(hVar), this.f1957e.a(hVar));
        }
        a.w.c.i.a("newAnnotations");
        throw null;
    }
}
