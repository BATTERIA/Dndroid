package e.h.a;

import e.h.a.f0.z.o;
import e.h.a.h0.c;
import java.io.IOException;
import java.io.StringWriter;

public abstract class q {
    public w a() {
        if (this instanceof w) {
            return (w) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c cVar = new c(stringWriter);
            cVar.f4825h = true;
            o.X.a(cVar, this);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
