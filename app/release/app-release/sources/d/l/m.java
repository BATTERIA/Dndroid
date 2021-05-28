package d.l;

import androidx.lifecycle.LiveData;

public class m<T> extends LiveData<T> {
    public void a(T t) {
        LiveData.a("setValue");
        this.f2412f++;
        this.f2410d = t;
        b(null);
    }
}
