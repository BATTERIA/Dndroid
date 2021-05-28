package a.a.a.a.v0.b.e1.b;

import a.a.a.a.v0.d.a.c0.n;
import a.a.a.a.v0.d.a.c0.v;
import a.w.c.i;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class w extends y implements n {

    /* renamed from: a  reason: collision with root package name */
    public final Field f477a;

    public w(Field field) {
        if (field != null) {
            this.f477a = field;
        } else {
            i.a("member");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.d.a.c0.n
    public boolean E() {
        return this.f477a.isEnumConstant();
    }

    @Override // a.a.a.a.v0.d.a.c0.n
    public boolean G() {
        return false;
    }

    @Override // a.a.a.a.v0.d.a.c0.n
    public v c() {
        Type genericType = this.f477a.getGenericType();
        i.a((Object) genericType, "member.genericType");
        return d0.a(genericType);
    }

    @Override // a.a.a.a.v0.b.e1.b.y
    public Member l() {
        return this.f477a;
    }
}
