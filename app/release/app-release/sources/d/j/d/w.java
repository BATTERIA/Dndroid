package d.j.d;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;

@SuppressLint({"BanParcelableUsage"})
public final class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final String f3521c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3522d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3523e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3524f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3525g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3526h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final Bundle l;
    public final boolean m;
    public final int n;
    public Bundle o;

    public static class a implements Parcelable.Creator<w> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public w createFromParcel(Parcel parcel) {
            return new w(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public w[] newArray(int i) {
            return new w[i];
        }
    }

    public w(Parcel parcel) {
        this.f3521c = parcel.readString();
        this.f3522d = parcel.readString();
        boolean z = true;
        this.f3523e = parcel.readInt() != 0;
        this.f3524f = parcel.readInt();
        this.f3525g = parcel.readInt();
        this.f3526h = parcel.readString();
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readInt() != 0;
        this.l = parcel.readBundle();
        this.m = parcel.readInt() == 0 ? false : z;
        this.o = parcel.readBundle();
        this.n = parcel.readInt();
    }

    public w(Fragment fragment) {
        this.f3521c = fragment.getClass().getName();
        this.f3522d = fragment.f2395g;
        this.f3523e = fragment.o;
        this.f3524f = fragment.x;
        this.f3525g = fragment.y;
        this.f3526h = fragment.z;
        this.i = fragment.C;
        this.j = fragment.n;
        this.k = fragment.B;
        this.l = fragment.f2396h;
        this.m = fragment.A;
        this.n = fragment.R.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f3521c);
        sb.append(" (");
        sb.append(this.f3522d);
        sb.append(")}:");
        if (this.f3523e) {
            sb.append(" fromLayout");
        }
        if (this.f3525g != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3525g));
        }
        String str = this.f3526h;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f3526h);
        }
        if (this.i) {
            sb.append(" retainInstance");
        }
        if (this.j) {
            sb.append(" removing");
        }
        if (this.k) {
            sb.append(" detached");
        }
        if (this.m) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f3521c);
        parcel.writeString(this.f3522d);
        parcel.writeInt(this.f3523e ? 1 : 0);
        parcel.writeInt(this.f3524f);
        parcel.writeInt(this.f3525g);
        parcel.writeString(this.f3526h);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeBundle(this.l);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeBundle(this.o);
        parcel.writeInt(this.n);
    }
}
