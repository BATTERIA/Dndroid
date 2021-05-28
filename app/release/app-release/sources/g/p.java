package g;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class p extends c {
    public final /* synthetic */ Socket k;

    public p(Socket socket) {
        this.k = socket;
    }

    @Override // g.c
    public IOException a(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.AssertionError */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // g.c
    public void i() {
        StringBuilder sb;
        Level level;
        Logger logger;
        Exception exc;
        try {
            this.k.close();
            return;
        } catch (Exception e2) {
            Logger logger2 = o.f5454a;
            level = Level.WARNING;
            sb = new StringBuilder();
            exc = e2;
            logger = logger2;
        } catch (AssertionError e3) {
            if (o.a(e3)) {
                Logger logger3 = o.f5454a;
                level = Level.WARNING;
                sb = new StringBuilder();
                exc = e3;
                logger = logger3;
            } else {
                throw e3;
            }
        }
        sb.append("Failed to close timed out socket ");
        sb.append(this.k);
        logger.log(level, sb.toString(), (Throwable) exc);
    }
}
