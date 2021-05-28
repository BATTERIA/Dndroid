package e.d.a.m.i.n;

import e.d.a.m.c;
import e.d.a.s.e;
import e.d.a.s.h;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public final e<c, String> f4042a = new e<>(1000);

    public String a(c cVar) {
        Y y;
        synchronized (this.f4042a) {
            y = this.f4042a.f4274a.get(cVar);
        }
        if (y == null) {
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                cVar.a(instance);
                y = h.a(instance.digest());
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            } catch (NoSuchAlgorithmException e3) {
                e3.printStackTrace();
            }
            synchronized (this.f4042a) {
                this.f4042a.b(cVar, y);
            }
        }
        return y;
    }
}
