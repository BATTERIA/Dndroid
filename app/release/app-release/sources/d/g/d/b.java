package d.g.d;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import d.g.l.c;
import d.g.l.p;
import d.l.e;
import d.l.h;
import d.l.i;

public class b extends Activity implements h, c.a {

    /* renamed from: c  reason: collision with root package name */
    public i f3239c = new i(this);

    @Override // d.g.l.c.a
    public boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !p.b(decorView, keyEvent)) {
            return c.a(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !p.b(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d.l.p.a(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f3239c.a(e.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
