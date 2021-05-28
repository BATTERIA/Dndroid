package a.a.a.a.v0.h;

import java.io.IOException;

public class k extends IOException {

    /* renamed from: c  reason: collision with root package name */
    public q f1407c = null;

    public k(String str) {
        super(str);
    }

    public static k a() {
        return new k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static k b() {
        return new k("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static k c() {
        return new k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public k a(q qVar) {
        this.f1407c = qVar;
        return this;
    }
}
