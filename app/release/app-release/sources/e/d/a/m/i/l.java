package e.d.a.m.i;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import e.d.a.s.h;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4007a;
    public final Handler b = new Handler(Looper.getMainLooper(), new b(null));

    public static class b implements Handler.Callback {
        public /* synthetic */ b(a aVar) {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((k) message.obj).a();
            return true;
        }
    }

    public void a(k<?> kVar) {
        h.a();
        if (this.f4007a) {
            this.b.obtainMessage(1, kVar).sendToTarget();
            return;
        }
        this.f4007a = true;
        kVar.a();
        this.f4007a = false;
    }
}
