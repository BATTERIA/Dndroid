package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.a;
import a.a.a.a.v0.b.a1;
import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.d1.o0;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.s;
import a.a.a.a.v0.b.v;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.b.y0;
import a.a.a.a.v0.b.z0;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.o.l;
import a.t.f;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class s extends n implements a.a.a.a.v0.b.s {
    public volatile a.w.b.a<Collection<a.a.a.a.v0.b.s>> A;
    public final a.a.a.a.v0.b.s B;
    public final b.a C;
    public a.a.a.a.v0.b.s D;
    public Map<a.AbstractC0014a<?>, Object> E;

    /* renamed from: g  reason: collision with root package name */
    public List<r0> f413g;

    /* renamed from: h  reason: collision with root package name */
    public List<w0> f414h;
    public d0 i;
    public i0 j;
    public i0 k;
    public v l;
    public a1 m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public Collection<? extends a.a.a.a.v0.b.s> z;

    public class a implements a.w.b.a<Collection<a.a.a.a.v0.b.s>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a.a.a.a.v0.m.a1 f415c;

        public a(a.a.a.a.v0.m.a1 a1Var) {
            this.f415c = a1Var;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public Collection<a.a.a.a.v0.b.s> a() {
            l lVar = new l();
            for (a.a.a.a.v0.b.s sVar : s.this.f()) {
                lVar.add(sVar.a(this.f415c));
            }
            return lVar;
        }
    }

    public static class b implements a.w.b.a<List<y0>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ List f417c;

        public b(List list) {
            this.f417c = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public List<y0> a() {
            return this.f417c;
        }
    }

    public class c implements s.a<a.a.a.a.v0.b.s> {

        /* renamed from: a  reason: collision with root package name */
        public a.a.a.a.v0.m.y0 f418a;
        public k b;

        /* renamed from: c  reason: collision with root package name */
        public v f419c;

        /* renamed from: d  reason: collision with root package name */
        public a1 f420d;

        /* renamed from: e  reason: collision with root package name */
        public a.a.a.a.v0.b.s f421e;

        /* renamed from: f  reason: collision with root package name */
        public b.a f422f;

        /* renamed from: g  reason: collision with root package name */
        public List<w0> f423g;

        /* renamed from: h  reason: collision with root package name */
        public i0 f424h;
        public i0 i;
        public d0 j;
        public d k;
        public boolean l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public List<r0> q;
        public h r;
        public boolean s;
        public Map<a.AbstractC0014a<?>, Object> t;
        public Boolean u;
        public boolean v;
        public final /* synthetic */ s w;

        public c(s sVar, a.a.a.a.v0.m.y0 y0Var, k kVar, v vVar, a1 a1Var, b.a aVar, List<w0> list, i0 i0Var, d0 d0Var, d dVar) {
            if (y0Var == null) {
                a(0);
                throw null;
            } else if (kVar == null) {
                a(1);
                throw null;
            } else if (vVar == null) {
                a(2);
                throw null;
            } else if (a1Var == null) {
                a(3);
                throw null;
            } else if (aVar == null) {
                a(4);
                throw null;
            } else if (list == null) {
                a(5);
                throw null;
            } else if (d0Var != null) {
                this.w = sVar;
                this.f421e = null;
                s sVar2 = this.w;
                this.i = sVar2.k;
                this.l = true;
                this.m = false;
                this.n = false;
                this.o = false;
                this.p = sVar2.u;
                this.q = null;
                this.r = null;
                this.s = sVar2.v;
                this.t = new LinkedHashMap();
                this.u = null;
                this.v = false;
                this.f418a = y0Var;
                this.b = kVar;
                this.f419c = vVar;
                this.f420d = a1Var;
                this.f422f = aVar;
                this.f423g = list;
                this.f424h = i0Var;
                this.j = d0Var;
                this.k = dVar;
            } else {
                a(6);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i2) {
            String str;
            int i3;
            switch (i2) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 9:
                case 11:
                case 13:
                case 16:
                case 18:
                case 20:
                case 22:
                case 32:
                case 34:
                case 36:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i2) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    i3 = 2;
                    break;
                case 9:
                case 11:
                case 13:
                case 16:
                case 18:
                case 20:
                case 22:
                case 32:
                case 34:
                case 36:
                default:
                    i3 = 3;
                    break;
            }
            Object[] objArr = new Object[i3];
            switch (i2) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 13:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newReturnType";
                    break;
                case 7:
                    objArr[0] = "owner";
                    break;
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 9:
                    objArr[0] = "modality";
                    break;
                case 11:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "name";
                    break;
                case 18:
                case 20:
                    objArr[0] = "parameters";
                    break;
                case 22:
                    objArr[0] = "type";
                    break;
                case 32:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 34:
                default:
                    objArr[0] = "substitution";
                    break;
                case 36:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i2) {
                case 8:
                    objArr[1] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 16:
                case 18:
                case 20:
                case 22:
                case 32:
                case 34:
                case 36:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[1] = "setModality";
                    break;
                case 12:
                    objArr[1] = "setVisibility";
                    break;
                case 14:
                    objArr[1] = "setKind";
                    break;
                case 15:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 17:
                    objArr[1] = "setName";
                    break;
                case 19:
                    objArr[1] = "setValueParameters";
                    break;
                case 21:
                    objArr[1] = "setTypeParameters";
                    break;
                case 23:
                    objArr[1] = "setReturnType";
                    break;
                case 24:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 25:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 26:
                    objArr[1] = "setOriginal";
                    break;
                case 27:
                    objArr[1] = "setSignatureChange";
                    break;
                case 28:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 29:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 30:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 31:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 33:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 35:
                    objArr[1] = "setSubstitution";
                    break;
                case 37:
                    objArr[1] = "putUserData";
                    break;
                case 38:
                    objArr[1] = "getSubstitution";
                    break;
                case 39:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i2) {
                case 7:
                    objArr[2] = "setOwner";
                    break;
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    break;
                case 9:
                    objArr[2] = "setModality";
                    break;
                case 11:
                    objArr[2] = "setVisibility";
                    break;
                case 13:
                    objArr[2] = "setKind";
                    break;
                case 16:
                    objArr[2] = "setName";
                    break;
                case 18:
                    objArr[2] = "setValueParameters";
                    break;
                case 20:
                    objArr[2] = "setTypeParameters";
                    break;
                case 22:
                    objArr[2] = "setReturnType";
                    break;
                case 32:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 34:
                    objArr[2] = "setSubstitution";
                    break;
                case 36:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            switch (i2) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    throw new IllegalStateException(format);
                case 9:
                case 11:
                case 13:
                case 16:
                case 18:
                case 20:
                case 22:
                case 32:
                case 34:
                case 36:
                default:
                    throw new IllegalArgumentException(format);
            }
        }

        /* Return type fixed from 'a.a.a.a.v0.b.s$a' to match base method */
        @Override // a.a.a.a.v0.b.s.a
        public s.a<a.a.a.a.v0.b.s> a(h hVar) {
            if (hVar != null) {
                this.r = hVar;
                return this;
            }
            a(32);
            throw null;
        }

        @Override // a.a.a.a.v0.b.s.a
        public a.a.a.a.v0.b.s a() {
            return this.w.a(this);
        }

        /* Return type fixed from 'a.a.a.a.v0.b.s$a' to match base method */
        @Override // a.a.a.a.v0.b.s.a
        public s.a<a.a.a.a.v0.b.s> b() {
            this.o = true;
            return this;
        }

        /* Return type fixed from 'a.a.a.a.v0.b.s$a' to match base method */
        @Override // a.a.a.a.v0.b.s.a
        public s.a<a.a.a.a.v0.b.s> c() {
            this.n = true;
            return this;
        }

        /* Return type fixed from 'a.a.a.a.v0.b.s$a' to match base method */
        @Override // a.a.a.a.v0.b.s.a
        public s.a<a.a.a.a.v0.b.s> d() {
            this.s = true;
            return this;
        }

        /* Return type fixed from 'a.a.a.a.v0.b.s$a' to match base method */
        @Override // a.a.a.a.v0.b.s.a
        public s.a<a.a.a.a.v0.b.s> e() {
            this.p = true;
            return this;
        }

        /* Return type fixed from 'a.a.a.a.v0.b.s$a' to match base method */
        @Override // a.a.a.a.v0.b.s.a
        public s.a<a.a.a.a.v0.b.s> f() {
            this.m = true;
            return this;
        }

        /* Return type fixed from 'a.a.a.a.v0.b.s$a' to match base method */
        @Override // a.a.a.a.v0.b.s.a
        public s.a<a.a.a.a.v0.b.s> a(boolean z) {
            this.l = z;
            return this;
        }

        /* Return type fixed from 'a.a.a.a.v0.b.s$a' to match base method */
        @Override // a.a.a.a.v0.b.s.a
        public s.a<a.a.a.a.v0.b.s> b(i0 i0Var) {
            this.f424h = i0Var;
            return this;
        }

        /* Return type fixed from 'a.a.a.a.v0.b.s$a' to match base method */
        @Override // a.a.a.a.v0.b.s.a
        public s.a<a.a.a.a.v0.b.s> a(i0 i0Var) {
            this.i = i0Var;
            return this;
        }

        /* Return type fixed from 'a.a.a.a.v0.b.s$a' to match base method */
        @Override // a.a.a.a.v0.b.s.a
        public s.a<a.a.a.a.v0.b.s> b(List list) {
            if (list != null) {
                this.q = list;
                return this;
            }
            a(20);
            throw null;
        }

        /* Return type fixed from 'a.a.a.a.v0.b.s$a' to match base method */
        @Override // a.a.a.a.v0.b.s.a
        public s.a<a.a.a.a.v0.b.s> a(b.a aVar) {
            if (aVar != null) {
                this.f422f = aVar;
                return this;
            }
            a(13);
            throw null;
        }

        /* Return type fixed from 'a.a.a.a.v0.b.s$a' to match base method */
        @Override // a.a.a.a.v0.b.s.a
        public s.a<a.a.a.a.v0.b.s> a(v vVar) {
            if (vVar != null) {
                this.f419c = vVar;
                return this;
            }
            a(9);
            throw null;
        }

        /* Return type fixed from 'a.a.a.a.v0.b.s$a' to match base method */
        @Override // a.a.a.a.v0.b.s.a
        public s.a<a.a.a.a.v0.b.s> a(d dVar) {
            if (dVar != null) {
                this.k = dVar;
                return this;
            }
            a(16);
            throw null;
        }

        /* Return type fixed from 'a.a.a.a.v0.b.s$a' to match base method */
        @Override // a.a.a.a.v0.b.s.a
        public s.a<a.a.a.a.v0.b.s> a(a.a.a.a.v0.b.b bVar) {
            this.f421e = (a.a.a.a.v0.b.s) bVar;
            return this;
        }

        /* Return type fixed from 'a.a.a.a.v0.b.s$a' to match base method */
        @Override // a.a.a.a.v0.b.s.a
        public s.a<a.a.a.a.v0.b.s> a(k kVar) {
            if (kVar != null) {
                this.b = kVar;
                return this;
            }
            a(7);
            throw null;
        }

        /* Return type fixed from 'a.a.a.a.v0.b.s$a' to match base method */
        @Override // a.a.a.a.v0.b.s.a
        public s.a<a.a.a.a.v0.b.s> a(d0 d0Var) {
            if (d0Var != null) {
                this.j = d0Var;
                return this;
            }
            a(22);
            throw null;
        }

        /* Return type fixed from 'a.a.a.a.v0.b.s$a' to match base method */
        @Override // a.a.a.a.v0.b.s.a
        public s.a<a.a.a.a.v0.b.s> a(a.a.a.a.v0.m.y0 y0Var) {
            if (y0Var != null) {
                this.f418a = y0Var;
                return this;
            }
            a(34);
            throw null;
        }

        /* Return type fixed from 'a.a.a.a.v0.b.s$a' to match base method */
        @Override // a.a.a.a.v0.b.s.a
        public s.a<a.a.a.a.v0.b.s> a(List list) {
            if (list != null) {
                this.f423g = list;
                return this;
            }
            a(18);
            throw null;
        }

        /* Return type fixed from 'a.a.a.a.v0.b.s$a' to match base method */
        @Override // a.a.a.a.v0.b.s.a
        public s.a<a.a.a.a.v0.b.s> a(a1 a1Var) {
            if (a1Var != null) {
                this.f420d = a1Var;
                return this;
            }
            a(11);
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(k kVar, a.a.a.a.v0.b.s sVar, h hVar, d dVar, b.a aVar, m0 m0Var) {
        super(kVar, hVar, dVar, m0Var);
        if (kVar == null) {
            a(0);
            throw null;
        } else if (hVar == null) {
            a(1);
            throw null;
        } else if (dVar == null) {
            a(2);
            throw null;
        } else if (aVar == null) {
            a(3);
            throw null;
        } else if (m0Var != null) {
            this.m = z0.i;
            this.n = false;
            this.o = false;
            this.p = false;
            this.q = false;
            this.r = false;
            this.s = false;
            this.t = false;
            this.u = false;
            this.v = false;
            this.w = false;
            this.x = true;
            this.y = false;
            this.z = null;
            this.A = null;
            this.D = null;
            this.E = null;
            this.B = sVar == null ? this : sVar;
            this.C = aVar;
        } else {
            a(4);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 11:
            case 15:
            case 20:
            case 22:
            case 23:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                i3 = 2;
                break;
            case 9:
            case 10:
            case 11:
            case 15:
            case 20:
            case 22:
            case 23:
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "typeParameters";
                break;
            case 6:
            case 26:
            case 28:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 7:
            case 9:
                objArr[0] = "visibility";
                break;
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 10:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 11:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 15:
                objArr[0] = "overriddenDescriptors";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
            case 27:
            case 29:
                objArr[0] = "substitutor";
                break;
            case 23:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i2) {
            case 8:
                objArr[1] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 15:
            case 20:
            case 22:
            case 23:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 12:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 13:
                objArr[1] = "getModality";
                break;
            case 14:
                objArr[1] = "getVisibility";
                break;
            case 16:
                objArr[1] = "getTypeParameters";
                break;
            case 17:
                objArr[1] = "getValueParameters";
                break;
            case 18:
                objArr[1] = "getOriginal";
                break;
            case 19:
                objArr[1] = "getKind";
                break;
            case 21:
                objArr[1] = "newCopyBuilder";
                break;
            case 24:
                objArr[1] = "copy";
                break;
            case 25:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i2) {
            case 5:
            case 6:
            case 7:
                objArr[2] = "initialize";
                break;
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setReturnType";
                break;
            case 11:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 15:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "newCopyBuilder";
                break;
            case 23:
                objArr[2] = "doSubstitute";
                break;
            case 26:
            case 27:
            case 28:
            case 29:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                throw new IllegalStateException(format);
            case 9:
            case 10:
            case 11:
            case 15:
            case 20:
            case 22:
            case 23:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // a.a.a.a.v0.b.u
    public boolean D() {
        return this.s;
    }

    @Override // a.a.a.a.v0.b.s
    public a.a.a.a.v0.b.s G() {
        return this.D;
    }

    @Override // a.a.a.a.v0.b.u
    public boolean H() {
        return this.p;
    }

    @Override // a.a.a.a.v0.b.a
    public i0 J() {
        return this.k;
    }

    @Override // a.a.a.a.v0.b.s
    public boolean L() {
        return this.u;
    }

    @Override // a.a.a.a.v0.b.s
    public boolean M() {
        return this.w;
    }

    @Override // a.a.a.a.v0.b.s
    public boolean Q() {
        return this.r;
    }

    @Override // a.a.a.a.v0.b.s
    public boolean S() {
        if (this.n) {
            return true;
        }
        for (a.a.a.a.v0.b.s sVar : a().f()) {
            if (sVar.S()) {
                return true;
            }
        }
        return false;
    }

    public s a(i0 i0Var, i0 i0Var2, List<? extends r0> list, List<w0> list2, d0 d0Var, v vVar, a1 a1Var) {
        if (list == null) {
            a(5);
            throw null;
        } else if (list2 == null) {
            a(6);
            throw null;
        } else if (a1Var != null) {
            this.f413g = f.g(list);
            this.f414h = f.g(list2);
            this.i = d0Var;
            this.l = vVar;
            this.m = a1Var;
            this.j = i0Var;
            this.k = i0Var2;
            for (int i2 = 0; i2 < list.size(); i2++) {
                r0 r0Var = (r0) list.get(i2);
                if (r0Var.z() != i2) {
                    throw new IllegalStateException(r0Var + " index is " + r0Var.z() + " but position is " + i2);
                }
            }
            for (int i3 = 0; i3 < list2.size(); i3++) {
                w0 w0Var = list2.get(i3);
                if (w0Var.z() != i3 + 0) {
                    throw new IllegalStateException(w0Var + "index is " + w0Var.z() + " but position is " + i3);
                }
            }
            return this;
        } else {
            a(7);
            throw null;
        }
    }

    public abstract s a(k kVar, a.a.a.a.v0.b.s sVar, b.a aVar, d dVar, h hVar, m0 m0Var);

    @Override // a.a.a.a.v0.b.s, a.a.a.a.v0.b.b, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.a, a.a.a.a.v0.b.d1.m, a.a.a.a.v0.b.k
    public a.a.a.a.v0.b.s a() {
        a.a.a.a.v0.b.s sVar = this.B;
        a.a.a.a.v0.b.s a2 = sVar == this ? this : sVar.a();
        if (a2 != null) {
            return a2;
        }
        a(18);
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: a.a.a.a.v0.b.i0 */
    /* JADX WARN: Multi-variable type inference failed */
    public a.a.a.a.v0.b.s a(c cVar) {
        m0 m0Var;
        i0 i0Var;
        i0 i0Var2;
        d0 b2;
        a.w.b.a<Collection<a.a.a.a.v0.b.s>> aVar;
        a.a.a.a.v0.b.s sVar;
        if (cVar != null) {
            boolean[] zArr = new boolean[1];
            h a2 = cVar.r != null ? g.a(y(), cVar.r) : y();
            k kVar = cVar.b;
            a.a.a.a.v0.b.s sVar2 = cVar.f421e;
            b.a aVar2 = cVar.f422f;
            d dVar = cVar.k;
            if (cVar.n) {
                if (sVar2 != null) {
                    sVar = sVar2;
                } else {
                    sVar = a();
                }
                m0Var = sVar.r();
            } else {
                m0Var = m0.f491a;
            }
            if (m0Var != null) {
                s a3 = a(kVar, sVar2, aVar2, dVar, a2, m0Var);
                List<r0> list = cVar.q;
                if (list == null) {
                    list = k();
                }
                zArr[0] = zArr[0] | (!list.isEmpty());
                ArrayList arrayList = new ArrayList(list.size());
                a.a.a.a.v0.m.a1 a4 = g.a(list, cVar.f418a, a3, arrayList, zArr);
                if (a4 == null) {
                    return null;
                }
                i0 i0Var3 = cVar.f424h;
                if (i0Var3 != null) {
                    d0 b3 = a4.b(i0Var3.c(), g1.IN_VARIANCE);
                    if (b3 == null) {
                        return null;
                    }
                    i0 i0Var4 = new i0(a3, new a.a.a.a.v0.j.w.o.b(a3, b3, cVar.f424h.getValue()), cVar.f424h.y());
                    zArr[0] = (b3 != cVar.f424h.c()) | zArr[0];
                    i0Var = i0Var4;
                } else {
                    i0Var = null;
                }
                i0 i0Var5 = cVar.i;
                if (i0Var5 != 0) {
                    i0 a5 = i0Var5.a(a4);
                    if (a5 == null) {
                        return null;
                    }
                    zArr[0] = zArr[0] | (a5 != cVar.i);
                    i0Var2 = a5;
                } else {
                    i0Var2 = null;
                }
                List<w0> a6 = a(a3, cVar.f423g, a4, cVar.o, cVar.n, zArr);
                if (a6 == null || (b2 = a4.b(cVar.j, g1.OUT_VARIANCE)) == null) {
                    return null;
                }
                zArr[0] = zArr[0] | (b2 != cVar.j);
                if (!zArr[0] && cVar.v) {
                    return this;
                }
                a3.a(i0Var, i0Var2, arrayList, a6, b2, cVar.f419c, cVar.f420d);
                a3.n = this.n;
                a3.o = this.o;
                a3.p = this.p;
                a3.q = this.q;
                a3.r = this.r;
                a3.w = this.w;
                a3.s = this.s;
                a3.t = this.t;
                a3.a(this.x);
                a3.u = cVar.p;
                a3.v = cVar.s;
                Boolean bool = cVar.u;
                a3.b(bool != null ? bool.booleanValue() : this.y);
                if (!cVar.t.isEmpty() || this.E != null) {
                    Map<a.AbstractC0014a<?>, Object> map = cVar.t;
                    Map<a.AbstractC0014a<?>, Object> map2 = this.E;
                    if (map2 != null) {
                        for (Map.Entry<a.AbstractC0014a<?>, Object> entry : map2.entrySet()) {
                            if (!map.containsKey(entry.getKey())) {
                                map.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    if (map.size() == 1) {
                        map = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
                    }
                    a3.E = map;
                }
                if (cVar.m || this.D != null) {
                    a.a.a.a.v0.b.s sVar3 = this.D;
                    if (sVar3 == null) {
                        sVar3 = this;
                    }
                    a3.D = sVar3.a(a4);
                }
                if (cVar.l && !a().f().isEmpty()) {
                    if (cVar.f418a.d()) {
                        aVar = this.A;
                        if (aVar == null) {
                            a3.a(f());
                        }
                    } else {
                        aVar = new a(a4);
                    }
                    a3.A = aVar;
                }
                return a3;
            }
            a(25);
            throw null;
        }
        a(23);
        throw null;
    }

    @Override // a.a.a.a.v0.b.b
    public a.a.a.a.v0.b.s a(k kVar, v vVar, a1 a1Var, b.a aVar, boolean z2) {
        a.a.a.a.v0.b.s a2 = s().a(kVar).a(vVar).a(a1Var).a(aVar).a(z2).a();
        if (a2 != null) {
            return a2;
        }
        a(24);
        throw null;
    }

    @Override // a.a.a.a.v0.b.a
    public <V> V a(a.AbstractC0014a<V> aVar) {
        Map<a.AbstractC0014a<?>, Object> map = this.E;
        if (map == null) {
            return null;
        }
        return (V) map.get(aVar);
    }

    @Override // a.a.a.a.v0.b.k
    public <R, D> R a(m<R, D> mVar, D d2) {
        return mVar.a(this, d2);
    }

    public <V> void a(a.AbstractC0014a<V> aVar, Object obj) {
        if (this.E == null) {
            this.E = new LinkedHashMap();
        }
        this.E.put(aVar, obj);
    }

    public void a(d0 d0Var) {
        if (d0Var != null) {
            this.i = d0Var;
        } else {
            a(10);
            throw null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Collection<? extends a.a.a.a.v0.b.b> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.a.a.a.v0.b.b
    public void a(Collection<? extends a.a.a.a.v0.b.b> collection) {
        if (collection != 0) {
            this.z = collection;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (((a.a.a.a.v0.b.s) it.next()).f0()) {
                    this.v = true;
                    return;
                }
            }
            return;
        }
        a(15);
        throw null;
    }

    public void a(boolean z2) {
        this.x = z2;
    }

    public c b(a.a.a.a.v0.m.a1 a1Var) {
        if (a1Var != null) {
            return new c(this, a1Var.a(), b(), o(), g(), t(), j(), this.j, h(), null);
        }
        a(22);
        throw null;
    }

    public void b(boolean z2) {
        this.y = z2;
    }

    @Override // a.a.a.a.v0.b.s, a.a.a.a.v0.b.b, a.a.a.a.v0.b.a
    public Collection<? extends a.a.a.a.v0.b.s> f() {
        a.w.b.a<Collection<a.a.a.a.v0.b.s>> aVar = this.A;
        if (aVar != null) {
            this.z = aVar.a();
            this.A = null;
        }
        Collection<? extends a.a.a.a.v0.b.s> collection = this.z;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        a(12);
        throw null;
    }

    @Override // a.a.a.a.v0.b.s
    public boolean f0() {
        return this.v;
    }

    @Override // a.a.a.a.v0.b.o, a.a.a.a.v0.b.u
    public a1 g() {
        a1 a1Var = this.m;
        if (a1Var != null) {
            return a1Var;
        }
        a(14);
        throw null;
    }

    @Override // a.a.a.a.v0.b.a
    public i0 g0() {
        return this.j;
    }

    @Override // a.a.a.a.v0.b.a
    public d0 h() {
        return this.i;
    }

    @Override // a.a.a.a.v0.b.a
    public List<w0> j() {
        List<w0> list = this.f414h;
        if (list != null) {
            return list;
        }
        a(17);
        throw null;
    }

    @Override // a.a.a.a.v0.b.a
    public List<r0> k() {
        List<r0> list = this.f413g;
        if (list != null) {
            return list;
        }
        a(16);
        throw null;
    }

    @Override // a.a.a.a.v0.b.u
    public boolean m0() {
        return this.t;
    }

    @Override // a.a.a.a.v0.b.u
    public v o() {
        v vVar = this.l;
        if (vVar != null) {
            return vVar;
        }
        a(13);
        throw null;
    }

    @Override // a.a.a.a.v0.b.s
    public boolean p() {
        return this.q;
    }

    @Override // a.a.a.a.v0.b.s
    public s.a<? extends a.a.a.a.v0.b.s> s() {
        return b(a.a.a.a.v0.m.a1.b);
    }

    @Override // a.a.a.a.v0.b.a
    public boolean s0() {
        return this.y;
    }

    @Override // a.a.a.a.v0.b.b
    public b.a t() {
        b.a aVar = this.C;
        if (aVar != null) {
            return aVar;
        }
        a(19);
        throw null;
    }

    @Override // a.a.a.a.v0.b.s
    public boolean x0() {
        if (this.o) {
            return true;
        }
        for (a.a.a.a.v0.b.s sVar : a().f()) {
            if (sVar.x0()) {
                return true;
            }
        }
        return false;
    }

    public static List<w0> a(a.a.a.a.v0.b.s sVar, List<w0> list, a.a.a.a.v0.m.a1 a1Var, boolean z2, boolean z3, boolean[] zArr) {
        if (list == null) {
            a(28);
            throw null;
        } else if (a1Var != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (w0 w0Var : list) {
                d0 b2 = a1Var.b(w0Var.c(), g1.IN_VARIANCE);
                d0 W = w0Var.W();
                d0 b3 = W == null ? null : a1Var.b(W, g1.IN_VARIANCE);
                if (b2 == null) {
                    return null;
                }
                if (!((b2 == w0Var.c() && W == b3) || zArr == null)) {
                    zArr[0] = true;
                }
                arrayList.add(o0.a(sVar, z2 ? null : w0Var, w0Var.z(), w0Var.y(), w0Var.d(), b2, w0Var.B(), w0Var.C(), w0Var.k0(), b3, z3 ? w0Var.r() : m0.f491a, w0Var instanceof o0.a ? new b((List) ((o0.a) w0Var).n.getValue()) : null));
            }
            return arrayList;
        } else {
            a(29);
            throw null;
        }
    }

    /* Return type fixed from 'a.a.a.a.v0.b.s' to match base method */
    @Override // a.a.a.a.v0.b.s, a.a.a.a.v0.b.o0
    public a.a.a.a.v0.b.a a(a.a.a.a.v0.m.a1 a1Var) {
        if (a1Var == null) {
            a(20);
            throw null;
        } else if (a1Var.b()) {
            return this;
        } else {
            c b2 = b(a1Var);
            b2.f421e = a();
            b2.n = true;
            b2.v = true;
            return b2.a();
        }
    }
}
