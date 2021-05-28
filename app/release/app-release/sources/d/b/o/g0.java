package d.b.o;

import android.view.View;
import android.widget.AdapterView;

public class g0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h0 f2906c;

    public g0(h0 h0Var) {
        this.f2906c = h0Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        c0 c0Var;
        if (i != -1 && (c0Var = this.f2906c.f2914e) != null) {
            c0Var.setListSelectionHidden(false);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
