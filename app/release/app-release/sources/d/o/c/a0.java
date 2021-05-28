package d.o.c;

import android.view.View;
import d.b.j;

public class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final b f3584a;
    public a b = new a();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f3585a = 0;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public int f3586c;

        /* renamed from: d  reason: collision with root package name */
        public int f3587d;

        /* renamed from: e  reason: collision with root package name */
        public int f3588e;

        public int a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        public boolean a() {
            int i = this.f3585a;
            if ((i & 7) != 0 && (i & (a(this.f3587d, this.b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f3585a;
            if ((i2 & j.AppCompatTheme_windowActionBarOverlay) != 0 && (i2 & (a(this.f3587d, this.f3586c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f3585a;
            if ((i3 & 1792) != 0 && (i3 & (a(this.f3588e, this.b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f3585a;
            return (i4 & 28672) == 0 || (i4 & (a(this.f3588e, this.f3586c) << 12)) != 0;
        }
    }

    public interface b {
        int a();

        int a(View view);

        View a(int i);

        int b();

        int b(View view);
    }

    public a0(b bVar) {
        this.f3584a = bVar;
    }

    public View a(int i, int i2, int i3, int i4) {
        int b2 = this.f3584a.b();
        int a2 = this.f3584a.a();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a3 = this.f3584a.a(i);
            int b3 = this.f3584a.b(a3);
            int a4 = this.f3584a.a(a3);
            a aVar = this.b;
            aVar.b = b2;
            aVar.f3586c = a2;
            aVar.f3587d = b3;
            aVar.f3588e = a4;
            if (i3 != 0) {
                aVar.f3585a = 0;
                aVar.f3585a = i3 | 0;
                if (aVar.a()) {
                    return a3;
                }
            }
            if (i4 != 0) {
                a aVar2 = this.b;
                aVar2.f3585a = 0;
                aVar2.f3585a = i4 | 0;
                if (aVar2.a()) {
                    view = a3;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean a(View view, int i) {
        a aVar = this.b;
        int b2 = this.f3584a.b();
        int a2 = this.f3584a.a();
        int b3 = this.f3584a.b(view);
        int a3 = this.f3584a.a(view);
        aVar.b = b2;
        aVar.f3586c = a2;
        aVar.f3587d = b3;
        aVar.f3588e = a3;
        if (i == 0) {
            return false;
        }
        a aVar2 = this.b;
        aVar2.f3585a = 0;
        aVar2.f3585a = 0 | i;
        return aVar2.a();
    }
}
