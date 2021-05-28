package a.a.a.a.v0.h;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f1406a;

    public interface a {
        int getNumber();
    }

    public interface b<T extends a> {
        T a(int i);
    }

    static {
        byte[] bArr = new byte[0];
        f1406a = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static String a(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }
}
