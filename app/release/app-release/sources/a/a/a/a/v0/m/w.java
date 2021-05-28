package a.a.a.a.v0.m;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.b.a1;
import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.b0;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.d1.i;
import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.l0;
import a.a.a.a.v0.b.m;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.v;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.z0;
import a.t.l;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class w {

    /* renamed from: a  reason: collision with root package name */
    public static final a.a.a.a.v0.b.w f1950a = new a();
    public static final c b = new c(a.a.a.a.v0.f.d.d("<ERROR CLASS>"));

    /* renamed from: c  reason: collision with root package name */
    public static final k0 f1951c = b("<LOOP IN SUPERTYPES>");

    /* renamed from: d  reason: collision with root package name */
    public static final d0 f1952d = b("<ERROR PROPERTY TYPE>");

    /* renamed from: e  reason: collision with root package name */
    public static final f0 f1953e;

    /* renamed from: f  reason: collision with root package name */
    public static final Set<f0> f1954f;

    public static class a implements a.a.a.a.v0.b.w {
        public static /* synthetic */ void a(int i) {
            String str = (i == 1 || i == 4 || i == 5 || i == 6 || i == 8 || i == 9 || i == 12 || i == 13) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 1 || i == 4 || i == 5 || i == 6 || i == 8 || i == 9 || i == 12 || i == 13) ? 2 : 3)];
            switch (i) {
                case 1:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 12:
                case 13:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$1";
                    break;
                case 2:
                case 7:
                    objArr[0] = "fqName";
                    break;
                case 3:
                    objArr[0] = "nameFilter";
                    break;
                case 10:
                    objArr[0] = "visitor";
                    break;
                case 11:
                    objArr[0] = "targetModule";
                    break;
                default:
                    objArr[0] = "capability";
                    break;
            }
            if (i == 1) {
                objArr[1] = "getAnnotations";
            } else if (i == 4) {
                objArr[1] = "getSubPackagesOf";
            } else if (i == 5) {
                objArr[1] = "getName";
            } else if (i == 6) {
                objArr[1] = "getStableName";
            } else if (i == 8) {
                objArr[1] = "getAllDependencyModules";
            } else if (i == 9) {
                objArr[1] = "getExpectedByModules";
            } else if (i == 12) {
                objArr[1] = "getOriginal";
            } else if (i != 13) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$1";
            } else {
                objArr[1] = "getBuiltIns";
            }
            switch (i) {
                case 1:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 12:
                case 13:
                    break;
                case 2:
                case 3:
                    objArr[2] = "getSubPackagesOf";
                    break;
                case 7:
                    objArr[2] = "getPackage";
                    break;
                case 10:
                    objArr[2] = "accept";
                    break;
                case 11:
                    objArr[2] = "shouldSeeInternalsOf";
                    break;
                default:
                    objArr[2] = "getCapability";
                    break;
            }
            String format = String.format(str, objArr);
            if (i == 1 || i == 4 || i == 5 || i == 6 || i == 8 || i == 9 || i == 12 || i == 13) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }

        @Override // a.a.a.a.v0.b.w
        public List<a.a.a.a.v0.b.w> E0() {
            return l.f2119c;
        }

        @Override // a.a.a.a.v0.b.w
        public b0 a(a.a.a.a.v0.f.b bVar) {
            if (bVar == null) {
                a(7);
                throw null;
            }
            throw new IllegalStateException("Should not be called!");
        }

        @Override // a.a.a.a.v0.b.k
        public k a() {
            return this;
        }

        @Override // a.a.a.a.v0.b.k
        public <R, D> R a(m<R, D> mVar, D d2) {
            if (mVar != null) {
                return null;
            }
            a(10);
            throw null;
        }

        @Override // a.a.a.a.v0.b.w
        public <T> T a(w.a<T> aVar) {
            if (aVar != null) {
                return null;
            }
            a(0);
            throw null;
        }

        @Override // a.a.a.a.v0.b.w
        public Collection<a.a.a.a.v0.f.b> a(a.a.a.a.v0.f.b bVar, a.w.b.l<? super a.a.a.a.v0.f.d, Boolean> lVar) {
            if (bVar == null) {
                a(2);
                throw null;
            } else if (lVar != null) {
                return l.f2119c;
            } else {
                a(3);
                throw null;
            }
        }

        @Override // a.a.a.a.v0.b.w
        public boolean a(a.a.a.a.v0.b.w wVar) {
            if (wVar != null) {
                return false;
            }
            a(11);
            throw null;
        }

        @Override // a.a.a.a.v0.b.k
        public k b() {
            return null;
        }

        @Override // a.a.a.a.v0.b.k
        public a.a.a.a.v0.f.d d() {
            return a.a.a.a.v0.f.d.d("<ERROR MODULE>");
        }

        @Override // a.a.a.a.v0.b.w
        public g m() {
            a.a.a.a.v0.a.d dVar = a.a.a.a.v0.a.d.m;
            if (dVar != null) {
                return dVar;
            }
            a(13);
            throw null;
        }

        @Override // a.a.a.a.v0.b.b1.a
        public h y() {
            if (h.b != null) {
                h hVar = h.a.f321a;
                if (hVar != null) {
                    return hVar;
                }
                a(1);
                throw null;
            }
            throw null;
        }
    }

    public static class b implements s0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f1955a;
        public final /* synthetic */ String b;

        public b(c cVar, String str) {
            this.f1955a = cVar;
            this.b = str;
        }

        public static /* synthetic */ void a(int i) {
            String str = i != 3 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i != 3 ? 2 : 3)];
            if (i != 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$2";
            } else {
                objArr[0] = "kotlinTypeRefiner";
            }
            if (i == 1) {
                objArr[1] = "getSupertypes";
            } else if (i == 2) {
                objArr[1] = "getBuiltIns";
            } else if (i == 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$2";
            } else if (i != 4) {
                objArr[1] = "getParameters";
            } else {
                objArr[1] = "refine";
            }
            if (i == 3) {
                objArr[2] = "refine";
            }
            String format = String.format(str, objArr);
            if (i != 3) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }

        @Override // a.a.a.a.v0.m.s0
        public boolean a() {
            return false;
        }

        @Override // a.a.a.a.v0.m.s0
        public Collection<d0> b() {
            return l.f2119c;
        }

        @Override // a.a.a.a.v0.m.s0
        public a.a.a.a.v0.b.h c() {
            return this.f1955a;
        }

        @Override // a.a.a.a.v0.m.s0
        public List<r0> d() {
            return l.f2119c;
        }

        @Override // a.a.a.a.v0.m.s0
        public g m() {
            a.a.a.a.v0.a.d dVar = a.a.a.a.v0.a.d.m;
            if (dVar != null) {
                return dVar;
            }
            a(2);
            throw null;
        }

        public String toString() {
            return this.b;
        }
    }

    public static class c extends a.a.a.a.v0.b.d1.k {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(a.a.a.a.v0.f.d dVar) {
            super(w.a(), dVar, v.OPEN, a.a.a.a.v0.b.f.CLASS, Collections.emptyList(), m0.f491a, false, a.a.a.a.v0.l.b.f1789e);
            if (dVar != null) {
                if (h.b != null) {
                    h hVar = h.a.f321a;
                    m0 m0Var = m0.f491a;
                    if (hVar != null) {
                        i iVar = new i(this, null, hVar, true, b.a.DECLARATION, m0Var);
                        iVar.a(Collections.emptyList(), z0.f514d);
                        a.a.a.a.v0.j.w.i a2 = w.a(d().a());
                        iVar.a(new v(w.a("<ERROR>", this), a2, null, false, null, 28));
                        a(a2, Collections.singleton(iVar), iVar);
                        return;
                    }
                    i.a(5);
                    throw null;
                }
                throw null;
            }
            a(0);
            throw null;
        }

        public static /* synthetic */ void a(int i) {
            String str = (i == 2 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 2 || i == 5 || i == 8) ? 2 : 3)];
            switch (i) {
                case 1:
                    objArr[0] = "substitutor";
                    break;
                case 2:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorClassDescriptor";
                    break;
                case 3:
                    objArr[0] = "typeArguments";
                    break;
                case 4:
                case 7:
                    objArr[0] = "kotlinTypeRefiner";
                    break;
                case 6:
                    objArr[0] = "typeSubstitution";
                    break;
                default:
                    objArr[0] = "name";
                    break;
            }
            if (i == 2) {
                objArr[1] = "substitute";
            } else if (i == 5 || i == 8) {
                objArr[1] = "getMemberScope";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorClassDescriptor";
            }
            switch (i) {
                case 1:
                    objArr[2] = "substitute";
                    break;
                case 2:
                case 5:
                case 8:
                    break;
                case 3:
                case 4:
                case 6:
                case 7:
                    objArr[2] = "getMemberScope";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (i == 2 || i == 5 || i == 8) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }

        /* Return type fixed from 'a.a.a.a.v0.b.e' to match base method */
        @Override // a.a.a.a.v0.b.d1.b, a.a.a.a.v0.b.d1.b, a.a.a.a.v0.b.o0
        public a.a.a.a.v0.b.i a(a1 a1Var) {
            if (a1Var != null) {
                return this;
            }
            a(1);
            throw null;
        }

        /* Return type fixed from 'a.a.a.a.v0.b.l' to match base method */
        @Override // a.a.a.a.v0.b.d1.b, a.a.a.a.v0.b.d1.b, a.a.a.a.v0.b.o0
        /* renamed from: a  reason: collision with other method in class */
        public a.a.a.a.v0.b.i m82a(a1 a1Var) {
            if (a1Var != null) {
                return this;
            }
            a(1);
            throw null;
        }

        @Override // a.a.a.a.v0.b.d1.b, a.a.a.a.v0.b.d1.w
        public a.a.a.a.v0.j.w.i a(y0 y0Var, a.a.a.a.v0.m.i1.f fVar) {
            if (y0Var == null) {
                a(6);
                throw null;
            } else if (fVar != null) {
                StringBuilder a2 = e.a.a.a.a.a("Error scope for class ");
                a2.append(d());
                a2.append(" with arguments: ");
                a2.append(y0Var);
                a.a.a.a.v0.j.w.i a3 = w.a(a2.toString());
                if (a3 != null) {
                    return a3;
                }
                a(8);
                throw null;
            } else {
                a(7);
                throw null;
            }
        }

        @Override // a.a.a.a.v0.b.d1.k
        public String toString() {
            return d().a();
        }
    }

    public static class d implements a.a.a.a.v0.j.w.i {
        public final String b;

        public /* synthetic */ d(String str, a aVar) {
            if (str != null) {
                this.b = str;
            } else {
                a(0);
                throw null;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0017  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0022  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0077  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x007f  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x009e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ void a(int r10) {
            /*
            // Method dump skipped, instructions count: 306
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.m.w.d.a(int):void");
        }

        @Override // a.a.a.a.v0.j.w.i
        public Collection a(a.a.a.a.v0.f.d dVar, a.a.a.a.v0.c.a.b bVar) {
            if (dVar == null) {
                a(8);
                throw null;
            } else if (bVar != null) {
                a.a.a.a.v0.m.j1.a aVar = new a.a.a.a.v0.m.j1.a(w.b, this);
                aVar.a((i0) null, (i0) null, Collections.emptyList(), Collections.emptyList(), (d0) w.b("<ERROR FUNCTION RETURN TYPE>"), v.OPEN, z0.f515e);
                Set singleton = Collections.singleton(aVar);
                if (singleton != null) {
                    return singleton;
                }
                a(10);
                throw null;
            } else {
                a(9);
                throw null;
            }
        }

        @Override // a.a.a.a.v0.j.w.k
        public Collection<k> a(a.a.a.a.v0.j.w.d dVar, a.w.b.l<? super a.a.a.a.v0.f.d, Boolean> lVar) {
            if (dVar == null) {
                a(16);
                throw null;
            } else if (lVar != null) {
                List emptyList = Collections.emptyList();
                if (emptyList != null) {
                    return emptyList;
                }
                a(18);
                throw null;
            } else {
                a(17);
                throw null;
            }
        }

        @Override // a.a.a.a.v0.j.w.i
        public Set<a.a.a.a.v0.f.d> a() {
            Set<a.a.a.a.v0.f.d> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            a(11);
            throw null;
        }

        @Override // a.a.a.a.v0.j.w.k
        public a.a.a.a.v0.b.h b(a.a.a.a.v0.f.d dVar, a.a.a.a.v0.c.a.b bVar) {
            if (dVar == null) {
                a(1);
                throw null;
            } else if (bVar != null) {
                String a2 = dVar.a();
                if (a2 != null) {
                    return new c(a.a.a.a.v0.f.d.d("<ERROR CLASS: " + a2 + ">"));
                }
                w.a(1);
                throw null;
            } else {
                a(2);
                throw null;
            }
        }

        @Override // a.a.a.a.v0.j.w.i
        public Set<a.a.a.a.v0.f.d> b() {
            Set<a.a.a.a.v0.f.d> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            a(12);
            throw null;
        }

        @Override // a.a.a.a.v0.j.w.i
        public Collection c(a.a.a.a.v0.f.d dVar, a.a.a.a.v0.c.a.b bVar) {
            if (dVar == null) {
                a(5);
                throw null;
            } else if (bVar != null) {
                Set<f0> set = w.f1954f;
                if (set != null) {
                    return set;
                }
                a(7);
                throw null;
            } else {
                a(6);
                throw null;
            }
        }

        public String toString() {
            StringBuilder a2 = e.a.a.a.a.a("ErrorScope{");
            a2.append(this.b);
            a2.append('}');
            return a2.toString();
        }
    }

    public static class e implements a.a.a.a.v0.j.w.i {
        public final String b;

        public /* synthetic */ e(String str, a aVar) {
            if (str != null) {
                this.b = str;
            } else {
                a(0);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 11:
                case 13:
                    objArr[0] = "name";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                case 12:
                    objArr[0] = "location";
                    break;
                case 9:
                    objArr[0] = "kindFilter";
                    break;
                case 10:
                    objArr[0] = "nameFilter";
                    break;
                case 14:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "message";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ThrowingScope";
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedClassifier";
                    break;
                case 3:
                case 4:
                    objArr[2] = "getContributedClassifierIncludeDeprecated";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedVariables";
                    break;
                case 7:
                case 8:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 9:
                case 10:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 11:
                case 12:
                    objArr[2] = "recordLookup";
                    break;
                case 13:
                    objArr[2] = "definitelyDoesNotContainName";
                    break;
                case 14:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // a.a.a.a.v0.j.w.i
        public Collection<? extends l0> a(a.a.a.a.v0.f.d dVar, a.a.a.a.v0.c.a.b bVar) {
            if (dVar == null) {
                a(7);
                throw null;
            } else if (bVar == null) {
                a(8);
                throw null;
            } else {
                throw new IllegalStateException(this.b + ", required name: " + dVar);
            }
        }

        @Override // a.a.a.a.v0.j.w.k
        public Collection<k> a(a.a.a.a.v0.j.w.d dVar, a.w.b.l<? super a.a.a.a.v0.f.d, Boolean> lVar) {
            if (dVar == null) {
                a(9);
                throw null;
            } else if (lVar == null) {
                a(10);
                throw null;
            } else {
                throw new IllegalStateException(this.b);
            }
        }

        @Override // a.a.a.a.v0.j.w.i
        public Set<a.a.a.a.v0.f.d> a() {
            throw new IllegalStateException();
        }

        @Override // a.a.a.a.v0.j.w.k
        public a.a.a.a.v0.b.h b(a.a.a.a.v0.f.d dVar, a.a.a.a.v0.c.a.b bVar) {
            if (dVar == null) {
                a(1);
                throw null;
            } else if (bVar == null) {
                a(2);
                throw null;
            } else {
                throw new IllegalStateException(this.b + ", required name: " + dVar);
            }
        }

        @Override // a.a.a.a.v0.j.w.i
        public Set<a.a.a.a.v0.f.d> b() {
            throw new IllegalStateException();
        }

        @Override // a.a.a.a.v0.j.w.i
        public Collection<? extends f0> c(a.a.a.a.v0.f.d dVar, a.a.a.a.v0.c.a.b bVar) {
            if (dVar == null) {
                a(5);
                throw null;
            } else if (bVar == null) {
                a(6);
                throw null;
            } else {
                throw new IllegalStateException(this.b + ", required name: " + dVar);
            }
        }

        public String toString() {
            StringBuilder a2 = e.a.a.a.a.a("ThrowingScope{");
            a2.append(this.b);
            a2.append('}');
            return a2.toString();
        }
    }

    public static class f implements s0 {
        public static /* synthetic */ void a(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 1 || i == 2 || i == 3 || i == 4 || i == 6) ? 2 : 3)];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$UninferredParameterTypeConstructor";
                    break;
                case 5:
                    objArr[0] = "kotlinTypeRefiner";
                    break;
                default:
                    objArr[0] = "descriptor";
                    break;
            }
            if (i == 1) {
                objArr[1] = "getTypeParameterDescriptor";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getSupertypes";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i != 6) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$UninferredParameterTypeConstructor";
            } else {
                objArr[1] = "refine";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                    break;
                case 5:
                    objArr[2] = "refine";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (i == 1 || i == 2 || i == 3 || i == 4 || i == 6) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }

        @Override // a.a.a.a.v0.m.s0
        public boolean a() {
            throw null;
        }

        @Override // a.a.a.a.v0.m.s0
        public Collection<d0> b() {
            throw null;
        }

        @Override // a.a.a.a.v0.m.s0
        public a.a.a.a.v0.b.h c() {
            throw null;
        }

        @Override // a.a.a.a.v0.m.s0
        public List<r0> d() {
            throw null;
        }

        @Override // a.a.a.a.v0.m.s0
        public g m() {
            throw null;
        }
    }

    static {
        c cVar = b;
        if (h.b != null) {
            h hVar = h.a.f321a;
            v vVar = v.OPEN;
            a1 a1Var = z0.f515e;
            a.a.a.a.v0.f.d d2 = a.a.a.a.v0.f.d.d("<ERROR PROPERTY>");
            b.a aVar = b.a.DECLARATION;
            m0 m0Var = m0.f491a;
            if (cVar == null) {
                a.a.a.a.v0.b.d1.f0.a(7);
                throw null;
            } else if (hVar == null) {
                a.a.a.a.v0.b.d1.f0.a(8);
                throw null;
            } else if (vVar == null) {
                a.a.a.a.v0.b.d1.f0.a(9);
                throw null;
            } else if (a1Var == null) {
                a.a.a.a.v0.b.d1.f0.a(10);
                throw null;
            } else if (aVar != null) {
                a.a.a.a.v0.b.d1.f0 f0Var = new a.a.a.a.v0.b.d1.f0(cVar, null, hVar, vVar, a1Var, true, d2, aVar, m0Var, false, false, false, false, false, false);
                f0Var.a(f1952d, Collections.emptyList(), (i0) null, (i0) null);
                f1953e = f0Var;
                f1954f = Collections.singleton(f0Var);
            } else {
                a.a.a.a.v0.b.d1.f0.a(12);
                throw null;
            }
        } else {
            throw null;
        }
    }

    public static a.a.a.a.v0.b.w a() {
        a.a.a.a.v0.b.w wVar = f1950a;
        if (wVar != null) {
            return wVar;
        }
        a(19);
        throw null;
    }

    public static a.a.a.a.v0.j.w.i a(String str) {
        if (str != null) {
            return a(str, false);
        }
        a(2);
        throw null;
    }

    public static a.a.a.a.v0.j.w.i a(String str, boolean z) {
        if (str != null) {
            return z ? new e(str, null) : new d(str, null);
        }
        a(3);
        throw null;
    }

    public static k0 a(String str, List<v0> list) {
        if (str == null) {
            a(11);
            throw null;
        } else if (list != null) {
            return new v(c(str), a(str), list, false, null, 16);
        } else {
            a(12);
            throw null;
        }
    }

    public static s0 a(String str, c cVar) {
        if (str == null) {
            a(17);
            throw null;
        } else if (cVar != null) {
            return new b(cVar, str);
        } else {
            a(18);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 4 || i == 6 || i == 19) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 6 || i == 19) ? 2 : 3)];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 7:
            case 11:
            case 15:
                objArr[0] = "debugMessage";
                break;
            case 4:
            case 6:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils";
                break;
            case 5:
                objArr[0] = "ownerScope";
                break;
            case 8:
            case 9:
            case 16:
            case 17:
                objArr[0] = "debugName";
                break;
            case 10:
                objArr[0] = "typeConstructor";
                break;
            case 12:
            case 14:
                objArr[0] = "arguments";
                break;
            case 13:
                objArr[0] = "presentableName";
                break;
            case 18:
                objArr[0] = "errorClass";
                break;
            case 20:
                objArr[0] = "typeParameterDescriptor";
                break;
            default:
                objArr[0] = "function";
                break;
        }
        if (i == 4) {
            objArr[1] = "createErrorProperty";
        } else if (i == 6) {
            objArr[1] = "createErrorFunction";
        } else if (i != 19) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils";
        } else {
            objArr[1] = "getErrorModule";
        }
        switch (i) {
            case 1:
                objArr[2] = "createErrorClass";
                break;
            case 2:
            case 3:
                objArr[2] = "createErrorScope";
                break;
            case 4:
            case 6:
            case 19:
                break;
            case 5:
                objArr[2] = "createErrorFunction";
                break;
            case 7:
                objArr[2] = "createErrorType";
                break;
            case 8:
                objArr[2] = "createErrorTypeWithCustomDebugName";
                break;
            case 9:
            case 10:
                objArr[2] = "createErrorTypeWithCustomConstructor";
                break;
            case 11:
            case 12:
                objArr[2] = "createErrorTypeWithArguments";
                break;
            case 13:
            case 14:
                objArr[2] = "createUnresolvedType";
                break;
            case 15:
                objArr[2] = "createErrorTypeConstructor";
                break;
            case 16:
            case 17:
            case 18:
                objArr[2] = "createErrorTypeConstructorWithCustomDebugName";
                break;
            case 20:
                objArr[2] = "createUninferredParameterType";
                break;
            default:
                objArr[2] = "containsErrorTypeInParameters";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 4 || i == 6 || i == 19) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    public static k0 b(String str) {
        if (str != null) {
            return a(str, Collections.emptyList());
        }
        a(7);
        throw null;
    }

    public static s0 c(String str) {
        if (str != null) {
            return a(e.a.a.a.a.a("[ERROR : ", str, "]"), b);
        }
        a(15);
        throw null;
    }

    public static k0 a(String str, s0 s0Var) {
        if (str == null) {
            a(9);
            throw null;
        } else if (s0Var != null) {
            return new v(s0Var, a(str), null, false, null, 28);
        } else {
            a(10);
            throw null;
        }
    }

    public static boolean a(k kVar) {
        if (kVar == null) {
            return false;
        }
        if ((kVar instanceof c) || (kVar.b() instanceof c) || kVar == f1950a) {
            return true;
        }
        return false;
    }
}
