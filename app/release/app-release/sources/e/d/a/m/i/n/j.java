package e.d.a.m.i.n;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import e.a.a.a.a;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public final int f4040a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f4041c;

    public j(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f4041c = context;
        int round = Math.round(((float) (activityManager.getMemoryClass() * 1024 * 1024)) * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        int i = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int i2 = i * 4;
        int i3 = i * 2;
        int i4 = i3 + i2;
        if (i4 <= round) {
            this.b = i3;
        } else {
            int round2 = Math.round(((float) round) / 6.0f);
            this.b = round2 * 2;
            i2 = round2 * 4;
        }
        this.f4040a = i2;
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder a2 = a.a("Calculated memory cache size: ");
            a2.append(a(this.b));
            a2.append(" pool size: ");
            a2.append(a(this.f4040a));
            a2.append(" memory class limited? ");
            a2.append(i4 > round);
            a2.append(" max size: ");
            a2.append(a(round));
            a2.append(" memoryClass: ");
            a2.append(activityManager.getMemoryClass());
            a2.append(" isLowMemoryDevice: ");
            a2.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", a2.toString());
        }
    }

    public final String a(int i) {
        return Formatter.formatFileSize(this.f4041c, (long) i);
    }
}
