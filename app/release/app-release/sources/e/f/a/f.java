package e.f.a;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

public final class f implements Closeable {

    /* renamed from: c  reason: collision with root package name */
    public final FileOutputStream f4637c;

    /* renamed from: d  reason: collision with root package name */
    public final FileLock f4638d;

    public f(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f4637c = fileOutputStream;
        try {
            FileLock lock = fileOutputStream.getChannel().lock();
            if (lock == null) {
            }
            this.f4638d = lock;
        } finally {
            this.f4637c.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            if (this.f4638d != null) {
                this.f4638d.release();
            }
        } finally {
            this.f4637c.close();
        }
    }
}
