package e.d.a.m.k.d;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import e.d.a.m.a;
import e.d.a.m.e;
import e.d.a.m.i.k;
import e.d.a.m.i.m.b;

public class h implements e<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final r f4092a = new r();
    public final b b;

    /* renamed from: c  reason: collision with root package name */
    public a f4093c;

    public h(b bVar, a aVar) {
        this.b = bVar;
        this.f4093c = aVar;
    }

    /* Return type fixed from 'e.d.a.m.i.k' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int] */
    @Override // e.d.a.m.e
    public k<Bitmap> a(ParcelFileDescriptor parcelFileDescriptor, int i, int i2) {
        ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
        r rVar = this.f4092a;
        if (rVar.f4130a != null) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor2.getFileDescriptor());
            int i3 = rVar.b;
            Bitmap frameAtTime = i3 >= 0 ? mediaMetadataRetriever.getFrameAtTime((long) i3) : mediaMetadataRetriever.getFrameAtTime();
            mediaMetadataRetriever.release();
            parcelFileDescriptor2.close();
            return c.a(frameAtTime, this.b);
        }
        throw null;
    }

    @Override // e.d.a.m.e
    public String a() {
        return "FileDescriptorBitmapDecoder.com.bumptech.glide.load.data.bitmap";
    }
}
