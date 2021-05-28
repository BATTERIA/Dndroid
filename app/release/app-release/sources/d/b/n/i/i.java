package d.b.n.i;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import d.b.k.g;
import d.b.n.i.o;

public class i implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, o.a {

    /* renamed from: c  reason: collision with root package name */
    public h f2825c;

    /* renamed from: d  reason: collision with root package name */
    public g f2826d;

    /* renamed from: e  reason: collision with root package name */
    public f f2827e;

    public i(h hVar) {
        this.f2825c = hVar;
    }

    @Override // d.b.n.i.o.a
    public void a(h hVar, boolean z) {
        g gVar;
        if ((z || hVar == this.f2825c) && (gVar = this.f2826d) != null) {
            gVar.dismiss();
        }
    }

    @Override // d.b.n.i.o.a
    public boolean a(h hVar) {
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f2825c.a((j) this.f2827e.a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        f fVar = this.f2827e;
        h hVar = this.f2825c;
        o.a aVar = fVar.j;
        if (aVar != null) {
            aVar.a(hVar, true);
        }
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2826d.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2826d.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f2825c.a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f2825c.performShortcut(i, keyEvent, 0);
    }
}
