package d.g.d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class a extends d.g.e.a {

    /* renamed from: d.g.d.a$a  reason: collision with other inner class name */
    public interface AbstractC0098a {
    }

    public static AbstractC0098a a() {
        return null;
    }

    public static void a(Activity activity) {
        activity.finishAffinity();
    }

    public static void a(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }
}
