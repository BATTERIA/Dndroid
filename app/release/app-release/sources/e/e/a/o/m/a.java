package e.e.a.o.m;

import com.didi.hummer.component.switchview.Switch;
import e.e.a.q.b.c;
import e.e.a.y.a.b.h;

public class a extends h<Switch> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.e.a.y.a.b.h
    public Switch a(c cVar, Object[] objArr) {
        return new Switch(this.f4585a, cVar, (objArr.length <= 0 || objArr[0] == null) ? null : String.valueOf(objArr[0]));
    }

    @Override // e.e.a.y.a.b.m
    public String d() {
        return "Switch";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String, java.lang.Object[]] */
    @Override // e.e.a.y.a.b.h
    public Object a(Switch r4, String str, Object[] objArr) {
        Switch r42 = r4;
        boolean z = false;
        if (((str.hashCode() == -578987803 && str.equals("setChecked")) ? (char) 0 : 65535) != 0) {
            return null;
        }
        if (objArr.length > 0 && objArr[0] != null) {
            z = ((Boolean) objArr[0]).booleanValue();
        }
        r42.setChecked(z);
        return null;
    }
}
