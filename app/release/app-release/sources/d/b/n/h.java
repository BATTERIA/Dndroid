package d.b.n;

import android.view.ActionMode;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;

public class h implements Window.Callback {

    /* renamed from: c  reason: collision with root package name */
    public final Window.Callback f2773c;

    public h(Window.Callback callback) {
        if (callback != null) {
            this.f2773c = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2773c.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2773c.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2773c.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2773c.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f2773c.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f2773c.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f2773c.onAttachedToWindow();
    }

    public View onCreatePanelView(int i) {
        return this.f2773c.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.f2773c.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2773c.onMenuItemSelected(i, menuItem);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f2773c.onPointerCaptureChanged(z);
    }

    public boolean onSearchRequested() {
        return this.f2773c.onSearchRequested();
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f2773c.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2773c.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f2773c.onWindowFocusChanged(z);
    }
}
