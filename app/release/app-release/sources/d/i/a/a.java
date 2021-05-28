package d.i.a;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: d  reason: collision with root package name */
    public static final a f3402d = new C0109a();

    /* renamed from: c  reason: collision with root package name */
    public final Parcelable f3403c;

    /* renamed from: d.i.a.a$a  reason: collision with other inner class name */
    public static class C0109a extends a {
        public C0109a() {
            super((C0109a) null);
        }
    }

    public static class b implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return a.f3402d;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new a[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f3402d;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f3403c = readParcelable == null ? f3402d : readParcelable;
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f3403c = parcelable == f3402d ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public /* synthetic */ a(C0109a aVar) {
        this.f3403c = null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3403c, i);
    }
}
