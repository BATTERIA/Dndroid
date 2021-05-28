package a.a.a.a.v0.j.w;

public abstract class c {

    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final int f1610a;
        public static final a b = new a();

        static {
            if (d.u != null) {
                int i = d.j;
                if (d.u != null) {
                    int i2 = d.f1617h;
                    if (d.u != null) {
                        f1610a = i & ((d.i | i2) ^ -1);
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }

        @Override // a.a.a.a.v0.j.w.c
        public int a() {
            return f1610a;
        }
    }

    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f1611a = new b();

        @Override // a.a.a.a.v0.j.w.c
        public int a() {
            return 0;
        }
    }

    public abstract int a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
