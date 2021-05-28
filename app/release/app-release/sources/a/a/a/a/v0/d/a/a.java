package a.a.a.a.v0.d.a;

import a.a.a.a.v0.b.f;
import a.a.a.a.v0.j.s.g;
import a.a.a.a.v0.j.s.k;
import a.a.a.a.v0.l.e;
import a.a.a.a.v0.l.j;
import a.a.a.a.v0.o.i;
import a.w.b.l;
import a.w.c.h;
import a.w.c.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final e<a.a.a.a.v0.b.e, a.a.a.a.v0.b.b1.c> f533a;
    public final boolean b;

    /* renamed from: c  reason: collision with root package name */
    public final i f534c;

    /* renamed from: a.a.a.a.v0.d.a.a$a  reason: collision with other inner class name */
    public enum EnumC0022a {
        METHOD_RETURN_TYPE,
        VALUE_PARAMETER,
        FIELD,
        TYPE_USE
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final a.a.a.a.v0.b.b1.c f540a;
        public final int b;

        public b(a.a.a.a.v0.b.b1.c cVar, int i) {
            if (cVar != null) {
                this.f540a = cVar;
                this.b = i;
                return;
            }
            a.w.c.i.a("typeQualifier");
            throw null;
        }
    }

    public static final /* synthetic */ class c extends h implements l<a.a.a.a.v0.b.e, a.a.a.a.v0.b.b1.c> {
        public c(a aVar) {
            super(1, aVar);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public a.a.a.a.v0.b.b1.c a(a.a.a.a.v0.b.e eVar) {
            a.a.a.a.v0.b.e eVar2 = eVar;
            if (eVar2 != null) {
                a aVar = (a) this.f2133d;
                if (aVar == null) {
                    throw null;
                } else if (!eVar2.y().b(b.f676a)) {
                    return null;
                } else {
                    for (a.a.a.a.v0.b.b1.c cVar : eVar2.y()) {
                        a.a.a.a.v0.b.b1.c c2 = aVar.c(cVar);
                        if (c2 != null) {
                            return c2;
                        }
                    }
                    return null;
                }
            } else {
                a.w.c.i.a("p1");
                throw null;
            }
        }

        @Override // a.w.c.b
        public final a.a.e c() {
            return s.a(a.class);
        }

        @Override // a.a.b, a.w.c.b
        public final String d() {
            return "computeTypeQualifierNickname";
        }

        @Override // a.w.c.b
        public final String f() {
            return "computeTypeQualifierNickname(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)Lorg/jetbrains/kotlin/descriptors/annotations/AnnotationDescriptor;";
        }
    }

    public a(j jVar, i iVar) {
        if (jVar == null) {
            a.w.c.i.a("storageManager");
            throw null;
        } else if (iVar != null) {
            this.f534c = iVar;
            this.f533a = jVar.b(new c(this));
            this.b = this.f534c.a();
        } else {
            a.w.c.i.a("jsr305State");
            throw null;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final List<EnumC0022a> a(g<?> gVar) {
        EnumC0022a aVar;
        if (gVar instanceof a.a.a.a.v0.j.s.b) {
            ArrayList arrayList = new ArrayList();
            for (g<?> gVar2 : ((a.a.a.a.v0.j.s.b) gVar).f1578a) {
                e.f.a.g.a(arrayList, a(gVar2));
            }
            return arrayList;
        } else if (!(gVar instanceof k)) {
            return a.t.l.f2119c;
        } else {
            String b2 = ((k) gVar).f1581c.b();
            switch (b2.hashCode()) {
                case -2024225567:
                    if (b2.equals("METHOD")) {
                        aVar = EnumC0022a.METHOD_RETURN_TYPE;
                        break;
                    }
                    aVar = null;
                    break;
                case 66889946:
                    if (b2.equals("FIELD")) {
                        aVar = EnumC0022a.FIELD;
                        break;
                    }
                    aVar = null;
                    break;
                case 107598562:
                    if (b2.equals("TYPE_USE")) {
                        aVar = EnumC0022a.TYPE_USE;
                        break;
                    }
                    aVar = null;
                    break;
                case 446088073:
                    if (b2.equals("PARAMETER")) {
                        aVar = EnumC0022a.VALUE_PARAMETER;
                        break;
                    }
                    aVar = null;
                    break;
                default:
                    aVar = null;
                    break;
            }
            return e.f.a.g.d(aVar);
        }
    }

    public final a.a.a.a.v0.o.k b(a.a.a.a.v0.b.b1.c cVar) {
        if (cVar != null) {
            Map<String, a.a.a.a.v0.o.k> map = this.f534c.f2002c;
            a.a.a.a.v0.f.b e2 = cVar.e();
            a.a.a.a.v0.o.k kVar = map.get(e2 != null ? e2.a() : null);
            if (kVar != null) {
                return kVar;
            }
            a.a.a.a.v0.b.e b2 = a.a.a.a.v0.j.u.a.b(cVar);
            if (b2 == null) {
                return null;
            }
            a.a.a.a.v0.b.b1.c a2 = b2.y().a(b.f678d);
            g<?> a3 = a2 != null ? a.a.a.a.v0.j.u.a.a(a2) : null;
            if (!(a3 instanceof k)) {
                a3 = null;
            }
            k kVar2 = (k) a3;
            if (kVar2 == null) {
                return null;
            }
            a.a.a.a.v0.o.k kVar3 = this.f534c.b;
            if (kVar3 != null) {
                return kVar3;
            }
            String a4 = kVar2.f1581c.a();
            int hashCode = a4.hashCode();
            if (hashCode != -2137067054) {
                if (hashCode != -1838656823) {
                    if (hashCode == 2656902 && a4.equals("WARN")) {
                        return a.a.a.a.v0.o.k.WARN;
                    }
                    return null;
                } else if (a4.equals("STRICT")) {
                    return a.a.a.a.v0.o.k.STRICT;
                } else {
                    return null;
                }
            } else if (a4.equals("IGNORE")) {
                return a.a.a.a.v0.o.k.IGNORE;
            } else {
                return null;
            }
        } else {
            a.w.c.i.a("annotationDescriptor");
            throw null;
        }
    }

    public final a.a.a.a.v0.b.b1.c c(a.a.a.a.v0.b.b1.c cVar) {
        a.a.a.a.v0.b.e b2;
        if (cVar == null) {
            a.w.c.i.a("annotationDescriptor");
            throw null;
        } else if (this.f534c.a() || (b2 = a.a.a.a.v0.j.u.a.b(cVar)) == null) {
            return null;
        } else {
            if (b.f680f.contains(a.a.a.a.v0.j.u.a.c(b2)) || b2.y().b(b.b)) {
                return cVar;
            }
            if (b2.t() != f.ANNOTATION_CLASS) {
                return null;
            }
            return this.f533a.a(b2);
        }
    }

    public final a.a.a.a.v0.o.k a(a.a.a.a.v0.b.b1.c cVar) {
        if (cVar != null) {
            a.a.a.a.v0.o.k b2 = b(cVar);
            return b2 != null ? b2 : this.f534c.f2001a;
        }
        a.w.c.i.a("annotationDescriptor");
        throw null;
    }
}
