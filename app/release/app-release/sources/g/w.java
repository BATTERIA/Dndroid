package g;

import java.io.Closeable;
import java.io.Flushable;

public interface w extends Closeable, Flushable {
    void a(e eVar, long j);

    y c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Override // java.io.Flushable
    void flush();
}
