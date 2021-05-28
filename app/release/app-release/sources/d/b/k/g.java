package d.b.k;

import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import d.b.a;

public class g extends r implements DialogInterface {

    /* renamed from: e  reason: collision with root package name */
    public final AlertController f2659e = new AlertController(getContext(), this, getWindow());

    public g(Context context, int i) {
        super(context, a(context, i));
    }

    public static int a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02df, code lost:
        if (r4 != null) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02e8, code lost:
        if (r4 != null) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0349, code lost:
        if (r9 != null) goto L_0x039d;
     */
    @Override // d.b.k.r
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r17) {
        /*
        // Method dump skipped, instructions count: 951
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.k.g.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2659e.A;
        if (nestedScrollView != null && nestedScrollView.a(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2659e.A;
        if (nestedScrollView != null && nestedScrollView.a(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // d.b.k.r, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f2659e;
        alertController.f2248e = charSequence;
        TextView textView = alertController.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
