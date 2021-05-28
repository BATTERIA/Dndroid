package e.e.a.n.d;

import java.io.Serializable;

public class c implements Serializable {

    /* renamed from: c  reason: collision with root package name */
    public String f4349c;

    /* renamed from: d  reason: collision with root package name */
    public String f4350d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4351e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4352f;

    public c() {
    }

    public c(String str) {
        this.f4350d = str;
    }

    public boolean a() {
        String str = this.f4350d;
        return str != null && str.toLowerCase().endsWith(".js");
    }
}
