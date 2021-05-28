package e.d.a.m.i;

import e.d.a.m.c;
import java.security.MessageDigest;

public class j implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f4006a;
    public final c b;

    public j(String str, c cVar) {
        this.f4006a = str;
        this.b = cVar;
    }

    @Override // e.d.a.m.c
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.f4006a.getBytes("UTF-8"));
        this.b.a(messageDigest);
    }

    @Override // e.d.a.m.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f4006a.equals(jVar.f4006a) && this.b.equals(jVar.b);
    }

    @Override // e.d.a.m.c
    public int hashCode() {
        return this.b.hashCode() + (this.f4006a.hashCode() * 31);
    }
}
