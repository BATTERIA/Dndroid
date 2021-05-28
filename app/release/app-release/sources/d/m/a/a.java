package d.m.a;

import d.l.h;
import d.l.v;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a {
    public static <T extends h & v> a a(T t) {
        return new b(t, t.e());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
