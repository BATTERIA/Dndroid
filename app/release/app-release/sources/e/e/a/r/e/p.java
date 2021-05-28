package e.e.a.r.e;

import android.content.Context;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.didi.hummer.core.engine.jsc.jni.HummerException;
import com.didi.hummer.render.style.HummerLayout;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaPositionType;
import e.c.a.b.l;
import e.e.a.p.b;
import e.e.a.r.d.a;
import e.e.a.y.a.b.j;

public class p extends LinearLayout {

    /* renamed from: c  reason: collision with root package name */
    public HummerLayout f4527c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4528d;

    /* renamed from: e  reason: collision with root package name */
    public j f4529e;

    /* renamed from: f  reason: collision with root package name */
    public e.e.a.r.d.a f4530f;

    /* renamed from: g  reason: collision with root package name */
    public b f4531g;

    /* renamed from: h  reason: collision with root package name */
    public e.e.a.r.a f4532h;
    public e.e.a.q.c.a i = new a();

    public class a implements e.e.a.q.c.a {
        public a() {
        }

        @Override // e.e.a.q.c.a
        public void a(Exception exc) {
            e.e.a.r.d.a aVar = p.this.f4530f;
            String stackTraceString = Log.getStackTraceString(exc);
            if (aVar != null) {
                e.e.a.r.b.a aVar2 = new e.e.a.r.b.a(6, stackTraceString);
                aVar.f4504a.add(aVar2);
                a.AbstractC0137a aVar3 = aVar.b;
                if (aVar3 != null) {
                    aVar3.a(aVar2);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    public p(Context context) {
        super(context, null, 0);
        b bVar;
        HummerLayout hummerLayout;
        if ((context instanceof b) && (hummerLayout = (bVar = (b) context).f4443d) != null) {
            this.f4531g = bVar;
            this.f4527c = hummerLayout;
            e.e.a.r.d.a aVar = new e.e.a.r.d.a();
            this.f4530f = aVar;
            this.f4531g.a(new e.e.a.r.c.a(aVar));
            setOrientation(1);
            setGravity(1);
            setFocusableInTouchMode(true);
            setOnKeyListener(new m(this));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setText("开发\n工具");
            textView.setTextSize(10.0f);
            textView.setTextColor(-1);
            textView.setWidth(l.f.a(context, 40.0f));
            textView.setHeight(l.f.a(context, 40.0f));
            textView.setGravity(17);
            textView.setBackgroundResource(e.e.a.t.a.btn_dev_tools_entrance_bg);
            addView(textView, layoutParams);
            TextView textView2 = new TextView(context);
            textView2.setText(getJsEngineString());
            textView2.setTextSize(7.0f);
            textView2.setTextColor(-1);
            textView2.setBackgroundResource(e.e.a.t.a.btn_dev_tools_js_engine_bg);
            textView2.setPadding(l.f.a(context, 3.0f), l.f.a(context, 1.0f), l.f.a(context, 3.0f), l.f.a(context, 1.0f));
            layoutParams.topMargin = l.f.a(context, 4.0f);
            addView(textView2, layoutParams);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.setMarginEnd(l.f.a(context, 12.0f));
            r rVar = new r(context);
            rVar.addView(this, layoutParams2);
            d.g.l.p.a((View) rVar, 20.0f);
            rVar.setOnClickListener(new l(this));
            o oVar = new o(this, this.f4531g, null, null, rVar);
            oVar.getYogaNode().setPositionType(YogaPositionType.ABSOLUTE);
            oVar.getYogaNode().setPosition(YogaEdge.END, 0.0f);
            oVar.getYogaNode().setPosition(YogaEdge.BOTTOM, (float) l.f.a(context, 100.0f));
            this.f4527c.a(oVar, -1);
        }
    }

    public /* synthetic */ boolean a(View view, int i2, KeyEvent keyEvent) {
        if (i2 != 4 || keyEvent.getAction() != 1 || !this.f4528d) {
            return false;
        }
        this.f4528d = false;
        this.f4527c.a(this.f4529e);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    @android.annotation.SuppressLint({"SwitchIntDef"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getJsEngineString() {
        /*
            r4 = this;
            e.e.a.p.b r0 = r4.f4531g
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            int r1 = r0.hashCode()
            r2 = -767648389(0xffffffffd23e9d7b, float:-2.04671468E11)
            r3 = 1
            if (r1 == r2) goto L_0x0024
            r2 = -148959245(0xfffffffff71f0ff3, float:-3.2261668E33)
            if (r1 == r2) goto L_0x001a
            goto L_0x002e
        L_0x001a:
            java.lang.String r1 = "V8HummerContext"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002e
            r0 = 1
            goto L_0x002f
        L_0x0024:
            java.lang.String r1 = "JSCHummerContext"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002e
            r0 = 0
            goto L_0x002f
        L_0x002e:
            r0 = -1
        L_0x002f:
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x0036
            java.lang.String r0 = "Unknown"
            return r0
        L_0x0036:
            java.lang.String r0 = "V8"
            return r0
        L_0x0039:
            e.e.a.k.b()
            java.lang.String r0 = "QuickJS"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.a.r.e.p.getJsEngineString():java.lang.String");
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f4531g;
        if (bVar != null) {
            HummerException.addJSContextExceptionCallback(bVar.f4446g, this.i);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f4531g;
        if (bVar != null) {
            HummerException.removeJSContextExceptionCallback(bVar.f4446g);
        }
    }

    public void setParameterInjector(e.e.a.r.a aVar) {
        this.f4532h = aVar;
    }

    public /* synthetic */ void a(View view) {
        if (!this.f4528d) {
            this.f4528d = true;
            if (this.f4529e == null) {
                n nVar = new n(getContext());
                nVar.o = this.f4531g;
                nVar.p = this.f4532h;
                e.e.a.r.d.a aVar = this.f4530f;
                aVar.b = nVar;
                nVar.setData(aVar.f4504a);
                d.g.l.p.a((View) nVar, 19.0f);
                q qVar = new q(this, this.f4531g, null, null, nVar);
                this.f4529e = qVar;
                qVar.getYogaNode().setPositionType(YogaPositionType.ABSOLUTE);
                this.f4529e.getYogaNode().setWidthPercent(100.0f);
                this.f4529e.getYogaNode().setHeightPercent(100.0f);
            }
            this.f4527c.a(this.f4529e, -1);
            requestFocus();
            return;
        }
        this.f4528d = false;
        this.f4527c.a(this.f4529e);
    }
}
