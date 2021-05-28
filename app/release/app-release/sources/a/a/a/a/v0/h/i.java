package a.a.a.a.v0.h;

import a.a.a.a.v0.h.a;
import a.a.a.a.v0.h.h;
import a.a.a.a.v0.h.j;
import a.a.a.a.v0.h.l;
import a.a.a.a.v0.h.q;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public abstract class i extends a implements Serializable {

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1389a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                a.a.a.a.v0.h.z[] r0 = a.a.a.a.v0.h.z.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a.a.a.a.v0.h.i.a.f1389a = r0
                a.a.a.a.v0.h.z r1 = a.a.a.a.v0.h.z.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0010 }
                r1 = 8
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                int[] r0 = a.a.a.a.v0.h.i.a.f1389a     // Catch:{ NoSuchFieldError -> 0x0018 }
                a.a.a.a.v0.h.z r1 = a.a.a.a.v0.h.z.ENUM     // Catch:{ NoSuchFieldError -> 0x0018 }
                r1 = 7
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.h.i.a.<clinit>():void");
        }
    }

    public static abstract class b<MessageType extends i, BuilderType extends b> extends a.AbstractC0055a<BuilderType> {

        /* renamed from: c  reason: collision with root package name */
        public d f1390c = d.f1366c;

        public abstract BuilderType a(MessageType messagetype);

        @Override // java.lang.Object
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        @Override // a.a.a.a.v0.h.r
        public abstract MessageType d();
    }

    public static abstract class c<MessageType extends d<MessageType>, BuilderType extends c<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements e<MessageType> {

        /* renamed from: d  reason: collision with root package name */
        public h<f> f1391d = h.f1386d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1392e;

        public final void a(MessageType messagetype) {
            if (!this.f1392e) {
                this.f1391d = this.f1391d.clone();
                this.f1392e = true;
            }
            h<f> hVar = this.f1391d;
            h<f> hVar2 = messagetype.f1393c;
            if (hVar != null) {
                for (int i = 0; i < hVar2.f1387a.b(); i++) {
                    hVar.b(hVar2.f1387a.a(i));
                }
                for (Object obj : hVar2.f1387a.c()) {
                    hVar.b((Map.Entry) obj);
                }
                return;
            }
            throw null;
        }

        public boolean h() {
            return this.f1391d.a();
        }
    }

    public interface e<MessageType extends d> extends r {
    }

    public static final class f implements h.a<f> {

        /* renamed from: c  reason: collision with root package name */
        public final j.b<?> f1397c;

        /* renamed from: d  reason: collision with root package name */
        public final int f1398d;

        /* renamed from: e  reason: collision with root package name */
        public final y f1399e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f1400f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f1401g;

        public f(j.b<?> bVar, int i, y yVar, boolean z, boolean z2) {
            this.f1397c = bVar;
            this.f1398d = i;
            this.f1399e = yVar;
            this.f1400f = z;
            this.f1401g = z2;
        }

        @Override // a.a.a.a.v0.h.h.a
        public q.a a(q.a aVar, q qVar) {
            return ((b) aVar).a((i) qVar);
        }

        @Override // a.a.a.a.v0.h.h.a
        public boolean c() {
            return this.f1400f;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f1398d - ((f) obj).f1398d;
        }

        @Override // a.a.a.a.v0.h.h.a
        public y d() {
            return this.f1399e;
        }

        @Override // a.a.a.a.v0.h.h.a
        public z e() {
            return this.f1399e.f1460c;
        }

        @Override // a.a.a.a.v0.h.h.a
        public boolean g() {
            return this.f1401g;
        }

        @Override // a.a.a.a.v0.h.h.a
        public int getNumber() {
            return this.f1398d;
        }
    }

    public static class g<ContainingType extends q, Type> {

        /* renamed from: a  reason: collision with root package name */
        public final ContainingType f1402a;
        public final Type b;

        /* renamed from: c  reason: collision with root package name */
        public final q f1403c;

        /* renamed from: d  reason: collision with root package name */
        public final f f1404d;

        /* renamed from: e  reason: collision with root package name */
        public final Method f1405e;

        public g(ContainingType containingtype, Type type, q qVar, f fVar, Class cls) {
            Method method;
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (fVar.f1399e == y.MESSAGE && qVar == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f1402a = containingtype;
                this.b = type;
                this.f1403c = qVar;
                this.f1404d = fVar;
                if (j.a.class.isAssignableFrom(cls)) {
                    try {
                        method = cls.getMethod("valueOf", Integer.TYPE);
                    } catch (NoSuchMethodException e2) {
                        String name = cls.getName();
                        StringBuilder sb = new StringBuilder("valueOf".length() + name.length() + 45);
                        sb.append("Generated message class \"");
                        sb.append(name);
                        sb.append("\" missing method \"");
                        sb.append("valueOf");
                        sb.append("\".");
                        throw new RuntimeException(sb.toString(), e2);
                    }
                } else {
                    method = null;
                }
                this.f1405e = method;
            }
        }

        public Object a(Object obj) {
            if (this.f1404d.f1399e.f1460c != z.ENUM) {
                return obj;
            }
            try {
                return this.f1405e.invoke(null, (Integer) obj);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                } else if (cause instanceof Error) {
                    throw ((Error) cause);
                } else {
                    throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
                }
            }
        }

        public Object b(Object obj) {
            return this.f1404d.f1399e.f1460c == z.ENUM ? Integer.valueOf(((j.a) obj).getNumber()) : obj;
        }
    }

    public i() {
    }

    public i(b bVar) {
    }

    public static <ContainingType extends q, Type> g<ContainingType, Type> a(ContainingType containingtype, q qVar, j.b<?> bVar, int i, y yVar, boolean z, Class cls) {
        return new g<>(containingtype, Collections.emptyList(), qVar, new f(bVar, i, yVar, true, z), cls);
    }

    public static <ContainingType extends q, Type> g<ContainingType, Type> a(ContainingType containingtype, Type type, q qVar, j.b<?> bVar, int i, y yVar, Class cls) {
        return new g<>(containingtype, type, qVar, new f(bVar, i, yVar, false, false), cls);
    }

    @Override // a.a.a.a.v0.h.q
    public s<? extends q> f() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public static abstract class d<MessageType extends d<MessageType>> extends i implements e<MessageType> {

        /* renamed from: c  reason: collision with root package name */
        public final h<f> f1393c;

        public class a {

            /* renamed from: a  reason: collision with root package name */
            public final Iterator<Map.Entry<f, Object>> f1394a;
            public Map.Entry<f, Object> b;

            /* renamed from: c  reason: collision with root package name */
            public final boolean f1395c;

            public /* synthetic */ a(boolean z, a aVar) {
                h<f> hVar = d.this.f1393c;
                Iterator<Map.Entry<f, Object>> cVar = hVar.f1388c ? new l.c<>(hVar.f1387a.entrySet().iterator()) : hVar.f1387a.entrySet().iterator();
                this.f1394a = cVar;
                if (cVar.hasNext()) {
                    this.b = this.f1394a.next();
                }
                this.f1395c = z;
            }

            public void a(int i, f fVar) {
                while (true) {
                    Map.Entry<f, Object> entry = this.b;
                    if (entry != null && entry.getKey().f1398d < i) {
                        f key = this.b.getKey();
                        if (!this.f1395c || key.f1399e.f1460c != z.MESSAGE || key.f1400f) {
                            h.a(key, this.b.getValue(), fVar);
                        } else {
                            int i2 = key.f1398d;
                            fVar.c(1, 3);
                            fVar.e(16);
                            fVar.e(i2);
                            fVar.a(3, (q) this.b.getValue());
                            fVar.c(1, 4);
                        }
                        this.b = this.f1394a.hasNext() ? this.f1394a.next() : null;
                    } else {
                        return;
                    }
                }
            }
        }

        public d() {
            this.f1393c = new h<>();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: a.a.a.a.v0.h.i$g<MessageType extends a.a.a.a.v0.h.i$d<MessageType>, Type> */
        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> Type a(g<MessageType, Type> gVar) {
            c(gVar);
            Type<Object> type = (Type) this.f1393c.a(gVar.f1404d);
            if (type == null) {
                return gVar.b;
            }
            f fVar = gVar.f1404d;
            if (!fVar.f1400f) {
                return (Type) gVar.a(type);
            }
            if (fVar.f1399e.f1460c != z.ENUM) {
                return type;
            }
            Type type2 = (Type) new ArrayList();
            for (Object obj : type) {
                type2.add(gVar.a(obj));
            }
            return type2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: a.a.a.a.v0.h.i$g<MessageType extends a.a.a.a.v0.h.i$d<MessageType>, Type> */
        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean b(g<MessageType, Type> gVar) {
            c(gVar);
            h<f> hVar = this.f1393c;
            f fVar = gVar.f1404d;
            if (hVar == null) {
                throw null;
            } else if (!fVar.c()) {
                return hVar.f1387a.get(fVar) != null;
            } else {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
        }

        public final void c(g<MessageType, ?> gVar) {
            if (gVar.f1402a != d()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public boolean h() {
            return this.f1393c.a();
        }

        public int i() {
            h<f> hVar = this.f1393c;
            int i = 0;
            for (int i2 = 0; i2 < hVar.f1387a.b(); i2++) {
                Map.Entry<FieldDescriptorType, Object> a2 = hVar.f1387a.a(i2);
                i += h.c(a2.getKey(), a2.getValue());
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : hVar.f1387a.c()) {
                i += h.c(entry.getKey(), entry.getValue());
            }
            return i;
        }

        public void j() {
            this.f1393c.b();
        }

        public d<MessageType>.a k() {
            return new a(false, null);
        }

        public d(c<MessageType, ?> cVar) {
            cVar.f1391d.b();
            cVar.f1392e = false;
            this.f1393c = cVar.f1391d;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(a.a.a.a.v0.h.e r8, a.a.a.a.v0.h.f r9, a.a.a.a.v0.h.g r10, int r11) {
            /*
            // Method dump skipped, instructions count: 335
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.h.i.d.a(a.a.a.a.v0.h.e, a.a.a.a.v0.h.f, a.a.a.a.v0.h.g, int):boolean");
        }
    }
}
