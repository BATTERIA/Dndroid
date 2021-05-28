package f;

import e.a.a.a.a;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

public final /* synthetic */ class s {
    public static /* synthetic */ List a(String str) {
        if (str != null) {
            try {
                return Arrays.asList(InetAddress.getAllByName(str));
            } catch (NullPointerException e2) {
                UnknownHostException unknownHostException = new UnknownHostException(a.b("Broken system behaviour for dns lookup of ", str));
                unknownHostException.initCause(e2);
                throw unknownHostException;
            }
        } else {
            throw new UnknownHostException("hostname == null");
        }
    }
}
