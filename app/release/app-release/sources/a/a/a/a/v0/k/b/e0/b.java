package a.a.a.a.v0.k.b.e0;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.b.a0;
import a.a.a.a.v0.b.c1.c;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.x;
import a.a.a.a.v0.b.z;
import a.a.a.a.v0.c.a.c;
import a.a.a.a.v0.k.b.d;
import a.a.a.a.v0.k.b.i;
import a.a.a.a.v0.k.b.k;
import a.a.a.a.v0.k.b.m;
import a.a.a.a.v0.k.b.p;
import a.a.a.a.v0.k.b.q;
import a.a.a.a.v0.k.b.t;
import a.a.a.a.v0.l.j;
import a.a.a.a.v0.m.i1.l;
import a.a.e;
import a.w.b.l;
import a.w.c.h;
import a.w.c.i;
import a.w.c.s;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public final class b implements a.a.a.a.v0.a.a {
    public final d b = new d();

    public static final /* synthetic */ class a extends h implements l<String, InputStream> {
        public a(d dVar) {
            super(1, dVar);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public InputStream a(String str) {
            InputStream resourceAsStream;
            String str2 = str;
            if (str2 == null) {
                i.a("p1");
                throw null;
            } else if (((d) this.f2133d) != null) {
                ClassLoader classLoader = d.class.getClassLoader();
                return (classLoader == null || (resourceAsStream = classLoader.getResourceAsStream(str2)) == null) ? ClassLoader.getSystemResourceAsStream(str2) : resourceAsStream;
            } else {
                throw null;
            }
        }

        @Override // a.w.c.b
        public final e c() {
            return s.a(d.class);
        }

        @Override // a.a.b, a.w.c.b
        public final String d() {
            return "loadResource";
        }

        @Override // a.w.c.b
        public final String f() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }
    }

    @Override // a.a.a.a.v0.a.a
    public z a(j jVar, w wVar, Iterable<? extends a.a.a.a.v0.b.c1.b> iterable, c cVar, a.a.a.a.v0.b.c1.a aVar, boolean z) {
        if (jVar == null) {
            i.a("storageManager");
            throw null;
        } else if (wVar == null) {
            i.a("builtInsModule");
            throw null;
        } else if (iterable == null) {
            i.a("classDescriptorFactories");
            throw null;
        } else if (cVar == null) {
            i.a("platformDependentDeclarationFilter");
            throw null;
        } else if (aVar != null) {
            Set<a.a.a.a.v0.f.b> set = g.j;
            i.a((Object) set, "KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAMES");
            a aVar2 = new a(this.b);
            ArrayList arrayList = new ArrayList(e.f.a.g.a(set, 10));
            for (T t : set) {
                String a2 = a.m.a(t);
                InputStream inputStream = (InputStream) aVar2.a(a2);
                if (inputStream != null) {
                    arrayList.add(c.a(t, jVar, wVar, inputStream, z));
                } else {
                    throw new IllegalStateException(e.a.a.a.a.b("Resource not found in classpath: ", a2));
                }
            }
            a0 a0Var = new a0(arrayList);
            x xVar = new x(jVar, wVar);
            k.a aVar3 = k.a.f1738a;
            m mVar = new m(a0Var);
            d dVar = new d(wVar, xVar, a.m);
            t.a aVar4 = t.a.f1755a;
            p pVar = p.f1750a;
            i.a((Object) pVar, "ErrorReporter.DO_NOTHING");
            c.a aVar5 = c.a.f519a;
            q.a aVar6 = q.a.f1751a;
            if (a.a.a.a.v0.k.b.i.f1729a != null) {
                a.a.a.a.v0.k.b.i iVar = i.a.f1730a;
                a.a.a.a.v0.h.g gVar = a.m.f1639a;
                if (a.a.a.a.v0.m.i1.l.b != null) {
                    a.a.a.a.v0.k.b.j jVar2 = new a.a.a.a.v0.k.b.j(jVar, wVar, aVar3, mVar, dVar, a0Var, aVar4, pVar, aVar5, aVar6, iterable, xVar, iVar, aVar, cVar, gVar, l.a.f1889a);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).a(jVar2);
                    }
                    return a0Var;
                }
                throw null;
            }
            throw null;
        } else {
            a.w.c.i.a("additionalClassPartsProvider");
            throw null;
        }
    }
}
