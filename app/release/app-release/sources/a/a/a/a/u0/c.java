package a.a.a.a.u0;

import a.w.b.a;
import a.w.c.j;
import java.util.Arrays;
import java.util.Map;

public final class c extends j implements a<Integer> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f141c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Map map) {
        super(0);
        this.f141c = map;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // a.w.b.a
    public Integer a() {
        int i = 0;
        for (Map.Entry entry : this.f141c.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            i += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
        }
        return Integer.valueOf(i);
    }
}
