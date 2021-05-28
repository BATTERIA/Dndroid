package d.b.n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import d.b.i;

public class c extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public int f2741a;
    public Resources.Theme b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f2742c;

    /* renamed from: d  reason: collision with root package name */
    public Resources f2743d;

    public c() {
        super(null);
    }

    public c(Context context, int i) {
        super(context);
        this.f2741a = i;
    }

    public final void a() {
        if (this.b == null) {
            this.b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.b.applyStyle(this.f2741a, true);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        if (this.f2743d == null) {
            this.f2743d = super.getResources();
        }
        return this.f2743d;
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2742c == null) {
            this.f2742c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2742c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.f2741a == 0) {
            this.f2741a = i.Theme_AppCompat_Light;
        }
        a();
        return this.b;
    }

    public void setTheme(int i) {
        if (this.f2741a != i) {
            this.f2741a = i;
            a();
        }
    }
}
