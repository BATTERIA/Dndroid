package f.o0.h;

import f.h0;
import f.p;
import f.q;
import f.x;
import f.y;
import g.h;

public final class e {
    static {
        h.c("\"\\");
        h.c("\t ,=");
    }

    public static int a(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static int a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static long a(h0 h0Var) {
        String a2 = h0Var.f5023h.a("Content-Length");
        if (a2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static boolean b(h0 h0Var) {
        if (h0Var.f5018c.b.equals("HEAD")) {
            return false;
        }
        int i = h0Var.f5020e;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && a(h0Var) == -1) {
            String a2 = h0Var.f5023h.a("Transfer-Encoding");
            if (a2 == null) {
                a2 = null;
            }
            if ("chunked".equalsIgnoreCase(a2)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static void a(q qVar, y yVar, x xVar) {
        if (qVar != q.f5388a && !p.a(yVar, xVar).isEmpty() && ((q.a) qVar) == null) {
            throw null;
        }
    }
}
