package e.d.a.r;

import e.a.a.a.a;
import java.security.MessageDigest;

public class c implements e.d.a.m.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f4266a;

    public c(String str) {
        if (str != null) {
            this.f4266a = str;
            return;
        }
        throw new NullPointerException("Signature cannot be null!");
    }

    @Override // e.d.a.m.c
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.f4266a.getBytes("UTF-8"));
    }

    @Override // e.d.a.m.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f4266a.equals(((c) obj).f4266a);
    }

    @Override // e.d.a.m.c
    public int hashCode() {
        return this.f4266a.hashCode();
    }

    public String toString() {
        StringBuilder a2 = a.a("StringSignature{signature='");
        a2.append(this.f4266a);
        a2.append('\'');
        a2.append('}');
        return a2.toString();
    }
}
