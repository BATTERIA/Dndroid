package e.c.a.b;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import e.c.a.b.l;
import e.e.a.n.b.a;
import e.e.a.o.n.d;
import e.e.a.o.n.e;

/* compiled from: lambda */
public final /* synthetic */ class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ SpannableString f3772a;
    private final /* synthetic */ e b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f3773c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f3774d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ d f3775e;

    public /* synthetic */ b(SpannableString spannableString, e eVar, int i, int i2, d dVar) {
        this.f3772a = spannableString;
        this.b = eVar;
        this.f3773c = i;
        this.f3774d = i2;
        this.f3775e = dVar;
    }

    @Override // e.e.a.n.b.a
    public final void a(Drawable drawable) {
        l.f.a(this.f3772a, this.b, this.f3773c, this.f3774d, this.f3775e, drawable);
    }
}
