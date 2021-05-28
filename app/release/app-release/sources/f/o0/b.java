package f.o0;

import java.util.concurrent.ThreadFactory;

/* compiled from: lambda */
public final /* synthetic */ class b implements ThreadFactory {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f5079c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ boolean f5080d;

    public /* synthetic */ b(String str, boolean z) {
        this.f5079c = str;
        this.f5080d = z;
    }

    public final Thread newThread(Runnable runnable) {
        return e.a(this.f5079c, this.f5080d, runnable);
    }
}
