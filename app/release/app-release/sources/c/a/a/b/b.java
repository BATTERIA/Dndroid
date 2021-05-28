package c.a.a.b;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import c.a.a.b.a;

@SuppressLint({"BanParcelableUsage"})
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final Handler f2584c = null;

    /* renamed from: d  reason: collision with root package name */
    public a f2585d;

    public static class a implements Parcelable.Creator<b> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    /* renamed from: c.a.a.b.b$b  reason: collision with other inner class name */
    public class BinderC0085b extends a.AbstractBinderC0083a {
        public BinderC0085b() {
        }

        @Override // c.a.a.b.a
        public void a(int i, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f2584c;
            if (handler != null) {
                handler.post(new c(i, bundle));
            } else {
                bVar.a(i, bundle);
            }
        }
    }

    public class c implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final int f2587c;

        /* renamed from: d  reason: collision with root package name */
        public final Bundle f2588d;

        public c(int i, Bundle bundle) {
            this.f2587c = i;
            this.f2588d = bundle;
        }

        public void run() {
            b.this.a(this.f2587c, this.f2588d);
        }
    }

    public b(Parcel parcel) {
        this.f2585d = a.AbstractBinderC0083a.a(parcel.readStrongBinder());
    }

    public void a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f2585d == null) {
                this.f2585d = new BinderC0085b();
            }
            parcel.writeStrongBinder(this.f2585d.asBinder());
        }
    }
}
