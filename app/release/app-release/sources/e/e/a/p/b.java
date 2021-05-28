package e.e.a.p;

import android.content.ContextWrapper;
import com.didi.hummer.core.engine.jsc.jni.JavaScriptRuntime;
import com.didi.hummer.render.style.HummerLayout;
import e.c.a.b.l;
import e.e.a.g;
import e.e.a.k;
import e.e.a.q.b.c;
import e.e.a.x.a;
import e.e.a.y.a.b.m;
import java.util.HashMap;
import java.util.regex.Pattern;

public class b extends ContextWrapper {

    /* renamed from: c  reason: collision with root package name */
    public String f4442c;

    /* renamed from: d  reason: collision with root package name */
    public HummerLayout f4443d;

    /* renamed from: e  reason: collision with root package name */
    public HummerLayout f4444e;

    /* renamed from: f  reason: collision with root package name */
    public a f4445f = new a();

    /* renamed from: g  reason: collision with root package name */
    public e.e.a.q.b.b f4446g;

    /* renamed from: h  reason: collision with root package name */
    public c f4447h;
    public String i = "";
    public boolean j;
    public boolean k;
    public HashMap<String, m> l = new HashMap<>();
    public HashMap<String, e.e.a.q.b.d.a> m = new HashMap<>();
    public Pattern n = Pattern.compile("function *_classCallCheck *\\( *\\w+ *, *\\w+ *\\) *\\{");
    public Pattern o = Pattern.compile("\\s");

    public b(HummerLayout hummerLayout, String str) {
        super(hummerLayout.getContext());
        l.f.a("HummerNative", "HummerContext.new");
        this.f4442c = str;
        this.f4443d = hummerLayout;
        HummerLayout hummerLayout2 = new HummerLayout(this);
        this.f4444e = hummerLayout2;
        hummerLayout2.getYogaNode().setWidthPercent(100.0f);
        this.f4444e.getYogaNode().setHeightPercent(100.0f);
        this.f4443d.addView(this.f4444e);
    }

    public Object a(String str, String str2) {
        k.b();
        return ((e.e.a.q.b.e.b) this.f4446g).a(str, str2);
    }

    public void a(m mVar) {
        if (mVar != null) {
            this.l.put(mVar.d(), mVar);
        }
    }

    public /* synthetic */ void a(Exception exc) {
        l.f.a(exc, new StackTraceElement("<<Bundle>>", "", this.i, -1));
        g a2 = k.a(this.f4442c);
        if (a2.f4296d == null) {
            a2.f4296d = e.e.a.a.f4280a;
        }
        a2.f4296d.a(exc);
    }

    public final void b() {
        if (this.j && this.k && this.f4447h != null) {
            this.f4445f.onResume();
            this.f4447h.a("onAppear", new Object[0]);
        }
    }

    public void a() {
        l.f.a("HummerNative", "HummerContext.releaseJSContext");
        JavaScriptRuntime.destroyJSContext(((e.e.a.q.b.e.b) this.f4446g).f4488a);
    }
}
