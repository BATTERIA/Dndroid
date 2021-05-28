package d.b.k;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

public class f implements AdapterView.OnItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AlertController f2657c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AlertController.b f2658d;

    public f(AlertController.b bVar, AlertController alertController) {
        this.f2658d = bVar;
        this.f2657c = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f2658d.k.onClick(this.f2657c.b, i);
        if (!this.f2658d.m) {
            this.f2657c.b.dismiss();
        }
    }
}
