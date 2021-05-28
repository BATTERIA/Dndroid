package d.o.c;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class z extends RecyclerView.o {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f3671a;
    public final RecyclerView.q b = new a();

    public class a extends RecyclerView.q {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3672a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void a(RecyclerView recyclerView, int i) {
            if (i == 0 && this.f3672a) {
                this.f3672a = false;
                z.this.a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void a(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f3672a = true;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.f3671a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            androidx.recyclerview.widget.RecyclerView$m r0 = r0.getLayoutManager()
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            r1 = r4
            d.o.c.u r1 = (d.o.c.u) r1
            boolean r2 = r0.b()
            if (r2 == 0) goto L_0x001a
            d.o.c.s r2 = r1.b(r0)
            goto L_0x0024
        L_0x001a:
            boolean r2 = r0.a()
            if (r2 == 0) goto L_0x0029
            d.o.c.s r2 = r1.a(r0)
        L_0x0024:
            android.view.View r1 = r1.a(r0, r2)
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            if (r1 != 0) goto L_0x002d
            return
        L_0x002d:
            int[] r0 = r4.a(r0, r1)
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L_0x003b
            r2 = r0[r3]
            if (r2 == 0) goto L_0x0044
        L_0x003b:
            androidx.recyclerview.widget.RecyclerView r2 = r4.f3671a
            r1 = r0[r1]
            r0 = r0[r3]
            r2.e(r1, r0)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.o.c.z.a():void");
    }

    public abstract int[] a(RecyclerView.m mVar, View view);
}
