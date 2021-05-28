package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final d.d.a<String, Integer> f2204d;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f2205c;

    public static class a implements Parcelable.Creator<MediaMetadataCompat> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        d.d.a<String, Integer> aVar = new d.d.a<>();
        f2204d = aVar;
        aVar.put("android.media.metadata.TITLE", 1);
        f2204d.put("android.media.metadata.ARTIST", 1);
        f2204d.put("android.media.metadata.DURATION", 0);
        f2204d.put("android.media.metadata.ALBUM", 1);
        f2204d.put("android.media.metadata.AUTHOR", 1);
        f2204d.put("android.media.metadata.WRITER", 1);
        f2204d.put("android.media.metadata.COMPOSER", 1);
        f2204d.put("android.media.metadata.COMPILATION", 1);
        f2204d.put("android.media.metadata.DATE", 1);
        f2204d.put("android.media.metadata.YEAR", 0);
        f2204d.put("android.media.metadata.GENRE", 1);
        f2204d.put("android.media.metadata.TRACK_NUMBER", 0);
        f2204d.put("android.media.metadata.NUM_TRACKS", 0);
        f2204d.put("android.media.metadata.DISC_NUMBER", 0);
        f2204d.put("android.media.metadata.ALBUM_ARTIST", 1);
        f2204d.put("android.media.metadata.ART", 2);
        f2204d.put("android.media.metadata.ART_URI", 1);
        f2204d.put("android.media.metadata.ALBUM_ART", 2);
        f2204d.put("android.media.metadata.ALBUM_ART_URI", 1);
        f2204d.put("android.media.metadata.USER_RATING", 3);
        f2204d.put("android.media.metadata.RATING", 3);
        f2204d.put("android.media.metadata.DISPLAY_TITLE", 1);
        f2204d.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        f2204d.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        f2204d.put("android.media.metadata.DISPLAY_ICON", 2);
        f2204d.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        f2204d.put("android.media.metadata.MEDIA_ID", 1);
        f2204d.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        f2204d.put("android.media.metadata.MEDIA_URI", 1);
        f2204d.put("android.media.metadata.ADVERTISEMENT", 0);
        f2204d.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f2205c = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f2205c);
    }
}
