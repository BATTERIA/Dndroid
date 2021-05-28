package e.d.a.m.k.d;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import e.d.a.m.k.d.l;
import e.d.a.s.h;
import java.io.IOException;
import java.io.InputStream;
import java.util.EnumSet;
import java.util.Queue;
import java.util.Set;

public abstract class f implements a<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<l.a> f4086a = EnumSet.of(l.a.JPEG, l.a.PNG_A, l.a.PNG);
    public static final Queue<BitmapFactory.Options> b = h.a(0);

    /* renamed from: c  reason: collision with root package name */
    public static final f f4087c = new a();

    public static class a extends f {
        @Override // e.d.a.m.k.d.f
        public int a(int i, int i2, int i3, int i4) {
            return Math.min(i2 / i4, i / i3);
        }

        @Override // e.d.a.m.k.d.a
        public String a() {
            return "AT_LEAST.com.bumptech.glide.load.data.bitmap";
        }
    }

    public static Bitmap a(e.d.a.s.f fVar, o oVar, BitmapFactory.Options options) {
        if (options.inJustDecodeBounds) {
            fVar.mark(5242880);
        } else {
            oVar.a();
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(fVar, null, options);
        try {
            if (options.inJustDecodeBounds) {
                fVar.reset();
            }
        } catch (IOException e2) {
            if (Log.isLoggable("Downsampler", 6)) {
                StringBuilder a2 = e.a.a.a.a.a("Exception loading inDecodeBounds=");
                a2.append(options.inJustDecodeBounds);
                a2.append(" sample=");
                a2.append(options.inSampleSize);
                Log.e("Downsampler", a2.toString(), e2);
            }
        }
        return decodeStream;
    }

    public static void a(BitmapFactory.Options options) {
        b(options);
        synchronized (b) {
            b.offer(options);
        }
    }

    @TargetApi(11)
    public static synchronized BitmapFactory.Options b() {
        BitmapFactory.Options poll;
        synchronized (f.class) {
            synchronized (b) {
                poll = b.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                b(poll);
            }
        }
        return poll;
    }

    @TargetApi(11)
    public static void b(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public abstract int a(int i, int i2, int i3, int i4);

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (android.util.Log.isLoggable("Downsampler", 5) == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (android.util.Log.isLoggable("Downsampler", 5) == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        android.util.Log.w("Downsampler", "Cannot reset the input stream", r15);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap a(e.d.a.s.f r8, e.d.a.m.k.d.o r9, android.graphics.BitmapFactory.Options r10, e.d.a.m.i.m.b r11, int r12, int r13, int r14, e.d.a.m.a r15) {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.a.m.k.d.f.a(e.d.a.s.f, e.d.a.m.k.d.o, android.graphics.BitmapFactory$Options, e.d.a.m.i.m.b, int, int, int, e.d.a.m.a):android.graphics.Bitmap");
    }
}
