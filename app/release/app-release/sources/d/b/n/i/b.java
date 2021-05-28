package d.b.n.i;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import d.b.n.i.o;
import d.b.n.i.p;
import d.b.o.c;
import java.util.ArrayList;

public abstract class b implements o {

    /* renamed from: c  reason: collision with root package name */
    public Context f2781c;

    /* renamed from: d  reason: collision with root package name */
    public Context f2782d;

    /* renamed from: e  reason: collision with root package name */
    public h f2783e;

    /* renamed from: f  reason: collision with root package name */
    public LayoutInflater f2784f;

    /* renamed from: g  reason: collision with root package name */
    public o.a f2785g;

    /* renamed from: h  reason: collision with root package name */
    public int f2786h;
    public int i;
    public p j;

    public b(Context context, int i2, int i3) {
        this.f2781c = context;
        this.f2784f = LayoutInflater.from(context);
        this.f2786h = i2;
        this.i = i3;
    }

    public View a(j jVar, View view, ViewGroup viewGroup) {
        p.a aVar = view instanceof p.a ? (p.a) view : (p.a) this.f2784f.inflate(this.i, viewGroup, false);
        c cVar = (c) this;
        aVar.a(jVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) cVar.j);
        if (cVar.z == null) {
            cVar.z = new c.b();
        }
        actionMenuItemView.setPopupCallback(cVar.z);
        return (View) aVar;
    }

    @Override // d.b.n.i.o
    public void a(o.a aVar) {
        this.f2785g = aVar;
    }

    @Override // d.b.n.i.o
    public boolean a(h hVar, j jVar) {
        return false;
    }

    @Override // d.b.n.i.o
    public boolean a(t tVar) {
        o.a aVar = this.f2785g;
        if (aVar != null) {
            return aVar.a(tVar);
        }
        return false;
    }

    @Override // d.b.n.i.o
    public boolean b(h hVar, j jVar) {
        return false;
    }

    @Override // d.b.n.i.o
    public void a(boolean z) {
        int i2;
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) this.j;
        if (viewGroup != null) {
            h hVar = this.f2783e;
            if (hVar != null) {
                hVar.a();
                ArrayList<j> d2 = this.f2783e.d();
                int size = d2.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    j jVar = d2.get(i3);
                    if (jVar.d()) {
                        View childAt = viewGroup.getChildAt(i2);
                        j itemData = childAt instanceof p.a ? ((p.a) childAt).getItemData() : null;
                        View a2 = a(jVar, childAt, viewGroup);
                        if (jVar != itemData) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.j).addView(a2, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == ((c) this).k) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i2);
                    z2 = true;
                }
                if (!z2) {
                    i2++;
                }
            }
        }
    }
}
