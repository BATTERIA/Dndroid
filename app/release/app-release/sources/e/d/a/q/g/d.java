package e.d.a.q.g;

import android.widget.ImageView;
import e.d.a.m.k.e.b;
import e.d.a.q.f.c;
import e.d.a.q.g.i;

public class d extends e<b> {

    /* renamed from: d  reason: collision with root package name */
    public int f4252d;

    /* renamed from: e  reason: collision with root package name */
    public b f4253e;

    public d(ImageView imageView) {
        super(imageView);
        this.f4252d = -1;
    }

    public d(ImageView imageView, int i) {
        super(imageView);
        this.f4252d = i;
    }

    @Override // e.d.a.q.g.a, e.d.a.n.g
    public void a() {
        b bVar = this.f4253e;
        if (bVar != null) {
            bVar.start();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, e.d.a.q.f.c] */
    @Override // e.d.a.q.g.a, e.d.a.q.g.e
    public void a(b bVar, c<? super b> cVar) {
        b bVar2 = bVar;
        if (!bVar2.a()) {
            float width = ((float) ((ImageView) this.b).getWidth()) / ((float) ((ImageView) this.b).getHeight());
            float intrinsicWidth = ((float) bVar2.getIntrinsicWidth()) / ((float) bVar2.getIntrinsicHeight());
            if (Math.abs(width - 1.0f) <= 0.05f && Math.abs(intrinsicWidth - 1.0f) <= 0.05f) {
                bVar2 = new i(new i.a(bVar2.getConstantState(), ((ImageView) this.b).getWidth()), bVar2, null);
            }
        }
        if (cVar == null || !cVar.a(bVar2, this)) {
            a((Object) bVar2);
        }
        this.f4253e = bVar2;
        bVar2.a(this.f4252d);
        bVar2.start();
    }

    @Override // e.d.a.q.g.a, e.d.a.n.g
    public void b() {
        b bVar = this.f4253e;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // e.d.a.q.g.e
    public void a(b bVar) {
        ((ImageView) this.b).setImageDrawable(bVar);
    }
}
