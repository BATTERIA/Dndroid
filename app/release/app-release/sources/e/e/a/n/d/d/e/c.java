package e.e.a.n.d.d.e;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import d.j.d.q;
import java.util.Random;

public class c extends Fragment {
    public SparseArray<a> X = new SparseArray<>();
    public Random Y = new Random();

    @Override // androidx.fragment.app.Fragment
    public void a(int i, int i2, Intent intent) {
        a aVar = this.X.get(i);
        this.X.remove(i);
        if (aVar != null) {
            aVar.a(i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        this.C = true;
        q qVar = this.t;
        if (qVar != null) {
            qVar.b(this);
        } else {
            this.D = true;
        }
    }
}
