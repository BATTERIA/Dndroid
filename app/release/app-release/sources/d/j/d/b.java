package d.j.d;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import d.j.d.z;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final int[] f3407c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<String> f3408d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f3409e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f3410f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3411g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3412h;
    public final int i;
    public final int j;
    public final CharSequence k;
    public final int l;
    public final CharSequence m;
    public final ArrayList<String> n;
    public final ArrayList<String> o;
    public final boolean p;

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

    public b(Parcel parcel) {
        this.f3407c = parcel.createIntArray();
        this.f3408d = parcel.createStringArrayList();
        this.f3409e = parcel.createIntArray();
        this.f3410f = parcel.createIntArray();
        this.f3411g = parcel.readInt();
        this.f3412h = parcel.readString();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.readInt();
        this.m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.n = parcel.createStringArrayList();
        this.o = parcel.createStringArrayList();
        this.p = parcel.readInt() != 0;
    }

    public b(a aVar) {
        int size = aVar.f3530a.size();
        this.f3407c = new int[(size * 5)];
        if (aVar.f3535g) {
            this.f3408d = new ArrayList<>(size);
            this.f3409e = new int[size];
            this.f3410f = new int[size];
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                z.a aVar2 = aVar.f3530a.get(i2);
                int i4 = i3 + 1;
                this.f3407c[i3] = aVar2.f3537a;
                ArrayList<String> arrayList = this.f3408d;
                Fragment fragment = aVar2.b;
                arrayList.add(fragment != null ? fragment.f2395g : null);
                int[] iArr = this.f3407c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f3538c;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f3539d;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f3540e;
                iArr[i7] = aVar2.f3541f;
                this.f3409e[i2] = aVar2.f3542g.ordinal();
                this.f3410f[i2] = aVar2.f3543h.ordinal();
                i2++;
                i3 = i7 + 1;
            }
            this.f3411g = aVar.f3534f;
            this.f3412h = aVar.f3536h;
            this.i = aVar.s;
            this.j = aVar.i;
            this.k = aVar.j;
            this.l = aVar.k;
            this.m = aVar.l;
            this.n = aVar.m;
            this.o = aVar.n;
            this.p = aVar.o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f3407c);
        parcel.writeStringList(this.f3408d);
        parcel.writeIntArray(this.f3409e);
        parcel.writeIntArray(this.f3410f);
        parcel.writeInt(this.f3411g);
        parcel.writeString(this.f3412h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeInt(this.l);
        TextUtils.writeToParcel(this.m, parcel, 0);
        parcel.writeStringList(this.n);
        parcel.writeStringList(this.o);
        parcel.writeInt(this.p ? 1 : 0);
    }
}
