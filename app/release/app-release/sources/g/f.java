package g;

import java.nio.channels.WritableByteChannel;

public interface f extends w, WritableByteChannel {
    f a(long j);

    f a(String str);

    e b();

    f e();

    f f();

    @Override // g.w, java.io.Flushable
    void flush();

    f write(byte[] bArr);

    f write(byte[] bArr, int i, int i2);

    f writeByte(int i);

    f writeInt(int i);

    f writeShort(int i);
}
