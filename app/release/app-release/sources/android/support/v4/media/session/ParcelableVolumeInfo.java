package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public int f2213c;

    /* renamed from: d  reason: collision with root package name */
    public int f2214d;

    /* renamed from: e  reason: collision with root package name */
    public int f2215e;

    /* renamed from: f  reason: collision with root package name */
    public int f2216f;

    /* renamed from: g  reason: collision with root package name */
    public int f2217g;

    public static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f2213c = parcel.readInt();
        this.f2215e = parcel.readInt();
        this.f2216f = parcel.readInt();
        this.f2217g = parcel.readInt();
        this.f2214d = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2213c);
        parcel.writeInt(this.f2215e);
        parcel.writeInt(this.f2216f);
        parcel.writeInt(this.f2217g);
        parcel.writeInt(this.f2214d);
    }
}
