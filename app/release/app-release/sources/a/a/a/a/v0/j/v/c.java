package a.a.a.a.v0.j.v;

import a.a.a.a.v0.a.i;
import a.a.a.a.v0.f.b;
import e.a.a.a.a;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public enum c {
    BOOLEAN(i.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(i.CHAR, "char", "C", "java.lang.Character"),
    BYTE(i.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(i.SHORT, "short", "S", "java.lang.Short"),
    INT(i.INT, "int", "I", "java.lang.Integer"),
    FLOAT(i.FLOAT, "float", "F", "java.lang.Float"),
    LONG(i.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(i.DOUBLE, "double", "D", "java.lang.Double");
    
    public static final Set<b> o = new HashSet();
    public static final Map<String, c> p = new HashMap();
    public static final Map<i, c> q = new EnumMap(i.class);
    public static final Map<String, c> r = new HashMap();

    /* renamed from: c */
    public final i f1605c;

    /* renamed from: d */
    public final String f1606d;

    /* renamed from: e */
    public final String f1607e;

    /* renamed from: f */
    public final b f1608f;

    static {
        c[] values = values();
        for (c cVar : values) {
            o.add(cVar.f());
            Map<String, c> map = p;
            String str = cVar.f1606d;
            if (str != null) {
                map.put(str, cVar);
                q.put(cVar.b(), cVar);
                r.put(cVar.a(), cVar);
            } else {
                a(11);
                throw null;
            }
        }
    }

    c(i iVar, String str, String str2, String str3) {
        if (iVar == null) {
            a(6);
            throw null;
        } else if (str == null) {
            a(7);
            throw null;
        } else if (str2 == null) {
            a(8);
            throw null;
        } else if (str3 != null) {
            this.f1605c = iVar;
            this.f1606d = str;
            this.f1607e = str2;
            this.f1608f = new b(str3);
        } else {
            a(9);
            throw null;
        }
    }

    public static c a(i iVar) {
        if (iVar != null) {
            c cVar = q.get(iVar);
            if (cVar != null) {
                return cVar;
            }
            a(4);
            throw null;
        }
        a(3);
        throw null;
    }

    public static c a(String str) {
        if (str != null) {
            c cVar = p.get(str);
            if (cVar != null) {
                return cVar;
            }
            throw new AssertionError(a.b("Non-primitive type name passed: ", str));
        }
        a(1);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void a(int r7) {
        /*
        // Method dump skipped, instructions count: 250
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.j.v.c.a(int):void");
    }

    public String a() {
        String str = this.f1607e;
        if (str != null) {
            return str;
        }
        a(12);
        throw null;
    }

    public i b() {
        i iVar = this.f1605c;
        if (iVar != null) {
            return iVar;
        }
        a(10);
        throw null;
    }

    public b f() {
        b bVar = this.f1608f;
        if (bVar != null) {
            return bVar;
        }
        a(13);
        throw null;
    }
}
