package e.f.a;

import a.a.a.a.a;
import a.a.a.a.c0;
import a.a.a.a.k0;
import a.a.a.a.l0;
import a.a.a.a.v0.b.a1;
import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.b1.c;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.d0;
import a.a.a.a.v0.b.d1.g0;
import a.a.a.a.v0.b.d1.h0;
import a.a.a.a.v0.b.d1.j0;
import a.a.a.a.v0.b.d1.n0;
import a.a.a.a.v0.b.d1.o0;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.e0;
import a.a.a.a.v0.b.e1.b.a0;
import a.a.a.a.v0.b.f;
import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.j;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.t0;
import a.a.a.a.v0.b.u0;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.b.y;
import a.a.a.a.v0.b.z0;
import a.a.a.a.v0.c.a.c;
import a.a.a.a.v0.c.a.e;
import a.a.a.a.v0.d.a.q;
import a.a.a.a.v0.d.a.x;
import a.a.a.a.v0.d.b.k;
import a.a.a.a.v0.d.b.t;
import a.a.a.a.v0.d.b.u;
import a.a.a.a.v0.e.p0;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.h.i;
import a.a.a.a.v0.j.s.r;
import a.a.a.a.v0.j.w.i;
import a.a.a.a.v0.k.b.p;
import a.a.a.a.v0.m.b0;
import a.a.a.a.v0.m.b1;
import a.a.a.a.v0.m.c1;
import a.a.a.a.v0.m.d1;
import a.a.a.a.v0.m.f1;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.m.i1.v;
import a.a.a.a.v0.m.k1.l;
import a.a.a.a.v0.m.q0;
import a.a.a.a.v0.m.s0;
import a.a.a.a.v0.m.u0;
import a.a.a.a.v0.m.v0;
import a.a.a.a.v0.m.w;
import a.a.a.a.v0.m.x0;
import a.a.a.a.v0.m.y0;
import a.a.a.a.v0.m.z;
import a.a.a.a.v0.o.m;
import a.a.m;
import a.a.n;
import a.s;
import a.w.b.a;
import a.w.c.i;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import dalvik.system.BaseDexClassLoader;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

public class g {

    /* renamed from: a */
    public static j f4639a;

    public static int a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static final <T extends Comparable<?>> int a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    public static int a(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == 1) {
                return b(b, bArr[i]);
            }
            if (i3 == 2) {
                return a(b, bArr[i], bArr[i + 1]);
            }
            throw new AssertionError();
        } else if (b > -12) {
            return -1;
        } else {
            return b;
        }
    }

    public static long a(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        a(fileChannel, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }

    public static <T> k0<T> a(T t, a<T> aVar) {
        if (aVar != null) {
            return new k0<>(t, aVar);
        }
        a(1);
        throw null;
    }

    public static <T> l0<T> a(a<T> aVar) {
        if (aVar != null) {
            return new l0<>(aVar);
        }
        a(0);
        throw null;
    }

    public static a1 a(a0 a0Var) {
        a1 a1Var;
        String str;
        int w = a0Var.w();
        if (Modifier.isPublic(w)) {
            a1Var = z0.f515e;
            str = "Visibilities.PUBLIC";
        } else if (Modifier.isPrivate(w)) {
            a1Var = z0.f512a;
            str = "Visibilities.PRIVATE";
        } else if (Modifier.isProtected(w)) {
            a1Var = Modifier.isStatic(w) ? q.b : q.f809c;
            str = "if (Modifier.isStatic(mo…ies.PROTECTED_AND_PACKAGE";
        } else {
            a1Var = q.f808a;
            str = "JavaVisibilities.PACKAGE_VISIBILITY";
        }
        i.a((Object) a1Var, str);
        return a1Var;
    }

    public static final d0 a(a.a.a.a.v0.m.d0 d0Var, a.a.a.a.v0.b.i iVar, int i) {
        a.a.a.a.v0.b.i iVar2 = null;
        if (iVar == null || w.a(iVar)) {
            return null;
        }
        int size = iVar.x().size() + i;
        if (!iVar.E()) {
            boolean z = size == d0Var.H0().size() || a.a.a.a.v0.j.g.n(iVar);
            if (!s.f2103a || z) {
                return new d0(iVar, d0Var.H0().subList(i, d0Var.H0().size()), null);
            }
            throw new AssertionError((d0Var.H0().size() - size) + " trailing arguments were found in " + d0Var + " type");
        }
        List<v0> subList = d0Var.H0().subList(i, size);
        k b = iVar.b();
        if (b instanceof a.a.a.a.v0.b.i) {
            iVar2 = b;
        }
        return new d0(iVar, subList, a(d0Var, iVar2, size));
    }

    public static g0 a(f0 f0Var, h hVar, boolean z, boolean z2, boolean z3, m0 m0Var) {
        if (f0Var == null) {
            c(17);
            throw null;
        } else if (hVar == null) {
            c(18);
            throw null;
        } else if (m0Var != null) {
            return new g0(f0Var, hVar, f0Var.o(), f0Var.g(), z, z2, z3, b.a.DECLARATION, null, m0Var);
        } else {
            c(19);
            throw null;
        }
    }

    public static h0 a(f0 f0Var, h hVar, h hVar2, boolean z, boolean z2, boolean z3, a1 a1Var, m0 m0Var) {
        if (f0Var == null) {
            c(7);
            throw null;
        } else if (hVar == null) {
            c(8);
            throw null;
        } else if (hVar2 == null) {
            c(9);
            throw null;
        } else if (a1Var == null) {
            c(10);
            throw null;
        } else if (m0Var != null) {
            h0 h0Var = new h0(f0Var, hVar, f0Var.o(), a1Var, z, z2, z3, b.a.DECLARATION, null, m0Var);
            h0Var.a((w0) h0.a(h0Var, f0Var.c(), hVar2));
            return h0Var;
        } else {
            c(11);
            throw null;
        }
    }

    public static i0 a(a.a.a.a.v0.b.a aVar, a.a.a.a.v0.m.d0 d0Var, h hVar) {
        if (aVar == null) {
            c(29);
            throw null;
        } else if (hVar == null) {
            c(30);
            throw null;
        } else if (d0Var == null) {
            return null;
        } else {
            return new a.a.a.a.v0.b.d1.i0(aVar, new a.a.a.a.v0.j.w.o.b(aVar, d0Var, null), hVar);
        }
    }

    public static w0 a(d dVar, e eVar) {
        if (dVar == null) {
            b(19);
            throw null;
        } else if (eVar != null) {
            Collection<a.a.a.a.v0.b.d> q = eVar.q();
            if (q.size() != 1) {
                return null;
            }
            for (w0 w0Var : q.iterator().next().j()) {
                if (w0Var.d().equals(dVar)) {
                    return w0Var;
                }
            }
            return null;
        } else {
            b(20);
            throw null;
        }
    }

    public static final a.a.a.a.v0.d.a.d0.d a(a.a.a.a.v0.d.a.d0.g gVar, a.a.a.a.v0.d.a.d0.e eVar, boolean z, boolean z2) {
        return (!z2 || gVar != a.a.a.a.v0.d.a.d0.g.NOT_NULL) ? new a.a.a.a.v0.d.a.d0.d(gVar, eVar, false, z) : new a.a.a.a.v0.d.a.d0.d(gVar, eVar, true, z);
    }

    public static a.a.a.a.v0.f.b a(c cVar) {
        e b = a.a.a.a.v0.j.u.a.b(cVar);
        if (b == null) {
            return null;
        }
        if (w.a(b)) {
            b = null;
        }
        if (b != null) {
            return a.a.a.a.v0.j.u.a.a((k) b);
        }
        return null;
    }

    public static final /* synthetic */ a.a.a.a.v0.f.b a(a.a.a.a.v0.f.b bVar, String str) {
        a.a.a.a.v0.f.b a2 = bVar.a(d.b(str));
        i.a((Object) a2, "child(Name.identifier(name))");
        return a2;
    }

    public static a.a.a.a.v0.m.a1 a(List<r0> list, y0 y0Var, k kVar, List<r0> list2) {
        if (list == null) {
            d(0);
            throw null;
        } else if (y0Var == null) {
            d(1);
            throw null;
        } else if (kVar == null) {
            d(2);
            throw null;
        } else if (list2 != null) {
            a.a.a.a.v0.m.a1 a2 = a(list, y0Var, kVar, list2, (boolean[]) null);
            if (a2 != null) {
                return a2;
            }
            throw new AssertionError("Substitution failed");
        } else {
            d(3);
            throw null;
        }
    }

    public static /* synthetic */ a.a.a.a.v0.m.k0 a(a.a.a.a.v0.m.k0 k0Var, List list, h hVar, int i) {
        if ((i & 1) != 0) {
            list = k0Var.H0();
        }
        if ((i & 2) != 0) {
            hVar = k0Var.y();
        }
        return a(k0Var, (List<? extends v0>) list, hVar);
    }

    public static final a.a.a.a.v0.m.k1.g a(b1 b1Var, a.a.a.a.v0.m.k1.g gVar, HashSet<a.a.a.a.v0.m.k1.k> hashSet) {
        a.a.a.a.v0.m.k1.g gVar2;
        a.a.a.a.v0.m.k1.k c2 = b1Var.c(gVar);
        if (!hashSet.add(c2)) {
            return null;
        }
        l h2 = b1Var.h(c2);
        if (h2 != null) {
            gVar2 = a(b1Var, b1Var.b(h2), hashSet);
            if (gVar2 == null) {
                return null;
            }
            if (!b1Var.g(gVar2) && b1Var.f(gVar)) {
                return b1Var.l(gVar2);
            }
        } else if (!b1Var.n(c2)) {
            return gVar;
        } else {
            a.a.a.a.v0.m.k1.g j = b1Var.j(gVar);
            if (j == null || (gVar2 = a(b1Var, j, hashSet)) == null) {
                return null;
            }
            if (b1Var.g(gVar)) {
                return b1Var.g(gVar2) ? gVar : (!(gVar2 instanceof a.a.a.a.v0.m.k1.h) || !b1Var.h((a.a.a.a.v0.m.k1.h) gVar2)) ? b1Var.l(gVar2) : gVar;
            }
        }
        return gVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new e.h.a.r(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new e.h.a.z(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return e.h.a.s.f4844a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new e.h.a.z(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new e.h.a.z(r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: d (r2v4 'e' e.h.a.h0.d A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e.h.a.q a(e.h.a.h0.a r2) {
        /*
            r2.A()     // Catch:{ EOFException -> 0x0024, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            e.h.a.c0<e.h.a.q> r1 = e.h.a.f0.z.o.X     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.a(r2)     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            e.h.a.q r2 = (e.h.a.q) r2     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            e.h.a.z r0 = new e.h.a.z
            r0.<init>(r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            e.h.a.r r0 = new e.h.a.r
            r0.<init>(r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            e.h.a.z r0 = new e.h.a.z
            r0.<init>(r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            e.h.a.s r2 = e.h.a.s.f4844a
            return r2
        L_0x002b:
            e.h.a.z r0 = new e.h.a.z
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.g.a(e.h.a.h0.a):e.h.a.q");
    }

    public static String a() {
        ClassLoader classLoader = l.class.getClassLoader();
        if (classLoader == null || (classLoader instanceof BaseDexClassLoader)) {
            try {
                return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
            } catch (Exception e2) {
                throw new RuntimeException("Cannot call getLdLibraryPath", e2);
            }
        } else {
            StringBuilder a2 = e.a.a.a.a.a("ClassLoader ");
            a2.append(classLoader.getClass().getName());
            a2.append(" should be of type BaseDexClassLoader");
            throw new IllegalStateException(a2.toString());
        }
    }

    public static final String a(s0 s0Var) {
        StringBuilder sb = new StringBuilder();
        v vVar = new v(sb);
        vVar.a("type: " + s0Var);
        vVar.a("hashCode: " + s0Var.hashCode());
        vVar.a("javaClass: " + s0Var.getClass().getCanonicalName());
        for (k c2 = s0Var.c(); c2 != null; c2 = c2.b()) {
            StringBuilder a2 = e.a.a.a.a.a("fqName: ");
            a2.append(a.a.a.a.v0.i.c.f1476a.a(c2));
            vVar.a(a2.toString());
            vVar.a("javaClass: " + c2.getClass().getCanonicalName());
        }
        String sb2 = sb.toString();
        i.a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static <D extends b> Collection<D> a(d dVar, Collection<D> collection, Collection<D> collection2, e eVar, p pVar, a.a.a.a.v0.j.l lVar) {
        if (dVar == null) {
            b(0);
            throw null;
        } else if (collection == null) {
            b(1);
            throw null;
        } else if (collection2 == null) {
            b(2);
            throw null;
        } else if (eVar == null) {
            b(3);
            throw null;
        } else if (pVar == null) {
            b(4);
            throw null;
        } else if (lVar != null) {
            return a(dVar, collection, collection2, eVar, pVar, lVar, false);
        } else {
            b(5);
            throw null;
        }
    }

    public static <D extends b> Collection<D> a(d dVar, Collection<D> collection, Collection<D> collection2, e eVar, p pVar, a.a.a.a.v0.j.l lVar, boolean z) {
        if (dVar == null) {
            b(12);
            throw null;
        } else if (collection == null) {
            b(13);
            throw null;
        } else if (collection2 == null) {
            b(14);
            throw null;
        } else if (eVar == null) {
            b(15);
            throw null;
        } else if (pVar == null) {
            b(16);
            throw null;
        } else if (lVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            lVar.a(dVar, collection, collection2, eVar, new a.a.a.a.v0.d.a.y.a(pVar, linkedHashSet, z));
            return linkedHashSet;
        } else {
            b(17);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i == 1 || i == 2) {
            objArr[2] = "lazySoft";
        } else {
            objArr[2] = "lazy";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static synchronized void a(j jVar) {
        synchronized (g.class) {
            if (f4639a == null) {
                f4639a = jVar;
            } else {
                throw new IllegalStateException("Cannot re-initialize NativeLoader.");
            }
        }
    }

    public static void a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    a(file2);
                }
            } else {
                return;
            }
        }
        if (!file.delete() && file.exists()) {
            throw new IOException("could not delete: " + file);
        }
    }

    public static void a(String str) {
        throw new IllegalArgumentException(e.a.a.a.a.b("Unknown library: ", str));
    }

    public static void a(FileChannel fileChannel, ByteBuffer byteBuffer, int i, long j) {
        int read;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (read = fileChannel.read(byteBuffer, j)) != -1) {
            j += (long) read;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new h("ELF file truncated");
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean a(a.a.a.a.v0.b.s sVar) {
        if (sVar != null) {
            return sVar.t() == b.a.SYNTHESIZED && a.a.a.a.v0.j.g.l(sVar.b());
        }
        c(28);
        throw null;
    }

    public static boolean a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static int b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int b(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        a(fileChannel, byteBuffer, 2, j);
        return byteBuffer.getShort() & 65535;
    }

    public static <T> k0<T> b(a<T> aVar) {
        if (aVar != null) {
            return a((Object) null, aVar);
        }
        a(2);
        throw null;
    }

    public static final a.a.a.a.v0.m.d0 b(b bVar) {
        i0 g0 = bVar.g0();
        i0 J = bVar.J();
        if (g0 != null) {
            return g0.c();
        }
        if (J == null) {
            return null;
        }
        if (bVar instanceof j) {
            return J.c();
        }
        k b = bVar.b();
        if (!(b instanceof e)) {
            b = null;
        }
        e eVar = (e) b;
        if (eVar != null) {
            return eVar.v();
        }
        return null;
    }

    public static a.a.a.a.v0.m.k1.c b(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.h hVar) {
        if (hVar == null) {
            i.a("$this$asCapturedType");
            throw null;
        } else if (hVar instanceof a.a.a.a.v0.m.k0) {
            if (!(hVar instanceof a.a.a.a.v0.m.i1.h)) {
                hVar = null;
            }
            return (a.a.a.a.v0.m.i1.h) hVar;
        } else {
            StringBuilder a2 = e.a.a.a.a.a("ClassicTypeSystemContext couldn't handle: ", hVar, ", ");
            a2.append(a.w.c.s.a(hVar.getClass()));
            throw new IllegalArgumentException(a2.toString().toString());
        }
    }

    public static final Class<?> b(k kVar) {
        if (kVar instanceof e) {
            e eVar = (e) kVar;
            if (eVar.p()) {
                Class<?> a2 = a.a.a.a.s0.a(eVar);
                if (a2 != null) {
                    return a2;
                }
                StringBuilder a3 = e.a.a.a.a.a("Class object for the class ");
                a3.append(eVar.d());
                a3.append(" cannot be found (classId=");
                a3.append(a.a.a.a.v0.j.u.a.a((a.a.a.a.v0.b.h) kVar));
                a3.append(')');
                throw new a.a.a.a.i0(a3.toString());
            }
        }
        return null;
    }

    public static <T> T b(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static <D extends b> Collection<D> b(d dVar, Collection<D> collection, Collection<D> collection2, e eVar, p pVar, a.a.a.a.v0.j.l lVar) {
        if (dVar == null) {
            b(6);
            throw null;
        } else if (collection == null) {
            b(7);
            throw null;
        } else if (collection2 == null) {
            b(8);
            throw null;
        } else if (eVar == null) {
            b(9);
            throw null;
        } else if (pVar == null) {
            b(10);
            throw null;
        } else if (lVar != null) {
            return a(dVar, collection, collection2, eVar, pVar, lVar, true);
        } else {
            b(11);
            throw null;
        }
    }

    public static /* synthetic */ void b(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 18 ? 3 : 2)];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
            case 21:
                objArr[0] = "member";
                break;
            case 22:
            case 23:
                objArr[0] = "method";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            case 21:
                objArr[2] = "isObjectMethodInInterface";
                break;
            case 22:
                objArr[2] = "isObjectMethod";
                break;
            case 23:
                objArr[2] = "isMethodWithOneObjectParameter";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 18) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        r3.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.io.File r3) {
        /*
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L_0x002f
            java.io.File[] r0 = r3.listFiles()
            if (r0 == 0) goto L_0x0018
            r3 = 0
        L_0x000d:
            int r1 = r0.length
            if (r3 >= r1) goto L_0x004d
            r1 = r0[r3]
            b(r1)
            int r3 = r3 + 1
            goto L_0x000d
        L_0x0018:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cannot list directory "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L_0x002f:
            java.lang.String r0 = r3.getPath()
            java.lang.String r1 = "_lock"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L_0x003c
            goto L_0x004d
        L_0x003c:
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "r"
            r0.<init>(r3, r1)
            java.io.FileDescriptor r3 = r0.getFD()     // Catch:{ all -> 0x004e }
            r3.sync()     // Catch:{ all -> 0x004e }
            r0.close()
        L_0x004d:
            return
        L_0x004e:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0055 }
            goto L_0x0059
        L_0x0055:
            r0 = move-exception
            r3.addSuppressed(r0)
        L_0x0059:
            goto L_0x005b
        L_0x005a:
            throw r1
        L_0x005b:
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.g.b(java.io.File):void");
    }

    public static boolean b(byte[] bArr, int i, int i2) {
        return c(bArr, i, i2) == 0;
    }

    public static final int c(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    public static long c(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        a(fileChannel, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    public static a.a.a.a.v0.m.k1.d c(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.h hVar) {
        if (hVar == null) {
            i.a("$this$asDefinitelyNotNullType");
            throw null;
        } else if (hVar instanceof a.a.a.a.v0.m.k0) {
            if (!(hVar instanceof a.a.a.a.v0.m.p)) {
                hVar = null;
            }
            return (a.a.a.a.v0.m.p) hVar;
        } else {
            StringBuilder a2 = e.a.a.a.a.a("ClassicTypeSystemContext couldn't handle: ", hVar, ", ");
            a2.append(a.w.c.s.a(hVar.getClass()));
            throw new IllegalArgumentException(a2.toString().toString());
        }
    }

    public static final <T> List<T> c(T t) {
        List<T> singletonList = Collections.singletonList(t);
        i.a((Object) singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    public static /* synthetic */ void c(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 12 || i == 23 || i == 25) ? 2 : 3)];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 30:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
                objArr[0] = "enumClass";
                break;
            case 26:
            case 27:
            case 28:
                objArr[0] = "descriptor";
                break;
            case 29:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 27:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 28:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 29:
            case 30:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 12 || i == 23 || i == 25) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    public static synchronized boolean c() {
        boolean z;
        synchronized (g.class) {
            z = f4639a != null;
        }
        return z;
    }

    public static a.a.a.a.v0.m.k1.j d(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.g gVar) {
        if (gVar == null) {
            i.a("$this$asTypeArgument");
            throw null;
        } else if (gVar instanceof a.a.a.a.v0.m.d0) {
            return a.a.a.a.v0.m.l1.a.b((a.a.a.a.v0.m.d0) gVar);
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + a.w.c.s.a(gVar.getClass())).toString());
        }
    }

    public static short d(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        a(fileChannel, byteBuffer, 1, j);
        return (short) (byteBuffer.get() & 255);
    }

    public static final void d() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static /* synthetic */ void d(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 4 ? 3 : 2)];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        if (i != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static final int e(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final <T extends b> T e(T t) {
        if (t != null) {
            T t2 = (T) d((b) t);
            if (t2 != null) {
                return t2;
            }
            a.a.a.a.v0.d.a.e eVar = a.a.a.a.v0.d.a.e.f784g;
            d d2 = t.d();
            i.a((Object) d2, "name");
            if (!eVar.a(d2)) {
                return null;
            }
            return (T) a.a.a.a.v0.j.u.a.a(t, false, x.f828c, 1);
        }
        i.a("$this$getOverriddenSpecialBuiltin");
        throw null;
    }

    public static final <T> Set<T> e(T t) {
        Set<T> singleton = Collections.singleton(t);
        i.a((Object) singleton, "java.util.Collections.singleton(element)");
        return singleton;
    }

    public static boolean f(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.k kVar) {
        if (kVar == null) {
            i.a("$this$isClassTypeConstructor");
            throw null;
        } else if (kVar instanceof s0) {
            return ((s0) kVar).c() instanceof e;
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + a.w.c.s.a(kVar.getClass())).toString());
        }
    }

    public static boolean g(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.k kVar) {
        e eVar = null;
        if (kVar == null) {
            i.a("$this$isCommonFinalClassConstructor");
            throw null;
        } else if (kVar instanceof s0) {
            a.a.a.a.v0.b.h c2 = ((s0) kVar).c();
            if (c2 instanceof e) {
                eVar = c2;
            }
            e eVar2 = eVar;
            return (eVar2 == null || !d(eVar2) || eVar2.t() == f.ENUM_ENTRY || eVar2.t() == f.ANNOTATION_CLASS) ? false : true;
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + a.w.c.s.a(kVar.getClass())).toString());
        }
    }

    public static boolean h(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.k kVar) {
        if (kVar == null) {
            i.a("$this$isDenotable");
            throw null;
        } else if (kVar instanceof s0) {
            return ((s0) kVar).a();
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + a.w.c.s.a(kVar.getClass())).toString());
        }
    }

    public static boolean i(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.k kVar) {
        e eVar = null;
        if (kVar == null) {
            i.a("$this$isInlineClass");
            throw null;
        } else if (kVar instanceof s0) {
            a.a.a.a.v0.b.h c2 = ((s0) kVar).c();
            if (c2 instanceof e) {
                eVar = c2;
            }
            e eVar2 = eVar;
            return eVar2 != null && eVar2.p();
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + a.w.c.s.a(kVar.getClass())).toString());
        }
    }

    public static boolean j(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.k kVar) {
        if (kVar == null) {
            i.a("$this$isIntegerLiteralTypeConstructor");
            throw null;
        } else if (kVar instanceof s0) {
            return kVar instanceof r;
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + a.w.c.s.a(kVar.getClass())).toString());
        }
    }

    public static boolean k(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.k kVar) {
        if (kVar == null) {
            i.a("$this$isIntersection");
            throw null;
        } else if (kVar instanceof s0) {
            return kVar instanceof b0;
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + a.w.c.s.a(kVar.getClass())).toString());
        }
    }

    public static boolean l(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.k kVar) {
        if (kVar == null) {
            i.a("$this$isNothingConstructor");
            throw null;
        } else if (kVar instanceof s0) {
            return a.a.a.a.v0.a.g.a((s0) kVar, a.a.a.a.v0.a.g.k.b);
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + a.w.c.s.a(kVar.getClass())).toString());
        }
    }

    public static boolean m(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.k kVar) {
        if (kVar == null) {
            i.a("$this$isUnderKotlinPackage");
            throw null;
        } else if (kVar instanceof s0) {
            a.a.a.a.v0.b.h c2 = ((s0) kVar).c();
            return c2 != null && a.a.a.a.v0.a.g.e(c2);
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + a.w.c.s.a(kVar.getClass())).toString());
        }
    }

    public static int n(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.k kVar) {
        if (kVar == null) {
            i.a("$this$parametersCount");
            throw null;
        } else if (kVar instanceof s0) {
            return ((s0) kVar).d().size();
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + a.w.c.s.a(kVar.getClass())).toString());
        }
    }

    public static Collection<a.a.a.a.v0.m.k1.g> o(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.k kVar) {
        if (kVar == null) {
            i.a("$this$supertypes");
            throw null;
        } else if (kVar instanceof s0) {
            Collection<a.a.a.a.v0.m.d0> b = ((s0) kVar).b();
            i.a((Object) b, "this.supertypes");
            return b;
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + a.w.c.s.a(kVar.getClass())).toString());
        }
    }

    public static final /* synthetic */ a.a.a.a.v0.f.b a(a.a.a.a.v0.f.c cVar, String str) {
        a.a.a.a.v0.f.b g2 = cVar.a(d.b(str)).g();
        i.a((Object) g2, "child(Name.identifier(name)).toSafe()");
        return g2;
    }

    public static a.a.a.a.v0.m.k1.f b(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.g gVar) {
        a.a.a.a.v0.m.x xVar = null;
        if (gVar == null) {
            i.a("$this$asFlexibleType");
            throw null;
        } else if (gVar instanceof a.a.a.a.v0.m.d0) {
            f1 K0 = ((a.a.a.a.v0.m.d0) gVar).K0();
            if (K0 instanceof a.a.a.a.v0.m.x) {
                xVar = K0;
            }
            return xVar;
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + a.w.c.s.a(gVar.getClass())).toString());
        }
    }

    public static a.a.a.a.v0.m.k1.h c(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.g gVar) {
        a.a.a.a.v0.m.k0 k0Var = null;
        if (gVar == null) {
            i.a("$this$asSimpleType");
            throw null;
        } else if (gVar instanceof a.a.a.a.v0.m.d0) {
            f1 K0 = ((a.a.a.a.v0.m.d0) gVar).K0();
            if (K0 instanceof a.a.a.a.v0.m.k0) {
                k0Var = K0;
            }
            return k0Var;
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + a.w.c.s.a(gVar.getClass())).toString());
        }
    }

    public static final <T> int d(T[] tArr) {
        if (tArr != null) {
            return tArr.length - 1;
        }
        i.a("$this$lastIndex");
        throw null;
    }

    public static final Collection<m<?>> e(a.a.c<?> cVar) {
        if (cVar != null) {
            k0 k0Var = ((a.a.a.a.a) cVar).f0d.a().k;
            a.a.l lVar = a.C0000a.m[15];
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Collection) k0Var.a()) {
                a.a.a.a.g gVar = (a.a.a.a.g) obj;
                if (a(gVar) && (gVar instanceof m)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        i.a("$this$staticProperties");
        throw null;
    }

    public static final boolean f(a.a.a.a.v0.m.d0 d0Var) {
        if (d0Var != null) {
            f1 K0 = d0Var.K0();
            return (K0 instanceof a.a.a.a.v0.m.v) || ((K0 instanceof a.a.a.a.v0.m.x) && (((a.a.a.a.v0.m.x) K0).L0() instanceof a.a.a.a.v0.m.v));
        }
        i.a("$this$isError");
        throw null;
    }

    public static final boolean g(a.a.a.a.v0.m.d0 d0Var) {
        if (d0Var != null) {
            return d0Var.K0() instanceof a.a.a.a.v0.m.x;
        }
        i.a("$this$isFlexible");
        throw null;
    }

    public static final boolean h(a.a.a.a.v0.m.d0 d0Var) {
        if (d0Var != null) {
            a.a.a.a.v0.b.h c2 = d0Var.I0().c();
            if (c2 != null) {
                return a((k) c2);
            }
            return false;
        }
        i.a("$this$isInlineClassType");
        throw null;
    }

    public static final a.a.a.a.v0.m.k0 i(a.a.a.a.v0.m.d0 d0Var) {
        if (d0Var != null) {
            f1 K0 = d0Var.K0();
            if (K0 instanceof a.a.a.a.v0.m.x) {
                return ((a.a.a.a.v0.m.x) K0).f1956d;
            }
            if (K0 instanceof a.a.a.a.v0.m.k0) {
                return (a.a.a.a.v0.m.k0) K0;
            }
            throw new a.h();
        }
        i.a("$this$lowerIfFlexible");
        throw null;
    }

    public static final a.a.a.a.v0.d.b.h j(a.a.a.a.v0.m.d0 d0Var) {
        if (d0Var != null) {
            return (a.a.a.a.v0.d.b.h) a(d0Var, a.a.a.a.v0.d.b.j.f915a, u.k, t.f922a, a.a.a.a.v0.o.g.b);
        }
        i.a("$this$mapToJvmType");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean k(a.a.a.a.v0.m.d0 r5) {
        /*
            r0 = 0
            if (r5 == 0) goto L_0x004e
            a.a.a.a.v0.m.s0 r1 = r5.I0()
            a.a.a.a.v0.b.h r1 = r1.c()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x002a
            boolean r4 = a(r1)
            if (r4 == 0) goto L_0x0025
            a.a.a.a.v0.b.e r1 = (a.a.a.a.v0.b.e) r1
            a.a.a.a.v0.f.b r1 = a.a.a.a.v0.j.u.a.c(r1)
            a.a.a.a.v0.f.b r4 = a.a.a.a.v0.j.g.f1544g
            boolean r1 = a.w.c.i.a(r1, r4)
            if (r1 != 0) goto L_0x0025
            r1 = 1
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            if (r1 != r2) goto L_0x002a
            r1 = 1
            goto L_0x002b
        L_0x002a:
            r1 = 0
        L_0x002b:
            if (r1 != 0) goto L_0x004d
            a.a.a.a.v0.m.s0 r5 = r5.I0()
            a.a.a.a.v0.b.h r5 = r5.c()
            boolean r1 = r5 instanceof a.a.a.a.v0.b.r0
            if (r1 != 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r0 = r5
        L_0x003b:
            a.a.a.a.v0.b.r0 r0 = (a.a.a.a.v0.b.r0) r0
            if (r0 == 0) goto L_0x0048
            a.a.a.a.v0.m.d0 r5 = a.a.a.a.v0.m.l1.a.a(r0)
            boolean r5 = k(r5)
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            if (r5 == 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r2 = 0
        L_0x004d:
            return r2
        L_0x004e:
            java.lang.String r5 = "$this$isInlineClassThatRequiresMangling"
            a.w.c.i.a(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.g.k(a.a.a.a.v0.m.d0):boolean");
    }

    public static final Class<?> l(a.a.a.a.v0.m.d0 d0Var) {
        if (d0Var != null) {
            return b((k) d0Var.I0().c());
        }
        i.a("$this$toInlineClass");
        throw null;
    }

    public static final a.a.a.a.v0.m.k0 m(a.a.a.a.v0.m.d0 d0Var) {
        if (d0Var != null) {
            f1 K0 = d0Var.K0();
            if (K0 instanceof a.a.a.a.v0.m.x) {
                return ((a.a.a.a.v0.m.x) K0).f1957e;
            }
            if (K0 instanceof a.a.a.a.v0.m.k0) {
                return (a.a.a.a.v0.m.k0) K0;
            }
            throw new a.h();
        }
        i.a("$this$upperIfFlexible");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ a.a.a.a.u0.h a(a.a.a.a.c0.a r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 1031
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.g.a(a.a.a.a.c0$a, boolean):a.a.a.a.u0.h");
    }

    public static final a.a.a.a.v0.m.k0 b(a.a.a.a.v0.m.d0 d0Var) {
        a.a.a.a.v0.m.k0 k0Var = null;
        if (d0Var != null) {
            f1 K0 = d0Var.K0();
            if (K0 instanceof a.a.a.a.v0.m.k0) {
                k0Var = K0;
            }
            a.a.a.a.v0.m.k0 k0Var2 = k0Var;
            if (k0Var2 != null) {
                return k0Var2;
            }
            throw new IllegalStateException(("This is should be simple type: " + d0Var).toString());
        }
        i.a("$this$asSimpleType");
        throw null;
    }

    public static final <T> T c(T[] tArr) {
        if (tArr != null) {
            if (tArr.length == 0) {
                return null;
            }
            return tArr[0];
        }
        i.a("$this$firstOrNull");
        throw null;
    }

    public static final <T> Collection<n<T, ?>> d(a.a.c<T> cVar) {
        if (cVar != null) {
            Collection<a.a.a.a.g<?>> a2 = ((a.a.a.a.a) cVar).f0d.a().a();
            ArrayList arrayList = new ArrayList();
            for (T t : a2) {
                T t2 = t;
                if (a(t2) && (t2 instanceof n)) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
        i.a("$this$memberProperties");
        throw null;
    }

    public static boolean f(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.g gVar) {
        if (gVar == null) {
            i.a("$this$isError");
            throw null;
        } else if (gVar instanceof a.a.a.a.v0.m.d0) {
            return f((a.a.a.a.v0.m.d0) gVar);
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + a.w.c.s.a(gVar.getClass())).toString());
        }
    }

    public static boolean g(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.g gVar) {
        if (gVar != null) {
            return (gVar instanceof a.a.a.a.v0.m.k1.h) && cVar.d((a.a.a.a.v0.m.k1.h) gVar);
        }
        i.a("$this$isMarkedNullable");
        throw null;
    }

    public static boolean h(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.g gVar) {
        if (gVar == null) {
            i.a("$this$isNullableType");
            throw null;
        } else if (gVar instanceof a.a.a.a.v0.m.d0) {
            return c1.c((a.a.a.a.v0.m.d0) gVar);
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + a.w.c.s.a(gVar.getClass())).toString());
        }
    }

    public static final <T> Set<T> l(T[] tArr) {
        if (tArr != null) {
            int length = tArr.length;
            if (length == 0) {
                return a.t.n.f2121c;
            }
            if (length == 1) {
                return e((Object) tArr[0]);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(e(tArr.length));
            a((Object[]) tArr, (Collection) linkedHashSet);
            return linkedHashSet;
        }
        i.a("$this$toSet");
        throw null;
    }

    public static final a.a.a.a.v0.d.a.a0.h b(a.a.a.a.v0.d.a.a0.h hVar, h hVar2) {
        if (hVar == null) {
            i.a("$this$copyWithNewDefaultTypeQualifiers");
            throw null;
        } else if (hVar2 != null) {
            return hVar2.isEmpty() ? hVar : new a.a.a.a.v0.d.a.a0.h(hVar.f562c, hVar.f563d, a(a.f.NONE, (a.w.b.a) new a.a.a.a.v0.d.a.a0.b(hVar, hVar2)));
        } else {
            i.a("additionalAnnotations");
            throw null;
        }
    }

    public static final a.a.a.a.v0.m.d0 c(a.a.a.a.v0.m.d0 d0Var) {
        if (d0Var == null) {
            i.a("$this$getEnhancement");
            throw null;
        } else if (d0Var instanceof d1) {
            return ((d1) d0Var).w0();
        } else {
            return null;
        }
    }

    public static boolean f(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.h hVar) {
        if (hVar == null) {
            i.a("$this$isStubType");
            throw null;
        } else if (hVar instanceof a.a.a.a.v0.m.k0) {
            return false;
        } else {
            StringBuilder a2 = e.a.a.a.a.a("ClassicTypeSystemContext couldn't handle: ", hVar, ", ");
            a2.append(a.w.c.s.a(hVar.getClass()));
            throw new IllegalArgumentException(a2.toString().toString());
        }
    }

    public static final <T> List<T> h(T... tArr) {
        if (tArr != null) {
            ArrayList arrayList = new ArrayList();
            for (T t : tArr) {
                if (t != null) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
        i.a("elements");
        throw null;
    }

    public static final <T> Class<T> c(a.a.c<T> cVar) {
        if (cVar != null) {
            Class<T> cls = (Class<T>) ((a.w.c.c) cVar).b();
            if (cls.isPrimitive()) {
                return cls;
            }
            String name = cls.getName();
            switch (name.hashCode()) {
                case -2056817302:
                    if (name.equals("java.lang.Integer")) {
                        return Integer.TYPE;
                    }
                    return null;
                case -527879800:
                    if (name.equals("java.lang.Float")) {
                        return Float.TYPE;
                    }
                    return null;
                case -515992664:
                    if (name.equals("java.lang.Short")) {
                        return Short.TYPE;
                    }
                    return null;
                case 155276373:
                    if (name.equals("java.lang.Character")) {
                        return Character.TYPE;
                    }
                    return null;
                case 344809556:
                    if (name.equals("java.lang.Boolean")) {
                        return Boolean.TYPE;
                    }
                    return null;
                case 398507100:
                    if (name.equals("java.lang.Byte")) {
                        return Byte.TYPE;
                    }
                    return null;
                case 398795216:
                    if (name.equals("java.lang.Long")) {
                        return Long.TYPE;
                    }
                    return null;
                case 399092968:
                    if (name.equals("java.lang.Void")) {
                        return Void.TYPE;
                    }
                    return null;
                case 761287205:
                    if (name.equals("java.lang.Double")) {
                        return Double.TYPE;
                    }
                    return null;
                default:
                    return null;
            }
        } else {
            i.a("$this$javaPrimitiveType");
            throw null;
        }
    }

    public static final <T> T f(T[] tArr) {
        if (tArr != null) {
            if (!(tArr.length == 0)) {
                return tArr[d((Object[]) tArr)];
            }
            throw new NoSuchElementException("Array is empty.");
        }
        i.a("$this$last");
        throw null;
    }

    public static final <T> List<T> g(T... tArr) {
        if (tArr != null) {
            return tArr.length > 0 ? a.t.f.a((Object[]) tArr) : a.t.l.f2119c;
        }
        i.a("elements");
        throw null;
    }

    public static a.a.a.a.v0.m.k1.g i(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.g gVar) {
        a.a.a.a.v0.m.k1.h a2;
        if (gVar != null) {
            a.a.a.a.v0.m.k1.h a3 = cVar.a(gVar);
            return (a3 == null || (a2 = cVar.a(a3, true)) == null) ? gVar : a2;
        }
        i.a("$this$makeNullable");
        throw null;
    }

    public static final String c(b bVar) {
        b a2;
        if (bVar != null) {
            b d2 = a.a.a.a.v0.a.g.c(bVar) ? d(bVar) : null;
            if (d2 == null || (a2 = a.a.a.a.v0.j.u.a.a(d2)) == null) {
                return null;
            }
            if (a2 instanceof f0) {
                return a.a.a.a.v0.d.a.f.f800e.a(a2);
            }
            if (!(a2 instanceof a.a.a.a.v0.b.l0)) {
                return null;
            }
            a.a.a.a.v0.d.a.d dVar = a.a.a.a.v0.d.a.d.f689f;
            Map<String, d> map = a.a.a.a.v0.d.a.d.f686c;
            String a3 = a((a.a.a.a.v0.b.a) ((a.a.a.a.v0.b.l0) a2));
            d dVar2 = a3 != null ? map.get(a3) : null;
            if (dVar2 != null) {
                return dVar2.a();
            }
            return null;
        }
        i.a("callableMemberDescriptor");
        throw null;
    }

    public static final <T extends b> T d(T t) {
        a.w.b.l lVar;
        if (t != null) {
            a.a.a.a.v0.d.a.d dVar = a.a.a.a.v0.d.a.d.f689f;
            if (!a.a.a.a.v0.d.a.d.f687d.contains(t.d())) {
                a.a.a.a.v0.d.a.f fVar = a.a.a.a.v0.d.a.f.f800e;
                if (!a.a.a.a.v0.d.a.f.f799d.contains(a.a.a.a.v0.j.u.a.a((b) t).d())) {
                    return null;
                }
            }
            if ((t instanceof f0) || (t instanceof e0)) {
                lVar = a.a.a.a.v0.d.a.v.f826c;
            } else if (!(t instanceof a.a.a.a.v0.b.l0)) {
                return null;
            } else {
                lVar = a.a.a.a.v0.d.a.w.f827c;
            }
            return (T) a.a.a.a.v0.j.u.a.a(t, false, lVar, 1);
        }
        i.a("$this$getOverriddenBuiltinWithDifferentJvmName");
        throw null;
    }

    public static a.a.a.a.v0.m.k1.k f(a.a.a.a.v0.m.k1.n nVar, a.a.a.a.v0.m.k1.g gVar) {
        if (gVar != null) {
            a.a.a.a.v0.m.k1.h a2 = nVar.a(gVar);
            if (a2 == null) {
                a2 = nVar.b(gVar);
            }
            return nVar.a(a2);
        }
        i.a("$this$typeConstructor");
        throw null;
    }

    public static final <T> T j(T[] tArr) {
        if (tArr != null) {
            int length = tArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            } else if (length == 1) {
                return tArr[0];
            } else {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        } else {
            i.a("$this$single");
            throw null;
        }
    }

    public static Collection<a.a.a.a.v0.m.k1.g> g(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.h hVar) {
        if (hVar != null) {
            a.a.a.a.v0.m.k1.k a2 = cVar.a(hVar);
            if (a2 instanceof r) {
                return ((r) a2).f1588c;
            }
            StringBuilder a3 = e.a.a.a.a.a("ClassicTypeSystemContext couldn't handle: ", hVar, ", ");
            a3.append(a.w.c.s.a(hVar.getClass()));
            throw new IllegalArgumentException(a3.toString().toString());
        }
        i.a("$this$possibleIntegerTypes");
        throw null;
    }

    public static a.a.a.a.v0.m.k1.k h(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.h hVar) {
        if (hVar == null) {
            i.a("$this$typeConstructor");
            throw null;
        } else if (hVar instanceof a.a.a.a.v0.m.k0) {
            return ((a.a.a.a.v0.m.k0) hVar).I0();
        } else {
            StringBuilder a2 = e.a.a.a.a.a("ClassicTypeSystemContext couldn't handle: ", hVar, ", ");
            a2.append(a.w.c.s.a(hVar.getClass()));
            throw new IllegalArgumentException(a2.toString().toString());
        }
    }

    public static final <T> Set<T> i(T... tArr) {
        if (tArr != null) {
            return tArr.length > 0 ? l(tArr) : a.t.n.f2121c;
        }
        i.a("elements");
        throw null;
    }

    public static final <T> List<T> k(T[] tArr) {
        if (tArr != null) {
            int length = tArr.length;
            if (length == 0) {
                return a.t.l.f2119c;
            }
            if (length != 1) {
                return new ArrayList(new a.t.c(tArr, false));
            }
            return c((Object) tArr[0]);
        }
        i.a("$this$toList");
        throw null;
    }

    public static a.a.a.a.v0.b.l0 b(e eVar) {
        if (eVar == null) {
            c(22);
            throw null;
        } else if (h.b != null) {
            j0 a2 = j0.a(eVar, h.a.f321a, a.a.a.a.v0.j.g.f1539a, b.a.SYNTHESIZED, eVar.r()).a((i0) null, (i0) null, Collections.emptyList(), Collections.emptyList(), (a.a.a.a.v0.m.d0) a.a.a.a.v0.j.u.a.b((k) eVar).a(g1.INVARIANT, eVar.v()), a.a.a.a.v0.b.v.FINAL, z0.f515e);
            if (a2 != null) {
                return a2;
            }
            c(23);
            throw null;
        } else {
            throw null;
        }
    }

    public static a.a.a.a.v0.m.k1.g e(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.g gVar) {
        if (gVar == null) {
            i.a("$this$getSubstitutedUnderlyingType");
            throw null;
        } else if (gVar instanceof a.a.a.a.v0.m.d0) {
            a.a.a.a.v0.m.d0 d0Var = (a.a.a.a.v0.m.d0) gVar;
            a.a.a.a.v0.b.h c2 = d0Var.I0().c();
            if (!(c2 instanceof e)) {
                c2 = null;
            }
            e eVar = (e) c2;
            w0 e2 = eVar != null ? e(eVar) : null;
            if (e2 == null) {
                return null;
            }
            a.a.a.a.v0.j.w.i u = d0Var.u();
            d d2 = e2.d();
            i.a((Object) d2, "parameter.name");
            f0 f0Var = (f0) a.t.f.f(u.c(d2, a.a.a.a.v0.c.a.d.f523f));
            if (f0Var != null) {
                return f0Var.c();
            }
            return null;
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + a.w.c.s.a(gVar.getClass())).toString());
        }
    }

    public static a.a.a.a.v0.m.k1.h g(a.a.a.a.v0.m.k1.n nVar, a.a.a.a.v0.m.k1.g gVar) {
        a.a.a.a.v0.m.k1.h hVar;
        if (gVar != null) {
            a.a.a.a.v0.m.k1.f i = nVar.i(gVar);
            if ((i != null && (hVar = nVar.b(i)) != null) || (hVar = nVar.a(gVar)) != null) {
                return hVar;
            }
            i.a();
            throw null;
        }
        i.a("$this$upperBoundIfFlexible");
        throw null;
    }

    public static final a.a.a.a.v0.d.a.a0.n.n c(e eVar) {
        a.a.a.a.v0.d.a.a0.n.n nVar = null;
        if (eVar != null) {
            e b = a.a.a.a.v0.j.u.a.b(eVar);
            if (b == null) {
                return null;
            }
            a.a.a.a.v0.j.w.i Z = b.Z();
            if (Z instanceof a.a.a.a.v0.d.a.a0.n.n) {
                nVar = Z;
            }
            a.a.a.a.v0.d.a.a0.n.n nVar2 = nVar;
            return nVar2 != null ? nVar2 : c(b);
        }
        i.a("$this$getParentJavaStaticClassScope");
        throw null;
    }

    public static l d(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.k kVar) {
        r0 r0Var = null;
        if (kVar == null) {
            i.a("$this$getTypeParameterClassifier");
            throw null;
        } else if (kVar instanceof s0) {
            a.a.a.a.v0.b.h c2 = ((s0) kVar).c();
            if (c2 instanceof r0) {
                r0Var = c2;
            }
            return r0Var;
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + a.w.c.s.a(kVar.getClass())).toString());
        }
    }

    public static final a.a.a.a.v0.b.h b(a.a.a.a.v0.b.w wVar, a.a.a.a.v0.f.a aVar) {
        if (wVar == null) {
            i.a("$this$findClassifierAcrossModuleDependencies");
            throw null;
        } else if (aVar != null) {
            a.a.a.a.v0.f.b d2 = aVar.d();
            i.a((Object) d2, "classId.packageFqName");
            a.a.a.a.v0.b.b0 a2 = wVar.a(d2);
            List<d> e2 = aVar.e().f1344a.e();
            if (e2 != null) {
                i.a((Object) e2, "classId.relativeClassName.pathSegments()");
                a.a.a.a.v0.j.w.i u = a2.u();
                Object a3 = a.t.f.a((List) e2);
                i.a(a3, "segments.first()");
                a.a.a.a.v0.b.h b = u.b((d) a3, a.a.a.a.v0.c.a.d.j);
                if (b == null) {
                    return null;
                }
                for (d dVar : e2.subList(1, e2.size())) {
                    if (!(b instanceof e)) {
                        return null;
                    }
                    a.a.a.a.v0.j.w.i T = ((e) b).T();
                    i.a((Object) dVar, "name");
                    a.a.a.a.v0.b.h b2 = T.b(dVar, a.a.a.a.v0.c.a.d.j);
                    if (!(b2 instanceof e)) {
                        b2 = null;
                    }
                    b = (e) b2;
                    if (b == null) {
                        return null;
                    }
                }
                return b;
            }
            a.a.a.a.v0.f.b.a(11);
            throw null;
        } else {
            i.a("classId");
            throw null;
        }
    }

    public static a.a.a.a.v0.a.i c(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.k kVar) {
        if (kVar == null) {
            i.a("$this$getPrimitiveType");
            throw null;
        } else if (kVar instanceof s0) {
            a.a.a.a.v0.b.h c2 = ((s0) kVar).c();
            if (c2 != null) {
                return a.a.a.a.v0.a.g.b((k) ((e) c2));
            }
            throw new a.n("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + a.w.c.s.a(kVar.getClass())).toString());
        }
    }

    public static final boolean d(a.a.a.a.v0.m.d0 d0Var) {
        if (d0Var != null) {
            return d0Var.I0() instanceof a.a.a.a.v0.j.r.a.b;
        }
        i.a("$this$isCaptured");
        throw null;
    }

    public static boolean c(a.a.a.a.v0.m.k1.n nVar, a.a.a.a.v0.m.k1.g gVar) {
        a.a.a.a.v0.m.k1.e eVar = null;
        if (gVar != null) {
            a.a.a.a.v0.m.k1.f i = nVar.i(gVar);
            if (i != null) {
                eVar = nVar.a(i);
            }
            return eVar != null;
        }
        i.a("$this$isDynamic");
        throw null;
    }

    public static final boolean d(e eVar) {
        if (eVar != null) {
            return eVar.o() == a.a.a.a.v0.b.v.FINAL && eVar.t() != f.ENUM_CLASS;
        }
        i.a("$this$isFinalClass");
        throw null;
    }

    public static boolean e(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.k kVar) {
        if (kVar == null) {
            i.a("$this$isAnyConstructor");
            throw null;
        } else if (kVar instanceof s0) {
            return a.a.a.a.v0.a.g.a((s0) kVar, a.a.a.a.v0.a.g.k.f198a);
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + a.w.c.s.a(kVar.getClass())).toString());
        }
    }

    public static boolean c(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.j jVar) {
        if (jVar == null) {
            i.a("$this$isStarProjection");
            throw null;
        } else if (jVar instanceof v0) {
            return ((v0) jVar).b();
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + a.w.c.s.a(jVar.getClass())).toString());
        }
    }

    public static boolean d(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.h hVar) {
        if (hVar == null) {
            i.a("$this$isMarkedNullable");
            throw null;
        } else if (hVar instanceof a.a.a.a.v0.m.k0) {
            return ((a.a.a.a.v0.m.k0) hVar).J0();
        } else {
            StringBuilder a2 = e.a.a.a.a.a("ClassicTypeSystemContext couldn't handle: ", hVar, ", ");
            a2.append(a.w.c.s.a(hVar.getClass()));
            throw new IllegalArgumentException(a2.toString().toString());
        }
    }

    public static final boolean e(a.a.a.a.v0.m.d0 d0Var) {
        if (d0Var != null) {
            return d0Var.K0() instanceof a.a.a.a.v0.m.u;
        }
        i.a("$this$isDynamic");
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> c(List<? extends T> list) {
        if (list != 0) {
            int size = list.size();
            if (size != 0) {
                return size != 1 ? list : c(list.get(0));
            }
            return a.t.l.f2119c;
        }
        i.a("$this$optimizeReadOnlyList");
        throw null;
    }

    public static boolean d(a.a.a.a.v0.m.k1.n nVar, a.a.a.a.v0.m.k1.g gVar) {
        if (gVar != null) {
            return nVar.o(nVar.c(gVar)) && !nVar.g(gVar);
        }
        i.a("$this$isNothing");
        throw null;
    }

    public static boolean e(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.h hVar) {
        if (hVar == null) {
            i.a("$this$isPrimitiveType");
            throw null;
        } else if (hVar instanceof a.a.a.a.v0.m.d0) {
            return a.a.a.a.v0.a.g.f((a.a.a.a.v0.m.d0) hVar);
        } else {
            StringBuilder a2 = e.a.a.a.a.a("ClassicTypeSystemContext couldn't handle: ", hVar, ", ");
            a2.append(a.w.c.s.a(hVar.getClass()));
            throw new IllegalArgumentException(a2.toString().toString());
        }
    }

    public static final <T> T b(T[] tArr) {
        if (tArr != null) {
            if (!(tArr.length == 0)) {
                return tArr[0];
            }
            throw new NoSuchElementException("Array is empty.");
        }
        i.a("$this$first");
        throw null;
    }

    public static final <T> List<T> d(T t) {
        return t != null ? c((Object) t) : a.t.l.f2119c;
    }

    public static final <T> Iterator<T> e(T[] tArr) {
        if (tArr != null) {
            return new a.w.c.a(tArr);
        }
        i.a("array");
        throw null;
    }

    public static final <T> Class<T> b(a.a.c<T> cVar) {
        if (cVar != null) {
            Class<T> cls = (Class<T>) ((a.w.c.c) cVar).b();
            if (!cls.isPrimitive()) {
                return cls;
            }
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    return name.equals("double") ? Double.class : cls;
                case 104431:
                    return name.equals("int") ? Integer.class : cls;
                case 3039496:
                    return name.equals("byte") ? Byte.class : cls;
                case 3052374:
                    return name.equals("char") ? Character.class : cls;
                case 3327612:
                    return name.equals("long") ? Long.class : cls;
                case 3625364:
                    return name.equals("void") ? Void.class : cls;
                case 64711720:
                    return name.equals("boolean") ? Boolean.class : cls;
                case 97526364:
                    return name.equals("float") ? Float.class : cls;
                case 109413500:
                    return name.equals("short") ? Short.class : cls;
                default:
                    return cls;
            }
        } else {
            i.a("$this$javaObjectType");
            throw null;
        }
    }

    public static int c(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                if (b >= -32) {
                    if (b < -16) {
                        if (i3 < i2 - 1) {
                            int i4 = i3 + 1;
                            byte b2 = bArr[i3];
                            if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                                i = i4 + 1;
                                if (bArr[i4] > -65) {
                                }
                            }
                        }
                    } else if (i3 < i2 - 2) {
                        int i5 = i3 + 1;
                        byte b3 = bArr[i3];
                        if (b3 <= -65) {
                            if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                                int i6 = i5 + 1;
                                if (bArr[i5] <= -65) {
                                    i3 = i6 + 1;
                                    if (bArr[i6] > -65) {
                                    }
                                }
                            }
                        }
                    }
                    return a(bArr, i3, i2);
                } else if (i3 >= i2) {
                    return b;
                } else {
                    if (b >= -62) {
                        i = i3 + 1;
                        if (bArr[i3] > -65) {
                        }
                    }
                }
                return -1;
            }
            i = i3;
        }
        return 0;
    }

    public static final String d(List<d> list) {
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            for (d dVar : list) {
                if (sb.length() > 0) {
                    sb.append(".");
                }
                sb.append(a(dVar));
            }
            String sb2 = sb.toString();
            i.a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        i.a("pathSegments");
        throw null;
    }

    public static a.a.a.a.v0.m.k1.h e(a.a.a.a.v0.m.k1.n nVar, a.a.a.a.v0.m.k1.g gVar) {
        a.a.a.a.v0.m.k1.h hVar;
        if (gVar != null) {
            a.a.a.a.v0.m.k1.f i = nVar.i(gVar);
            if ((i != null && (hVar = nVar.c(i)) != null) || (hVar = nVar.a(gVar)) != null) {
                return hVar;
            }
            i.a();
            throw null;
        }
        i.a("$this$lowerBoundIfFlexible");
        throw null;
    }

    public static final d b(a.a.a.a.v0.e.x0.c cVar, int i) {
        if (cVar != null) {
            d a2 = d.a(cVar.a(i));
            i.a((Object) a2, "Name.guessByFirstCharacter(getString(index))");
            return a2;
        }
        i.a("$this$getName");
        throw null;
    }

    public static a.a.a.a.v0.m.k1.h c(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.f fVar) {
        if (fVar == null) {
            i.a("$this$upperBound");
            throw null;
        } else if (fVar instanceof a.a.a.a.v0.m.x) {
            return ((a.a.a.a.v0.m.x) fVar).f1957e;
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + a.w.c.s.a(fVar.getClass())).toString());
        }
    }

    public static final w0 e(e eVar) {
        a.a.a.a.v0.b.d Y;
        List<w0> j;
        if (eVar == null) {
            i.a("$this$underlyingRepresentation");
            throw null;
        } else if (!eVar.p() || (Y = eVar.Y()) == null || (j = Y.j()) == null) {
            return null;
        } else {
            return (w0) a.t.f.f((List) j);
        }
    }

    public static a.a.a.a.v0.a.i b(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.k kVar) {
        if (kVar == null) {
            i.a("$this$getPrimitiveArrayType");
            throw null;
        } else if (kVar instanceof s0) {
            a.a.a.a.v0.b.h c2 = ((s0) kVar).c();
            if (c2 != null) {
                return a.a.a.a.v0.a.g.a((k) ((e) c2));
            }
            throw new a.n("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + a.w.c.s.a(kVar.getClass())).toString());
        }
    }

    public static String[] b() {
        i iVar;
        i iVar2;
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        if (i >= 23) {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            if (Process.is64Bit()) {
                treeSet.add(i.AARCH64.f4645c);
                iVar2 = i.X86_64;
            } else {
                treeSet.add(i.ARM.f4645c);
                iVar2 = i.X86;
            }
            treeSet.add(iVar2.f4645c);
            ArrayList arrayList = new ArrayList();
            int length = strArr.length;
            while (i2 < length) {
                String str = strArr[i2];
                if (treeSet.contains(str)) {
                    arrayList.add(str);
                }
                i2++;
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        } else if (i >= 21) {
            String[] strArr2 = Build.SUPPORTED_ABIS;
            TreeSet treeSet2 = new TreeSet();
            try {
                if (Os.readlink("/proc/self/exe").contains("64")) {
                    treeSet2.add(i.AARCH64.f4645c);
                    iVar = i.X86_64;
                } else {
                    treeSet2.add(i.ARM.f4645c);
                    iVar = i.X86;
                }
                treeSet2.add(iVar.f4645c);
                ArrayList arrayList2 = new ArrayList();
                int length2 = strArr2.length;
                while (i2 < length2) {
                    String str2 = strArr2[i2];
                    if (treeSet2.contains(str2)) {
                        arrayList2.add(str2);
                    }
                    i2++;
                }
                return (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            } catch (ErrnoException e2) {
                Log.e("SysUtil", String.format("Could not read /proc/self/exe. Falling back to default ABI list: %s. errno: %d Err msg: %s", Arrays.toString(strArr2), Integer.valueOf(e2.errno), e2.getMessage()));
                return Build.SUPPORTED_ABIS;
            }
        } else {
            return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
        }
    }

    public static a.a.a.a.v0.m.k1.q b(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.j jVar) {
        if (jVar == null) {
            i.a("$this$getVariance");
            throw null;
        } else if (jVar instanceof v0) {
            g1 a2 = ((v0) jVar).a();
            i.a((Object) a2, "this.projectionKind");
            return a(a2);
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + a.w.c.s.a(jVar.getClass())).toString());
        }
    }

    public static a.a.a.a.v0.m.k1.q b(a.a.a.a.v0.m.i1.c cVar, l lVar) {
        if (lVar == null) {
            i.a("$this$getVariance");
            throw null;
        } else if (lVar instanceof r0) {
            g1 F = ((r0) lVar).F();
            i.a((Object) F, "this.variance");
            return a(F);
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + a.w.c.s.a(lVar.getClass())).toString());
        }
    }

    public static boolean b(h hVar, a.a.a.a.v0.f.b bVar) {
        if (bVar != null) {
            return hVar.a(bVar) != null;
        }
        i.a("fqName");
        throw null;
    }

    public static final int b(int[] iArr, int i) {
        if (iArr != null) {
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (i == iArr[i2]) {
                    return i2;
                }
            }
            return -1;
        }
        i.a("$this$indexOf");
        throw null;
    }

    public static final <T> int b(T[] tArr, T t) {
        if (tArr != null) {
            int i = 0;
            if (t == null) {
                int length = tArr.length;
                while (i < length) {
                    if (tArr[i] == null) {
                        return i;
                    }
                    i++;
                }
                return -1;
            }
            int length2 = tArr.length;
            while (i < length2) {
                if (i.a((Object) t, (Object) tArr[i])) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        i.a("$this$indexOf");
        throw null;
    }

    public static a.a.a.a.v0.m.k1.g b(List list) {
        a.a.a.a.v0.m.k0 k0Var;
        if (list != null) {
            int size = list.size();
            if (size == 0) {
                throw new IllegalStateException("Expected some types".toString());
            } else if (size == 1) {
                return (f1) a.t.f.e(list);
            } else {
                ArrayList arrayList = new ArrayList(a((Iterable) list, 10));
                Iterator it = list.iterator();
                boolean z = false;
                boolean z2 = false;
                while (it.hasNext()) {
                    f1 f1Var = (f1) it.next();
                    z = z || f(f1Var);
                    if (f1Var instanceof a.a.a.a.v0.m.k0) {
                        k0Var = (a.a.a.a.v0.m.k0) f1Var;
                    } else if (!(f1Var instanceof a.a.a.a.v0.m.x)) {
                        throw new a.h();
                    } else if (e((a.a.a.a.v0.m.d0) f1Var)) {
                        return f1Var;
                    } else {
                        k0Var = ((a.a.a.a.v0.m.x) f1Var).f1956d;
                        z2 = true;
                    }
                    arrayList.add(k0Var);
                }
                if (z) {
                    a.a.a.a.v0.m.k0 b = w.b("Intersection of error types: " + list);
                    i.a((Object) b, "ErrorUtils.createErrorTy… of error types: $types\")");
                    return b;
                } else if (!z2) {
                    return a.a.a.a.v0.m.i1.s.f1901a.a(arrayList);
                } else {
                    ArrayList arrayList2 = new ArrayList(a((Iterable) list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(m((f1) it2.next()));
                    }
                    return a.a.a.a.v0.m.e0.a(a.a.a.a.v0.m.i1.s.f1901a.a(arrayList), a.a.a.a.v0.m.i1.s.f1901a.a(arrayList2));
                }
            }
        } else {
            i.a("types");
            throw null;
        }
    }

    public static boolean b(a.a.a.a.v0.m.k1.n nVar, a.a.a.a.v0.m.k1.g gVar) {
        a.a.a.a.v0.m.k1.d dVar = null;
        if (gVar != null) {
            a.a.a.a.v0.m.k1.h a2 = nVar.a(gVar);
            if (a2 != null) {
                dVar = nVar.e(a2);
            }
            return dVar != null;
        }
        i.a("$this$isDefinitelyNotNullType");
        throw null;
    }

    public static final boolean b(a.a.a.a.v0.b.a aVar) {
        if (aVar != null) {
            if (aVar instanceof a.a.a.a.v0.b.g0) {
                f0 a0 = ((a.a.a.a.v0.b.g0) aVar).a0();
                i.a((Object) a0, "correspondingProperty");
                if (a((a.a.a.a.v0.b.y0) a0)) {
                    return true;
                }
            }
            return false;
        }
        i.a("$this$isGetterOfUnderlyingPropertyOfInlineClass");
        throw null;
    }

    public static a.a.a.a.v0.m.k1.h b(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.f fVar) {
        if (fVar == null) {
            i.a("$this$lowerBound");
            throw null;
        } else if (fVar instanceof a.a.a.a.v0.m.x) {
            return ((a.a.a.a.v0.m.x) fVar).f1956d;
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + a.w.c.s.a(fVar.getClass())).toString());
        }
    }

    public static final a.a.a.a.v0.e.g0 b(a.a.a.a.v0.e.r rVar, a.a.a.a.v0.e.x0.e eVar) {
        if (rVar == null) {
            i.a("$this$returnType");
            throw null;
        } else if (eVar == null) {
            i.a("typeTable");
            throw null;
        } else if (rVar.n()) {
            a.a.a.a.v0.e.g0 g0Var = rVar.i;
            i.a((Object) g0Var, "returnType");
            return g0Var;
        } else {
            if ((rVar.f1155e & 16) == 16) {
                return eVar.a(rVar.j);
            }
            throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
        }
    }

    public static final f1 b(f1 f1Var, a.a.a.a.v0.m.d0 d0Var) {
        if (f1Var == null) {
            i.a("$this$wrapEnhancement");
            throw null;
        } else if (d0Var == null) {
            return f1Var;
        } else {
            if (f1Var instanceof a.a.a.a.v0.m.k0) {
                return new a.a.a.a.v0.m.m0((a.a.a.a.v0.m.k0) f1Var, d0Var);
            }
            if (f1Var instanceof a.a.a.a.v0.m.x) {
                return new z((a.a.a.a.v0.m.x) f1Var, d0Var);
            }
            throw new a.h();
        }
    }

    public static final /* synthetic */ String a(Object obj) {
        StringBuilder a2 = e.a.a.a.a.a("ClassicTypeCheckerContext couldn't handle ");
        a2.append(a.w.c.s.a(obj.getClass()));
        a2.append(' ');
        a2.append(obj);
        return a2.toString();
    }

    public static final /* synthetic */ String a(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        i.a((Object) parameterTypes, "parameterTypes");
        sb.append(a(parameterTypes, "", "(", ")", 0, (CharSequence) null, a.a.a.a.r0.f118c, 24));
        Class<?> returnType = method.getReturnType();
        i.a((Object) returnType, "returnType");
        sb.append(a.a.a.a.v0.b.e1.b.b.c(returnType));
        return sb.toString();
    }

    public static final /* synthetic */ a.a.a.a.v0.d.a.u a(String str, String str2, String str3, String str4) {
        d b = d.b(str2);
        i.a((Object) b, "Name.identifier(name)");
        String str5 = str2 + '(' + str3 + ')' + str4;
        if (str == null) {
            i.a("internalName");
            throw null;
        } else if (str5 != null) {
            return new a.a.a.a.v0.d.a.u(b, str + '.' + str5);
        } else {
            i.a("jvmDescriptor");
            throw null;
        }
    }

    public static final /* synthetic */ int a(List list, int i) {
        int a2 = a(list);
        if (i >= 0 && a2 >= i) {
            return a(list) - i;
        }
        StringBuilder a3 = e.a.a.a.a.a("Element index ", i, " must be in range [");
        a3.append(new a.y.c(0, a(list)));
        a3.append("].");
        throw new IndexOutOfBoundsException(a3.toString());
    }

    public static final <T> boolean a(Collection<? super T> collection, Iterable<? extends T> iterable) {
        if (collection == null) {
            i.a("$this$addAll");
            throw null;
        } else if (iterable == null) {
            i.a("elements");
            throw null;
        } else if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        } else {
            boolean z = false;
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                if (collection.add((Object) it.next())) {
                    z = true;
                }
            }
            return z;
        }
    }

    public static int a(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.g gVar) {
        if (gVar == null) {
            i.a("$this$argumentsCount");
            throw null;
        } else if (gVar instanceof a.a.a.a.v0.m.d0) {
            return ((a.a.a.a.v0.m.d0) gVar).H0().size();
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + a.w.c.s.a(gVar.getClass())).toString());
        }
    }

    public static a.a.a.a.v0.m.k1.i a(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.h hVar) {
        if (hVar == null) {
            i.a("$this$asArgumentList");
            throw null;
        } else if (hVar instanceof a.a.a.a.v0.m.k0) {
            return (a.a.a.a.v0.m.k1.i) hVar;
        } else {
            StringBuilder a2 = e.a.a.a.a.a("ClassicTypeSystemContext couldn't handle: ", hVar, ", ");
            a2.append(a.w.c.s.a(hVar.getClass()));
            throw new IllegalArgumentException(a2.toString().toString());
        }
    }

    public static a.a.a.a.v0.m.k1.e a(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.f fVar) {
        if (fVar == null) {
            i.a("$this$asDynamicType");
            throw null;
        } else if (fVar instanceof a.a.a.a.v0.m.x) {
            if (!(fVar instanceof a.a.a.a.v0.m.u)) {
                fVar = null;
            }
            return (a.a.a.a.v0.m.u) fVar;
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + a.w.c.s.a(fVar.getClass())).toString());
        }
    }

    public static final a.a.a.a.v0.m.x a(a.a.a.a.v0.m.d0 d0Var) {
        if (d0Var != null) {
            f1 K0 = d0Var.K0();
            if (K0 != null) {
                return (a.a.a.a.v0.m.x) K0;
            }
            throw new a.n("null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        }
        i.a("$this$asFlexibleType");
        throw null;
    }

    public static final <T> a.z.h<T> a(T[] tArr) {
        if (tArr != null) {
            if (tArr.length == 0) {
                return a.z.d.f2165a;
            }
            return new a.t.g(tArr);
        }
        i.a("$this$asSequence");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static a.a.a.a.v0.m.k1.h a(a.a.a.a.v0.m.i1.c r18, a.a.a.a.v0.m.k1.h r19, a.a.a.a.v0.m.k1.b r20) {
        /*
        // Method dump skipped, instructions count: 509
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.g.a(a.a.a.a.v0.m.i1.c, a.a.a.a.v0.m.k1.h, a.a.a.a.v0.m.k1.b):a.a.a.a.v0.m.k1.h");
    }

    public static <M extends Member> void a(a.a.a.a.u0.h<? extends M> hVar, Object[] objArr) {
        if (objArr == null) {
            i.a("args");
            throw null;
        } else if (a((a.a.a.a.u0.h<?>) hVar) != objArr.length) {
            StringBuilder a2 = e.a.a.a.a.a("Callable expects ");
            a2.append(a((a.a.a.a.u0.h<?>) hVar));
            a2.append(" arguments, but ");
            a2.append(objArr.length);
            a2.append(" were provided.");
            throw new IllegalArgumentException(a2.toString());
        }
    }

    public static void a(View view, e.i.a.a.a.b.e eVar, e.i.a.a.a.e.a aVar) {
        try {
            if (view instanceof d.f.b.b) {
                e.i.a.a.a.a.this.a(false);
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    AppBarLayout childAt = viewGroup.getChildAt(childCount);
                    if (childAt instanceof AppBarLayout) {
                        childAt.addOnOffsetChangedListener(new e.i.a.a.a.g.a(aVar));
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ a.a.a.a.v0.d.a.a0.h a(a.a.a.a.v0.d.a.a0.h hVar, a.a.a.a.v0.b.g gVar, a.a.a.a.v0.d.a.c0.x xVar, int i, int i2) {
        a.a.a.a.v0.d.a.a0.m mVar;
        if ((i2 & 2) != 0) {
            xVar = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if (hVar == null) {
            i.a("$this$childForClassOrPackage");
            throw null;
        } else if (gVar != null) {
            a.e a2 = a(a.f.NONE, (a.w.b.a) new a.a.a.a.v0.d.a.a0.a(hVar, gVar));
            a.a.a.a.v0.d.a.a0.c cVar = hVar.f562c;
            if (xVar != null) {
                mVar = new a.a.a.a.v0.d.a.a0.i(hVar, gVar, xVar, i);
            } else {
                mVar = hVar.f563d;
            }
            return new a.a.a.a.v0.d.a.a0.h(cVar, mVar, a2);
        } else {
            i.a("containingDeclaration");
            throw null;
        }
    }

    public static final a.a.a.a.v0.d.a.a0.h a(a.a.a.a.v0.d.a.a0.h hVar, k kVar, a.a.a.a.v0.d.a.c0.x xVar, int i) {
        if (hVar == null) {
            i.a("$this$childForMethod");
            throw null;
        } else if (kVar == null) {
            i.a("containingDeclaration");
            throw null;
        } else if (xVar != null) {
            return new a.a.a.a.v0.d.a.a0.h(hVar.f562c, new a.a.a.a.v0.d.a.a0.i(hVar, kVar, xVar, i), hVar.f564e);
        } else {
            i.a("typeParameterOwner");
            throw null;
        }
    }

    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                a.v.b.f2128a.a(th, th2);
            }
        }
    }

    public static final Object a(Object obj, b bVar) {
        a.a.a.a.v0.m.d0 b;
        Class<?> l;
        Method a2;
        if (bVar != null) {
            return (((bVar instanceof f0) && a((a.a.a.a.v0.b.y0) bVar)) || (b = b(bVar)) == null || (l = l(b)) == null || (a2 = a(l, bVar)) == null) ? obj : a2.invoke(obj, new Object[0]);
        }
        i.a("descriptor");
        throw null;
    }

    public static final <T> int a(Iterable<? extends T> iterable, int i) {
        if (iterable != null) {
            return iterable instanceof Collection ? ((Collection) iterable).size() : i;
        }
        i.a("$this$collectionSizeOrDefault");
        throw null;
    }

    public static final h a(h hVar, h hVar2) {
        if (hVar == null) {
            i.a("first");
            throw null;
        } else if (hVar2 == null) {
            i.a("second");
            throw null;
        } else if (hVar.isEmpty()) {
            return hVar2;
        } else {
            if (hVar2.isEmpty()) {
                return hVar;
            }
            return new a.a.a.a.v0.b.b1.k(hVar, hVar2);
        }
    }

    public static final List<r0> a(a.a.a.a.v0.b.i iVar) {
        k kVar;
        s0 n;
        List<r0> list = null;
        if (iVar != null) {
            List<r0> x = iVar.x();
            i.a((Object) x, "declaredTypeParameters");
            if (!(iVar.E() || (iVar.b() instanceof a.a.a.a.v0.b.a))) {
                return x;
            }
            a.z.h<k> f2 = a.a.a.a.v0.j.u.a.f(iVar);
            a.a.a.a.v0.b.s0 s0Var = a.a.a.a.v0.b.s0.f496c;
            if (f2 != null) {
                List b = a.a.a.a.v0.m.l1.a.b(a.a.a.a.v0.m.l1.a.c(a.a.a.a.v0.m.l1.a.a((a.z.h) new a.z.p(f2, s0Var), (a.w.b.l) t0.f497c), u0.f498c));
                Iterator<k> it = a.a.a.a.v0.j.u.a.f(iVar).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        kVar = null;
                        break;
                    }
                    kVar = it.next();
                    if (kVar instanceof e) {
                        break;
                    }
                }
                e eVar = (e) kVar;
                if (!(eVar == null || (n = eVar.n()) == null)) {
                    list = n.d();
                }
                if (list == null) {
                    list = a.t.l.f2119c;
                }
                if (!b.isEmpty() || !list.isEmpty()) {
                    List<r0> a2 = a.t.f.a((Collection) b, (Iterable) list);
                    ArrayList arrayList = new ArrayList(a((Iterable) a2, 10));
                    for (r0 r0Var : a2) {
                        i.a((Object) r0Var, "it");
                        arrayList.add(new a.a.a.a.v0.b.c(r0Var, iVar, x.size()));
                    }
                    return a.t.f.a((Collection) x, (Iterable) arrayList);
                }
                List<r0> x2 = iVar.x();
                i.a((Object) x2, "declaredTypeParameters");
                return x2;
            }
            i.a("$this$takeWhile");
            throw null;
        }
        i.a("$this$computeConstructorTypeParameters");
        throw null;
    }

    public static final String a(e eVar, a.a.a.a.v0.d.b.s<?> sVar) {
        e eVar2 = null;
        if (eVar == null) {
            i.a("klass");
            throw null;
        } else if (sVar != null) {
            String c2 = sVar.c(eVar);
            if (c2 != null) {
                return c2;
            }
            k b = eVar.b();
            i.a((Object) b, "klass.containingDeclaration");
            d b2 = a.a.a.a.v0.f.f.b(eVar.d());
            i.a((Object) b2, "SpecialNames.safeIdentifier(klass.name)");
            String b3 = b2.b();
            i.a((Object) b3, "SpecialNames.safeIdentifier(klass.name).identifier");
            if (b instanceof y) {
                a.a.a.a.v0.f.b e2 = ((y) b).e();
                if (e2.b()) {
                    return b3;
                }
                StringBuilder sb = new StringBuilder();
                String a2 = e2.a();
                i.a((Object) a2, "fqName.asString()");
                sb.append(a.a.a.a.v0.m.l1.a.a(a2, '.', '/', false, 4));
                sb.append('/');
                sb.append(b3);
                return sb.toString();
            }
            if (b instanceof e) {
                eVar2 = b;
            }
            e eVar3 = eVar2;
            if (eVar3 != null) {
                String a3 = sVar.a(eVar3);
                if (a3 == null) {
                    a3 = a(eVar3, sVar);
                }
                return a3 + '$' + b3;
            }
            throw new IllegalArgumentException("Unexpected container: " + b + " for " + eVar);
        } else {
            i.a("typeMappingConfiguration");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0081, code lost:
        if ((r4 instanceof a.a.a.a.v0.b.g0) == false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.String a(a.a.a.a.v0.b.s r4, boolean r5, boolean r6, int r7) {
        /*
        // Method dump skipped, instructions count: 190
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.g.a(a.a.a.a.v0.b.s, boolean, boolean, int):java.lang.String");
    }

    public static final String a(a.a.a.a.v0.b.a aVar) {
        if (aVar != null) {
            a.a.a.a.v0.d.b.r rVar = a.a.a.a.v0.d.b.r.f921a;
            if (a.a.a.a.v0.j.g.n(aVar)) {
                return null;
            }
            k b = aVar.b();
            if (!(b instanceof e)) {
                b = null;
            }
            e eVar = (e) b;
            if (eVar != null) {
                d d2 = eVar.d();
                i.a((Object) d2, "classDescriptor.name");
                if (d2.f1352d) {
                    return null;
                }
                a.a.a.a.v0.b.a a2 = aVar.a();
                if (!(a2 instanceof a.a.a.a.v0.b.l0)) {
                    a2 = null;
                }
                a.a.a.a.v0.b.l0 l0Var = (a.a.a.a.v0.b.l0) a2;
                if (l0Var != null) {
                    return rVar.a(eVar, a((a.a.a.a.v0.b.s) l0Var, false, false, 3));
                }
            }
            return null;
        }
        i.a("$this$computeJvmSignature");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:132:0x001d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0166 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x019b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final a.a.a.a.v0.d.a.a0.e a(a.a.a.a.v0.d.a.a0.h r17, a.a.a.a.v0.b.b1.h r18) {
        /*
        // Method dump skipped, instructions count: 524
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.g.a(a.a.a.a.v0.d.a.a0.h, a.a.a.a.v0.b.b1.h):a.a.a.a.v0.d.a.a0.e");
    }

    public static final <T> boolean a(T[] tArr, T t) {
        if (tArr != null) {
            return b(tArr, t) >= 0;
        }
        i.a("$this$contains");
        throw null;
    }

    public static final a.a.a.a.v0.m.k1.q a(g1 g1Var) {
        if (g1Var != null) {
            int ordinal = g1Var.ordinal();
            if (ordinal == 0) {
                return a.a.a.a.v0.m.k1.q.INV;
            }
            if (ordinal == 1) {
                return a.a.a.a.v0.m.k1.q.IN;
            }
            if (ordinal == 2) {
                return a.a.a.a.v0.m.k1.q.OUT;
            }
            throw new a.h();
        }
        i.a("$this$convertVariance");
        throw null;
    }

    public static final List<w0> a(Collection<a.a.a.a.v0.d.a.z.k> collection, Collection<? extends w0> collection2, a.a.a.a.v0.b.a aVar) {
        if (collection == null) {
            i.a("newValueParametersTypes");
            throw null;
        } else if (collection2 == null) {
            i.a("oldValueParameters");
            throw null;
        } else if (aVar != null) {
            boolean z = collection.size() == collection2.size();
            if (!s.f2103a || z) {
                List a2 = a.t.f.a((Iterable) collection, (Iterable) collection2);
                ArrayList arrayList = new ArrayList(a((Iterable) a2, 10));
                Iterator it = ((ArrayList) a2).iterator();
                while (it.hasNext()) {
                    a.j jVar = (a.j) it.next();
                    A a3 = jVar.f2088c;
                    B b = jVar.f2089d;
                    int z2 = b.z();
                    h y = b.y();
                    d d2 = b.d();
                    i.a((Object) d2, "oldParameter.name");
                    a.a.a.a.v0.m.d0 d0Var = a3.f873a;
                    boolean z3 = a3.b;
                    boolean C = b.C();
                    boolean k0 = b.k0();
                    a.a.a.a.v0.m.d0 a4 = b.W() != null ? a.a.a.a.v0.j.u.a.e(aVar).m().a(a3.f873a) : null;
                    m0 r = b.r();
                    i.a((Object) r, "oldParameter.source");
                    arrayList.add(new o0(aVar, null, z2, y, d2, d0Var, z3, C, k0, a4, r));
                }
                return arrayList;
            }
            StringBuilder a5 = e.a.a.a.a.a("Different value parameters sizes: Enhanced = ");
            a5.append(collection.size());
            a5.append(", Old = ");
            a5.append(collection2.size());
            throw new AssertionError(a5.toString());
        } else {
            i.a("newOwner");
            throw null;
        }
    }

    public static final <T> T a(Class<T> cls, Map<String, ? extends Object> map, List<Method> list) {
        if (cls == null) {
            i.a("annotationClass");
            throw null;
        } else if (map == null) {
            i.a("values");
            throw null;
        } else if (list != null) {
            a.a.a.a.u0.b bVar = new a.a.a.a.u0.b(cls, list, map);
            a.e a2 = m92a((a.w.b.a) new a.a.a.a.u0.c(map));
            a.e a3 = m92a((a.w.b.a) new a.a.a.a.u0.f(cls, map));
            T t = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a.a.a.a.u0.d(cls, a3, null, a2, null, bVar, map));
            if (t != null) {
                return t;
            }
            throw new a.n("null cannot be cast to non-null type T");
        } else {
            i.a("methods");
            throw null;
        }
    }

    public static final v0 a(v0 v0Var, r0 r0Var) {
        if (r0Var == null || v0Var.a() == g1.INVARIANT) {
            return v0Var;
        }
        if (r0Var.F() != v0Var.a()) {
            a.a.a.a.v0.j.r.a.c cVar = new a.a.a.a.v0.j.r.a.c(v0Var);
            if (h.b != null) {
                return new x0(new a.a.a.a.v0.j.r.a.a(v0Var, cVar, false, h.a.f321a));
            }
            throw null;
        } else if (!v0Var.b()) {
            return new x0(v0Var.c());
        } else {
            a.a.a.a.v0.l.j jVar = a.a.a.a.v0.l.b.f1789e;
            i.a((Object) jVar, "LockBasedStorageManager.NO_LOCKS");
            return new x0(new a.a.a.a.v0.m.g0(jVar, new a.a.a.a.v0.j.r.a.d(v0Var)));
        }
    }

    public static g0 a(f0 f0Var, h hVar) {
        if (f0Var == null) {
            c(13);
            throw null;
        } else if (hVar == null) {
            c(14);
            throw null;
        } else if (f0Var == null) {
            c(15);
            throw null;
        } else if (hVar != null) {
            return a(f0Var, hVar, true, false, false, f0Var.r());
        } else {
            c(16);
            throw null;
        }
    }

    public static h0 a(f0 f0Var, h hVar, h hVar2) {
        if (f0Var == null) {
            c(0);
            throw null;
        } else if (hVar == null) {
            c(1);
            throw null;
        } else if (hVar2 != null) {
            m0 r = f0Var.r();
            if (hVar == null) {
                c(4);
                throw null;
            } else if (hVar2 == null) {
                c(5);
                throw null;
            } else if (r != null) {
                return a(f0Var, hVar, hVar2, true, false, false, f0Var.g(), r);
            } else {
                c(6);
                throw null;
            }
        } else {
            c(2);
            throw null;
        }
    }

    public static a.a.a.a.v0.b.l0 a(e eVar) {
        if (eVar == null) {
            c(24);
            throw null;
        } else if (h.b != null) {
            j0 a2 = j0.a(eVar, h.a.f321a, a.a.a.a.v0.j.g.b, b.a.SYNTHESIZED, eVar.r());
            if (h.b != null) {
                j0 a3 = a2.a((i0) null, (i0) null, Collections.emptyList(), Collections.singletonList(new o0(a2, null, 0, h.a.f321a, d.b("value"), a.a.a.a.v0.j.u.a.b((k) eVar).i(), false, false, false, null, eVar.r())), (a.a.a.a.v0.m.d0) eVar.v(), a.a.a.a.v0.b.v.FINAL, z0.f515e);
                if (a3 != null) {
                    return a3;
                }
                c(25);
                throw null;
            }
            throw null;
        } else {
            throw null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: a.a.a.a.u0.h<? extends M extends java.lang.reflect.Member> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        if ((r0 != null && h(r0)) != false) goto L_0x0066;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <M extends java.lang.reflect.Member> a.a.a.a.u0.h<M> a(a.a.a.a.u0.h<? extends M> r5, a.a.a.a.v0.b.b r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.g.a(a.a.a.a.u0.h, a.a.a.a.v0.b.b, boolean):a.a.a.a.u0.h");
    }

    public static final a.a.a.a.v0.m.u0 a(e eVar, e eVar2) {
        if (eVar == null) {
            i.a("from");
            throw null;
        } else if (eVar2 != null) {
            boolean z = eVar.x().size() == eVar2.x().size();
            if (!s.f2103a || z) {
                u0.a aVar = a.a.a.a.v0.m.u0.b;
                List<r0> x = eVar.x();
                i.a((Object) x, "from.declaredTypeParameters");
                ArrayList arrayList = new ArrayList(a((Iterable) x, 10));
                Iterator<T> it = x.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().n());
                }
                List<r0> x2 = eVar2.x();
                i.a((Object) x2, "to.declaredTypeParameters");
                ArrayList arrayList2 = new ArrayList(a((Iterable) x2, 10));
                for (T t : x2) {
                    i.a((Object) t, "it");
                    a.a.a.a.v0.m.k0 v = t.v();
                    i.a((Object) v, "it.defaultType");
                    arrayList2.add(a.a.a.a.v0.m.l1.a.b(v));
                }
                return u0.a.a(aVar, a.t.f.h(a.t.f.a((Iterable) arrayList, (Iterable) arrayList2)), false, 2);
            }
            throw new AssertionError(eVar + " and " + eVar2 + " should have same number of type parameters, " + "but " + eVar.x().size() + " / " + eVar2.x().size() + " found");
        } else {
            i.a("to");
            throw null;
        }
    }

    public static final boolean a(b bVar) {
        if (bVar != null) {
            return d(bVar) != null;
        }
        i.a("$this$doesOverrideBuiltinWithDifferentJvmName");
        throw null;
    }

    public static String[] a(FileChannel fileChannel) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (c(fileChannel, allocate, 0) == 1179403647) {
            boolean z = true;
            if (d(fileChannel, allocate, 4) != 1) {
                z = false;
            }
            if (d(fileChannel, allocate, 5) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            long c2 = z ? c(fileChannel, allocate, 28) : a(fileChannel, allocate, 32);
            long b = z ? (long) b(fileChannel, allocate, 44) : (long) b(fileChannel, allocate, 56);
            int b2 = b(fileChannel, allocate, z ? 42 : 54);
            if (b == 65535) {
                long c3 = z ? c(fileChannel, allocate, 32) : a(fileChannel, allocate, 40);
                b = c(fileChannel, allocate, z ? c3 + 28 : c3 + 44);
            }
            long j6 = c2;
            long j7 = 0;
            while (true) {
                if (j7 >= b) {
                    j = 0;
                    break;
                } else if (c(fileChannel, allocate, j6 + 0) == 2) {
                    j = z ? c(fileChannel, allocate, j6 + 4) : a(fileChannel, allocate, j6 + 8);
                } else {
                    j6 += (long) b2;
                    j7++;
                }
            }
            long j8 = 0;
            if (j != 0) {
                long j9 = j;
                long j10 = 0;
                int i = 0;
                while (true) {
                    long c4 = z ? c(fileChannel, allocate, j9 + j8) : a(fileChannel, allocate, j9 + j8);
                    if (c4 == 1) {
                        j2 = j;
                        if (i != Integer.MAX_VALUE) {
                            i++;
                        } else {
                            throw new h("malformed DT_NEEDED section");
                        }
                    } else {
                        j2 = j;
                        if (c4 == 5) {
                            j10 = z ? c(fileChannel, allocate, j9 + 4) : a(fileChannel, allocate, j9 + 8);
                        }
                    }
                    long j11 = 16;
                    j9 += z ? 8 : 16;
                    j8 = 0;
                    if (c4 != 0) {
                        z = z;
                        j = j2;
                    } else if (j10 != 0) {
                        int i2 = 0;
                        while (true) {
                            if (((long) i2) >= b) {
                                j3 = 0;
                                break;
                            }
                            if (c(fileChannel, allocate, c2 + j8) == 1) {
                                long c5 = z ? c(fileChannel, allocate, c2 + 8) : a(fileChannel, allocate, c2 + j11);
                                if (z) {
                                    j4 = b;
                                    j5 = c(fileChannel, allocate, c2 + 20);
                                } else {
                                    j4 = b;
                                    j5 = a(fileChannel, allocate, c2 + 40);
                                }
                                if (c5 <= j10 && j10 < j5 + c5) {
                                    j3 = (z ? c(fileChannel, allocate, c2 + 4) : a(fileChannel, allocate, c2 + 8)) + (j10 - c5);
                                }
                            } else {
                                j4 = b;
                            }
                            c2 += (long) b2;
                            i2++;
                            b = j4;
                            j11 = 16;
                            j8 = 0;
                        }
                        long j12 = 0;
                        if (j3 != 0) {
                            String[] strArr = new String[i];
                            int i3 = 0;
                            while (true) {
                                long j13 = j2 + j12;
                                long c6 = z ? c(fileChannel, allocate, j13) : a(fileChannel, allocate, j13);
                                if (c6 == 1) {
                                    long c7 = (z ? c(fileChannel, allocate, j2 + 4) : a(fileChannel, allocate, j2 + 8)) + j3;
                                    StringBuilder sb = new StringBuilder();
                                    while (true) {
                                        long j14 = c7 + 1;
                                        short d2 = d(fileChannel, allocate, c7);
                                        if (d2 == 0) {
                                            break;
                                        }
                                        sb.append((char) d2);
                                        c7 = j14;
                                    }
                                    strArr[i3] = sb.toString();
                                    if (i3 != Integer.MAX_VALUE) {
                                        i3++;
                                    } else {
                                        throw new h("malformed DT_NEEDED section");
                                    }
                                }
                                j2 += z ? 8 : 16;
                                if (c6 != 0) {
                                    j12 = 0;
                                } else if (i3 == i) {
                                    return strArr;
                                } else {
                                    throw new h("malformed DT_NEEDED section");
                                }
                            }
                        } else {
                            throw new h("did not find file offset of DT_STRTAB table");
                        }
                    } else {
                        throw new h("Dynamic section string-table not found");
                    }
                }
            } else {
                throw new h("ELF file does not contain dynamic linking information");
            }
        } else {
            throw new h("file is not ELF");
        }
    }

    public static void a(FileDescriptor fileDescriptor, long j) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                Os.posix_fallocate(fileDescriptor, 0, j);
            } catch (ErrnoException e2) {
                int i = e2.errno;
                if (i != OsConstants.EOPNOTSUPP && i != OsConstants.ENOSYS && i != OsConstants.EINVAL) {
                    throw new IOException(e2.toString(), e2);
                }
            }
        }
    }

    public static c a(h hVar, a.a.a.a.v0.f.b bVar) {
        Object obj = null;
        if (bVar != null) {
            Iterator it = hVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (i.a(((c) next).e(), bVar)) {
                    obj = next;
                    break;
                }
            }
            return (c) obj;
        }
        i.a("fqName");
        throw null;
    }

    public static a.a.a.a.v0.b.e1.b.c a(a.a.a.a.v0.b.e1.b.f fVar, a.a.a.a.v0.f.b bVar) {
        Annotation[] declaredAnnotations;
        if (bVar != null) {
            AnnotatedElement M = fVar.M();
            if (M == null || (declaredAnnotations = M.getDeclaredAnnotations()) == null) {
                return null;
            }
            return a(declaredAnnotations, bVar);
        }
        i.a("fqName");
        throw null;
    }

    public static final a.a.a.a.v0.b.e1.b.c a(Annotation[] annotationArr, a.a.a.a.v0.f.b bVar) {
        Annotation annotation;
        if (annotationArr == null) {
            i.a("$this$findAnnotation");
            throw null;
        } else if (bVar != null) {
            int length = annotationArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    annotation = null;
                    break;
                }
                annotation = annotationArr[i];
                if (i.a(a.a.a.a.v0.b.e1.b.b.b(a(a(annotation))).a(), bVar)) {
                    break;
                }
                i++;
            }
            if (annotation != null) {
                return new a.a.a.a.v0.b.e1.b.c(annotation);
            }
            return null;
        } else {
            i.a("fqName");
            throw null;
        }
    }

    public static final e a(a.a.a.a.v0.b.w wVar, a.a.a.a.v0.f.a aVar) {
        e eVar = null;
        if (wVar == null) {
            i.a("$this$findClassAcrossModuleDependencies");
            throw null;
        } else if (aVar != null) {
            a.a.a.a.v0.b.h b = b(wVar, aVar);
            if (b instanceof e) {
                eVar = b;
            }
            return eVar;
        } else {
            i.a("classId");
            throw null;
        }
    }

    public static final a.a.a.a.v0.d.b.l a(a.a.a.a.v0.d.b.k kVar, a.a.a.a.v0.f.a aVar) {
        if (kVar == null) {
            i.a("$this$findKotlinClass");
            throw null;
        } else if (aVar != null) {
            k.a a2 = kVar.a(aVar);
            if (a2 != null) {
                return a2.a();
            }
            return null;
        } else {
            i.a("classId");
            throw null;
        }
    }

    public static final e a(a.a.a.a.v0.b.w wVar, a.a.a.a.v0.f.a aVar, a.a.a.a.v0.b.x xVar) {
        if (wVar == null) {
            i.a("$this$findNonGenericClassAcrossDependencies");
            throw null;
        } else if (aVar == null) {
            i.a("classId");
            throw null;
        } else if (xVar != null) {
            e a2 = a(wVar, aVar);
            return a2 != null ? a2 : xVar.a(aVar, a.a.a.a.v0.m.l1.a.b(a.a.a.a.v0.m.l1.a.d(a.a.a.a.v0.m.l1.a.a(aVar, a.a.a.a.v0.b.q.f494f), a.a.a.a.v0.b.r.f495c)));
        } else {
            i.a("notFoundClasses");
            throw null;
        }
    }

    public static a.a.a.a.v0.m.k1.j a(a.a.a.a.v0.m.k1.n nVar, a.a.a.a.v0.m.k1.i iVar, int i) {
        if (iVar == null) {
            i.a("$this$get");
            throw null;
        } else if (iVar instanceof a.a.a.a.v0.m.k1.h) {
            return nVar.a((a.a.a.a.v0.m.k1.g) iVar, i);
        } else {
            if (iVar instanceof a.a.a.a.v0.m.k1.a) {
                Object obj = ((a.a.a.a.v0.m.k1.a) iVar).get(i);
                i.a(obj, "get(index)");
                return (a.a.a.a.v0.m.k1.j) obj;
            }
            throw new IllegalStateException(("unknown type argument list type: " + iVar + ", " + a.w.c.s.a(iVar.getClass())).toString());
        }
    }

    public static final <T extends Annotation> a.a.c<? extends T> a(T t) {
        if (t != null) {
            Class<? extends Annotation> annotationType = t.annotationType();
            i.a((Object) annotationType, "(this as java.lang.annot…otation).annotationType()");
            a.a.c<? extends T> a2 = a((Class) annotationType);
            if (a2 != null) {
                return a2;
            }
            throw new a.n("null cannot be cast to non-null type kotlin.reflect.KClass<out T>");
        }
        i.a("$this$annotationClass");
        throw null;
    }

    public static List<a.a.a.a.v0.b.e1.b.c> a(a.a.a.a.v0.b.e1.b.f fVar) {
        Annotation[] declaredAnnotations;
        AnnotatedElement M = fVar.M();
        return (M == null || (declaredAnnotations = M.getDeclaredAnnotations()) == null) ? a.t.l.f2119c : a(declaredAnnotations);
    }

    public static final List<a.a.a.a.v0.b.e1.b.c> a(Annotation[] annotationArr) {
        if (annotationArr != null) {
            ArrayList arrayList = new ArrayList(annotationArr.length);
            for (Annotation annotation : annotationArr) {
                arrayList.add(new a.a.a.a.v0.b.e1.b.c(annotation));
            }
            return arrayList;
        }
        i.a("$this$getAnnotations");
        throw null;
    }

    public static a.a.a.a.v0.m.k1.j a(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.g gVar, int i) {
        if (gVar == null) {
            i.a("$this$getArgument");
            throw null;
        } else if (gVar instanceof a.a.a.a.v0.m.d0) {
            return ((a.a.a.a.v0.m.d0) gVar).H0().get(i);
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + a.w.c.s.a(gVar.getClass())).toString());
        }
    }

    public static a.a.a.a.v0.m.k1.j a(a.a.a.a.v0.m.k1.n nVar, a.a.a.a.v0.m.k1.h hVar, int i) {
        if (hVar != null) {
            int d2 = nVar.d((a.a.a.a.v0.m.k1.g) hVar);
            if (i >= 0 && d2 > i) {
                return nVar.a(hVar, i);
            }
            return null;
        }
        i.a("$this$getArgumentOrNull");
        throw null;
    }

    public static final int a(a.a.a.a.u0.h<?> hVar) {
        if (hVar != null) {
            return hVar.i().size();
        }
        i.a("$this$arity");
        throw null;
    }

    public static final Object a(c0.a<?, ?> aVar) {
        if (aVar != null) {
            c0<?> h2 = aVar.h();
            return a(h2.i, h2.e());
        }
        i.a("$this$boundReceiver");
        throw null;
    }

    public static a.a.a.a.v0.f.c a(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.k kVar) {
        if (kVar == null) {
            i.a("$this$getClassFqNameUnsafe");
            throw null;
        } else if (kVar instanceof s0) {
            a.a.a.a.v0.b.h c2 = ((s0) kVar).c();
            if (c2 != null) {
                return a.a.a.a.v0.j.u.a.d((e) c2);
            }
            throw new a.n("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + a.w.c.s.a(kVar.getClass())).toString());
        }
    }

    public static final a.a.a.a.v0.f.a a(a.a.a.a.v0.e.x0.c cVar, int i) {
        if (cVar != null) {
            a.a.a.a.v0.f.a a2 = a.a.a.a.v0.f.a.a(cVar.c(i), cVar.b(i));
            i.a((Object) a2, "ClassId.fromString(getQu… isLocalClassName(index))");
            return a2;
        }
        i.a("$this$getClassId");
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: a.a.a.a.v0.j.w.k */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Collection a(a.a.a.a.v0.j.w.k kVar, a.a.a.a.v0.j.w.d dVar, a.w.b.l lVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                dVar = a.a.a.a.v0.j.w.d.n;
            }
            if ((i & 2) != 0) {
                if (a.a.a.a.v0.j.w.i.f1624a != null) {
                    lVar = i.a.f1625a;
                } else {
                    throw null;
                }
            }
            return kVar.a(dVar, lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: a.a.a.a.v0.h.i$g<M extends a.a.a.a.v0.h.i$d<M>, T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends i.d<M>, T> T a(i.d<M> dVar, i.g<M, T> gVar) {
        if (dVar == null) {
            a.w.c.i.a("$this$getExtensionOrNull");
            throw null;
        } else if (gVar == 0) {
            a.w.c.i.a("extension");
            throw null;
        } else if (dVar.b(gVar)) {
            return (T) dVar.a((i.g<M, Type>) gVar);
        } else {
            return null;
        }
    }

    public static final <M extends i.d<M>, T> T a(i.d<M> dVar, i.g<M, List<T>> gVar, int i) {
        if (dVar == null) {
            a.w.c.i.a("$this$getExtensionOrNull");
            throw null;
        } else if (gVar != null) {
            dVar.c(gVar);
            a.a.a.a.v0.h.h<i.f> hVar = dVar.f1393c;
            i.f fVar = gVar.f1404d;
            if (hVar == null) {
                throw null;
            } else if (fVar.c()) {
                Object a2 = hVar.a(fVar);
                if (i >= (a2 == null ? 0 : ((List) a2).size())) {
                    return null;
                }
                dVar.c(gVar);
                a.a.a.a.v0.h.h<i.f> hVar2 = dVar.f1393c;
                i.f fVar2 = gVar.f1404d;
                if (hVar2 == null) {
                    throw null;
                } else if (fVar2.c()) {
                    Object a3 = hVar2.a(fVar2);
                    if (a3 != null) {
                        return (T) gVar.a(((List) a3).get(i));
                    }
                    throw new IndexOutOfBoundsException();
                } else {
                    throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
                }
            } else {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
        } else {
            a.w.c.i.a("extension");
            throw null;
        }
    }

    public static final a.y.c a(Collection<?> collection) {
        if (collection != null) {
            return new a.y.c(0, collection.size() - 1);
        }
        a.w.c.i.a("$this$indices");
        throw null;
    }

    public static final <T> Class<T> a(a.a.c<T> cVar) {
        if (cVar != null) {
            Class<T> cls = (Class<T>) ((a.w.c.c) cVar).b();
            if (cls != null) {
                return cls;
            }
            throw new a.n("null cannot be cast to non-null type java.lang.Class<T>");
        }
        a.w.c.i.a("$this$java");
        throw null;
    }

    public static final a.a.c<?> a(a.a.d dVar) {
        a.a.c<?> a2;
        boolean z;
        T t = null;
        if (dVar == null) {
            a.w.c.i.a("$this$jvmErasure");
            throw null;
        } else if (dVar instanceof a.a.c) {
            return (a.a.c) dVar;
        } else {
            if (dVar instanceof a.a.q) {
                List<a.a.p> upperBounds = ((a.a.q) dVar).getUpperBounds();
                Iterator<T> it = upperBounds.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    T t2 = next;
                    if (t2 != null) {
                        a.a.a.a.v0.b.h c2 = t2.f78c.I0().c();
                        if (!(c2 instanceof e)) {
                            c2 = null;
                        }
                        e eVar = (e) c2;
                        if (eVar == null || eVar.t() == f.INTERFACE || eVar.t() == f.ANNOTATION_CLASS) {
                            z = false;
                            continue;
                        } else {
                            z = true;
                            continue;
                        }
                        if (z) {
                            t = next;
                            break;
                        }
                    } else {
                        throw new a.n("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
                    }
                }
                T t3 = t;
                if (t3 == null) {
                    t3 = (a.a.p) a.t.f.b((List) upperBounds);
                }
                if (t3 == null) {
                    return a.w.c.s.a(Object.class);
                }
                a.a.d i = t3.i();
                if (i != null && (a2 = a(i)) != null) {
                    return a2;
                }
                throw new a.a.a.a.i0("Cannot calculate JVM erasure for type: " + t3);
            }
            throw new a.a.a.a.i0("Cannot calculate JVM erasure for type: " + dVar);
        }
    }

    public static final <T> a.a.c<T> a(Class<T> cls) {
        if (cls != null) {
            return a.w.c.s.a(cls);
        }
        a.w.c.i.a("$this$kotlin");
        throw null;
    }

    public static final <T> int a(List<? extends T> list) {
        if (list != null) {
            return list.size() - 1;
        }
        a.w.c.i.a("$this$lastIndex");
        throw null;
    }

    public static final Integer a(int[] iArr, int i) {
        if (iArr == null) {
            a.w.c.i.a("$this$getOrNull");
            throw null;
        } else if (i < 0 || i > iArr.length - 1) {
            return null;
        } else {
            return Integer.valueOf(iArr[i]);
        }
    }

    public static l a(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.k kVar, int i) {
        if (kVar == null) {
            a.w.c.i.a("$this$getParameter");
            throw null;
        } else if (kVar instanceof s0) {
            r0 r0Var = ((s0) kVar).d().get(i);
            a.w.c.i.a((Object) r0Var, "this.parameters[index]");
            return r0Var;
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + a.w.c.s.a(kVar.getClass())).toString());
        }
    }

    public static a.a.a.a.v0.m.k1.g a(a.a.a.a.v0.m.i1.c cVar, l lVar) {
        if (lVar == null) {
            a.w.c.i.a("$this$getRepresentativeUpperBound");
            throw null;
        } else if (lVar instanceof r0) {
            return a.a.a.a.v0.m.l1.a.a((r0) lVar);
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lVar + ", " + a.w.c.s.a(lVar.getClass())).toString());
        }
    }

    public static a.a.a.a.v0.m.k1.g a(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.j jVar) {
        if (jVar == null) {
            a.w.c.i.a("$this$getType");
            throw null;
        } else if (jVar instanceof v0) {
            return ((v0) jVar).c().K0();
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + jVar + ", " + a.w.c.s.a(jVar.getClass())).toString());
        }
    }

    public static DateFormat a(int i, int i2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i == 1) {
            str = "MMMM d, yyyy";
        } else if (i == 2) {
            str = "MMM d, yyyy";
        } else if (i == 3) {
            str = "M/d/yy";
        } else {
            throw new IllegalArgumentException(e.a.a.a.a.a("Unknown DateFormat style: ", i));
        }
        sb.append(str);
        sb.append(" ");
        if (i2 == 0 || i2 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i2 == 2) {
            str2 = "h:mm:ss a";
        } else if (i2 == 3) {
            str2 = "h:mm a";
        } else {
            throw new IllegalArgumentException(e.a.a.a.a.a("Unknown DateFormat style: ", i2));
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    public static final Method a(Class<?> cls, b bVar) {
        if (cls == null) {
            a.w.c.i.a("$this$getUnboxMethod");
            throw null;
        } else if (bVar != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
                a.w.c.i.a((Object) declaredMethod, "getDeclaredMethod(\"unbox…FOR_INLINE_CLASS_MEMBERS)");
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                throw new a.a.a.a.i0("No unbox method found in inline class: " + cls + " (calling " + bVar + ')');
            }
        } else {
            a.w.c.i.a("descriptor");
            throw null;
        }
    }

    public static final Object a(a.a.a.a.v0.l.g gVar, a.a.l lVar) {
        if (gVar == null) {
            a.w.c.i.a("$this$getValue");
            throw null;
        } else if (lVar != null) {
            return gVar.a();
        } else {
            a.w.c.i.a("p");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x012a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<a.a.a.a.v0.e.x0.f> a(a.a.a.a.v0.k.b.f0.h r18) {
        /*
        // Method dump skipped, instructions count: 354
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.g.a(a.a.a.a.v0.k.b.f0.h):java.util.List");
    }

    public static boolean a(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.g gVar, a.a.a.a.v0.f.b bVar) {
        if (gVar == null) {
            a.w.c.i.a("$this$hasAnnotation");
            throw null;
        } else if (bVar == null) {
            a.w.c.i.a("fqName");
            throw null;
        } else if (gVar instanceof a.a.a.a.v0.m.d0) {
            return ((a.a.a.a.v0.m.d0) gVar).y().b(bVar);
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + a.w.c.s.a(gVar.getClass())).toString());
        }
    }

    public static boolean a(a.a.a.a.v0.m.k1.n nVar, a.a.a.a.v0.m.k1.g gVar) {
        if (gVar != null) {
            return nVar.d(nVar.b(gVar)) != nVar.d(nVar.e(gVar));
        }
        a.w.c.i.a("$this$hasFlexibleNullability");
        throw null;
    }

    public static final boolean a(e eVar, a.a.a.a.v0.b.a aVar) {
        if (eVar == null) {
            a.w.c.i.a("$this$hasRealKotlinSuperClassWithOverrideOf");
            throw null;
        } else if (aVar != null) {
            a.a.a.a.v0.b.k b = aVar.b();
            if (b != null) {
                a.a.a.a.v0.m.k0 v = ((e) b).v();
                a.w.c.i.a((Object) v, "(specialCallableDescript…ssDescriptor).defaultType");
                while (true) {
                    eVar = a.a.a.a.v0.j.g.b(eVar);
                    boolean z = false;
                    if (eVar == null) {
                        return false;
                    }
                    if (!(eVar instanceof a.a.a.a.v0.d.a.z.d)) {
                        a.a.a.a.v0.m.k0 v2 = eVar.v();
                        if (v2 != null) {
                            if (a.a.a.a.v0.m.i1.r.a(v2, v, new a.a.a.a.v0.m.i1.q()) != null) {
                                z = true;
                            }
                            if (z) {
                                return !a.a.a.a.v0.a.g.c(eVar);
                            }
                        } else {
                            a.a.a.a.v0.m.i1.r.a(0);
                            throw null;
                        }
                    }
                }
            } else {
                throw new a.n("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            }
        } else {
            a.w.c.i.a("specialCallableDescriptor");
            throw null;
        }
    }

    public static final boolean a(a.a.a.a.v0.e.r rVar) {
        if (rVar != null) {
            return rVar.l() || rVar.m();
        }
        a.w.c.i.a("$this$hasReceiver");
        throw null;
    }

    public static final boolean a(a.a.a.a.v0.e.z zVar) {
        if (zVar != null) {
            return zVar.l() || zVar.m();
        }
        a.w.c.i.a("$this$hasReceiver");
        throw null;
    }

    public static boolean a(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.h hVar, a.a.a.a.v0.m.k1.h hVar2) {
        if (hVar == null) {
            a.w.c.i.a("a");
            throw null;
        } else if (hVar2 == null) {
            a.w.c.i.a("b");
            throw null;
        } else if (!(hVar instanceof a.a.a.a.v0.m.k0)) {
            StringBuilder a2 = e.a.a.a.a.a("ClassicTypeSystemContext couldn't handle: ", hVar, ", ");
            a2.append(a.w.c.s.a(hVar.getClass()));
            throw new IllegalArgumentException(a2.toString().toString());
        } else if (hVar2 instanceof a.a.a.a.v0.m.k0) {
            return ((a.a.a.a.v0.m.k0) hVar).H0() == ((a.a.a.a.v0.m.k0) hVar2).H0();
        } else {
            StringBuilder a3 = e.a.a.a.a.a("ClassicTypeSystemContext couldn't handle: ", hVar2, ", ");
            a3.append(a.w.c.s.a(hVar2.getClass()));
            throw new IllegalArgumentException(a3.toString().toString());
        }
    }

    public static final f1 a(f1 f1Var, a.a.a.a.v0.m.d0 d0Var) {
        if (f1Var == null) {
            a.w.c.i.a("$this$inheritEnhancement");
            throw null;
        } else if (d0Var != null) {
            return b(f1Var, c(d0Var));
        } else {
            a.w.c.i.a("origin");
            throw null;
        }
    }

    public static boolean a(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.k kVar, a.a.a.a.v0.m.k1.k kVar2) {
        if (kVar == null) {
            a.w.c.i.a("c1");
            throw null;
        } else if (kVar2 == null) {
            a.w.c.i.a("c2");
            throw null;
        } else if (!(kVar instanceof s0)) {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + a.w.c.s.a(kVar.getClass())).toString());
        } else if (kVar2 instanceof s0) {
            return a.w.c.i.a(kVar, kVar2);
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar2 + ", " + a.w.c.s.a(kVar2.getClass())).toString());
        }
    }

    public static final boolean a(a.a.a.a.v0.b.k kVar) {
        if (kVar != null) {
            return (kVar instanceof e) && ((e) kVar).p();
        }
        a.w.c.i.a("$this$isInlineClass");
        throw null;
    }

    public static final boolean a(f0 f0Var) {
        if (f0Var != null) {
            return f0Var.w() == null;
        }
        a.w.c.i.a("$this$isJavaField");
        throw null;
    }

    public static final boolean a(a.a.a.a.g<?> gVar) {
        return !(gVar.e().g0() != null);
    }

    public static final boolean a(a.a.a.a.v0.b.y0 y0Var) {
        d dVar = null;
        if (y0Var != null) {
            a.a.a.a.v0.b.k b = y0Var.b();
            a.w.c.i.a((Object) b, "this.containingDeclaration");
            if (!a(b)) {
                return false;
            }
            w0 e2 = e((e) b);
            if (e2 != null) {
                dVar = e2.d();
            }
            return a.w.c.i.a(dVar, y0Var.d());
        }
        a.w.c.i.a("$this$isUnderlyingPropertyOfInlineClass");
        throw null;
    }

    public static /* synthetic */ String a(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, a.w.b.l lVar, int i2) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        if (objArr == null) {
            a.w.c.i.a("$this$joinToString");
            throw null;
        } else if (charSequence == null) {
            a.w.c.i.a("separator");
            throw null;
        } else if (charSequence2 == null) {
            a.w.c.i.a("prefix");
            throw null;
        } else if (charSequence3 == null) {
            a.w.c.i.a("postfix");
            throw null;
        } else if (charSequence4 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence2);
            int i3 = 0;
            for (Object obj : objArr) {
                i3++;
                if (i3 > 1) {
                    sb.append(charSequence);
                }
                if (i >= 0 && i3 > i) {
                    break;
                }
                a.a.a.a.v0.m.l1.a.a(sb, obj, lVar);
            }
            if (i >= 0 && i3 > i) {
                sb.append(charSequence4);
            }
            sb.append(charSequence3);
            String sb2 = sb.toString();
            a.w.c.i.a((Object) sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
            return sb2;
        } else {
            a.w.c.i.a("truncated");
            throw null;
        }
    }

    public static final <T> a.e<T> a(a.f fVar, a.w.b.a<? extends T> aVar) {
        if (fVar == null) {
            a.w.c.i.a("mode");
            throw null;
        } else if (aVar != null) {
            int ordinal = fVar.ordinal();
            if (ordinal == 0) {
                return new a.l(aVar, null, 2);
            }
            if (ordinal == 1) {
                return new a.k(aVar);
            }
            if (ordinal == 2) {
                return new a.r(aVar);
            }
            throw new a.h();
        } else {
            a.w.c.i.a("initializer");
            throw null;
        }
    }

    /* renamed from: a */
    public static final <T> a.e<T> m92a(a.w.b.a<? extends T> aVar) {
        if (aVar != null) {
            return new a.l(aVar, null, 2);
        }
        a.w.c.i.a("initializer");
        throw null;
    }

    public static void a(Context context, String str) {
        new e.g.a.f().a(context, str, null, null);
    }

    public static a.a.a.a.v0.m.k1.g a(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.c cVar2) {
        if (cVar2 == null) {
            a.w.c.i.a("$this$lowerType");
            throw null;
        } else if (cVar2 instanceof a.a.a.a.v0.m.i1.h) {
            return ((a.a.a.a.v0.m.i1.h) cVar2).f1877f;
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + cVar2 + ", " + a.w.c.s.a(cVar2.getClass())).toString());
        }
    }

    public static final <K, V> Map<K, V> a(a.j<? extends K, ? extends V> jVar) {
        if (jVar != null) {
            Map<K, V> singletonMap = Collections.singletonMap(jVar.f2088c, jVar.f2089d);
            a.w.c.i.a((Object) singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
            return singletonMap;
        }
        a.w.c.i.a("pair");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e0, code lost:
        if (r7 != false) goto L_0x00f9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(a.a.a.a.v0.m.d0 r17, a.a.a.a.v0.d.b.i r18, a.a.a.a.v0.d.b.u r19, a.a.a.a.v0.d.b.s r20, a.w.b.q r21) {
        /*
        // Method dump skipped, instructions count: 675
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.g.a(a.a.a.a.v0.m.d0, a.a.a.a.v0.d.b.i, a.a.a.a.v0.d.b.u, a.a.a.a.v0.d.b.s, a.w.b.q):java.lang.Object");
    }

    public static final a.a.a.a.v0.e.g0 a(a.a.a.a.v0.e.g0 g0Var, a.a.a.a.v0.e.x0.e eVar) {
        if (g0Var == null) {
            a.w.c.i.a("$this$outerType");
            throw null;
        } else if (eVar == null) {
            a.w.c.i.a("typeTable");
            throw null;
        } else if (g0Var.o()) {
            return g0Var.o;
        } else {
            if ((g0Var.f1033e & 512) == 512) {
                return eVar.a(g0Var.p);
            }
            return null;
        }
    }

    public static final <T> Set<T> a(Set<? extends T> set, Iterable<? extends T> iterable) {
        int i;
        Integer num = null;
        if (set == null) {
            a.w.c.i.a("$this$plus");
            throw null;
        } else if (iterable != null) {
            if (iterable instanceof Collection) {
                num = Integer.valueOf(((Collection) iterable).size());
            }
            if (num != null) {
                i = set.size() + num.intValue();
            } else {
                i = set.size() * 2;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(e(i));
            linkedHashSet.addAll(set);
            a((Collection) linkedHashSet, (Iterable) iterable);
            return linkedHashSet;
        } else {
            a.w.c.i.a("elements");
            throw null;
        }
    }

    public static final <T> Set<T> a(Set<? extends T> set, T t) {
        if (set != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(e(set.size() + 1));
            linkedHashSet.addAll(set);
            linkedHashSet.add(t);
            return linkedHashSet;
        }
        a.w.c.i.a("$this$plus");
        throw null;
    }

    public static final d a(d dVar, boolean z) {
        String str = null;
        if (dVar != null) {
            if (z) {
                str = "is";
            }
            return a(dVar, "set", false, str, 4);
        }
        a.w.c.i.a("methodName");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0128, code lost:
        if (a.a.a.a.v0.f.d.c(r6) == false) goto L_0x012a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ a.a.a.a.v0.f.d a(a.a.a.a.v0.f.d r6, java.lang.String r7, boolean r8, java.lang.String r9, int r10) {
        /*
        // Method dump skipped, instructions count: 313
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.g.a(a.a.a.a.v0.f.d, java.lang.String, boolean, java.lang.String, int):a.a.a.a.v0.f.d");
    }

    public static final a.a.a.a.v0.e.g0 a(a.a.a.a.v0.e.r rVar, a.a.a.a.v0.e.x0.e eVar) {
        if (rVar == null) {
            a.w.c.i.a("$this$receiverType");
            throw null;
        } else if (eVar == null) {
            a.w.c.i.a("typeTable");
            throw null;
        } else if (rVar.l()) {
            return rVar.l;
        } else {
            if (rVar.m()) {
                return eVar.a(rVar.m);
            }
            return null;
        }
    }

    public static final void a(a.a.a.a.v0.c.a.c cVar, a.a.a.a.v0.c.a.b bVar, e eVar, d dVar) {
        a.a.a.a.v0.c.a.a b;
        a.a.a.a.v0.c.a.e eVar2;
        if (cVar == null) {
            a.w.c.i.a("$this$record");
            throw null;
        } else if (bVar == null) {
            a.w.c.i.a("from");
            throw null;
        } else if (eVar == null) {
            a.w.c.i.a("scopeOwner");
            throw null;
        } else if (dVar == null) {
            a.w.c.i.a("name");
            throw null;
        } else if (cVar != c.a.f519a && (b = bVar.b()) != null) {
            if (cVar.a()) {
                eVar2 = b.b();
            } else {
                e.a aVar = a.a.a.a.v0.c.a.e.f527f;
                eVar2 = a.a.a.a.v0.c.a.e.f526e;
            }
            String a2 = b.a();
            String a3 = a.a.a.a.v0.j.g.e(eVar).a();
            a.w.c.i.a((Object) a3, "DescriptorUtils.getFqName(scopeOwner).asString()");
            a.a.a.a.v0.c.a.f fVar = a.a.a.a.v0.c.a.f.CLASSIFIER;
            String a4 = dVar.a();
            a.w.c.i.a((Object) a4, "name.asString()");
            cVar.a(a2, eVar2, a3, fVar, a4);
        }
    }

    public static final void a(a.a.a.a.v0.c.a.c cVar, a.a.a.a.v0.c.a.b bVar, y yVar, d dVar) {
        a.a.a.a.v0.c.a.a b;
        a.a.a.a.v0.c.a.e eVar;
        if (cVar == null) {
            a.w.c.i.a("$this$record");
            throw null;
        } else if (bVar == null) {
            a.w.c.i.a("from");
            throw null;
        } else if (yVar == null) {
            a.w.c.i.a("scopeOwner");
            throw null;
        } else if (dVar != null) {
            String a2 = yVar.e().a();
            a.w.c.i.a((Object) a2, "scopeOwner.fqName.asString()");
            String a3 = dVar.a();
            a.w.c.i.a((Object) a3, "name.asString()");
            if (cVar != c.a.f519a && (b = bVar.b()) != null) {
                if (cVar.a()) {
                    eVar = b.b();
                } else {
                    e.a aVar = a.a.a.a.v0.c.a.e.f527f;
                    eVar = a.a.a.a.v0.c.a.e.f526e;
                }
                cVar.a(b.a(), eVar, a2, a.a.a.a.v0.c.a.f.PACKAGE, a3);
            }
        } else {
            a.w.c.i.a("name");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r0 != false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String a(a.a.a.a.v0.f.d r7) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.g.a(a.a.a.a.v0.f.d):java.lang.String");
    }

    public static final a.a.a.a.v0.m.d0 a(a.a.a.a.v0.m.d0 d0Var, List<? extends v0> list, h hVar) {
        if (d0Var == null) {
            a.w.c.i.a("$this$replace");
            throw null;
        } else if (list == null) {
            a.w.c.i.a("newArguments");
            throw null;
        } else if (hVar == null) {
            a.w.c.i.a("newAnnotations");
            throw null;
        } else if ((list.isEmpty() || list == d0Var.H0()) && hVar == d0Var.y()) {
            return d0Var;
        } else {
            f1 K0 = d0Var.K0();
            if (K0 instanceof a.a.a.a.v0.m.x) {
                a.a.a.a.v0.m.x xVar = (a.a.a.a.v0.m.x) K0;
                return a.a.a.a.v0.m.e0.a(a(xVar.f1956d, list, hVar), a(xVar.f1957e, list, hVar));
            } else if (K0 instanceof a.a.a.a.v0.m.k0) {
                return a((a.a.a.a.v0.m.k0) K0, list, hVar);
            } else {
                throw new a.h();
            }
        }
    }

    public static final a.a.a.a.v0.m.k0 a(a.a.a.a.v0.m.k0 k0Var, List<? extends v0> list, h hVar) {
        if (k0Var == null) {
            a.w.c.i.a("$this$replace");
            throw null;
        } else if (list == null) {
            a.w.c.i.a("newArguments");
            throw null;
        } else if (hVar == null) {
            a.w.c.i.a("newAnnotations");
            throw null;
        } else if (!list.isEmpty() || hVar != k0Var.y()) {
            return list.isEmpty() ? k0Var.a(hVar) : a.a.a.a.v0.m.e0.a(hVar, k0Var.I0(), list, k0Var.J0(), (a.a.a.a.v0.m.i1.f) null, 16);
        } else {
            return k0Var;
        }
    }

    public static final h a(a.a.a.a.v0.d.a.a0.h hVar, a.a.a.a.v0.d.a.c0.d dVar) {
        if (hVar == null) {
            a.w.c.i.a("$this$resolveAnnotations");
            throw null;
        } else if (dVar != null) {
            return new a.a.a.a.v0.d.a.a0.f(hVar, dVar);
        } else {
            a.w.c.i.a("annotationsOwner");
            throw null;
        }
    }

    public static final a.a.a.a.v0.b.e a(a.a.a.a.v0.b.w wVar, a.a.a.a.v0.f.b bVar, a.a.a.a.v0.c.a.b bVar2) {
        a.a.a.a.v0.b.h hVar;
        a.a.a.a.v0.j.w.i T;
        a.a.a.a.v0.b.e eVar = null;
        if (wVar == null) {
            a.w.c.i.a("$this$resolveClassByFqName");
            throw null;
        } else if (bVar == null) {
            a.w.c.i.a("fqName");
            throw null;
        } else if (bVar2 == null) {
            a.w.c.i.a("lookupLocation");
            throw null;
        } else if (bVar.b()) {
            return null;
        } else {
            a.a.a.a.v0.f.b c2 = bVar.c();
            a.w.c.i.a((Object) c2, "fqName.parent()");
            a.a.a.a.v0.j.w.i u = wVar.a(c2).u();
            d d2 = bVar.d();
            a.w.c.i.a((Object) d2, "fqName.shortName()");
            a.a.a.a.v0.b.h b = u.b(d2, bVar2);
            if (!(b instanceof a.a.a.a.v0.b.e)) {
                b = null;
            }
            a.a.a.a.v0.b.e eVar2 = (a.a.a.a.v0.b.e) b;
            if (eVar2 != null) {
                return eVar2;
            }
            a.a.a.a.v0.f.b c3 = bVar.c();
            a.w.c.i.a((Object) c3, "fqName.parent()");
            a.a.a.a.v0.b.e a2 = a(wVar, c3, bVar2);
            if (a2 == null || (T = a2.T()) == null) {
                hVar = null;
            } else {
                d d3 = bVar.d();
                a.w.c.i.a((Object) d3, "fqName.shortName()");
                hVar = T.b(d3, bVar2);
            }
            if (hVar instanceof a.a.a.a.v0.b.e) {
                eVar = hVar;
            }
            return eVar;
        }
    }

    public static final a.a.a.a.v0.e.g0 a(a.a.a.a.v0.e.z zVar, a.a.a.a.v0.e.x0.e eVar) {
        if (zVar == null) {
            a.w.c.i.a("$this$returnType");
            throw null;
        } else if (eVar == null) {
            a.w.c.i.a("typeTable");
            throw null;
        } else if (zVar.n()) {
            a.a.a.a.v0.e.g0 g0Var = zVar.i;
            a.w.c.i.a((Object) g0Var, "returnType");
            return g0Var;
        } else {
            if ((zVar.f1334e & 16) == 16) {
                return eVar.a(zVar.j);
            }
            throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
        }
    }

    public static final <T> T a(Set<? extends T> set, T t, T t2, T t3, boolean z) {
        Set<? extends T> k;
        if (set == null) {
            a.w.c.i.a("$this$select");
            throw null;
        } else if (t == null) {
            a.w.c.i.a("low");
            throw null;
        } else if (t2 == null) {
            a.w.c.i.a("high");
            throw null;
        } else if (z) {
            T t4 = set.contains(t) ? t : set.contains(t2) ? t2 : null;
            if (!a.w.c.i.a((Object) t4, (Object) t) || !a.w.c.i.a((Object) t3, (Object) t2)) {
                return t3 != null ? t3 : t4;
            }
            return null;
        } else {
            if (!(t3 == null || (k = a.t.f.k(a((Set) set, (Object) t3))) == null)) {
                set = k;
            }
            return (T) a.t.f.f(set);
        }
    }

    public static final a.a.a.a.v0.d.a.d0.g a(Set<? extends a.a.a.a.v0.d.a.d0.g> set, a.a.a.a.v0.d.a.d0.g gVar, boolean z) {
        if (set != null) {
            a.a.a.a.v0.d.a.d0.g gVar2 = a.a.a.a.v0.d.a.d0.g.FORCE_FLEXIBILITY;
            return gVar == gVar2 ? gVar2 : (a.a.a.a.v0.d.a.d0.g) a(set, a.a.a.a.v0.d.a.d0.g.NOT_NULL, a.a.a.a.v0.d.a.d0.g.NULLABLE, gVar, z);
        }
        a.w.c.i.a("$this$select");
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.Collection<? extends H> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> Collection<H> a(Collection<? extends H> collection, a.w.b.l<? super H, ? extends a.a.a.a.v0.b.a> lVar) {
        Object obj;
        if (collection == 0) {
            a.w.c.i.a("$this$selectMostSpecificInEachOverridableGroup");
            throw null;
        } else if (lVar == null) {
            a.w.c.i.a("descriptorByHandle");
            throw null;
        } else if (collection.size() <= 1) {
            return collection;
        } else {
            LinkedList linkedList = new LinkedList(collection);
            a.a.a.a.v0.o.m a2 = m.b.a();
            while (!linkedList.isEmpty()) {
                Object a3 = a.t.f.a((List) linkedList);
                a.a.a.a.v0.o.m a4 = m.b.a();
                Collection a5 = a.a.a.a.v0.j.l.a(a3, linkedList, lVar, new a.a.a.a.v0.j.q(a4));
                a.w.c.i.a((Object) a5, "OverridingUtil.extractMe…nflictedHandles.add(it) }");
                ArrayList arrayList = (ArrayList) a5;
                if (arrayList.size() != 1 || !a4.isEmpty()) {
                    obj = (Object) a.a.a.a.v0.j.l.a(a5, lVar);
                    a.w.c.i.a(obj, "OverridingUtil.selectMos…roup, descriptorByHandle)");
                    a.a.a.a.v0.b.a aVar = (a.a.a.a.v0.b.a) lVar.a(obj);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object obj2 = (Object) it.next();
                        a.w.c.i.a((Object) obj2, "it");
                        if (!a.a.a.a.v0.j.l.c(aVar, (a.a.a.a.v0.b.a) lVar.a(obj2))) {
                            a4.add(obj2);
                        }
                    }
                    if (!a4.isEmpty()) {
                        a2.addAll(a4);
                    }
                } else {
                    obj = (Object) a.t.f.e(a5);
                    a.w.c.i.a(obj, "overridableGroup.single()");
                }
                a2.add(obj);
            }
            return a2;
        }
    }

    public static final char a(char[] cArr) {
        if (cArr != null) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            } else if (length == 1) {
                return cArr[0];
            } else {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        } else {
            a.w.c.i.a("$this$single");
            throw null;
        }
    }

    public static int a(a.a.a.a.v0.m.k1.n nVar, a.a.a.a.v0.m.k1.i iVar) {
        if (iVar == null) {
            a.w.c.i.a("$this$size");
            throw null;
        } else if (iVar instanceof a.a.a.a.v0.m.k1.h) {
            return nVar.d((a.a.a.a.v0.m.k1.g) iVar);
        } else {
            if (iVar instanceof a.a.a.a.v0.m.k1.a) {
                return ((a.a.a.a.v0.m.k1.a) iVar).size();
            }
            throw new IllegalStateException(("unknown type argument list type: " + iVar + ", " + a.w.c.s.a(iVar.getClass())).toString());
        }
    }

    public static final <T> void a(List<T> list, Comparator<? super T> comparator) {
        if (list == null) {
            a.w.c.i.a("$this$sortWith");
            throw null;
        } else if (comparator == null) {
            a.w.c.i.a("comparator");
            throw null;
        } else if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static final a.a.a.a.v0.m.d0 a(r0 r0Var) {
        if (r0Var != null) {
            a.a.a.a.v0.b.k b = r0Var.b();
            if (b != null) {
                s0 n = ((a.a.a.a.v0.b.i) b).n();
                a.w.c.i.a((Object) n, "classDescriptor.typeConstructor");
                List<r0> d2 = n.d();
                a.w.c.i.a((Object) d2, "classDescriptor.typeConstructor.parameters");
                ArrayList arrayList = new ArrayList(a((Iterable) d2, 10));
                for (T t : d2) {
                    a.w.c.i.a((Object) t, "it");
                    arrayList.add(t.n());
                }
                a.a.a.a.v0.m.a1 a2 = a.a.a.a.v0.m.a1.a((y0) new q0(arrayList));
                List<a.a.a.a.v0.m.d0> upperBounds = r0Var.getUpperBounds();
                a.w.c.i.a((Object) upperBounds, "this.upperBounds");
                a.a.a.a.v0.m.d0 b2 = a2.b((a.a.a.a.v0.m.d0) a.t.f.a((List) upperBounds), g1.OUT_VARIANCE);
                if (b2 != null) {
                    return b2;
                }
                a.a.a.a.v0.m.k0 d3 = a.a.a.a.v0.j.u.a.b(r0Var).d();
                a.w.c.i.a((Object) d3, "builtIns.defaultBound");
                return d3;
            }
            throw new a.n("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassifierDescriptorWithTypeParameters");
        }
        a.w.c.i.a("$this$starProjectionType");
        throw null;
    }

    public static a.a.a.a.v0.m.a1 a(List<r0> list, y0 y0Var, a.a.a.a.v0.b.k kVar, List<r0> list2, boolean[] zArr) {
        if (list == null) {
            d(5);
            throw null;
        } else if (y0Var == null) {
            d(6);
            throw null;
        } else if (kVar == null) {
            d(7);
            throw null;
        } else if (list2 != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            int i = 0;
            for (r0 r0Var : list) {
                n0 a2 = n0.a(kVar, r0Var.y(), r0Var.p0(), r0Var.F(), r0Var.d(), i, m0.f491a, r0Var.O());
                hashMap.put(r0Var.n(), new x0(a2.v()));
                hashMap2.put(r0Var, a2);
                list2.add(a2);
                i++;
            }
            a.a.a.a.v0.m.a1 a3 = a.a.a.a.v0.m.a1.a(y0Var, u0.a.a(a.a.a.a.v0.m.u0.b, hashMap, false, 2));
            for (r0 r0Var2 : list) {
                n0 n0Var = (n0) hashMap2.get(r0Var2);
                for (a.a.a.a.v0.m.d0 d0Var : r0Var2.getUpperBounds()) {
                    a.a.a.a.v0.m.d0 b = a3.b(d0Var, g1.IN_VARIANCE);
                    if (b == null) {
                        return null;
                    }
                    if (!(b == d0Var || zArr == null)) {
                        zArr[0] = true;
                    }
                    n0Var.b(b);
                }
                n0Var.r0();
                n0Var.o = true;
            }
            return a3;
        } else {
            d(8);
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        if (r0.charAt(r3.length()) == '.') goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final a.a.a.a.v0.f.b a(a.a.a.a.v0.f.b r5, a.a.a.a.v0.f.b r6) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.g.a(a.a.a.a.v0.f.b, a.a.a.a.v0.f.b):a.a.a.a.v0.f.b");
    }

    public static final <T, C extends Collection<? super T>> C a(T[] tArr, C c2) {
        if (tArr == null) {
            a.w.c.i.a("$this$toCollection");
            throw null;
        } else if (c2 != null) {
            for (T t : tArr) {
                c2.add(t);
            }
            return c2;
        } else {
            a.w.c.i.a("destination");
            throw null;
        }
    }

    public static final Class<?> a(ClassLoader classLoader, String str) {
        if (classLoader == null) {
            a.w.c.i.a("$this$tryLoadClass");
            throw null;
        } else if (str != null) {
            try {
                return Class.forName(str, false, classLoader);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } else {
            a.w.c.i.a("fqName");
            throw null;
        }
    }

    public static final a.a.a.a.v0.e.g0 a(p0 p0Var, a.a.a.a.v0.e.x0.e eVar) {
        if (p0Var == null) {
            a.w.c.i.a("$this$type");
            throw null;
        } else if (eVar == null) {
            a.w.c.i.a("typeTable");
            throw null;
        } else if (p0Var.l()) {
            a.a.a.a.v0.e.g0 g0Var = p0Var.f1150h;
            a.w.c.i.a((Object) g0Var, "type");
            return g0Var;
        } else {
            if ((p0Var.f1147e & 8) == 8) {
                return eVar.a(p0Var.i);
            }
            throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
        }
    }

    public static a.a.a.a.v0.m.k1.h a(a.a.a.a.v0.m.i1.c cVar, a.a.a.a.v0.m.k1.h hVar, boolean z) {
        if (hVar == null) {
            a.w.c.i.a("$this$withNullability");
            throw null;
        } else if (hVar instanceof a.a.a.a.v0.m.k0) {
            return ((a.a.a.a.v0.m.k0) hVar).a(z);
        } else {
            StringBuilder a2 = e.a.a.a.a.a("ClassicTypeSystemContext couldn't handle: ", hVar, ", ");
            a2.append(a.w.c.s.a(hVar.getClass()));
            throw new IllegalArgumentException(a2.toString().toString());
        }
    }

    public static /* synthetic */ y0 a(y0 y0Var, boolean z, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if (y0Var == null) {
            a.w.c.i.a("$this$wrapWithCapturingSubstitution");
            throw null;
        } else if (!(y0Var instanceof a.a.a.a.v0.m.a0)) {
            return new a.a.a.a.v0.j.r.a.e(y0Var, z, y0Var);
        } else {
            a.a.a.a.v0.m.a0 a0Var = (a.a.a.a.v0.m.a0) y0Var;
            r0[] r0VarArr = a0Var.b;
            v0[] v0VarArr = a0Var.f1813c;
            if (v0VarArr == null) {
                a.w.c.i.a("$this$zip");
                throw null;
            } else if (r0VarArr != null) {
                int min = Math.min(v0VarArr.length, r0VarArr.length);
                ArrayList arrayList = new ArrayList(min);
                for (int i2 = 0; i2 < min; i2++) {
                    arrayList.add(new a.j(v0VarArr[i2], r0VarArr[i2]));
                }
                ArrayList arrayList2 = new ArrayList(a((Iterable) arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    a.j jVar = (a.j) it.next();
                    arrayList2.add(a((v0) jVar.f2088c, (r0) jVar.f2089d));
                }
                Object[] array = arrayList2.toArray(new v0[0]);
                if (array != null) {
                    return new a.a.a.a.v0.m.a0(r0VarArr, (v0[]) array, z);
                }
                throw new a.n("null cannot be cast to non-null type kotlin.Array<T>");
            } else {
                a.w.c.i.a("other");
                throw null;
            }
        }
    }
}
