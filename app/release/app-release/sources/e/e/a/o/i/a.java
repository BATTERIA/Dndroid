package e.e.a.o.i;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import e.c.a.b.l;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnTouchListener {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Context f4385c;

    public /* synthetic */ a(Context context) {
        this.f4385c = context;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Context context = this.f4385c;
        if (motionEvent.getAction() != 0) {
            return false;
        }
        l.f.a(context);
        return false;
    }
}
