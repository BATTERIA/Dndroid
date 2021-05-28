package d.g.l.z;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    /* renamed from: c  reason: collision with root package name */
    public final int f3361c;

    /* renamed from: d  reason: collision with root package name */
    public final b f3362d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3363e;

    public a(int i, b bVar, int i2) {
        this.f3361c = i;
        this.f3362d = bVar;
        this.f3363e = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3361c);
        b bVar = this.f3362d;
        bVar.f3365a.performAction(this.f3363e, bundle);
    }
}
