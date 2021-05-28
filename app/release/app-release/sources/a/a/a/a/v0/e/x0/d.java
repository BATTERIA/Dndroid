package a.a.a.a.v0.e.x0;

import a.a.a.a.v0.e.b0;
import a.a.a.a.v0.e.e0;
import a.m;
import a.t.f;
import a.w.b.l;
import a.w.c.i;
import java.util.LinkedList;
import java.util.List;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f1247a;
    public final b0 b;

    public d(e0 e0Var, b0 b0Var) {
        if (e0Var == null) {
            i.a("strings");
            throw null;
        } else if (b0Var != null) {
            this.f1247a = e0Var;
            this.b = b0Var;
        } else {
            i.a("qualifiedNames");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.e.x0.c
    public String a(int i) {
        String str = (String) this.f1247a.f1013d.get(i);
        i.a((Object) str, "strings.getString(index)");
        return str;
    }

    @Override // a.a.a.a.v0.e.x0.c
    public boolean b(int i) {
        return d(i).f2098e.booleanValue();
    }

    @Override // a.a.a.a.v0.e.x0.c
    public String c(int i) {
        m<List<String>, List<String>, Boolean> d2 = d(i);
        A a2 = d2.f2096c;
        String a3 = f.a(d2.f2097d, ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
        if (a2.isEmpty()) {
            return a3;
        }
        return f.a(a2, "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62) + '/' + a3;
    }

    public final m<List<String>, List<String>, Boolean> d(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            b0.c cVar = this.b.f990d.get(i);
            e0 e0Var = this.f1247a;
            i.a((Object) cVar, "proto");
            String str = (String) e0Var.f1013d.get(cVar.f998f);
            b0.c.EnumC0043c cVar2 = cVar.f999g;
            if (cVar2 != null) {
                int ordinal = cVar2.ordinal();
                if (ordinal == 0) {
                    linkedList2.addFirst(str);
                } else if (ordinal == 1) {
                    linkedList.addFirst(str);
                } else if (ordinal == 2) {
                    linkedList2.addFirst(str);
                    z = true;
                }
                i = cVar.f997e;
            } else {
                i.a();
                throw null;
            }
        }
        return new m<>(linkedList, linkedList2, Boolean.valueOf(z));
    }
}
