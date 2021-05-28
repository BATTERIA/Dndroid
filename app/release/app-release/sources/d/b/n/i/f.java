package d.b.n.i;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.view.menu.ExpandedMenuView;
import d.b.k.g;
import d.b.n.i.o;
import d.b.n.i.p;
import java.util.ArrayList;

public class f implements o, AdapterView.OnItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    public Context f2804c;

    /* renamed from: d  reason: collision with root package name */
    public LayoutInflater f2805d;

    /* renamed from: e  reason: collision with root package name */
    public h f2806e;

    /* renamed from: f  reason: collision with root package name */
    public ExpandedMenuView f2807f;

    /* renamed from: g  reason: collision with root package name */
    public int f2808g;

    /* renamed from: h  reason: collision with root package name */
    public int f2809h = 0;
    public int i;
    public o.a j;
    public a k;

    public class a extends BaseAdapter {

        /* renamed from: c  reason: collision with root package name */
        public int f2810c = -1;

        public a() {
            a();
        }

        public void a() {
            h hVar = f.this.f2806e;
            j jVar = hVar.w;
            if (jVar != null) {
                hVar.a();
                ArrayList<j> arrayList = hVar.j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == jVar) {
                        this.f2810c = i;
                        return;
                    }
                }
            }
            this.f2810c = -1;
        }

        public int getCount() {
            h hVar = f.this.f2806e;
            hVar.a();
            int size = hVar.j.size() - f.this.f2808g;
            return this.f2810c < 0 ? size : size - 1;
        }

        public j getItem(int i) {
            h hVar = f.this.f2806e;
            hVar.a();
            ArrayList<j> arrayList = hVar.j;
            int i2 = i + f.this.f2808g;
            int i3 = this.f2810c;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayList.get(i2);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                f fVar = f.this;
                view = fVar.f2805d.inflate(fVar.i, viewGroup, false);
            }
            ((p.a) view).a(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public f(Context context, int i2) {
        this.i = i2;
        this.f2804c = context;
        this.f2805d = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.k == null) {
            this.k = new a();
        }
        return this.k;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // d.b.n.i.o
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r3, d.b.n.i.h r4) {
        /*
            r2 = this;
            int r0 = r2.f2809h
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f2809h
            r0.<init>(r3, r1)
            r2.f2804c = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L_0x0011:
            r2.f2805d = r3
            goto L_0x0023
        L_0x0014:
            android.content.Context r0 = r2.f2804c
            if (r0 == 0) goto L_0x0023
            r2.f2804c = r3
            android.view.LayoutInflater r0 = r2.f2805d
            if (r0 != 0) goto L_0x0023
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L_0x0011
        L_0x0023:
            r2.f2806e = r4
            d.b.n.i.f$a r3 = r2.k
            if (r3 == 0) goto L_0x002c
            r3.notifyDataSetChanged()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.n.i.f.a(android.content.Context, d.b.n.i.h):void");
    }

    @Override // d.b.n.i.o
    public void a(h hVar, boolean z) {
        o.a aVar = this.j;
        if (aVar != null) {
            aVar.a(hVar, z);
        }
    }

    @Override // d.b.n.i.o
    public void a(o.a aVar) {
        this.j = aVar;
    }

    @Override // d.b.n.i.o
    public void a(boolean z) {
        a aVar = this.k;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // d.b.n.i.o
    public boolean a(h hVar, j jVar) {
        return false;
    }

    @Override // d.b.n.i.o
    public boolean a(t tVar) {
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        i iVar = new i(tVar);
        h hVar = iVar.f2825c;
        Context context = hVar.f2818a;
        int a2 = g.a(context, 0);
        AlertController.b bVar = new AlertController.b(new ContextThemeWrapper(context, g.a(context, a2)));
        f fVar = new f(bVar.f2255a, d.b.g.abc_list_menu_item_layout);
        iVar.f2827e = fVar;
        fVar.j = iVar;
        h hVar2 = iVar.f2825c;
        hVar2.a(fVar, hVar2.f2818a);
        bVar.j = iVar.f2827e.a();
        bVar.k = iVar;
        View view = hVar.o;
        if (view != null) {
            bVar.f2260g = view;
        } else {
            bVar.f2257d = hVar.n;
            bVar.f2259f = hVar.m;
        }
        bVar.i = iVar;
        g gVar = new g(bVar.f2255a, a2);
        AlertController alertController = gVar.f2659e;
        View view2 = bVar.f2260g;
        if (view2 != null) {
            alertController.G = view2;
        } else {
            CharSequence charSequence = bVar.f2259f;
            if (charSequence != null) {
                alertController.f2248e = charSequence;
                TextView textView = alertController.E;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = bVar.f2257d;
            if (drawable != null) {
                alertController.C = drawable;
                alertController.B = 0;
                ImageView imageView = alertController.D;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    alertController.D.setImageDrawable(drawable);
                }
            }
            int i2 = bVar.f2256c;
            if (i2 != 0) {
                alertController.a(i2);
            }
            int i3 = bVar.f2258e;
            if (i3 != 0) {
                if (alertController != null) {
                    TypedValue typedValue = new TypedValue();
                    alertController.f2245a.getTheme().resolveAttribute(i3, typedValue, true);
                    alertController.a(typedValue.resourceId);
                } else {
                    throw null;
                }
            }
        }
        if (bVar.j != null) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.b.inflate(alertController.L, (ViewGroup) null);
            int i4 = alertController.O;
            ListAdapter listAdapter = bVar.j;
            if (listAdapter == null) {
                listAdapter = new AlertController.d(bVar.f2255a, i4, 16908308, null);
            }
            alertController.H = listAdapter;
            alertController.I = bVar.n;
            if (bVar.k != null) {
                recycleListView.setOnItemClickListener(new d.b.k.f(bVar, alertController));
            }
            alertController.f2250g = recycleListView;
        }
        gVar.setCancelable(bVar.f2261h);
        if (bVar.f2261h) {
            gVar.setCanceledOnTouchOutside(true);
        }
        gVar.setOnCancelListener(null);
        gVar.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = bVar.i;
        if (onKeyListener != null) {
            gVar.setOnKeyListener(onKeyListener);
        }
        iVar.f2826d = gVar;
        gVar.setOnDismissListener(iVar);
        WindowManager.LayoutParams attributes = iVar.f2826d.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        iVar.f2826d.show();
        o.a aVar = this.j;
        if (aVar != null) {
            aVar.a(tVar);
        }
        return true;
    }

    @Override // d.b.n.i.o
    public boolean b() {
        return false;
    }

    @Override // d.b.n.i.o
    public boolean b(h hVar, j jVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f2806e.a(this.k.getItem(i2), this, 0);
    }
}
