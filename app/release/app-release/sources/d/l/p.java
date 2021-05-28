package d.l;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import d.l.e;

public class p extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    public a f3566c;

    public interface a {
        void a();

        void onCreate();

        void onResume();
    }

    public static class b implements Application.ActivityLifecycleCallbacks {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            p.a(activity, e.a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            p.a(activity, e.a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            p.a(activity, e.a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            p.a(activity, e.a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            p.a(activity, e.a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            p.a(activity, e.a.ON_STOP);
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

    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new b());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new p(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static void a(Activity activity, e.a aVar) {
        if (activity instanceof j) {
            ((j) activity).a().a(aVar);
        } else if (activity instanceof h) {
            e a2 = ((h) activity).a();
            if (a2 instanceof i) {
                ((i) a2).a(aVar);
            }
        }
    }

    public final void a(e.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), aVar);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a aVar = this.f3566c;
        if (aVar != null) {
            aVar.onCreate();
        }
        a(e.a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        a(e.a.ON_DESTROY);
        this.f3566c = null;
    }

    public void onPause() {
        super.onPause();
        a(e.a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        a aVar = this.f3566c;
        if (aVar != null) {
            aVar.onResume();
        }
        a(e.a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        a aVar = this.f3566c;
        if (aVar != null) {
            aVar.a();
        }
        a(e.a.ON_START);
    }

    public void onStop() {
        super.onStop();
        a(e.a.ON_STOP);
    }
}
