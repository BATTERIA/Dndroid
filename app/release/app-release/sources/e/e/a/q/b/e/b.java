package e.e.a.q.b.e;

import android.text.TextUtils;
import com.didi.hummer.core.engine.jsc.jni.JavaScriptRuntime;
import e.c.a.b.l;

public class b extends c implements e.e.a.q.b.b {
    public b(long j) {
        super(j, -1);
    }

    public Object a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return l.f.a(this.f4488a, JavaScriptRuntime.evaluateJavaScript(this.f4488a, str, str2));
    }

    public Object c(String str) {
        return a(str, "");
    }

    @Override // e.e.a.q.b.e.c, e.e.a.q.b.d.e
    public void d() {
        JavaScriptRuntime.destroyJSContext(this.f4488a);
    }

    @Override // e.e.a.q.b.e.c, e.e.a.q.b.d.d
    public long f() {
        return this.f4488a;
    }
}
