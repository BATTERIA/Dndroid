package e.e.a.n.d.d.e;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.Random;

public class b extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    public SparseArray<a> f4357c = new SparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    public Random f4358d = new Random();

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        a aVar = this.f4357c.get(i);
        this.f4357c.remove(i);
        if (aVar != null) {
            aVar.a(i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }
}
