package e.e.a.q.d;

import e.h.a.k;
import e.h.a.l;
import e.h.a.n;
import e.h.a.q;
import e.h.a.r;
import e.h.a.s;
import e.h.a.t;
import e.h.a.v;
import e.h.a.z;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static a f4500a = new a();
    public static k b;

    public static class a extends e.h.a.g0.a<Map<String, Object>> {
    }

    public static class b extends e.h.a.g0.a<List<Object>> {
    }

    static {
        l lVar = new l();
        lVar.a(Map.class, f4500a);
        lVar.a(List.class, f4500a);
        lVar.a(new a().b, f4500a);
        lVar.a(new b().b, f4500a);
        lVar.f4839e.add(new c());
        b = lVar.a();
    }

    public static <T> T a(String str, Type type) {
        try {
            return (T) b.a(str, type);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(Object obj) {
        try {
            return b.a(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean a(String str) {
        try {
            try {
                e.h.a.h0.a aVar = new e.h.a.h0.a(new StringReader(str));
                q a2 = v.a(aVar);
                if (a2 != null) {
                    if (!(a2 instanceof s)) {
                        if (aVar.A() != e.h.a.h0.b.END_DOCUMENT) {
                            throw new z("Did not consume the entire document.");
                        }
                    }
                    return a2 instanceof n;
                }
                throw null;
            } catch (e.h.a.h0.d e2) {
                throw new z(e2);
            } catch (IOException e3) {
                throw new r(e3);
            } catch (NumberFormatException e4) {
                throw new z(e4);
            }
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b(String str) {
        try {
            try {
                e.h.a.h0.a aVar = new e.h.a.h0.a(new StringReader(str));
                q a2 = v.a(aVar);
                if (a2 != null) {
                    if (!(a2 instanceof s)) {
                        if (aVar.A() != e.h.a.h0.b.END_DOCUMENT) {
                            throw new z("Did not consume the entire document.");
                        }
                    }
                    return a2 instanceof t;
                }
                throw null;
            } catch (e.h.a.h0.d e2) {
                throw new z(e2);
            } catch (IOException e3) {
                throw new r(e3);
            } catch (NumberFormatException e4) {
                throw new z(e4);
            }
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean c(String str) {
        try {
            return b.a(str, Object.class) != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
