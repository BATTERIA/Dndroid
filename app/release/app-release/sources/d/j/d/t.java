package d.j.d;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<w> f3506c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<String> f3507d;

    /* renamed from: e  reason: collision with root package name */
    public b[] f3508e;

    /* renamed from: f  reason: collision with root package name */
    public int f3509f;

    /* renamed from: g  reason: collision with root package name */
    public String f3510g = null;

    public static class a implements Parcelable.Creator<t> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public t createFromParcel(Parcel parcel) {
            return new t(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public t[] newArray(int i) {
            return new t[i];
        }
    }

    public t() {
    }

    public t(Parcel parcel) {
        this.f3506c = parcel.createTypedArrayList(w.CREATOR);
        this.f3507d = parcel.createStringArrayList();
        this.f3508e = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f3509f = parcel.readInt();
        this.f3510g = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f3506c);
        parcel.writeStringList(this.f3507d);
        parcel.writeTypedArray(this.f3508e, i);
        parcel.writeInt(this.f3509f);
        parcel.writeString(this.f3510g);
    }
}
