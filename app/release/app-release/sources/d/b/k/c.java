package d.b.k;

import android.view.View;
import androidx.appcompat.app.AlertController;

public class c implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2650c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f2651d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AlertController f2652e;

    public c(AlertController alertController, View view, View view2) {
        this.f2652e = alertController;
        this.f2650c = view;
        this.f2651d = view2;
    }

    public void run() {
        AlertController.a(this.f2652e.A, this.f2650c, this.f2651d);
    }
}
