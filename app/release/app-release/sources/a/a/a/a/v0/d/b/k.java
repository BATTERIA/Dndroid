package a.a.a.a.v0.d.b;

import a.a.a.a.v0.d.a.c0.g;
import a.a.a.a.v0.k.b.s;
import a.w.c.f;
import a.w.c.i;
import java.util.Arrays;

public interface k extends s {

    public static abstract class a {

        /* renamed from: a.a.a.a.v0.d.b.k$a$a  reason: collision with other inner class name */
        public static final class C0035a extends a {

            /* renamed from: a  reason: collision with root package name */
            public final byte[] f916a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C0035a) && i.a(null, ((C0035a) obj).f916a);
                }
                return true;
            }

            public int hashCode() {
                return 0;
            }

            public String toString() {
                StringBuilder a2 = e.a.a.a.a.a("ClassFileContent(content=");
                a2.append(Arrays.toString((byte[]) null));
                a2.append(")");
                return a2.toString();
            }
        }

        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public final l f917a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(l lVar) {
                super(null);
                if (lVar != null) {
                    this.f917a = lVar;
                    return;
                }
                i.a("kotlinJvmBinaryClass");
                throw null;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof b) && i.a(this.f917a, ((b) obj).f917a);
                }
                return true;
            }

            public int hashCode() {
                l lVar = this.f917a;
                if (lVar != null) {
                    return lVar.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder a2 = e.a.a.a.a.a("KotlinClass(kotlinJvmBinaryClass=");
                a2.append(this.f917a);
                a2.append(")");
                return a2.toString();
            }
        }

        public /* synthetic */ a(f fVar) {
        }

        public final l a() {
            b bVar = (b) (!(this instanceof b) ? null : this);
            if (bVar != null) {
                return bVar.f917a;
            }
            return null;
        }
    }

    a a(g gVar);

    a a(a.a.a.a.v0.f.a aVar);
}
