package e.d.a.m.k.g;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import e.d.a.i;
import e.d.a.q.g.g;
import e.d.a.s.h;
import java.security.MessageDigest;
import java.util.UUID;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public final c f4157a;
    public final e.d.a.k.a b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f4158c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4159d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4160e;

    /* renamed from: f  reason: collision with root package name */
    public e.d.a.c<e.d.a.k.a, e.d.a.k.a, Bitmap, Bitmap> f4161f;

    /* renamed from: g  reason: collision with root package name */
    public b f4162g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4163h;

    public static class b extends g<Bitmap> {

        /* renamed from: d  reason: collision with root package name */
        public final Handler f4164d;

        /* renamed from: e  reason: collision with root package name */
        public final int f4165e;

        /* renamed from: f  reason: collision with root package name */
        public final long f4166f;

        /* renamed from: g  reason: collision with root package name */
        public Bitmap f4167g;

        public b(Handler handler, int i, long j) {
            this.f4164d = handler;
            this.f4165e = i;
            this.f4166f = j;
        }

        @Override // e.d.a.q.g.a
        public void a(Object obj, e.d.a.q.f.c cVar) {
            this.f4167g = (Bitmap) obj;
            this.f4164d.sendMessageAtTime(this.f4164d.obtainMessage(1, this), this.f4166f);
        }
    }

    public interface c {
    }

    public class d implements Handler.Callback {
        public /* synthetic */ d(a aVar) {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                b bVar = (b) message.obj;
                f fVar = f.this;
                if (fVar.f4163h) {
                    fVar.f4158c.obtainMessage(2, bVar).sendToTarget();
                } else {
                    b bVar2 = fVar.f4162g;
                    fVar.f4162g = bVar;
                    c cVar = fVar.f4157a;
                    int i2 = bVar.f4165e;
                    b bVar3 = (b) cVar;
                    if (bVar3.getCallback() == null) {
                        bVar3.stop();
                        bVar3.f4143g.a();
                        bVar3.invalidateSelf();
                    } else {
                        bVar3.invalidateSelf();
                        if (i2 == bVar3.f4142f.j.f3912c - 1) {
                            bVar3.l++;
                        }
                        int i3 = bVar3.m;
                        if (i3 != -1 && bVar3.l >= i3) {
                            bVar3.stop();
                        }
                    }
                    if (bVar2 != null) {
                        fVar.f4158c.obtainMessage(2, bVar2).sendToTarget();
                    }
                    fVar.f4160e = false;
                    fVar.b();
                }
                return true;
            }
            if (i == 2) {
                b bVar4 = (b) message.obj;
                h.a();
                e.d.a.q.b bVar5 = bVar4.f4251a;
                if (bVar5 != null) {
                    bVar5.clear();
                    bVar4.f4251a = null;
                }
            }
            return false;
        }
    }

    public static class e implements e.d.a.m.c {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f4169a = UUID.randomUUID();

        @Override // e.d.a.m.c
        public void a(MessageDigest messageDigest) {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // e.d.a.m.c
        public boolean equals(Object obj) {
            if (obj instanceof e) {
                return ((e) obj).f4169a.equals(this.f4169a);
            }
            return false;
        }

        @Override // e.d.a.m.c
        public int hashCode() {
            return this.f4169a.hashCode();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r19v0, resolved type: e.d.a.k.a */
    /* JADX WARN: Multi-variable type inference failed */
    public f(Context context, c cVar, e.d.a.k.a aVar, int i, int i2) {
        h hVar = new h(e.d.a.e.a(context).f3844c);
        g gVar = new g();
        e.d.a.m.k.a<?> aVar2 = e.d.a.m.k.a.f4080a;
        i b2 = e.d.a.e.b(context);
        if (b2 != null) {
            Class cls = aVar != 0 ? e.d.a.k.a.class : null;
            i.b bVar = b2.f3868e;
            e.d.a.d dVar = new e.d.a.d(b2.f3865a, b2.f3867d, cls, gVar, e.d.a.k.a.class, Bitmap.class, b2.f3866c, b2.b, bVar);
            i.a aVar3 = i.this.f3869f;
            if (aVar3 != null) {
                aVar3.a(dVar);
            }
            dVar.i = aVar;
            dVar.k = true;
            e.d.a.p.a<ModelType, DataType, ResourceType, TranscodeType> aVar4 = dVar.f3841h;
            if (aVar4 != null) {
                aVar4.f4224e = aVar2;
            }
            e.d.a.p.a<ModelType, DataType, ResourceType, TranscodeType> aVar5 = dVar.f3841h;
            if (aVar5 != null) {
                aVar5.f4223d = hVar;
            }
            dVar.n = false;
            dVar.r = e.d.a.m.i.b.NONE;
            dVar.a(i, i2);
            this.f4159d = false;
            this.f4160e = false;
            Handler handler = new Handler(Looper.getMainLooper(), new d(null));
            this.f4157a = cVar;
            this.b = aVar;
            this.f4158c = handler;
            this.f4161f = dVar;
            return;
        }
        throw null;
    }

    public void a() {
        this.f4159d = false;
        b bVar = this.f4162g;
        if (bVar != null) {
            h.a();
            e.d.a.q.b bVar2 = bVar.f4251a;
            if (bVar2 != null) {
                bVar2.clear();
                bVar.f4251a = null;
            }
            this.f4162g = null;
        }
        this.f4163h = true;
    }

    public final void b() {
        int i;
        if (this.f4159d && !this.f4160e) {
            this.f4160e = true;
            this.b.a();
            long uptimeMillis = SystemClock.uptimeMillis();
            e.d.a.k.a aVar = this.b;
            this.f4161f.a(new e()).a(new b(this.f4158c, this.b.i, uptimeMillis + ((long) ((aVar.j.f3912c <= 0 || (i = aVar.i) < 0) ? -1 : aVar.a(i)))));
        }
    }
}
