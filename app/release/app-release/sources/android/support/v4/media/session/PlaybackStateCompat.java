package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final int f2218c;

    /* renamed from: d  reason: collision with root package name */
    public final long f2219d;

    /* renamed from: e  reason: collision with root package name */
    public final long f2220e;

    /* renamed from: f  reason: collision with root package name */
    public final float f2221f;

    /* renamed from: g  reason: collision with root package name */
    public final long f2222g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2223h;
    public final CharSequence i;
    public final long j;
    public List<CustomAction> k;
    public final long l;
    public final Bundle m;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public final String f2224c;

        /* renamed from: d  reason: collision with root package name */
        public final CharSequence f2225d;

        /* renamed from: e  reason: collision with root package name */
        public final int f2226e;

        /* renamed from: f  reason: collision with root package name */
        public final Bundle f2227f;

        public static class a implements Parcelable.Creator<CustomAction> {
            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f2224c = parcel.readString();
            this.f2225d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f2226e = parcel.readInt();
            this.f2227f = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder a2 = e.a.a.a.a.a("Action:mName='");
            a2.append((Object) this.f2225d);
            a2.append(", mIcon=");
            a2.append(this.f2226e);
            a2.append(", mExtras=");
            a2.append(this.f2227f);
            return a2.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f2224c);
            TextUtils.writeToParcel(this.f2225d, parcel, i);
            parcel.writeInt(this.f2226e);
            parcel.writeBundle(this.f2227f);
        }
    }

    public static class a implements Parcelable.Creator<PlaybackStateCompat> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f2218c = parcel.readInt();
        this.f2219d = parcel.readLong();
        this.f2221f = parcel.readFloat();
        this.j = parcel.readLong();
        this.f2220e = parcel.readLong();
        this.f2222g = parcel.readLong();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.k = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.l = parcel.readLong();
        this.m = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f2223h = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f2218c + ", position=" + this.f2219d + ", buffered position=" + this.f2220e + ", speed=" + this.f2221f + ", updated=" + this.j + ", actions=" + this.f2222g + ", error code=" + this.f2223h + ", error message=" + this.i + ", custom actions=" + this.k + ", active item id=" + this.l + "}";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f2218c);
        parcel.writeLong(this.f2219d);
        parcel.writeFloat(this.f2221f);
        parcel.writeLong(this.j);
        parcel.writeLong(this.f2220e);
        parcel.writeLong(this.f2222g);
        TextUtils.writeToParcel(this.i, parcel, i2);
        parcel.writeTypedList(this.k);
        parcel.writeLong(this.l);
        parcel.writeBundle(this.m);
        parcel.writeInt(this.f2223h);
    }
}
