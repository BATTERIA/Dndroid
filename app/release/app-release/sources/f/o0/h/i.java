package f.o0.h;

import e.a.a.a.a;
import f.c0;
import java.net.ProtocolException;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final c0 f5170a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5171c;

    public i(c0 c0Var, int i, String str) {
        this.f5170a = c0Var;
        this.b = i;
        this.f5171c = str;
    }

    public static i a(String str) {
        c0 c0Var;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(a.b("Unexpected status line: ", str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                c0Var = c0.HTTP_1_0;
            } else if (charAt == 1) {
                c0Var = c0.HTTP_1_1;
            } else {
                throw new ProtocolException(a.b("Unexpected status line: ", str));
            }
        } else if (str.startsWith("ICY ")) {
            c0Var = c0.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException(a.b("Unexpected status line: ", str));
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                } else {
                    throw new ProtocolException(a.b("Unexpected status line: ", str));
                }
                return new i(c0Var, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(a.b("Unexpected status line: ", str));
            }
        } else {
            throw new ProtocolException(a.b("Unexpected status line: ", str));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5170a == c0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.b);
        if (this.f5171c != null) {
            sb.append(' ');
            sb.append(this.f5171c);
        }
        return sb.toString();
    }
}
