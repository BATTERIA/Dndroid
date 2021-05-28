package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final String f2198c;

    /* renamed from: d  reason: collision with root package name */
    public final CharSequence f2199d;

    /* renamed from: e  reason: collision with root package name */
    public final CharSequence f2200e;

    /* renamed from: f  reason: collision with root package name */
    public final CharSequence f2201f;

    /* renamed from: g  reason: collision with root package name */
    public final Bitmap f2202g;

    /* renamed from: h  reason: collision with root package name */
    public final Uri f2203h;
    public final Bundle i;
    public final Uri j;
    public Object k;

    public static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.f2198c = parcel.readString();
        this.f2199d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2200e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2201f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f2202g = (Bitmap) parcel.readParcelable(classLoader);
        this.f2203h = (Uri) parcel.readParcelable(classLoader);
        this.i = parcel.readBundle(classLoader);
        this.j = (Uri) parcel.readParcelable(classLoader);
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f2198c = str;
        this.f2199d = charSequence;
        this.f2200e = charSequence2;
        this.f2201f = charSequence3;
        this.f2202g = bitmap;
        this.f2203h = uri;
        this.i = bundle;
        this.j = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r14) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f2199d) + ", " + ((Object) this.f2200e) + ", " + ((Object) this.f2201f);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Object obj;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 21) {
            parcel.writeString(this.f2198c);
            TextUtils.writeToParcel(this.f2199d, parcel, i2);
            TextUtils.writeToParcel(this.f2200e, parcel, i2);
            TextUtils.writeToParcel(this.f2201f, parcel, i2);
            parcel.writeParcelable(this.f2202g, i2);
            parcel.writeParcelable(this.f2203h, i2);
            parcel.writeBundle(this.i);
            parcel.writeParcelable(this.j, i2);
            return;
        }
        if (this.k != null || i3 < 21) {
            obj = this.k;
        } else {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f2198c);
            builder.setTitle(this.f2199d);
            builder.setSubtitle(this.f2200e);
            builder.setDescription(this.f2201f);
            builder.setIconBitmap(this.f2202g);
            builder.setIconUri(this.f2203h);
            Bundle bundle = this.i;
            if (Build.VERSION.SDK_INT < 23 && this.j != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.j);
            }
            builder.setExtras(bundle);
            if (Build.VERSION.SDK_INT >= 23) {
                builder.setMediaUri(this.j);
            }
            obj = builder.build();
            this.k = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i2);
    }
}
