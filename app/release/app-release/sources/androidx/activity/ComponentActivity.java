package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import d.l.e;
import d.l.f;
import d.l.h;
import d.l.i;
import d.l.p;
import d.l.u;
import d.l.v;
import d.p.c;

public class ComponentActivity extends d.g.d.b implements h, v, c, d.a.c {

    /* renamed from: d  reason: collision with root package name */
    public final i f2228d = new i(this);

    /* renamed from: e  reason: collision with root package name */
    public final d.p.b f2229e = new d.p.b(this);

    /* renamed from: f  reason: collision with root package name */
    public u f2230f;

    /* renamed from: g  reason: collision with root package name */
    public final OnBackPressedDispatcher f2231g = new OnBackPressedDispatcher(new a());

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public u f2235a;
    }

    public ComponentActivity() {
        i iVar = this.f2228d;
        if (iVar != null) {
            iVar.a(new f() {
                /* class androidx.activity.ComponentActivity.AnonymousClass2 */

                @Override // d.l.f
                public void a(h hVar, e.a aVar) {
                    if (aVar == e.a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
            this.f2228d.a(new f() {
                /* class androidx.activity.ComponentActivity.AnonymousClass3 */

                @Override // d.l.f
                public void a(h hVar, e.a aVar) {
                    if (aVar == e.a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.e().a();
                    }
                }
            });
            if (Build.VERSION.SDK_INT <= 23) {
                this.f2228d.a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    @Override // d.l.h
    public e a() {
        return this.f2228d;
    }

    @Override // d.a.c
    public final OnBackPressedDispatcher b() {
        return this.f2231g;
    }

    @Override // d.p.c
    public final d.p.a c() {
        return this.f2229e.b;
    }

    @Override // d.l.v
    public u e() {
        if (getApplication() != null) {
            if (this.f2230f == null) {
                b bVar = (b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.f2230f = bVar.f2235a;
                }
                if (this.f2230f == null) {
                    this.f2230f = new u();
                }
            }
            return this.f2230f;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void onBackPressed() {
        this.f2231g.a();
    }

    @Override // d.g.d.b
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2229e.a(bundle);
        p.a(this);
    }

    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        u uVar = this.f2230f;
        if (uVar == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            uVar = bVar.f2235a;
        }
        if (uVar == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.f2235a = uVar;
        return bVar2;
    }

    @Override // d.g.d.b
    public void onSaveInstanceState(Bundle bundle) {
        i iVar = this.f2228d;
        if (iVar instanceof i) {
            iVar.a(e.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f2229e.b(bundle);
    }
}
