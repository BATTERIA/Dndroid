package a.a.a.a.u0;

import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import java.util.Arrays;
import java.util.Map;

public final class e extends j implements l<Map.Entry<? extends String, ? extends Object>, String> {

    /* renamed from: c  reason: collision with root package name */
    public static final e f148c = new e();

    public e() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public String a(Map.Entry<? extends String, ? extends Object> entry) {
        Map.Entry<? extends String, ? extends Object> entry2 = entry;
        if (entry2 != null) {
            String str = (String) entry2.getKey();
            Object value = entry2.getValue();
            String arrays = value instanceof boolean[] ? Arrays.toString((boolean[]) value) : value instanceof char[] ? Arrays.toString((char[]) value) : value instanceof byte[] ? Arrays.toString((byte[]) value) : value instanceof short[] ? Arrays.toString((short[]) value) : value instanceof int[] ? Arrays.toString((int[]) value) : value instanceof float[] ? Arrays.toString((float[]) value) : value instanceof long[] ? Arrays.toString((long[]) value) : value instanceof double[] ? Arrays.toString((double[]) value) : value instanceof Object[] ? Arrays.toString((Object[]) value) : value.toString();
            return str + '=' + arrays;
        }
        i.a("entry");
        throw null;
    }
}
