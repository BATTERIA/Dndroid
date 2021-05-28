package a.a.a.a.v0.d.b;

import a.a.a.a.v0.b.n0;
import a.a.a.a.v0.e.v;
import a.a.a.a.v0.e.x0.c;
import a.a.a.a.v0.e.y0.a;
import a.a.a.a.v0.e.y0.g.f;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.h.i;
import a.a.a.a.v0.j.v.b;
import a.a.a.a.v0.k.b.r;
import a.w.c.i;

public final class g implements a.a.a.a.v0.k.b.f0.g {
    public final b b;

    /* renamed from: c  reason: collision with root package name */
    public final b f910c;

    /* renamed from: d  reason: collision with root package name */
    public final l f911d;

    public g(l lVar, v vVar, c cVar, r<f> rVar, boolean z) {
        b bVar = null;
        if (lVar == null) {
            i.a("kotlinClass");
            throw null;
        } else if (vVar == null) {
            i.a("packageProto");
            throw null;
        } else if (cVar != null) {
            b a2 = b.a(lVar.a());
            i.a((Object) a2, "JvmClassName.byClassId(kotlinClass.classId)");
            String a3 = lVar.c().a();
            if (a3 != null) {
                if (a3.length() > 0) {
                    bVar = b.a(a3);
                }
            }
            this.b = a2;
            this.f910c = bVar;
            this.f911d = lVar;
            i.g<v, Integer> gVar = a.l;
            a.w.c.i.a((Object) gVar, "JvmProtoBuf.packageModuleName");
            Integer num = (Integer) e.f.a.g.a(vVar, gVar);
            if (num != null) {
                cVar.a(num.intValue());
            }
        } else {
            a.w.c.i.a("nameResolver");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.m0
    public n0 a() {
        n0 n0Var = n0.f492a;
        a.w.c.i.a((Object) n0Var, "SourceFile.NO_SOURCE_FILE");
        return n0Var;
    }

    @Override // a.a.a.a.v0.k.b.f0.g
    public String c() {
        StringBuilder a2 = e.a.a.a.a.a("Class '");
        a2.append(d().a().a());
        a2.append('\'');
        return a2.toString();
    }

    public final a.a.a.a.v0.f.a d() {
        a.a.a.a.v0.f.b bVar;
        b bVar2 = this.b;
        int lastIndexOf = bVar2.f1602a.lastIndexOf("/");
        if (lastIndexOf == -1) {
            bVar = a.a.a.a.v0.f.b.f1343c;
            if (bVar == null) {
                b.a(7);
                throw null;
            }
        } else {
            bVar = new a.a.a.a.v0.f.b(bVar2.f1602a.substring(0, lastIndexOf).replace('/', '.'));
        }
        return new a.a.a.a.v0.f.a(bVar, e());
    }

    public final d e() {
        String a2 = this.b.a();
        a.w.c.i.a((Object) a2, "className.internalName");
        d b2 = d.b(a.a0.i.a(a2, '/', (String) null, 2));
        a.w.c.i.a((Object) b2, "Name.identifier(classNam….substringAfterLast('/'))");
        return b2;
    }

    public String toString() {
        return g.class.getSimpleName() + ": " + this.b;
    }
}
