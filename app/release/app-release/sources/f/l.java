package f;

import f.o0.m.c;
import g.h;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class l {

    /* renamed from: c  reason: collision with root package name */
    public static final l f5050c = new l(new LinkedHashSet(new ArrayList()), null);

    /* renamed from: a  reason: collision with root package name */
    public final Set<a> f5051a;
    public final c b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f5052a;
        public final String b;

        /* renamed from: c  reason: collision with root package name */
        public final h f5053c;

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            String str = ((a) obj).f5052a;
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            new StringBuilder().append((String) null);
            throw null;
        }
    }

    public l(Set<a> set, c cVar) {
        this.f5051a = set;
        this.b = cVar;
    }

    public void a(String str, List<Certificate> list) {
        List emptyList = Collections.emptyList();
        Iterator<a> it = this.f5051a.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        } else if (!emptyList.isEmpty()) {
            c cVar = this.b;
            if (cVar != null) {
                list = cVar.a(list, str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                int size2 = emptyList.size();
                h hVar = null;
                h hVar2 = null;
                for (int i2 = 0; i2 < size2; i2++) {
                    a aVar = (a) emptyList.get(i2);
                    if (aVar.b.equals("sha256/")) {
                        if (hVar == null) {
                            hVar = h.a(x509Certificate.getPublicKey().getEncoded()).a("SHA-256");
                        }
                        if (aVar.f5053c.equals(hVar)) {
                            return;
                        }
                    } else if (aVar.b.equals("sha1/")) {
                        if (hVar2 == null) {
                            hVar2 = h.a(x509Certificate.getPublicKey().getEncoded()).f();
                        }
                        if (aVar.f5053c.equals(hVar2)) {
                            return;
                        }
                    } else {
                        StringBuilder a2 = e.a.a.a.a.a("unsupported hashAlgorithm: ");
                        a2.append(aVar.b);
                        throw new AssertionError(a2.toString());
                    }
                }
            }
            StringBuilder a3 = e.a.a.a.a.a("Certificate pinning failure!", "\n  Peer certificate chain:");
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
                a3.append("\n    ");
                a3.append(a(x509Certificate2));
                a3.append(": ");
                a3.append(x509Certificate2.getSubjectDN().getName());
            }
            a3.append("\n  Pinned certificates for ");
            a3.append(str);
            a3.append(":");
            int size4 = emptyList.size();
            for (int i4 = 0; i4 < size4; i4++) {
                a3.append("\n    ");
                a3.append((a) emptyList.get(i4));
            }
            throw new SSLPeerUnverifiedException(a3.toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return Objects.equals(this.b, lVar.b) && this.f5051a.equals(lVar.f5051a);
        }
    }

    public int hashCode() {
        return this.f5051a.hashCode() + (Objects.hashCode(this.b) * 31);
    }

    public static String a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder a2 = e.a.a.a.a.a("sha256/");
            a2.append(h.a(((X509Certificate) certificate).getPublicKey().getEncoded()).a("SHA-256").a());
            return a2.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }
}
