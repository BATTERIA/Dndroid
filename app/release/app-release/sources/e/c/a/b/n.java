package e.c.a.b;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.blankj.utilcode.util.UtilsTransActivity;
import e.c.a.b.l;
import e.e.a.n.c.c.h;
import java.util.List;
import java.util.Set;

public final class n {
    public static n k;
    public static d l;
    public static d m;

    /* renamed from: a  reason: collision with root package name */
    public String[] f3806a;
    public b b;

    /* renamed from: c  reason: collision with root package name */
    public d f3807c;

    /* renamed from: d  reason: collision with root package name */
    public a f3808d;

    /* renamed from: e  reason: collision with root package name */
    public e f3809e;

    /* renamed from: f  reason: collision with root package name */
    public Set<String> f3810f;

    /* renamed from: g  reason: collision with root package name */
    public List<String> f3811g;

    /* renamed from: h  reason: collision with root package name */
    public List<String> f3812h;
    public List<String> i;
    public List<String> j;

    public interface a {
        void a(List<String> list);

        void a(List<String> list, List<String> list2);
    }

    public interface b {

        public interface a {
        }

        void a(UtilsTransActivity utilsTransActivity, a aVar);
    }

    public static final class c extends UtilsTransActivity.a {

        /* renamed from: a  reason: collision with root package name */
        public static int f3813a = -1;
        public static c b = new c();

        public static class a implements t<Intent> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f3814a;

            public a(int i) {
                this.f3814a = i;
            }
        }

        public static void a(int i) {
            UtilsTransActivity.a(new a(i), b);
        }

        public final void a(Activity activity) {
            List<String> list = n.k.f3811g;
            if (list != null) {
                int size = list.size();
                if (size <= 0) {
                    activity.finish();
                } else {
                    activity.requestPermissions((String[]) n.k.f3811g.toArray(new String[size]), 1);
                }
            }
        }
    }

    public interface d {
    }

    public interface e {
        void a(Activity activity);
    }

    public n(String... strArr) {
        this.f3806a = strArr;
        k = this;
    }

    public static boolean a(String str) {
        return Build.VERSION.SDK_INT < 23 || d.g.e.a.a(l.f.b(), str) == 0;
    }

    public static void b() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        StringBuilder a2 = e.a.a.a.a.a("package:");
        a2.append(l.f.b().getPackageName());
        intent.setData(Uri.parse(a2.toString()));
        if (w.a(intent)) {
            l.f.b().startActivity(intent.addFlags(268435456));
        }
    }

    public final void a() {
        if (this.f3807c != null) {
            if (this.i.isEmpty()) {
                ((h) this.f3807c).b();
            } else {
                ((h) this.f3807c).a();
            }
            this.f3807c = null;
        }
        if (this.f3808d != null) {
            if (this.f3811g.size() == 0 || this.f3812h.size() > 0) {
                this.f3808d.a(this.f3812h);
            }
            if (!this.i.isEmpty()) {
                this.f3808d.a(this.j, this.i);
            }
            this.f3808d = null;
        }
        this.b = null;
        this.f3809e = null;
    }

    public final void a(Activity activity) {
        List<String> list;
        for (String str : this.f3811g) {
            if (a(str)) {
                list = this.f3812h;
            } else {
                this.i.add(str);
                if (!activity.shouldShowRequestPermissionRationale(str)) {
                    list = this.j;
                }
            }
            list.add(str);
        }
    }
}
