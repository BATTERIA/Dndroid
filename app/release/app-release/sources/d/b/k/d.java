package d.b.k;

import android.view.View;
import android.widget.AbsListView;
import androidx.appcompat.app.AlertController;

public class d implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f2653a;
    public final /* synthetic */ View b;

    public d(AlertController alertController, View view, View view2) {
        this.f2653a = view;
        this.b = view2;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AlertController.a(absListView, this.f2653a, this.b);
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
