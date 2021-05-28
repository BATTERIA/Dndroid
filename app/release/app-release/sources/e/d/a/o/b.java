package e.d.a.o;

public final class b {
    public static a a(String str) {
        Object obj;
        Object obj2;
        try {
            try {
                Object newInstance = Class.forName(str).newInstance();
                if (newInstance instanceof a) {
                    return (a) newInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + newInstance);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Unable to instantiate GlideModule implementation for " + obj, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Unable to instantiate GlideModule implementation for " + obj2, e3);
            }
        } catch (ClassNotFoundException e4) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e4);
        }
    }
}
