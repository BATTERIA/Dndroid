package d.b.k;

public class s {

    /* renamed from: d  reason: collision with root package name */
    public static s f2694d;

    /* renamed from: a  reason: collision with root package name */
    public long f2695a;
    public long b;

    /* renamed from: c  reason: collision with root package name */
    public int f2696c;

    public void a(long j, double d2, double d3) {
        float f2 = ((float) (j - 946728000000L)) / 8.64E7f;
        float f3 = (0.01720197f * f2) + 6.24006f;
        double d4 = (double) f3;
        Double.isNaN(d4);
        double sin = (Math.sin((double) (f3 * 3.0f)) * 5.236000106378924E-6d) + (Math.sin((double) (2.0f * f3)) * 3.4906598739326E-4d) + (Math.sin(d4) * 0.03341960161924362d) + d4 + 1.796593063d + 3.141592653589793d;
        double d5 = (-d3) / 360.0d;
        double d6 = (double) (f2 - 9.0E-4f);
        Double.isNaN(d6);
        double round = (double) (((float) Math.round(d6 - d5)) + 9.0E-4f);
        Double.isNaN(round);
        double sin2 = (Math.sin(2.0d * sin) * -0.0069d) + (Math.sin(d4) * 0.0053d) + round + d5;
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d7 = 0.01745329238474369d * d2;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d7))) / (Math.cos(asin) * Math.cos(d7));
        if (sin3 >= 1.0d) {
            this.f2696c = 1;
        } else if (sin3 <= -1.0d) {
            this.f2696c = 0;
        } else {
            double acos = (double) ((float) (Math.acos(sin3) / 6.283185307179586d));
            Double.isNaN(acos);
            this.f2695a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            Double.isNaN(acos);
            long round2 = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.b = round2;
            if (round2 >= j || this.f2695a <= j) {
                this.f2696c = 1;
                return;
            } else {
                this.f2696c = 0;
                return;
            }
        }
        this.f2695a = -1;
        this.b = -1;
    }
}
