package a.a.a.a.v0.d.a.d0;

import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.d.a.a;
import a.a.a.a.v0.d.a.a0.h;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.f1;
import a.a.a.a.v0.o.i;
import a.w.c.j;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Collection;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final a.a.a.a.v0.d.a.a f747a;
    public final i b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final d0 f748a;
        public final boolean b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f749c;

        public a(d0 d0Var, boolean z, boolean z2) {
            if (d0Var != null) {
                this.f748a = d0Var;
                this.b = z;
                this.f749c = z2;
                return;
            }
            a.w.c.i.a("type");
            throw null;
        }
    }

    public static final class c extends a {

        /* renamed from: d  reason: collision with root package name */
        public final boolean f759d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(d0 d0Var, boolean z, boolean z2, boolean z3) {
            super(d0Var, z2, z3);
            if (d0Var != null) {
                this.f759d = z;
                return;
            }
            a.w.c.i.a("type");
            throw null;
        }
    }

    public l(a.a.a.a.v0.d.a.a aVar, i iVar) {
        if (aVar == null) {
            a.w.c.i.a("annotationTypeQualifierResolver");
            throw null;
        } else if (iVar != null) {
            this.f747a = aVar;
            this.b = iVar;
        } else {
            a.w.c.i.a("jsr305State");
            throw null;
        }
    }

    public final b a(a.a.a.a.v0.b.b bVar, a.a.a.a.v0.b.b1.a aVar, boolean z, h hVar, a.EnumC0022a aVar2, a.w.b.l<? super a.a.a.a.v0.b.b, ? extends d0> lVar) {
        d0 d0Var = (d0) lVar.a(bVar);
        Collection<? extends a.a.a.a.v0.b.b> f2 = bVar.f();
        a.w.c.i.a((Object) f2, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(g.a(f2, 10));
        for (T t : f2) {
            a.w.c.i.a((Object) t, "it");
            arrayList.add((d0) lVar.a(t));
        }
        return new b(this, aVar, d0Var, arrayList, z, g.b(hVar, ((d0) lVar.a(bVar)).y()), aVar2);
    }

    public final b a(a.a.a.a.v0.b.b bVar, w0 w0Var, h hVar, a.w.b.l<? super a.a.a.a.v0.b.b, ? extends d0> lVar) {
        h b2;
        return a(bVar, w0Var, false, (w0Var == null || (b2 = g.b(hVar, w0Var.y())) == null) ? hVar : b2, a.EnumC0022a.VALUE_PARAMETER, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v126, types: [a.a.a.a.v0.b.d1.g0, a.a.a.a.v0.b.d1.e0, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004a, code lost:
        if (r0.f().size() == 1) goto L_0x051f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0408, code lost:
        if (a.a.a.a.v0.a.g.g(r6) != false) goto L_0x0410;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x04f4, code lost:
        if (r6.b != true) goto L_0x04f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x051c, code lost:
        if (r5 == false) goto L_0x051f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x027a A[Catch:{ IllegalArgumentException -> 0x040b }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0284 A[Catch:{ IllegalArgumentException -> 0x040b }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0457  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0490  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0492  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x04d2  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x04fc  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0524  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0531  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0534  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0537  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x054d A[LOOP:5: B:305:0x0547->B:307:0x054d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0576 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x056a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c7  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <D extends a.a.a.a.v0.b.b> java.util.Collection<D> a(a.a.a.a.v0.d.a.a0.h r32, java.util.Collection<? extends D> r33) {
        /*
        // Method dump skipped, instructions count: 1423
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.d.a.d0.l.a(a.a.a.a.v0.d.a.a0.h, java.util.Collection):java.util.Collection");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        if (r0.equals("NEVER") != false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        if (r0.equals("MAYBE") != false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0083, code lost:
        r0 = new a.a.a.a.v0.d.a.d0.h(a.a.a.a.v0.d.a.d0.g.f702c, false, 2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final a.a.a.a.v0.d.a.d0.h b(a.a.a.a.v0.b.b1.c r7) {
        /*
        // Method dump skipped, instructions count: 268
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.d.a.d0.l.b(a.a.a.a.v0.b.b1.c):a.a.a.a.v0.d.a.d0.h");
    }

    public final class b {

        /* renamed from: a  reason: collision with root package name */
        public final a.a.a.a.v0.b.b1.a f750a;
        public final d0 b;

        /* renamed from: c  reason: collision with root package name */
        public final Collection<d0> f751c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f752d;

        /* renamed from: e  reason: collision with root package name */
        public final h f753e;

        /* renamed from: f  reason: collision with root package name */
        public final a.EnumC0022a f754f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f755g;

        public static final class a extends j implements a.w.b.l<Integer, d> {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ w f756c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ a.w.b.l f757d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(w wVar, a.w.b.l lVar) {
                super(1);
                this.f756c = wVar;
                this.f757d = lVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // a.w.b.l
            public d a(Integer num) {
                int intValue = num.intValue();
                d dVar = this.f756c.f777a.get(Integer.valueOf(intValue));
                return dVar != null ? dVar : (d) this.f757d.a(Integer.valueOf(intValue));
            }
        }

        /* renamed from: a.a.a.a.v0.d.a.d0.l$b$b  reason: collision with other inner class name */
        public static final class C0029b extends j implements a.w.b.l<f1, Boolean> {

            /* renamed from: c  reason: collision with root package name */
            public static final C0029b f758c = new C0029b();

            public C0029b() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // a.w.b.l
            public Boolean a(f1 f1Var) {
                a.a.a.a.v0.b.h c2 = f1Var.I0().c();
                boolean z = false;
                if (c2 != null) {
                    a.w.c.i.a((Object) c2, "it.constructor.declarati… ?: return@contains false");
                    d d2 = c2.d();
                    a.a.a.a.v0.a.p.c cVar = a.a.a.a.v0.a.p.c.m;
                    if (a.w.c.i.a(d2, a.a.a.a.v0.a.p.c.f253f.d())) {
                        a.a.a.a.v0.f.b a2 = a.a.a.a.v0.j.u.a.a((k) c2);
                        a.a.a.a.v0.a.p.c cVar2 = a.a.a.a.v0.a.p.c.m;
                        if (a.w.c.i.a(a2, a.a.a.a.v0.a.p.c.f253f)) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.Collection<? extends a.a.a.a.v0.m.d0> */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l lVar, a.a.a.a.v0.b.b1.a aVar, d0 d0Var, Collection<? extends d0> collection, boolean z, h hVar, a.EnumC0022a aVar2) {
            if (d0Var == null) {
                a.w.c.i.a("fromOverride");
                throw null;
            } else if (collection == 0) {
                a.w.c.i.a("fromOverridden");
                throw null;
            } else if (hVar == null) {
                a.w.c.i.a("containerContext");
                throw null;
            } else if (aVar2 != null) {
                this.f755g = lVar;
                this.f750a = aVar;
                this.b = d0Var;
                this.f751c = collection;
                this.f752d = z;
                this.f753e = hVar;
                this.f754f = aVar2;
            } else {
                a.w.c.i.a("containerApplicabilityType");
                throw null;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:160:0x0274, code lost:
            if ((((r13 != null ? r13.W() : null) != null) && r12 && r11 == a.a.a.a.v0.d.a.d0.g.f702c) == false) goto L_0x0278;
         */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x0239  */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x023b  */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x023e  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x0241  */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x0253  */
        /* JADX WARNING: Removed duplicated region for block: B:170:0x0296  */
        /* JADX WARNING: Removed duplicated region for block: B:180:0x02b7  */
        /* JADX WARNING: Removed duplicated region for block: B:183:0x02bc A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:186:0x02ca  */
        /* JADX WARNING: Removed duplicated region for block: B:187:0x02cc  */
        /* JADX WARNING: Removed duplicated region for block: B:192:0x02ed  */
        /* JADX WARNING: Removed duplicated region for block: B:193:0x02f3  */
        /* JADX WARNING: Removed duplicated region for block: B:196:0x0300  */
        /* JADX WARNING: Removed duplicated region for block: B:199:0x0309  */
        /* JADX WARNING: Removed duplicated region for block: B:200:0x030e  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0087  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final a.a.a.a.v0.d.a.d0.l.a a(a.a.a.a.v0.d.a.d0.w r22) {
            /*
            // Method dump skipped, instructions count: 789
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.d.a.d0.l.b.a(a.a.a.a.v0.d.a.d0.w):a.a.a.a.v0.d.a.d0.l$a");
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final a.a.a.a.v0.d.a.d0.d a(a.a.a.a.v0.m.d0 r11) {
            /*
            // Method dump skipped, instructions count: 126
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.d.a.d0.l.b.a(a.a.a.a.v0.m.d0):a.a.a.a.v0.d.a.d0.d");
        }
    }

    public final h a(a.a.a.a.v0.b.b1.c cVar) {
        h b2;
        if (cVar != null) {
            h b3 = b(cVar);
            if (b3 != null) {
                return b3;
            }
            a.a.a.a.v0.b.b1.c c2 = this.f747a.c(cVar);
            if (c2 == null) {
                return null;
            }
            a.a.a.a.v0.o.k a2 = this.f747a.a(cVar);
            if (a2 != null) {
                if (!(a2 == a.a.a.a.v0.o.k.IGNORE) && (b2 = b(c2)) != null) {
                    return h.a(b2, null, a2.a(), 1);
                }
                return null;
            }
            throw null;
        }
        a.w.c.i.a("annotationDescriptor");
        throw null;
    }
}
