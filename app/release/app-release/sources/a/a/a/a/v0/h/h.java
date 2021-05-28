package a.a.a.a.v0.h;

import a.a.a.a.v0.h.h.a;
import a.a.a.a.v0.h.j;
import a.a.a.a.v0.h.q;
import e.f.a.g;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class h<FieldDescriptorType extends a<FieldDescriptorType>> {

    /* renamed from: d  reason: collision with root package name */
    public static final h f1386d = new h(true);

    /* renamed from: a  reason: collision with root package name */
    public final u<FieldDescriptorType, Object> f1387a = u.c(16);
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1388c = false;

    public interface a<T extends a<T>> extends Comparable<T> {
        q.a a(q.a aVar, q qVar);

        boolean c();

        y d();

        z e();

        boolean g();

        int getNumber();
    }

    public h() {
    }

    public h(boolean z) {
        b();
    }

    public static int a(y yVar, Object obj) {
        switch (yVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                return 8;
            case 1:
                ((Float) obj).floatValue();
                return 4;
            case 2:
                return f.c(((Long) obj).longValue());
            case 3:
                return f.c(((Long) obj).longValue());
            case 4:
                return f.f(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                return 8;
            case 6:
                ((Integer) obj).intValue();
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return f.g(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e2) {
                    throw new RuntimeException("UTF-8 not supported.", e2);
                }
            case 9:
                return ((q) obj).b();
            case 10:
                if (!(obj instanceof l)) {
                    return f.b((q) obj);
                }
                l lVar = (l) obj;
                int b2 = lVar.b ? lVar.f1411c.b() : lVar.f1410a.size();
                return f.g(b2) + b2;
            case 11:
                if (obj instanceof d) {
                    return f.c((d) obj);
                }
                byte[] bArr = (byte[]) obj;
                return f.g(bArr.length) + bArr.length;
            case 12:
                return f.g(((Integer) obj).intValue());
            case 13:
                if (obj instanceof j.a) {
                    return f.f(((j.a) obj).getNumber());
                }
                return f.f(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return 4;
            case 15:
                ((Long) obj).longValue();
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return f.g((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return f.c((longValue >> 63) ^ (longValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void a(a<?> aVar, Object obj, f fVar) {
        y d2 = aVar.d();
        int number = aVar.getNumber();
        if (aVar.c()) {
            List<Object> list = (List) obj;
            if (aVar.g()) {
                fVar.c(number, 2);
                int i = 0;
                for (Object obj2 : list) {
                    i += a(d2, obj2);
                }
                fVar.e(i);
                for (Object obj3 : list) {
                    a(fVar, d2, obj3);
                }
                return;
            }
            for (Object obj4 : list) {
                a(fVar, d2, number, obj4);
            }
        } else if (obj instanceof l) {
            a(fVar, d2, number, ((l) obj).a());
        } else {
            a(fVar, d2, number, obj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if ((r3 instanceof a.a.a.a.v0.h.j.a) == false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if ((r3 instanceof a.a.a.a.v0.h.l) == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(a.a.a.a.v0.h.y r2, java.lang.Object r3) {
        /*
            if (r3 == 0) goto L_0x0048
            a.a.a.a.v0.h.z r2 = r2.f1460c
            int r2 = r2.ordinal()
            r0 = 1
            r1 = 0
            switch(r2) {
                case 0: goto L_0x003b;
                case 1: goto L_0x0038;
                case 2: goto L_0x0035;
                case 3: goto L_0x0032;
                case 4: goto L_0x002f;
                case 5: goto L_0x002c;
                case 6: goto L_0x0020;
                case 7: goto L_0x0017;
                case 8: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x003d
        L_0x000e:
            boolean r2 = r3 instanceof a.a.a.a.v0.h.q
            if (r2 != 0) goto L_0x002a
            boolean r2 = r3 instanceof a.a.a.a.v0.h.l
            if (r2 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0017:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x002a
            boolean r2 = r3 instanceof a.a.a.a.v0.h.j.a
            if (r2 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0020:
            boolean r2 = r3 instanceof a.a.a.a.v0.h.d
            if (r2 != 0) goto L_0x002a
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            r1 = r0
            goto L_0x003d
        L_0x002c:
            boolean r1 = r3 instanceof java.lang.String
            goto L_0x003d
        L_0x002f:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L_0x003d
        L_0x0032:
            boolean r1 = r3 instanceof java.lang.Double
            goto L_0x003d
        L_0x0035:
            boolean r1 = r3 instanceof java.lang.Float
            goto L_0x003d
        L_0x0038:
            boolean r1 = r3 instanceof java.lang.Long
            goto L_0x003d
        L_0x003b:
            boolean r1 = r3 instanceof java.lang.Integer
        L_0x003d:
            if (r1 == 0) goto L_0x0040
            return
        L_0x0040:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        L_0x0048:
            r2 = 0
            throw r2
            switch-data {0->0x003b, 1->0x0038, 2->0x0035, 3->0x0032, 4->0x002f, 5->0x002c, 6->0x0020, 7->0x0017, 8->0x000e, }
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.h.h.b(a.a.a.a.v0.h.y, java.lang.Object):void");
    }

    public static int c(a<?> aVar, Object obj) {
        int h2;
        int a2;
        y d2 = aVar.d();
        int number = aVar.getNumber();
        if (aVar.c()) {
            int i = 0;
            List<Object> list = (List) obj;
            if (aVar.g()) {
                for (Object obj2 : list) {
                    i += a(d2, obj2);
                }
                h2 = f.h(number) + i;
                a2 = f.g(i);
            } else {
                for (Object obj3 : list) {
                    int h3 = f.h(number);
                    if (d2 == y.GROUP) {
                        h3 *= 2;
                    }
                    i += a(d2, obj3) + h3;
                }
                return i;
            }
        } else {
            h2 = f.h(number);
            if (d2 == y.GROUP) {
                h2 *= 2;
            }
            a2 = a(d2, obj);
        }
        return a2 + h2;
    }

    public Object a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f1387a.get(fielddescriptortype);
        return obj instanceof l ? ((l) obj).a() : obj;
    }

    public final Object a(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public void a(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (fielddescriptortype.c()) {
            b(fielddescriptortype.d(), obj);
            Object a2 = a((a) fielddescriptortype);
            if (a2 == null) {
                list = new ArrayList();
                this.f1387a.a(fielddescriptortype, list);
            } else {
                list = (List) a2;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public boolean a() {
        for (int i = 0; i < this.f1387a.b(); i++) {
            if (!a((Map.Entry) this.f1387a.a(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f1387a.c()) {
            if (!a((Map.Entry) entry)) {
                return false;
            }
        }
        return true;
    }

    public final boolean a(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.e() == z.MESSAGE) {
            boolean c2 = key.c();
            Object value = entry.getValue();
            if (c2) {
                for (q qVar : (List) value) {
                    if (!qVar.g()) {
                        return false;
                    }
                }
            } else if (value instanceof q) {
                if (!((q) value).g()) {
                    return false;
                }
            } else if (value instanceof l) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    public void b() {
        if (!this.b) {
            this.f1387a.e();
            this.b = true;
        }
    }

    public void b(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.c()) {
            b(fielddescriptortype.d(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b(fielddescriptortype.d(), it.next());
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof l) {
            this.f1388c = true;
        }
        this.f1387a.a(fielddescriptortype, obj);
    }

    public final void b(Map.Entry<FieldDescriptorType, Object> entry) {
        Object obj;
        u<FieldDescriptorType, Object> uVar;
        Object a2;
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof l) {
            value = ((l) value).a();
        }
        if (key.c()) {
            Object a3 = a((a) key);
            if (a3 == null) {
                a3 = new ArrayList();
            }
            for (Object obj2 : (List) value) {
                ((List) a3).add(a(obj2));
            }
            this.f1387a.a(key, a3);
            return;
        }
        if (key.e() != z.MESSAGE || (a2 = a((a) key)) == null) {
            uVar = this.f1387a;
            obj = a(value);
        } else {
            obj = key.a(((q) a2).e(), (q) value).a();
            uVar = this.f1387a;
        }
        uVar.a(key, obj);
    }

    public h<FieldDescriptorType> clone() {
        h<FieldDescriptorType> hVar = new h<>();
        for (int i = 0; i < this.f1387a.b(); i++) {
            Map.Entry<FieldDescriptorType, Object> a2 = this.f1387a.a(i);
            hVar.b(a2.getKey(), a2.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f1387a.c()) {
            hVar.b(entry.getKey(), entry.getValue());
        }
        hVar.f1388c = this.f1388c;
        return hVar;
    }

    public static int a(y yVar, boolean z) {
        if (z) {
            return 2;
        }
        return yVar.f1461d;
    }

    public static Object a(e eVar, y yVar, boolean z) {
        byte[] bArr;
        switch (yVar.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(eVar.f()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(eVar.e()));
            case 2:
                return Long.valueOf(eVar.h());
            case 3:
                return Long.valueOf(eVar.h());
            case 4:
                return Integer.valueOf(eVar.g());
            case 5:
                return Long.valueOf(eVar.f());
            case 6:
                return Integer.valueOf(eVar.e());
            case 7:
                return Boolean.valueOf(eVar.b());
            case 8:
                if (z) {
                    int g2 = eVar.g();
                    int i = eVar.f1376e;
                    if (g2 <= eVar.f1374c - i && g2 > 0) {
                        bArr = eVar.f1373a;
                        eVar.f1376e = i + g2;
                    } else if (g2 == 0) {
                        return "";
                    } else {
                        bArr = eVar.d(g2);
                        i = 0;
                    }
                    if (g.b(bArr, i, i + g2)) {
                        return new String(bArr, i, g2, "UTF-8");
                    }
                    throw new k("Protocol message had invalid UTF-8.");
                }
                int g3 = eVar.g();
                if (g3 <= eVar.f1374c - eVar.f1376e && g3 > 0) {
                    String str = new String(eVar.f1373a, eVar.f1376e, g3, "UTF-8");
                    eVar.f1376e += g3;
                    return str;
                } else if (g3 == 0) {
                    return "";
                } else {
                    return new String(eVar.d(g3), "UTF-8");
                }
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return eVar.c();
            case 12:
                return Integer.valueOf(eVar.g());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(eVar.e());
            case 15:
                return Long.valueOf(eVar.f());
            case 16:
                int g4 = eVar.g();
                return Integer.valueOf((-(g4 & 1)) ^ (g4 >>> 1));
            case 17:
                long h2 = eVar.h();
                return Long.valueOf((-(h2 & 1)) ^ (h2 >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void a(f fVar, y yVar, int i, Object obj) {
        if (yVar == y.GROUP) {
            int i2 = i << 3;
            fVar.e(i2 | 3);
            ((q) obj).a(fVar);
            fVar.e(i2 | 4);
            return;
        }
        fVar.e((i << 3) | a(yVar, false));
        a(fVar, yVar, obj);
    }

    public static void a(f fVar, y yVar, Object obj) {
        switch (yVar.ordinal()) {
            case 0:
                double doubleValue = ((Double) obj).doubleValue();
                if (fVar != null) {
                    fVar.a(Double.doubleToRawLongBits(doubleValue));
                    return;
                }
                throw null;
            case 1:
                float floatValue = ((Float) obj).floatValue();
                if (fVar != null) {
                    fVar.d(Float.floatToRawIntBits(floatValue));
                    return;
                }
                throw null;
            case 2:
                fVar.b(((Long) obj).longValue());
                return;
            case 3:
                fVar.b(((Long) obj).longValue());
                return;
            case 4:
                fVar.b(((Integer) obj).intValue());
                return;
            case 5:
                fVar.a(((Long) obj).longValue());
                return;
            case 6:
                fVar.d(((Integer) obj).intValue());
                return;
            case 7:
                fVar.c(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case 8:
                String str = (String) obj;
                if (fVar != null) {
                    byte[] bytes = str.getBytes("UTF-8");
                    fVar.e(bytes.length);
                    fVar.a(bytes);
                    return;
                }
                throw null;
            case 9:
                q qVar = (q) obj;
                if (fVar != null) {
                    qVar.a(fVar);
                    return;
                }
                throw null;
            case 10:
                fVar.a((q) obj);
                return;
            case 11:
                if (obj instanceof d) {
                    fVar.a((d) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                if (fVar != null) {
                    fVar.e(bArr.length);
                    fVar.a(bArr);
                    return;
                }
                throw null;
            case 12:
                fVar.e(((Integer) obj).intValue());
                return;
            case 13:
                fVar.a(obj instanceof j.a ? ((j.a) obj).getNumber() : ((Integer) obj).intValue());
                return;
            case 14:
                fVar.d(((Integer) obj).intValue());
                return;
            case 15:
                fVar.a(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                fVar.e((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                fVar.b((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }
}
