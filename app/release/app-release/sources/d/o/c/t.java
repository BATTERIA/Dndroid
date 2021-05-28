package d.o.c;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class t extends o {
    public final /* synthetic */ u o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(u uVar, Context context) {
        super(context);
        this.o = uVar;
    }

    @Override // d.o.c.o
    public float a(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }

    @Override // d.o.c.o, androidx.recyclerview.widget.RecyclerView.w
    public void a(View view, RecyclerView.x xVar, RecyclerView.w.a aVar) {
        u uVar = this.o;
        int[] a2 = uVar.a(uVar.f3671a.getLayoutManager(), view);
        int i = a2[0];
        int i2 = a2[1];
        double b = (double) b(Math.max(Math.abs(i), Math.abs(i2)));
        Double.isNaN(b);
        Double.isNaN(b);
        Double.isNaN(b);
        int ceil = (int) Math.ceil(b / 0.3356d);
        if (ceil > 0) {
            aVar.a(i, i2, ceil, this.j);
        }
    }

    @Override // d.o.c.o
    public int b(int i) {
        return Math.min(100, super.b(i));
    }
}
