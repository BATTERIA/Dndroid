package a.a.a.a.v0.n;

import a.a.a.a.v0.b.s;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import java.util.Arrays;
import java.util.Collection;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final a.a.a.a.v0.f.d f1963a;
    public final a.a0.d b;

    /* renamed from: c  reason: collision with root package name */
    public final Collection<a.a.a.a.v0.f.d> f1964c;

    /* renamed from: d  reason: collision with root package name */
    public final l<s, String> f1965d;

    /* renamed from: e  reason: collision with root package name */
    public final b[] f1966e;

    public static final class a extends j implements l {

        /* renamed from: c  reason: collision with root package name */
        public static final a f1967c = new a();

        public a() {
            super(1);
        }

        @Override // a.w.b.l
        public Object a(Object obj) {
            if (((s) obj) != null) {
                return null;
            }
            i.a("$receiver");
            throw null;
        }
    }

    public static final class b extends j implements l {

        /* renamed from: c  reason: collision with root package name */
        public static final b f1968c = new b();

        public b() {
            super(1);
        }

        @Override // a.w.b.l
        public Object a(Object obj) {
            if (((s) obj) != null) {
                return null;
            }
            i.a("$receiver");
            throw null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: a.w.b.l<? super a.a.a.a.v0.b.s, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(a.a.a.a.v0.f.d dVar, a.a0.d dVar2, Collection<a.a.a.a.v0.f.d> collection, l<? super s, String> lVar, b... bVarArr) {
        this.f1963a = dVar;
        this.b = dVar2;
        this.f1964c = collection;
        this.f1965d = lVar;
        this.f1966e = bVarArr;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(a.a.a.a.v0.f.d dVar, b[] bVarArr, l lVar, int i) {
        this(dVar, bVarArr, (i & 4) != 0 ? a.f1967c : lVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(Collection<a.a.a.a.v0.f.d> collection, b[] bVarArr, l<? super s, String> lVar) {
        this(null, null, collection, lVar, (b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        if (collection == null) {
            i.a("nameList");
            throw null;
        } else if (bVarArr == null) {
            i.a("checks");
            throw null;
        } else if (lVar != null) {
        } else {
            i.a("additionalChecks");
            throw null;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Collection collection, b[] bVarArr, l lVar, int i) {
        this(collection, bVarArr, (i & 4) != 0 ? b.f1968c : lVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: a.w.b.l<? super a.a.a.a.v0.b.s, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(a.a.a.a.v0.f.d dVar, b[] bVarArr, l<? super s, String> lVar) {
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (bVarArr == null) {
            i.a("checks");
            throw null;
        } else if (lVar != 0) {
            this.f1963a = dVar;
            this.b = null;
            this.f1964c = null;
            this.f1965d = lVar;
            this.f1966e = (b[]) Arrays.copyOf(bVarArr, bVarArr.length);
        } else {
            i.a("additionalChecks");
            throw null;
        }
    }
}
