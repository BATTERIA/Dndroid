package a.a.a.a.v0.e.w0;

import a.t.r;
import a.w.c.i;
import a.y.b;
import a.y.c;
import e.f.a.g;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public final class a extends a.a.a.a.v0.e.x0.a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f1225f = new a(1, 0, 7);

    /* renamed from: g  reason: collision with root package name */
    public static final a f1226g = null;

    static {
        new a(new int[0]);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        if (iArr != null) {
        } else {
            i.a("numbers");
            throw null;
        }
    }

    public static final a a(InputStream inputStream) {
        if (inputStream != null) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            c cVar = new c(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(g.a(cVar, 10));
            Iterator<Integer> it = cVar.iterator();
            while (((b) it).f2156d) {
                ((r) it).a();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int size = arrayList.size();
            int[] iArr = new int[size];
            int i = 0;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                iArr[i] = ((Number) it2.next()).intValue();
                i++;
            }
            return new a(Arrays.copyOf(iArr, size));
        }
        i.a("stream");
        throw null;
    }
}
