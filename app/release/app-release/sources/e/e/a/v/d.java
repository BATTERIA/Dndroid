package e.e.a.v;

import com.didi.hummer.module.Timer;
import e.e.a.q.b.a;

/* compiled from: lambda */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Timer f4549c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f4550d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ a f4551e;

    public /* synthetic */ d(Timer timer, long j, a aVar) {
        this.f4549c = timer;
        this.f4550d = j;
        this.f4551e = aVar;
    }

    public final void run() {
        this.f4549c.a(this.f4550d, this.f4551e);
    }
}
