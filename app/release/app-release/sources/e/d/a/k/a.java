package e.d.a.k;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

public class a {
    public static final Bitmap.Config o = Bitmap.Config.ARGB_8888;

    /* renamed from: a  reason: collision with root package name */
    public int[] f3897a;
    public ByteBuffer b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f3898c = new byte[256];

    /* renamed from: d  reason: collision with root package name */
    public short[] f3899d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f3900e;

    /* renamed from: f  reason: collision with root package name */
    public byte[] f3901f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f3902g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f3903h;
    public int i;
    public c j;
    public AbstractC0119a k;
    public Bitmap l;
    public boolean m;
    public int n;

    /* renamed from: e.d.a.k.a$a  reason: collision with other inner class name */
    public interface AbstractC0119a {
    }

    public a(AbstractC0119a aVar) {
        this.k = aVar;
        this.j = new c();
    }

    public int a(int i2) {
        if (i2 >= 0) {
            c cVar = this.j;
            if (i2 < cVar.f3912c) {
                return cVar.f3914e.get(i2).i;
            }
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01d8 A[LOOP:6: B:100:0x01d6->B:101:0x01d8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01d4 A[EDGE_INSN: B:144:0x01d4->B:99:0x01d4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0242 A[EDGE_INSN: B:160:0x0242->B:131:0x0242 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0095 A[LOOP:0: B:41:0x0093->B:42:0x0095, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01a2 A[LOOP:5: B:94:0x01a0->B:95:0x01a2, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap a(e.d.a.k.b r30, e.d.a.k.b r31) {
        /*
        // Method dump skipped, instructions count: 627
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.a.k.a.a(e.d.a.k.b, e.d.a.k.b):android.graphics.Bitmap");
    }

    public void a() {
        this.i = (this.i + 1) % this.j.f3912c;
    }

    public void a(c cVar, byte[] bArr) {
        this.j = cVar;
        this.n = 0;
        this.i = -1;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.b = wrap;
        wrap.rewind();
        this.b.order(ByteOrder.LITTLE_ENDIAN);
        this.m = false;
        Iterator<b> it = cVar.f3914e.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().f3909g == 3) {
                    this.m = true;
                    break;
                }
            } else {
                break;
            }
        }
        int i2 = cVar.f3915f;
        int i3 = cVar.f3916g;
        this.f3902g = new byte[(i2 * i3)];
        this.f3903h = new int[(i2 * i3)];
    }

    public final Bitmap b() {
        AbstractC0119a aVar = this.k;
        c cVar = this.j;
        Bitmap b2 = ((e.d.a.m.k.g.a) aVar).f4138a.b(cVar.f3915f, cVar.f3916g, o);
        if (b2 == null) {
            c cVar2 = this.j;
            b2 = Bitmap.createBitmap(cVar2.f3915f, cVar2.f3916g, o);
        }
        b2.setHasAlpha(true);
        return b2;
    }

    public synchronized Bitmap c() {
        if (this.j.f3912c <= 0 || this.i < 0) {
            if (Log.isLoggable("a", 3)) {
                Log.d("a", "unable to decode frame, frameCount=" + this.j.f3912c + " framePointer=" + this.i);
            }
            this.n = 1;
        }
        if (this.n != 1) {
            if (this.n != 2) {
                int i2 = 0;
                this.n = 0;
                b bVar = this.j.f3914e.get(this.i);
                int i3 = this.i - 1;
                b bVar2 = i3 >= 0 ? this.j.f3914e.get(i3) : null;
                if (bVar.k == null) {
                    this.f3897a = this.j.f3911a;
                } else {
                    this.f3897a = bVar.k;
                    if (this.j.j == bVar.f3910h) {
                        this.j.l = 0;
                    }
                }
                if (bVar.f3908f) {
                    int i4 = this.f3897a[bVar.f3910h];
                    this.f3897a[bVar.f3910h] = 0;
                    i2 = i4;
                }
                if (this.f3897a == null) {
                    if (Log.isLoggable("a", 3)) {
                        Log.d("a", "No Valid Color Table");
                    }
                    this.n = 1;
                    return null;
                }
                Bitmap a2 = a(bVar, bVar2);
                if (bVar.f3908f) {
                    this.f3897a[bVar.f3910h] = i2;
                }
                return a2;
            }
        }
        if (Log.isLoggable("a", 3)) {
            Log.d("a", "Unable to decode frame, status=" + this.n);
        }
        return null;
    }
}
