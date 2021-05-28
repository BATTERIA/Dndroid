package e.d.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import e.d.a.c;
import e.d.a.m.g;
import e.d.a.m.j.f;
import e.d.a.m.k.e.b;
import e.d.a.n.l;
import e.d.a.q.g.d;
import e.d.a.s.h;

public class a<ModelType> extends c<ModelType, f, e.d.a.m.k.h.a, b> {
    public a(Context context, Class<ModelType> cls, e.d.a.p.f<ModelType, f, e.d.a.m.k.h.a, b> fVar, e eVar, l lVar, e.d.a.n.f fVar2) {
        super(context, cls, fVar, b.class, eVar, lVar, fVar2);
        this.o = new e.d.a.q.f.a();
    }

    public e.d.a.q.g.a<b> a(ImageView imageView) {
        e.d.a.q.g.a<b> aVar;
        h.a();
        if (imageView != null) {
            if (!this.t && imageView.getScaleType() != null) {
                int i = c.a.f3842a[imageView.getScaleType().ordinal()];
                if (i == 1) {
                    b();
                } else if (i == 2 || i == 3 || i == 4) {
                    c();
                }
            }
            e eVar = this.f3837d;
            Class<TranscodeType> cls = this.f3838e;
            if (eVar.f3846e != null) {
                if (b.class.isAssignableFrom(cls)) {
                    aVar = new d(imageView);
                } else if (Bitmap.class.equals(cls)) {
                    aVar = new e.d.a.q.g.b(imageView);
                } else if (Drawable.class.isAssignableFrom(cls)) {
                    aVar = new e.d.a.q.g.c(imageView);
                } else {
                    throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
                }
                a(aVar);
                return aVar;
            }
            throw null;
        }
        throw new IllegalArgumentException("You must pass in a non null View");
    }

    @Override // e.d.a.c
    public void b() {
        super.a(this.f3837d.i);
    }

    @Override // e.d.a.c
    public void c() {
        super.a(this.f3837d.k);
    }

    @Override // e.d.a.c, e.d.a.c, java.lang.Object
    public c clone() {
        return (a) super.clone();
    }

    @Override // e.d.a.c, e.d.a.c, java.lang.Object
    /* renamed from: clone  reason: collision with other method in class */
    public Object m90clone() {
        return (a) super.clone();
    }

    @Override // e.d.a.c
    public c a(int i, int i2) {
        super.a(i, i2);
        return this;
    }

    @Override // e.d.a.c
    public c a(e.d.a.m.c cVar) {
        if (cVar != null) {
            this.j = cVar;
            return this;
        }
        throw new NullPointerException("Signature must not be null");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.d.a.m.g[]] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: e.d.a.m.g<e.d.a.m.k.h.a>[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.d.a.c
    public c a(g<e.d.a.m.k.h.a>[] gVarArr) {
        super.a(gVarArr);
        return this;
    }
}
