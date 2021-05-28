package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final int f2206c;

    /* renamed from: d  reason: collision with root package name */
    public final float f2207d;

    public static class a implements Parcelable.Creator<RatingCompat> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    public RatingCompat(int i, float f2) {
        this.f2206c = i;
        this.f2207d = f2;
    }

    public int describeContents() {
        return this.f2206c;
    }

    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("Rating:style=");
        a2.append(this.f2206c);
        a2.append(" rating=");
        float f2 = this.f2207d;
        a2.append(f2 < 0.0f ? "unrated" : String.valueOf(f2));
        return a2.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2206c);
        parcel.writeFloat(this.f2207d);
    }
}
