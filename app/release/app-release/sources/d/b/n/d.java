package d.b.n;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import d.b.n.a;
import d.b.n.i.h;
import d.b.o.c;
import java.lang.ref.WeakReference;

public class d extends a implements h.a {

    /* renamed from: e  reason: collision with root package name */
    public Context f2744e;

    /* renamed from: f  reason: collision with root package name */
    public ActionBarContextView f2745f;

    /* renamed from: g  reason: collision with root package name */
    public a.AbstractC0090a f2746g;

    /* renamed from: h  reason: collision with root package name */
    public WeakReference<View> f2747h;
    public boolean i;
    public h j;

    public d(Context context, ActionBarContextView actionBarContextView, a.AbstractC0090a aVar, boolean z) {
        this.f2744e = context;
        this.f2745f = actionBarContextView;
        this.f2746g = aVar;
        h hVar = new h(actionBarContextView.getContext());
        hVar.l = 1;
        this.j = hVar;
        hVar.f2821e = this;
    }

    @Override // d.b.n.a
    public void a() {
        if (!this.i) {
            this.i = true;
            this.f2745f.sendAccessibilityEvent(32);
            this.f2746g.a(this);
        }
    }

    @Override // d.b.n.a
    public void a(View view) {
        this.f2745f.setCustomView(view);
        this.f2747h = view != null ? new WeakReference<>(view) : null;
    }

    @Override // d.b.n.i.h.a
    public void a(h hVar) {
        g();
        c cVar = this.f2745f.f2859f;
        if (cVar != null) {
            cVar.f();
        }
    }

    @Override // d.b.n.a
    public void a(CharSequence charSequence) {
        this.f2745f.setSubtitle(charSequence);
    }

    @Override // d.b.n.i.h.a
    public boolean a(h hVar, MenuItem menuItem) {
        return this.f2746g.a(this, menuItem);
    }

    @Override // d.b.n.a
    public View b() {
        WeakReference<View> weakReference = this.f2747h;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // d.b.n.a
    public void b(int i2) {
        this.f2745f.setTitle(this.f2744e.getString(i2));
    }

    @Override // d.b.n.a
    public void b(CharSequence charSequence) {
        this.f2745f.setTitle(charSequence);
    }

    @Override // d.b.n.a
    public Menu c() {
        return this.j;
    }

    @Override // d.b.n.a
    public MenuInflater d() {
        return new f(this.f2745f.getContext());
    }

    @Override // d.b.n.a
    public CharSequence e() {
        return this.f2745f.getSubtitle();
    }

    @Override // d.b.n.a
    public CharSequence f() {
        return this.f2745f.getTitle();
    }

    @Override // d.b.n.a
    public void g() {
        this.f2746g.a(this, this.j);
    }

    @Override // d.b.n.a
    public boolean h() {
        return this.f2745f.t;
    }

    @Override // d.b.n.a
    public void a(int i2) {
        this.f2745f.setSubtitle(this.f2744e.getString(i2));
    }

    @Override // d.b.n.a
    public void a(boolean z) {
        this.f2740d = z;
        this.f2745f.setTitleOptional(z);
    }
}
