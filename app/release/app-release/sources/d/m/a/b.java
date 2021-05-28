package d.m.a;

import d.d.i;
import d.l.h;
import d.l.m;
import d.l.n;
import d.l.q;
import d.l.r;
import d.l.s;
import d.l.t;
import d.l.u;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public final h f3569a;
    public final c b;

    public static class a<D> extends m<D> {
        public h j;
        public C0111b<D> k;

        @Override // androidx.lifecycle.LiveData
        public void a() {
            throw null;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: d.l.n<? super D> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void a(n<? super D> nVar) {
            super.a((n) nVar);
            this.j = null;
            this.k = null;
        }

        @Override // d.l.m
        public void a(D d2) {
            super.a((Object) d2);
        }

        @Override // androidx.lifecycle.LiveData
        public void b() {
            throw null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(0);
            sb.append(" : ");
            c.a.a.a.a.a((Object) null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: d.m.a.b$b  reason: collision with other inner class name */
    public static class C0111b<D> implements n<D> {
    }

    public static class c extends q {

        /* renamed from: c  reason: collision with root package name */
        public static final r f3570c = new a();
        public i<a> b = new i<>(10);

        public static class a implements r {
            @Override // d.l.r
            public <T extends q> T a(Class<T> cls) {
                return new c();
            }
        }

        @Override // d.l.q
        public void b() {
            if (this.b.c() > 0) {
                this.b.d(0);
                throw null;
            }
            i<a> iVar = this.b;
            int i = iVar.f3106f;
            Object[] objArr = iVar.f3105e;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            iVar.f3106f = 0;
            iVar.f3103c = false;
        }
    }

    public b(h hVar, u uVar) {
        this.f3569a = hVar;
        r rVar = c.f3570c;
        String canonicalName = c.class.getCanonicalName();
        if (canonicalName != null) {
            String b2 = e.a.a.a.a.b("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            q qVar = uVar.f3568a.get(b2);
            if (!c.class.isInstance(qVar)) {
                qVar = rVar instanceof s ? ((s) rVar).a(b2, c.class) : rVar.a(c.class);
                q put = uVar.f3568a.put(b2, qVar);
                if (put != null) {
                    put.b();
                }
            } else if (rVar instanceof t) {
                t tVar = (t) rVar;
            }
            this.b = (c) qVar;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // d.m.a.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        c cVar = this.b;
        if (cVar.b.c() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (cVar.b.c() > 0) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(cVar.b.b(0));
                printWriter.print(": ");
                printWriter.println(cVar.b.d(0).toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println((Object) null);
                throw null;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        c.a.a.a.a.a((Object) this.f3569a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
