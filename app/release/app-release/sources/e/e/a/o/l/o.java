package e.e.a.o.l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;

public class o {

    /* renamed from: a  reason: collision with root package name */
    public int f4407a = 0;
    public boolean b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4408c = false;

    /* renamed from: d  reason: collision with root package name */
    public int f4409d = 0;

    /* renamed from: e  reason: collision with root package name */
    public b f4410e;

    /* renamed from: f  reason: collision with root package name */
    public final Handler f4411f = new Handler(Looper.getMainLooper(), new a());

    public class a implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        public int f4412a = Integer.MIN_VALUE;

        public a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            o oVar = o.this;
            int i = oVar.f4407a;
            if (oVar.f4408c || this.f4412a != i) {
                this.f4412a = i;
                o oVar2 = o.this;
                oVar2.f4411f.removeMessages(1);
                oVar2.f4411f.sendEmptyMessageDelayed(1, 40);
            } else {
                this.f4412a = Integer.MIN_VALUE;
                if (oVar.f4409d != 4) {
                    oVar.f4409d = 4;
                    b bVar = oVar.f4410e;
                    if (bVar != null) {
                        bVar.a(4);
                    }
                }
            }
            return true;
        }
    }

    public interface b {
        void a(int i);
    }

    public void a(int i) {
        this.f4407a = i;
        if (!this.b) {
            this.b = true;
            b(1);
        }
        b(this.f4408c ? 2 : 3);
    }

    public void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            this.f4408c = false;
            this.f4411f.removeMessages(1);
            this.f4411f.sendEmptyMessageDelayed(1, 40);
        }
    }

    public final void b(int i) {
        if (this.f4409d != i) {
            this.f4409d = i;
            b bVar = this.f4410e;
            if (bVar != null) {
                bVar.a(i);
            }
        }
    }
}
