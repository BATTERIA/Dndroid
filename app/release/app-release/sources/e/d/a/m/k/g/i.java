package e.d.a.m.k.g;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import e.d.a.k.a;
import e.d.a.k.c;
import e.d.a.k.d;
import e.d.a.m.e;
import e.d.a.m.i.k;
import e.d.a.m.k.g.b;
import e.d.a.s.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public class i implements e<InputStream, b> {

    /* renamed from: f  reason: collision with root package name */
    public static final b f4172f = new b();

    /* renamed from: g  reason: collision with root package name */
    public static final a f4173g = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Context f4174a;
    public final b b;

    /* renamed from: c  reason: collision with root package name */
    public final e.d.a.m.i.m.b f4175c;

    /* renamed from: d  reason: collision with root package name */
    public final a f4176d;

    /* renamed from: e  reason: collision with root package name */
    public final a f4177e;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Queue<e.d.a.k.a> f4178a = h.a(0);

        public synchronized e.d.a.k.a a(a.AbstractC0119a aVar) {
            e.d.a.k.a poll;
            poll = this.f4178a.poll();
            if (poll == null) {
                poll = new e.d.a.k.a(aVar);
            }
            return poll;
        }

        public synchronized void a(e.d.a.k.a aVar) {
            aVar.j = null;
            aVar.f3902g = null;
            aVar.f3903h = null;
            Bitmap bitmap = aVar.l;
            if (bitmap != null && !((a) aVar.k).f4138a.a(bitmap)) {
                bitmap.recycle();
            }
            aVar.l = null;
            this.f4178a.offer(aVar);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Queue<d> f4179a = h.a(0);

        public synchronized d a(byte[] bArr) {
            d poll;
            poll = this.f4179a.poll();
            if (poll == null) {
                poll = new d();
            }
            poll.a(bArr);
            return poll;
        }

        public synchronized void a(d dVar) {
            dVar.b = null;
            dVar.f3919c = null;
            this.f4179a.offer(dVar);
        }
    }

    public i(Context context, e.d.a.m.i.m.b bVar) {
        b bVar2 = f4172f;
        a aVar = f4173g;
        this.f4174a = context;
        this.f4175c = bVar;
        this.f4176d = aVar;
        this.f4177e = new a(bVar);
        this.b = bVar2;
    }

    /* Return type fixed from 'e.d.a.m.i.k' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int] */
    @Override // e.d.a.m.e
    public k<b> a(InputStream inputStream, int i, int i2) {
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream2.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.flush();
        } catch (IOException e2) {
            Log.w("GifResourceDecoder", "Error reading data from stream", e2);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        d a2 = this.b.a(byteArray);
        e.d.a.k.a a3 = this.f4176d.a(this.f4177e);
        try {
            return a(byteArray, i, i2, a2, a3);
        } finally {
            this.b.a(a2);
            this.f4176d.a(a3);
        }
    }

    @Override // e.d.a.m.e
    public String a() {
        return "";
    }

    public final d a(byte[] bArr, int i, int i2, d dVar, e.d.a.k.a aVar) {
        c b2 = dVar.b();
        if (b2.f3912c <= 0 || b2.b != 0) {
            return null;
        }
        aVar.a(b2, bArr);
        aVar.a();
        Bitmap c2 = aVar.c();
        if (c2 == null) {
            return null;
        }
        return new d(new b(new b.a(b2, bArr, this.f4174a, (e.d.a.m.k.c) e.d.a.m.k.c.f4082a, i, i2, this.f4177e, this.f4175c, c2)));
    }
}
