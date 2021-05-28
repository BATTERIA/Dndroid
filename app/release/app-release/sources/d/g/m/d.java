package d.g.m;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Method;

public class d implements ActionMode.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final ActionMode.Callback f3388a;
    public final TextView b;

    /* renamed from: c  reason: collision with root package name */
    public Class f3389c;

    /* renamed from: d  reason: collision with root package name */
    public Method f3390d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3391e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3392f = false;

    public d(ActionMode.Callback callback, TextView textView) {
        this.f3388a = callback;
        this.b = textView;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f3388a.onActionItemClicked(actionMode, menuItem);
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f3388a.onCreateActionMode(actionMode, menu);
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        this.f3388a.onDestroyActionMode(actionMode);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[ExcHandler: IllegalAccessException | NoSuchMethodException | InvocationTargetException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:16:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x009f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPrepareActionMode(android.view.ActionMode r13, android.view.Menu r14) {
        /*
        // Method dump skipped, instructions count: 304
        */
        throw new UnsupportedOperationException("Method not decompiled: d.g.m.d.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
    }
}
