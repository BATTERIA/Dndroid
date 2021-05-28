package e.d.a.s;

import android.annotation.TargetApi;
import android.os.SystemClock;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final double f4273a = (1.0d / Math.pow(10.0d, 6.0d));

    public static double a(long j) {
        double elapsedRealtimeNanos = (double) (SystemClock.elapsedRealtimeNanos() - j);
        double d2 = f4273a;
        Double.isNaN(elapsedRealtimeNanos);
        return elapsedRealtimeNanos * d2;
    }

    @TargetApi(17)
    public static long a() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
