package d.b.o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import d.b.n.i.g;
import d.b.n.i.h;
import d.b.n.i.j;
import java.lang.reflect.Method;

public class j0 extends h0 implements i0 {
    public static Method I;
    public i0 H;

    public static class a extends c0 {
        public final int q;
        public final int r;
        public i0 s;
        public MenuItem t;

        public a(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.q = 21;
                this.r = 22;
                return;
            }
            this.q = 22;
            this.r = 21;
        }

        @Override // d.b.o.c0
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            int pointToPosition;
            int i2;
            if (this.s != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                g gVar = (g) adapter;
                j jVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < gVar.getCount()) {
                    jVar = gVar.getItem(i2);
                }
                MenuItem menuItem = this.t;
                if (menuItem != jVar) {
                    h hVar = gVar.f2812c;
                    if (menuItem != null) {
                        this.s.b(hVar, menuItem);
                    }
                    this.t = jVar;
                    if (jVar != null) {
                        this.s.a(hVar, jVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.q) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.r) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((g) getAdapter()).f2812c.a(false);
                return true;
            }
        }

        public void setHoverListener(i0 i0Var) {
            this.s = i0Var;
        }

        @Override // d.b.o.c0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            I = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public j0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // d.b.o.h0
    public c0 a(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    @Override // d.b.o.i0
    public void a(h hVar, MenuItem menuItem) {
        i0 i0Var = this.H;
        if (i0Var != null) {
            i0Var.a(hVar, menuItem);
        }
    }

    @Override // d.b.o.i0
    public void b(h hVar, MenuItem menuItem) {
        i0 i0Var = this.H;
        if (i0Var != null) {
            i0Var.b(hVar, menuItem);
        }
    }
}
