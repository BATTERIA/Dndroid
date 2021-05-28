package e.e.a.q.a;

import android.os.Handler;
import e.c.a.b.l;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f4469a = new Handler();
    public final ExecutorService b = Executors.newSingleThreadExecutor();

    /* renamed from: c  reason: collision with root package name */
    public final List<i> f4470c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final List<i> f4471d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final g f4472e = new g();

    /* renamed from: f  reason: collision with root package name */
    public final f f4473f = new f();

    /* renamed from: g  reason: collision with root package name */
    public final k f4474g = new k();

    /* renamed from: h  reason: collision with root package name */
    public boolean f4475h;
    public long i = 0;
    public long j = 0;

    public /* synthetic */ void a() {
        try {
            this.f4472e.a(this.f4470c);
            this.f4473f.a(this.f4470c);
        } catch (Exception e2) {
            l.f.a("InvokerAnalyzer", "analyzeTree, e = ", (Throwable) e2);
        }
    }

    public /* synthetic */ void a(long j2, StackTraceElement[] stackTraceElementArr) {
        int i2;
        long nanoTime = System.nanoTime() - j2;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.i > 1000) {
            this.i = currentTimeMillis;
            this.b.submit(new a(this));
        }
        if (currentTimeMillis - this.j > 60) {
            this.j = currentTimeMillis;
            String str = "";
            int i3 = 0;
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement.toString().contains("JavaScriptRuntime.evaluateJavaScript")) {
                    str = "evaluateJavaScript";
                } else if (stackTraceElement.toString().contains("CallbackImpl.call") && (i2 = i3 + 2) < stackTraceElementArr.length) {
                    str = stackTraceElementArr[i2].toString();
                }
                i3++;
            }
            this.b.submit(new d(this, new ArrayList(this.f4471d), nanoTime, str));
        }
        this.f4475h = false;
    }

    public /* synthetic */ void a(i iVar) {
        try {
            this.f4470c.add(iVar);
            this.f4471d.add(iVar);
        } catch (Exception e2) {
            l.f.a("InvokerAnalyzer", "track, e = ", (Throwable) e2);
        }
    }

    public /* synthetic */ void a(List list, long j2, String str) {
        try {
            this.f4474g.a(list, j2, str);
        } catch (Exception e2) {
            l.f.a("InvokerAnalyzer", "analyzePerformance, e = ", (Throwable) e2);
        }
    }

    public i b() {
        if (!this.f4475h) {
            this.f4475h = true;
            long nanoTime = System.nanoTime();
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            this.f4471d.clear();
            this.f4469a.post(new c(this, nanoTime, stackTrace));
        }
        i iVar = new i();
        iVar.f4465e = System.nanoTime();
        iVar.f4467g = System.currentTimeMillis();
        iVar.f4468h = new SimpleDateFormat("HH:mm:ss.SSS").format(Long.valueOf(iVar.f4467g));
        return iVar;
    }
}
