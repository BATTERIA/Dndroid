package e.d.a.m.j;

import android.text.TextUtils;
import e.a.a.a.a;
import java.net.URL;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final URL f4055a;
    public final d b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4056c;

    /* renamed from: d  reason: collision with root package name */
    public String f4057d;

    /* renamed from: e  reason: collision with root package name */
    public URL f4058e;

    public c(String str) {
        d dVar = d.f4059a;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(a.b("String url must not be empty or null: ", str));
        } else if (dVar != null) {
            this.f4056c = str;
            this.f4055a = null;
            this.b = dVar;
        } else {
            throw new IllegalArgumentException("Headers must not be null");
        }
    }

    public String a() {
        String str = this.f4056c;
        return str != null ? str : this.f4055a.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return a().equals(cVar.a()) && this.b.equals(cVar.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (a().hashCode() * 31);
    }

    public String toString() {
        return a() + '\n' + this.b.toString();
    }

    public c(URL url) {
        d dVar = d.f4059a;
        if (url == null) {
            throw new IllegalArgumentException("URL must not be null!");
        } else if (dVar != null) {
            this.f4055a = url;
            this.f4056c = null;
            this.b = dVar;
        } else {
            throw new IllegalArgumentException("Headers must not be null");
        }
    }
}
