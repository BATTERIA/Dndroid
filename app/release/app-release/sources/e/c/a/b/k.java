package e.c.a.b;

import android.util.Log;
import e.a.a.a.a;
import e.c.a.b.l;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class k implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3782c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ l.g f3783d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f3784e;

    public k(int i, l.g gVar, String str) {
        this.f3782c = i;
        this.f3783d = gVar;
        this.f3784e = str;
    }

    public void run() {
        int i = this.f3782c;
        String str = this.f3783d.f3802a;
        String str2 = this.f3783d.f3803c + this.f3784e;
        if (l.f3788e == null) {
            l.f3788e = new SimpleDateFormat("yyyy_MM_dd HH:mm:ss.SSS ", Locale.getDefault());
        }
        String format = l.f3788e.format(new Date());
        boolean z = false;
        String substring = format.substring(0, 10);
        String substring2 = format.substring(11);
        StringBuilder sb = new StringBuilder();
        sb.append(l.f3787d.f3792a);
        sb.append(l.f3787d.b);
        sb.append("_");
        sb.append(substring);
        sb.append("_");
        String str3 = l.f3787d.q;
        sb.append(str3 == null ? "" : str3.replace(":", "_"));
        sb.append(l.f3787d.f3793c);
        String sb2 = sb.toString();
        File file = new File(sb2);
        if (file.exists()) {
            z = file.isFile();
        } else if (i.a(file.getParentFile())) {
            try {
                l.a(sb2, substring);
                boolean createNewFile = file.createNewFile();
                if (createNewFile) {
                    l.c(sb2, substring);
                }
                z = createNewFile;
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        if (!z) {
            Log.e("LogUtils", "create " + sb2 + " failed!");
            return;
        }
        StringBuilder a2 = a.a(substring2);
        a2.append(l.f3785a[i - 2]);
        a2.append("/");
        a2.append(str);
        a2.append(str2);
        a2.append(l.f3786c);
        l.b(sb2, a2.toString());
    }
}
