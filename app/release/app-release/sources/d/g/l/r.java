package d.g.l;

import android.view.View;
import d.g.l.p;

public final class r extends p.b<CharSequence> {
    public r(int i, Class cls, int i2, int i3) {
        super(i, cls, i2, i3);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // d.g.l.p.b
    public CharSequence a(View view) {
        return view.getAccessibilityPaneTitle();
    }
}
