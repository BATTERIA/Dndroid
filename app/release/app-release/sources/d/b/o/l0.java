package d.b.o;

public class l0 {

    /* renamed from: a  reason: collision with root package name */
    public int f2937a = 0;
    public int b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f2938c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f2939d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public int f2940e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f2941f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2942g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2943h = false;

    public void a(int i, int i2) {
        this.f2938c = i;
        this.f2939d = i2;
        this.f2943h = true;
        if (this.f2942g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2937a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2937a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.b = i2;
        }
    }
}
