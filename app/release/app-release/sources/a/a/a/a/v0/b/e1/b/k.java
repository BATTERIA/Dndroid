package a.a.a.a.v0.b.e1.b;

import a.a.e;
import a.w.b.l;
import a.w.c.h;
import a.w.c.i;
import a.w.c.s;
import java.lang.reflect.Member;

public final /* synthetic */ class k extends h implements l<Member, Boolean> {

    /* renamed from: f  reason: collision with root package name */
    public static final k f468f = new k();

    public k() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public Boolean a(Member member) {
        Member member2 = member;
        if (member2 != null) {
            return Boolean.valueOf(member2.isSynthetic());
        }
        i.a("p1");
        throw null;
    }

    @Override // a.w.c.b
    public final e c() {
        return s.a(Member.class);
    }

    @Override // a.a.b, a.w.c.b
    public final String d() {
        return "isSynthetic";
    }

    @Override // a.w.c.b
    public final String f() {
        return "isSynthetic()Z";
    }
}
