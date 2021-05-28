package a.a.a.a.v0.h;

import java.io.IOException;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public d f1410a;
    public volatile boolean b;

    /* renamed from: c  reason: collision with root package name */
    public volatile q f1411c;

    public void a(q qVar) {
        if (this.f1411c == null) {
            synchronized (this) {
                if (this.f1411c == null) {
                    try {
                        if (this.f1410a != null) {
                            qVar = (q) ((b) qVar.f()).a(this.f1410a, (g) null);
                        }
                        this.f1411c = qVar;
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }
}
