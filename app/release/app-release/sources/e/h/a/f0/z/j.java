package e.h.a.f0.z;

import e.h.a.c0;
import e.h.a.d0;
import e.h.a.e;
import e.h.a.e0.c;
import e.h.a.e0.d;
import e.h.a.f0.g;
import e.h.a.f0.o;
import e.h.a.f0.t;
import e.h.a.z;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class j implements d0 {

    /* renamed from: c  reason: collision with root package name */
    public final g f4760c;

    /* renamed from: d  reason: collision with root package name */
    public final e f4761d;

    /* renamed from: e  reason: collision with root package name */
    public final o f4762e;

    /* renamed from: f  reason: collision with root package name */
    public final d f4763f;

    /* renamed from: g  reason: collision with root package name */
    public final e.h.a.f0.a0.b f4764g = e.h.a.f0.a0.b.f4698a;

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f4766a;
        public final boolean b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f4767c;

        public b(String str, boolean z, boolean z2) {
            this.f4766a = str;
            this.b = z;
            this.f4767c = z2;
        }
    }

    public j(g gVar, e eVar, o oVar, d dVar) {
        this.f4760c = gVar;
        this.f4761d = eVar;
        this.f4762e = oVar;
        this.f4763f = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x019e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0184 A[SYNTHETIC] */
    @Override // e.h.a.d0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> e.h.a.c0<T> a(e.h.a.k r35, e.h.a.g0.a<T> r36) {
        /*
        // Method dump skipped, instructions count: 489
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.a.f0.z.j.a(e.h.a.k, e.h.a.g0.a):e.h.a.c0");
    }

    public static final class a<T> extends c0<T> {

        /* renamed from: a  reason: collision with root package name */
        public final t<T> f4765a;
        public final Map<String, b> b;

        public a(t<T> tVar, Map<String, b> map) {
            this.f4765a = tVar;
            this.b = map;
        }

        @Override // e.h.a.c0
        public T a(e.h.a.h0.a aVar) {
            if (aVar.A() == e.h.a.h0.b.NULL) {
                aVar.x();
                return null;
            }
            T a2 = this.f4765a.a();
            try {
                aVar.k();
                while (aVar.q()) {
                    b bVar = this.b.get(aVar.w());
                    if (bVar != null) {
                        if (bVar.f4767c) {
                            i iVar = (i) bVar;
                            Object a3 = iVar.f4757f.a(aVar);
                            if (a3 != null || !iVar.i) {
                                iVar.f4755d.set(a2, a3);
                            }
                        }
                    }
                    aVar.D();
                }
                aVar.o();
                return a2;
            } catch (IllegalStateException e2) {
                throw new z(e2);
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v4, types: [e.h.a.c0] */
        /* JADX WARN: Type inference failed for: r1v8, types: [e.h.a.c0] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // e.h.a.c0
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(e.h.a.h0.c r7, T r8) {
            /*
            // Method dump skipped, instructions count: 102
            */
            throw new UnsupportedOperationException("Method not decompiled: e.h.a.f0.z.j.a.a(e.h.a.h0.c, java.lang.Object):void");
        }
    }

    public boolean a(Field field, boolean z) {
        boolean z2;
        o oVar = this.f4762e;
        Class<?> type = field.getType();
        if (!(oVar.a(type) || oVar.a(type, z))) {
            if ((oVar.f4710d & field.getModifiers()) == 0 && ((oVar.f4709c == -1.0d || oVar.a((c) field.getAnnotation(c.class), (d) field.getAnnotation(d.class))) && !field.isSynthetic() && ((oVar.f4711e || !oVar.c(field.getType())) && !oVar.b(field.getType())))) {
                List<e.h.a.b> list = z ? oVar.f4712f : oVar.f4713g;
                if (!list.isEmpty()) {
                    e.h.a.c cVar = new e.h.a.c(field);
                    Iterator<e.h.a.b> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().a(cVar)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                return true;
            }
        }
        return false;
    }
}
