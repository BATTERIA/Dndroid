package e.h.a;

import e.f.a.g;
import e.h.a.h0.a;

public final class v {
    public static q a(a aVar) {
        boolean z = aVar.f4809d;
        aVar.f4809d = true;
        try {
            q a2 = g.a(aVar);
            aVar.f4809d = z;
            return a2;
        } catch (StackOverflowError e2) {
            throw new u("Failed parsing JSON source: " + aVar + " to Json", e2);
        } catch (OutOfMemoryError e3) {
            throw new u("Failed parsing JSON source: " + aVar + " to Json", e3);
        } catch (Throwable th) {
            aVar.f4809d = z;
            throw th;
        }
    }
}
