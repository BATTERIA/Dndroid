package d.b.k;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import d.b.k.k;
import d.b.n.a;
import d.g.l.c;

public class r extends Dialog implements i {

    /* renamed from: c  reason: collision with root package name */
    public j f2691c;

    /* renamed from: d  reason: collision with root package name */
    public final c.a f2692d;

    public class a implements c.a {
        public a() {
        }

        @Override // d.g.l.c.a
        public boolean a(KeyEvent keyEvent) {
            return r.this.a(keyEvent);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r(android.content.Context r4, int r5) {
        /*
            r3 = this;
            if (r5 != 0) goto L_0x0013
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r0 = r4.getTheme()
            int r1 = d.b.a.dialogTheme
            r2 = 1
            r0.resolveAttribute(r1, r5, r2)
            int r5 = r5.resourceId
        L_0x0013:
            r3.<init>(r4, r5)
            d.b.k.r$a r4 = new d.b.k.r$a
            r4.<init>()
            r3.f2692d = r4
            d.b.k.j r4 = r3.a()
            r5 = 0
            r4.a(r5)
            d.b.k.j r4 = r3.a()
            r4.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.k.r.<init>(android.content.Context, int):void");
    }

    public j a() {
        if (this.f2691c == null) {
            this.f2691c = new k(getContext(), getWindow(), this);
        }
        return this.f2691c;
    }

    @Override // d.b.k.i
    public d.b.n.a a(a.AbstractC0090a aVar) {
        return null;
    }

    @Override // d.b.k.i
    public void a(d.b.n.a aVar) {
    }

    public boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k kVar = (k) a();
        kVar.f();
        ((ViewGroup) kVar.u.findViewById(16908290)).addView(view, layoutParams);
        kVar.f2662e.onContentChanged();
    }

    @Override // d.b.k.i
    public void b(d.b.n.a aVar) {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return c.a(this.f2692d, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        k kVar = (k) a();
        kVar.f();
        return (T) kVar.f2661d.findViewById(i);
    }

    public void invalidateOptionsMenu() {
        a().c();
    }

    public void onCreate(Bundle bundle) {
        a().b();
        super.onCreate(bundle);
        a().a(bundle);
    }

    public void onStop() {
        super.onStop();
        k kVar = (k) a();
        kVar.h();
        a aVar = kVar.f2665h;
        if (aVar != null) {
            aVar.c(false);
        }
        k.f fVar = kVar.L;
        if (fVar != null) {
            fVar.a();
        }
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        a().b(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().a(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        a().a(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().a(charSequence);
    }
}
