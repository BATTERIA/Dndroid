package d.g.l;

import android.view.View;
import d.g.l.p;

public final class q extends p.b<Boolean> {
    public q(int i, Class cls, int i2) {
        super(i, cls, i2);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // d.g.l.p.b
    public Boolean a(View view) {
        return Boolean.valueOf(view.isScreenReaderFocusable());
    }
}
