package d.s.a;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final DataSetObservable f3740a = new DataSetObservable();
    public DataSetObserver b;

    public abstract int a();

    public abstract Object a(ViewGroup viewGroup, int i);

    public void a(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.b = dataSetObserver;
        }
    }

    public void a(Parcelable parcelable, ClassLoader classLoader) {
    }

    public void a(ViewGroup viewGroup) {
    }

    public abstract void a(ViewGroup viewGroup, int i, Object obj);

    public abstract boolean a(View view, Object obj);

    public void b() {
        synchronized (this) {
            if (this.b != null) {
                this.b.onChanged();
            }
        }
        this.f3740a.notifyChanged();
    }

    public void b(ViewGroup viewGroup) {
    }

    public void b(ViewGroup viewGroup, int i, Object obj) {
    }

    public Parcelable c() {
        return null;
    }
}
