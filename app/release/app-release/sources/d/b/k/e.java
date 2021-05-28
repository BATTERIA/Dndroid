package d.b.k;

import android.view.View;
import androidx.appcompat.app.AlertController;

public class e implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2654c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f2655d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AlertController f2656e;

    public e(AlertController alertController, View view, View view2) {
        this.f2656e = alertController;
        this.f2654c = view;
        this.f2655d = view2;
    }

    public void run() {
        AlertController.a(this.f2656e.f2250g, this.f2654c, this.f2655d);
    }
}
