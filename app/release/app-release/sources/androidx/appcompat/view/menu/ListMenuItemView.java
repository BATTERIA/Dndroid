package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import d.b.a;
import d.b.f;
import d.b.g;
import d.b.h;
import d.b.n.i.j;
import d.b.n.i.p;
import d.b.o.t0;

public class ListMenuItemView extends LinearLayout implements p.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: c  reason: collision with root package name */
    public j f2276c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f2277d;

    /* renamed from: e  reason: collision with root package name */
    public RadioButton f2278e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f2279f;

    /* renamed from: g  reason: collision with root package name */
    public CheckBox f2280g;

    /* renamed from: h  reason: collision with root package name */
    public TextView f2281h;
    public ImageView i;
    public ImageView j;
    public LinearLayout k;
    public Drawable l;
    public int m;
    public Context n;
    public boolean o;
    public Drawable p;
    public boolean q;
    public LayoutInflater r;
    public boolean s;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        t0 a2 = t0.a(getContext(), attributeSet, d.b.j.MenuView, i2, 0);
        this.l = a2.b(d.b.j.MenuView_android_itemBackground);
        this.m = a2.f(d.b.j.MenuView_android_itemTextAppearance, -1);
        this.o = a2.a(d.b.j.MenuView_preserveIconSpacing, false);
        this.n = context;
        this.p = a2.b(d.b.j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, a.dropDownListViewStyle, 0);
        this.q = obtainStyledAttributes.hasValue(0);
        a2.b.recycle();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.r == null) {
            this.r = LayoutInflater.from(getContext());
        }
        return this.r;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // d.b.n.i.p.a
    public void a(j jVar, int i2) {
        CharSequence charSequence;
        String str;
        int i3;
        this.f2276c = jVar;
        int i4 = 0;
        setVisibility(jVar.isVisible() ? 0 : 8);
        if (c()) {
            charSequence = jVar.getTitleCondensed();
        } else {
            charSequence = jVar.f2831e;
        }
        setTitle(charSequence);
        setCheckable(jVar.isCheckable());
        boolean f2 = jVar.f();
        jVar.b();
        if (!f2 || !this.f2276c.f()) {
            i4 = 8;
        }
        if (i4 == 0) {
            TextView textView = this.f2281h;
            j jVar2 = this.f2276c;
            char b = jVar2.b();
            if (b == 0) {
                str = "";
            } else {
                Resources resources = jVar2.n.f2818a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(jVar2.n.f2818a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(h.abc_prepend_shortcut_label));
                }
                int i5 = jVar2.n.f() ? jVar2.k : jVar2.i;
                j.a(sb, i5, 65536, resources.getString(h.abc_menu_meta_shortcut_label));
                j.a(sb, i5, 4096, resources.getString(h.abc_menu_ctrl_shortcut_label));
                j.a(sb, i5, 2, resources.getString(h.abc_menu_alt_shortcut_label));
                j.a(sb, i5, 1, resources.getString(h.abc_menu_shift_shortcut_label));
                j.a(sb, i5, 4, resources.getString(h.abc_menu_sym_shortcut_label));
                j.a(sb, i5, 8, resources.getString(h.abc_menu_function_shortcut_label));
                if (b == '\b') {
                    i3 = h.abc_menu_delete_shortcut_label;
                } else if (b == '\n') {
                    i3 = h.abc_menu_enter_shortcut_label;
                } else if (b != ' ') {
                    sb.append(b);
                    str = sb.toString();
                } else {
                    i3 = h.abc_menu_space_shortcut_label;
                }
                sb.append(resources.getString(i3));
                str = sb.toString();
            }
            textView.setText(str);
        }
        if (this.f2281h.getVisibility() != i4) {
            this.f2281h.setVisibility(i4);
        }
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.q);
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.j;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.j.getLayoutParams();
            rect.top = this.j.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    public final void b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(g.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f2278e = radioButton;
        LinearLayout linearLayout = this.k;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    @Override // d.b.n.i.p.a
    public boolean c() {
        return false;
    }

    @Override // d.b.n.i.p.a
    public j getItemData() {
        return this.f2276c;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        d.g.l.p.a(this, this.l);
        TextView textView = (TextView) findViewById(f.title);
        this.f2279f = textView;
        int i2 = this.m;
        if (i2 != -1) {
            textView.setTextAppearance(this.n, i2);
        }
        this.f2281h = (TextView) findViewById(f.shortcut);
        ImageView imageView = (ImageView) findViewById(f.submenuarrow);
        this.i = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.p);
        }
        this.j = (ImageView) findViewById(f.group_divider);
        this.k = (LinearLayout) findViewById(f.content);
    }

    public void onMeasure(int i2, int i3) {
        if (this.f2277d != null && this.o) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2277d.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f2278e != null || this.f2280g != null) {
            if (this.f2276c.e()) {
                if (this.f2278e == null) {
                    b();
                }
                compoundButton2 = this.f2278e;
                compoundButton = this.f2280g;
            } else {
                if (this.f2280g == null) {
                    a();
                }
                compoundButton2 = this.f2280g;
                compoundButton = this.f2278e;
            }
            if (z) {
                compoundButton2.setChecked(this.f2276c.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f2280g;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f2278e;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f2276c.e()) {
            if (this.f2278e == null) {
                b();
            }
            compoundButton = this.f2278e;
        } else {
            if (this.f2280g == null) {
                a();
            }
            compoundButton = this.f2280g;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.s = z;
        this.o = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.j;
        if (imageView != null) {
            imageView.setVisibility((this.q || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f2276c.n.s || this.s;
        if (!z && !this.o) {
            return;
        }
        if (this.f2277d != null || drawable != null || this.o) {
            if (this.f2277d == null) {
                ImageView imageView = (ImageView) getInflater().inflate(g.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f2277d = imageView;
                LinearLayout linearLayout = this.k;
                if (linearLayout != null) {
                    linearLayout.addView(imageView, 0);
                } else {
                    addView(imageView, 0);
                }
            }
            if (drawable != null || this.o) {
                ImageView imageView2 = this.f2277d;
                if (!z) {
                    drawable = null;
                }
                imageView2.setImageDrawable(drawable);
                if (this.f2277d.getVisibility() != 0) {
                    this.f2277d.setVisibility(0);
                    return;
                }
                return;
            }
            this.f2277d.setVisibility(8);
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i2;
        if (charSequence != null) {
            this.f2279f.setText(charSequence);
            if (this.f2279f.getVisibility() != 0) {
                textView = this.f2279f;
                i2 = 0;
            } else {
                return;
            }
        } else {
            i2 = 8;
            if (this.f2279f.getVisibility() != 8) {
                textView = this.f2279f;
            } else {
                return;
            }
        }
        textView.setVisibility(i2);
    }

    public final void a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f2280g = checkBox;
        LinearLayout linearLayout = this.k;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }
}
