package d.g.e.c;

import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f3256a;
    public final float[] b;

    public f(int i, int i2) {
        this.f3256a = new int[]{i, i2};
        this.b = new float[]{0.0f, 1.0f};
    }

    public f(int i, int i2, int i3) {
        this.f3256a = new int[]{i, i2, i3};
        this.b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public f(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.f3256a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; i++) {
            this.f3256a[i] = list.get(i).intValue();
            this.b[i] = list2.get(i).floatValue();
        }
    }
}
