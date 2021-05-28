package f;

import e.a.a.a.a;
import java.io.IOException;

public enum c0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: c  reason: collision with root package name */
    public final String f4988c;

    /* access modifiers changed from: public */
    c0(String str) {
        this.f4988c = str;
    }

    public static c0 a(String str) {
        if (str.equals(HTTP_1_0.f4988c)) {
            return HTTP_1_0;
        }
        if (str.equals(HTTP_1_1.f4988c)) {
            return HTTP_1_1;
        }
        if (str.equals(H2_PRIOR_KNOWLEDGE.f4988c)) {
            return H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals(HTTP_2.f4988c)) {
            return HTTP_2;
        }
        if (str.equals(SPDY_3.f4988c)) {
            return SPDY_3;
        }
        if (str.equals(QUIC.f4988c)) {
            return QUIC;
        }
        throw new IOException(a.b("Unexpected protocol: ", str));
    }

    public String toString() {
        return this.f4988c;
    }
}
