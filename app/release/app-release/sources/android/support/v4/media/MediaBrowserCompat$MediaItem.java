package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final int f2196c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaDescriptionCompat f2197d;

    public static class a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public MediaBrowserCompat$MediaItem[] newArray(int i) {
            return new MediaBrowserCompat$MediaItem[i];
        }
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f2196c = parcel.readInt();
        this.f2197d = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{" + "mFlags=" + this.f2196c + ", mDescription=" + this.f2197d + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2196c);
        this.f2197d.writeToParcel(parcel, i);
    }
}
