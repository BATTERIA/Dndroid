package e.e.a.v;

import com.didi.hummer.module.Timer;
import e.e.a.q.b.a;

/* compiled from: lambda */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Timer f4547c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ a f4548d;

    public /* synthetic */ c(Timer timer, a aVar) {
        this.f4547c = timer;
        this.f4548d = aVar;
    }

    public final void run() {
        this.f4547c.a(this.f4548d);
    }
}
