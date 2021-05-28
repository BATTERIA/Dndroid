package d.r;

import android.os.Parcel;
import android.util.SparseIntArray;
import d.d.a;
import java.lang.reflect.Method;

public class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f3735d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f3736e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3737f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3738g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3739h;
    public int i;
    public int j;
    public int k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new a(), new a(), new a());
    }

    public b(Parcel parcel, int i2, int i3, String str, a<String, Method> aVar, a<String, Method> aVar2, a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f3735d = new SparseIntArray();
        this.i = -1;
        this.j = 0;
        this.k = -1;
        this.f3736e = parcel;
        this.f3737f = i2;
        this.f3738g = i3;
        this.j = i2;
        this.f3739h = str;
    }

    @Override // d.r.a
    public void a() {
        int i2 = this.i;
        if (i2 >= 0) {
            int i3 = this.f3735d.get(i2);
            int dataPosition = this.f3736e.dataPosition();
            this.f3736e.setDataPosition(i3);
            this.f3736e.writeInt(dataPosition - i3);
            this.f3736e.setDataPosition(dataPosition);
        }
    }

    @Override // d.r.a
    public boolean a(int i2) {
        while (this.j < this.f3738g) {
            int i3 = this.k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.f3736e.setDataPosition(this.j);
            int readInt = this.f3736e.readInt();
            this.k = this.f3736e.readInt();
            this.j += readInt;
        }
        return this.k == i2;
    }

    @Override // d.r.a
    public a b() {
        Parcel parcel = this.f3736e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.j;
        if (i2 == this.f3737f) {
            i2 = this.f3738g;
        }
        return new b(parcel, dataPosition, i2, e.a.a.a.a.a(new StringBuilder(), this.f3739h, "  "), this.f3733a, this.b, this.f3734c);
    }

    @Override // d.r.a
    public void b(int i2) {
        a();
        this.i = i2;
        this.f3735d.put(i2, this.f3736e.dataPosition());
        this.f3736e.writeInt(0);
        this.f3736e.writeInt(i2);
    }
}
