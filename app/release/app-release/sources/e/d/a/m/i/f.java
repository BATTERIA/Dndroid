package e.d.a.m.i;

import e.a.a.a.a;
import e.d.a.m.b;
import e.d.a.m.c;
import e.d.a.m.e;
import e.d.a.m.g;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f3986a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3987c;

    /* renamed from: d  reason: collision with root package name */
    public final e f3988d;

    /* renamed from: e  reason: collision with root package name */
    public final e f3989e;

    /* renamed from: f  reason: collision with root package name */
    public final g f3990f;

    /* renamed from: g  reason: collision with root package name */
    public final e.d.a.m.f f3991g;

    /* renamed from: h  reason: collision with root package name */
    public final e.d.a.m.k.i.c f3992h;
    public final b i;
    public final c j;
    public String k;
    public int l;
    public c m;

    public f(String str, c cVar, int i2, int i3, e eVar, e eVar2, g gVar, e.d.a.m.f fVar, e.d.a.m.k.i.c cVar2, b bVar) {
        this.f3986a = str;
        this.j = cVar;
        this.b = i2;
        this.f3987c = i3;
        this.f3988d = eVar;
        this.f3989e = eVar2;
        this.f3990f = gVar;
        this.f3991g = fVar;
        this.f3992h = cVar2;
        this.i = bVar;
    }

    public c a() {
        if (this.m == null) {
            this.m = new j(this.f3986a, this.j);
        }
        return this.m;
    }

    @Override // e.d.a.m.c
    public void a(MessageDigest messageDigest) {
        byte[] array = ByteBuffer.allocate(8).putInt(this.b).putInt(this.f3987c).array();
        this.j.a(messageDigest);
        messageDigest.update(this.f3986a.getBytes("UTF-8"));
        messageDigest.update(array);
        e eVar = this.f3988d;
        String str = "";
        messageDigest.update((eVar != null ? eVar.a() : str).getBytes("UTF-8"));
        e eVar2 = this.f3989e;
        messageDigest.update((eVar2 != null ? eVar2.a() : str).getBytes("UTF-8"));
        g gVar = this.f3990f;
        messageDigest.update((gVar != null ? gVar.a() : str).getBytes("UTF-8"));
        e.d.a.m.f fVar = this.f3991g;
        messageDigest.update((fVar != null ? fVar.a() : str).getBytes("UTF-8"));
        b bVar = this.i;
        if (bVar != null) {
            str = bVar.a();
        }
        messageDigest.update(str.getBytes("UTF-8"));
    }

    @Override // e.d.a.m.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f3986a.equals(fVar.f3986a) || !this.j.equals(fVar.j) || this.f3987c != fVar.f3987c || this.b != fVar.b) {
            return false;
        }
        if ((this.f3990f == null) ^ (fVar.f3990f == null)) {
            return false;
        }
        g gVar = this.f3990f;
        if (gVar != null && !gVar.a().equals(fVar.f3990f.a())) {
            return false;
        }
        if ((this.f3989e == null) ^ (fVar.f3989e == null)) {
            return false;
        }
        e eVar = this.f3989e;
        if (eVar != null && !eVar.a().equals(fVar.f3989e.a())) {
            return false;
        }
        if ((this.f3988d == null) ^ (fVar.f3988d == null)) {
            return false;
        }
        e eVar2 = this.f3988d;
        if (eVar2 != null && !eVar2.a().equals(fVar.f3988d.a())) {
            return false;
        }
        if ((this.f3991g == null) ^ (fVar.f3991g == null)) {
            return false;
        }
        e.d.a.m.f fVar2 = this.f3991g;
        if (fVar2 != null && !fVar2.a().equals(fVar.f3991g.a())) {
            return false;
        }
        if ((this.f3992h == null) ^ (fVar.f3992h == null)) {
            return false;
        }
        e.d.a.m.k.i.c cVar = this.f3992h;
        if (cVar != null && !cVar.a().equals(fVar.f3992h.a())) {
            return false;
        }
        if ((this.i == null) ^ (fVar.i == null)) {
            return false;
        }
        b bVar = this.i;
        return bVar == null || bVar.a().equals(fVar.i.a());
    }

    @Override // e.d.a.m.c
    public int hashCode() {
        if (this.l == 0) {
            int hashCode = this.f3986a.hashCode();
            this.l = hashCode;
            int hashCode2 = this.j.hashCode() + (hashCode * 31);
            this.l = hashCode2;
            int i2 = (hashCode2 * 31) + this.b;
            this.l = i2;
            int i3 = (i2 * 31) + this.f3987c;
            this.l = i3;
            int i4 = i3 * 31;
            e eVar = this.f3988d;
            int i5 = 0;
            int hashCode3 = i4 + (eVar != null ? eVar.a().hashCode() : 0);
            this.l = hashCode3;
            int i6 = hashCode3 * 31;
            e eVar2 = this.f3989e;
            int hashCode4 = i6 + (eVar2 != null ? eVar2.a().hashCode() : 0);
            this.l = hashCode4;
            int i7 = hashCode4 * 31;
            g gVar = this.f3990f;
            int hashCode5 = i7 + (gVar != null ? gVar.a().hashCode() : 0);
            this.l = hashCode5;
            int i8 = hashCode5 * 31;
            e.d.a.m.f fVar = this.f3991g;
            int hashCode6 = i8 + (fVar != null ? fVar.a().hashCode() : 0);
            this.l = hashCode6;
            int i9 = hashCode6 * 31;
            e.d.a.m.k.i.c cVar = this.f3992h;
            int hashCode7 = i9 + (cVar != null ? cVar.a().hashCode() : 0);
            this.l = hashCode7;
            int i10 = hashCode7 * 31;
            b bVar = this.i;
            if (bVar != null) {
                i5 = bVar.a().hashCode();
            }
            this.l = i10 + i5;
        }
        return this.l;
    }

    public String toString() {
        if (this.k == null) {
            StringBuilder a2 = a.a("EngineKey{");
            a2.append(this.f3986a);
            a2.append('+');
            a2.append(this.j);
            a2.append("+[");
            a2.append(this.b);
            a2.append('x');
            a2.append(this.f3987c);
            a2.append("]+");
            a2.append('\'');
            e eVar = this.f3988d;
            String str = "";
            a2.append(eVar != null ? eVar.a() : str);
            a2.append('\'');
            a2.append('+');
            a2.append('\'');
            e eVar2 = this.f3989e;
            a2.append(eVar2 != null ? eVar2.a() : str);
            a2.append('\'');
            a2.append('+');
            a2.append('\'');
            g gVar = this.f3990f;
            a2.append(gVar != null ? gVar.a() : str);
            a2.append('\'');
            a2.append('+');
            a2.append('\'');
            e.d.a.m.f fVar = this.f3991g;
            a2.append(fVar != null ? fVar.a() : str);
            a2.append('\'');
            a2.append('+');
            a2.append('\'');
            e.d.a.m.k.i.c cVar = this.f3992h;
            a2.append(cVar != null ? cVar.a() : str);
            a2.append('\'');
            a2.append('+');
            a2.append('\'');
            b bVar = this.i;
            if (bVar != null) {
                str = bVar.a();
            }
            a2.append(str);
            a2.append('\'');
            a2.append('}');
            this.k = a2.toString();
        }
        return this.k;
    }
}
