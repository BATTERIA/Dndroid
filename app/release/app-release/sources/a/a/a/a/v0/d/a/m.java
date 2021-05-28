package a.a.a.a.v0.d.a;

import a.a.a.a.v0.d.a.c0.g;
import a.a.a.a.v0.d.a.c0.t;
import a.a.a.a.v0.f.b;
import a.w.c.i;
import java.util.Arrays;
import java.util.Set;

public interface m {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final a.a.a.a.v0.f.a f805a;
        public final byte[] b;

        /* renamed from: c  reason: collision with root package name */
        public final g f806c;

        public /* synthetic */ a(a.a.a.a.v0.f.a aVar, byte[] bArr, g gVar, int i) {
            bArr = (i & 2) != 0 ? null : bArr;
            gVar = (i & 4) != 0 ? null : gVar;
            if (aVar != null) {
                this.f805a = aVar;
                this.b = bArr;
                this.f806c = gVar;
                return;
            }
            i.a("classId");
            throw null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return i.a(this.f805a, aVar.f805a) && i.a(this.b, aVar.b) && i.a(this.f806c, aVar.f806c);
        }

        public int hashCode() {
            a.a.a.a.v0.f.a aVar = this.f805a;
            int i = 0;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            byte[] bArr = this.b;
            int hashCode2 = (hashCode + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
            g gVar = this.f806c;
            if (gVar != null) {
                i = gVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder a2 = e.a.a.a.a.a("Request(classId=");
            a2.append(this.f805a);
            a2.append(", previouslyFoundClassFileContent=");
            a2.append(Arrays.toString(this.b));
            a2.append(", outerClass=");
            a2.append(this.f806c);
            a2.append(")");
            return a2.toString();
        }
    }

    g a(a aVar);

    t a(b bVar);

    Set<String> b(b bVar);
}
