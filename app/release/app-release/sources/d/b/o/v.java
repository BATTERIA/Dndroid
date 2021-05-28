package d.b.o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import d.g.l.o;
import d.g.l.p;

public class v extends Spinner implements o {
    public static final int[] k = {16843505};

    /* renamed from: c  reason: collision with root package name */
    public final e f2988c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f2989d;

    /* renamed from: e  reason: collision with root package name */
    public e0 f2990e;

    /* renamed from: f  reason: collision with root package name */
    public SpinnerAdapter f2991f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2992g;

    /* renamed from: h  reason: collision with root package name */
    public b f2993h;
    public int i;
    public final Rect j = new Rect();

    public static class a implements ListAdapter, SpinnerAdapter {

        /* renamed from: c  reason: collision with root package name */
        public SpinnerAdapter f2994c;

        /* renamed from: d  reason: collision with root package name */
        public ListAdapter f2995d;

        public a(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f2994c = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f2995d = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof p0) {
                p0 p0Var = (p0) spinnerAdapter;
                if (p0Var.getDropDownViewTheme() == null) {
                    p0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f2995d;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f2994c;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f2994c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f2994c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f2994c;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f2994c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f2994c;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f2995d;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2994c;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2994c;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class b extends h0 {
        public CharSequence H;
        public ListAdapter I;
        public final Rect J = new Rect();

        public class a implements AdapterView.OnItemClickListener {
            public a(v vVar) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                v.this.setSelection(i);
                if (v.this.getOnItemClickListener() != null) {
                    b bVar = b.this;
                    v.this.performItemClick(view, i, bVar.I.getItemId(i));
                }
                b.this.dismiss();
            }
        }

        /* renamed from: d.b.o.v$b$b  reason: collision with other inner class name */
        public class ViewTreeObserver$OnGlobalLayoutListenerC0093b implements ViewTreeObserver.OnGlobalLayoutListener {
            public ViewTreeObserver$OnGlobalLayoutListenerC0093b() {
            }

            public void onGlobalLayout() {
                b bVar = b.this;
                v vVar = v.this;
                if (bVar != null) {
                    if (!(p.p(vVar) && vVar.getGlobalVisibleRect(bVar.J))) {
                        b.this.dismiss();
                        return;
                    }
                    b.this.e();
                    b.super.a();
                    return;
                }
                throw null;
            }
        }

        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f2998c;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f2998c = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = v.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f2998c);
                }
            }
        }

        public b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i, 0);
            this.t = v.this;
            a(true);
            this.r = 0;
            this.u = new a(v.this);
        }

        @Override // d.b.n.i.r, d.b.o.h0
        public void a() {
            ViewTreeObserver viewTreeObserver;
            boolean c2 = c();
            e();
            this.D.setInputMethodMode(2);
            super.a();
            this.f2914e.setChoiceMode(1);
            int selectedItemPosition = v.this.getSelectedItemPosition();
            c0 c0Var = this.f2914e;
            if (c() && c0Var != null) {
                c0Var.setListSelectionHidden(false);
                c0Var.setSelection(selectedItemPosition);
                if (c0Var.getChoiceMode() != 0) {
                    c0Var.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!c2 && (viewTreeObserver = v.this.getViewTreeObserver()) != null) {
                ViewTreeObserver$OnGlobalLayoutListenerC0093b bVar = new ViewTreeObserver$OnGlobalLayoutListenerC0093b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                this.D.setOnDismissListener(new c(bVar));
            }
        }

        @Override // d.b.o.h0
        public void a(ListAdapter listAdapter) {
            super.a(listAdapter);
            this.I = listAdapter;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0093  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void e() {
            /*
            // Method dump skipped, instructions count: 152
            */
            throw new UnsupportedOperationException("Method not decompiled: d.b.o.v.b.e():void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        if (r5 != null) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.o.v.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        drawable.getPadding(this.j);
        Rect rect = this.j;
        return i3 + rect.left + rect.right;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f2988c;
        if (eVar != null) {
            eVar.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        b bVar = this.f2993h;
        if (bVar != null) {
            return bVar.f2917h;
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        b bVar = this.f2993h;
        if (bVar == null) {
            return super.getDropDownVerticalOffset();
        }
        if (!bVar.k) {
            return 0;
        }
        return bVar.i;
    }

    public int getDropDownWidth() {
        return this.f2993h != null ? this.i : super.getDropDownWidth();
    }

    public Drawable getPopupBackground() {
        b bVar = this.f2993h;
        return bVar != null ? bVar.b() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        if (this.f2993h != null) {
            return this.f2989d;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    public CharSequence getPrompt() {
        b bVar = this.f2993h;
        if (bVar != null) {
            return bVar.H;
        }
        return super.getPrompt();
    }

    @Override // d.g.l.o
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f2988c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // d.g.l.o
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f2988c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f2993h;
        if (bVar != null && bVar.c()) {
            this.f2993h.dismiss();
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f2993h != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        e0 e0Var = this.f2990e;
        if (e0Var == null || !e0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        b bVar = this.f2993h;
        if (bVar == null) {
            return super.performClick();
        }
        if (bVar.c()) {
            return true;
        }
        this.f2993h.a();
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2992g) {
            this.f2991f = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f2993h != null) {
            Context context = this.f2989d;
            if (context == null) {
                context = getContext();
            }
            this.f2993h.a(new a(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f2988c;
        if (eVar != null) {
            eVar.d();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f2988c;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    public void setDropDownHorizontalOffset(int i2) {
        b bVar = this.f2993h;
        if (bVar != null) {
            bVar.f2917h = i2;
        } else {
            super.setDropDownHorizontalOffset(i2);
        }
    }

    public void setDropDownVerticalOffset(int i2) {
        b bVar = this.f2993h;
        if (bVar != null) {
            bVar.i = i2;
            bVar.k = true;
            return;
        }
        super.setDropDownVerticalOffset(i2);
    }

    public void setDropDownWidth(int i2) {
        if (this.f2993h != null) {
            this.i = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        b bVar = this.f2993h;
        if (bVar != null) {
            bVar.D.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(d.b.l.a.a.c(getPopupContext(), i2));
    }

    public void setPrompt(CharSequence charSequence) {
        b bVar = this.f2993h;
        if (bVar != null) {
            bVar.H = charSequence;
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // d.g.l.o
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f2988c;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // d.g.l.o
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f2988c;
        if (eVar != null) {
            eVar.a(mode);
        }
    }
}
