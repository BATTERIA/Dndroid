package e.e.a.o.j;

import com.didi.hummer.component.loading.Loading;
import e.e.a.q.b.c;
import e.e.a.y.a.b.h;

public class a extends h<Loading> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.e.a.y.a.b.h
    public Loading a(c cVar, Object[] objArr) {
        return new Loading(this.f4585a, cVar, (objArr.length <= 0 || objArr[0] == null) ? null : String.valueOf(objArr[0]));
    }

    @Override // e.e.a.y.a.b.m
    public String d() {
        return "Loading";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String, java.lang.Object[]] */
    @Override // e.e.a.y.a.b.h
    public Object a(Loading loading, String str, Object[] objArr) {
        str.getClass();
        return null;
    }
}
