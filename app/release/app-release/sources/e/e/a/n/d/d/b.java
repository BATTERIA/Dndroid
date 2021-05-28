package e.e.a.n.d.d;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import e.c.a.b.l;
import java.util.Stack;

public class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public Stack<Activity> f4354a = new Stack<>();

    /* renamed from: e.e.a.n.d.d.b$b  reason: collision with other inner class name */
    public static class C0133b {

        /* renamed from: a  reason: collision with root package name */
        public static b f4355a = new b(null);
    }

    public /* synthetic */ b(a aVar) {
    }

    public final String a(Activity activity) {
        String str = null;
        if (activity == null) {
            return null;
        }
        if (activity.getIntent() != null) {
            str = activity.getIntent().getStringExtra("PAGE_ID");
        }
        return str == null ? activity.toString() : str;
    }

    public final void a(Stack<Activity> stack) {
        l.f.a("HummerNative", "----------- stack start -----------");
        for (int size = stack.size() - 1; size >= 0; size += -1) {
            Activity activity = stack.get(size);
            l.f.a("HummerNative", "|\t" + activity + " -> " + a(activity));
        }
        l.f.a("HummerNative", "----------- stack end -----------");
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f4354a.push(activity);
        if (e.e.a.q.d.b.f4498a) {
            a(this.f4354a);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        if (!this.f4354a.isEmpty()) {
            this.f4354a.remove(activity);
        }
        if (e.e.a.q.d.b.f4498a) {
            a(this.f4354a);
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
