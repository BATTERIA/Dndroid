package g;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

public interface g extends x, ReadableByteChannel {
    int a(q qVar);

    long a(byte b);

    String a(Charset charset);

    @Deprecated
    e b();

    h b(long j);

    void b(e eVar, long j);

    String c(long j);

    short d();

    void d(long j);

    byte[] e(long j);

    String g();

    e getBuffer();

    int h();

    boolean i();

    long j();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j);
}
