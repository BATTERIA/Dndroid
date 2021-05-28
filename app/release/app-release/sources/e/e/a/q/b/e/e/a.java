package e.e.a.q.b.e.e;

import com.didi.hummer.core.engine.jsc.jni.HummerException;
import e.e.a.q.c.b;

/* compiled from: lambda */
public final /* synthetic */ class a implements HummerException.JSExceptionCallback {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a f4496a = new a();

    private /* synthetic */ a() {
    }

    @Override // com.didi.hummer.core.engine.jsc.jni.HummerException.JSExceptionCallback
    public final void onException(long j, String str) {
        HummerException.dispatchExceptionCallback(j, new b(str));
    }
}
