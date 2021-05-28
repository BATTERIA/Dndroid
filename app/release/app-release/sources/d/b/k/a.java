package d.b.k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import d.b.j;
import d.b.n.a;

public abstract class a {

    /* renamed from: d.b.k.a$a  reason: collision with other inner class name */
    public static class C0086a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f2648a;

        public C0086a(int i, int i2) {
            super(i, i2);
            this.f2648a = 0;
            this.f2648a = 8388627;
        }

        public C0086a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2648a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionBarLayout);
            this.f2648a = obtainStyledAttributes.getInt(j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0086a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2648a = 0;
        }

        public C0086a(C0086a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f2648a = 0;
            this.f2648a = aVar.f2648a;
        }
    }

    public interface b {
        void a(boolean z);
    }

    @Deprecated
    public static abstract class c {
        public abstract void a();
    }

    public abstract d.b.n.a a(a.AbstractC0090a aVar);

    public abstract void a(Configuration configuration);

    public abstract void a(CharSequence charSequence);

    public abstract void a(boolean z);

    public abstract boolean a();

    public abstract boolean a(int i, KeyEvent keyEvent);

    public abstract int b();

    public abstract void b(boolean z);

    public abstract Context c();

    public abstract void c(boolean z);
}
