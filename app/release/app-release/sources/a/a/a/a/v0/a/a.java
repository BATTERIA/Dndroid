package a.a.a.a.v0.a;

import a.a.a.a.v0.b.c1.b;
import a.a.a.a.v0.b.c1.c;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.z;
import a.e;
import a.f;
import a.w.c.i;
import a.w.c.j;
import e.f.a.g;
import java.util.ServiceLoader;

public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0010a f184a = C0010a.b;

    /* renamed from: a.a.a.a.v0.a.a$a  reason: collision with other inner class name */
    public static final class C0010a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f185a = g.a(f.PUBLICATION, (a.w.b.a) C0011a.f186c);
        public static final /* synthetic */ C0010a b = new C0010a();

        /* renamed from: a.a.a.a.v0.a.a$a$a  reason: collision with other inner class name */
        public static final class C0011a extends j implements a.w.b.a<a> {

            /* renamed from: c  reason: collision with root package name */
            public static final C0011a f186c = new C0011a();

            public C0011a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // a.w.b.a
            public a a() {
                ServiceLoader load = ServiceLoader.load(a.class, a.class.getClassLoader());
                i.a((Object) load, "implementations");
                a aVar = (a) a.t.f.c(load);
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        }
    }

    z a(a.a.a.a.v0.l.j jVar, w wVar, Iterable<? extends b> iterable, c cVar, a.a.a.a.v0.b.c1.a aVar, boolean z);
}
