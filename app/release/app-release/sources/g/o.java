package g;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f5454a = Logger.getLogger(o.class.getName());

    public class a implements x {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ y f5455c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ InputStream f5456d;

        public a(y yVar, InputStream inputStream) {
            this.f5455c = yVar;
            this.f5456d = inputStream;
        }

        @Override // g.x
        public long c(e eVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (j == 0) {
                return 0;
            } else {
                try {
                    this.f5455c.e();
                    t a2 = eVar.a(1);
                    int read = this.f5456d.read(a2.f5465a, a2.f5466c, (int) Math.min(j, (long) (8192 - a2.f5466c)));
                    if (read == -1) {
                        return -1;
                    }
                    a2.f5466c += read;
                    long j2 = (long) read;
                    eVar.f5428d += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (o.a(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
            }
        }

        @Override // g.x
        public y c() {
            return this.f5455c;
        }

        @Override // g.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f5456d.close();
        }

        public String toString() {
            StringBuilder a2 = e.a.a.a.a.a("source(");
            a2.append(this.f5456d);
            a2.append(")");
            return a2.toString();
        }
    }

    public static f a(w wVar) {
        return new r(wVar);
    }

    public static g a(x xVar) {
        return new s(xVar);
    }

    public static w a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            p pVar = new p(socket);
            OutputStream outputStream = socket.getOutputStream();
            if (outputStream != null) {
                return new a(pVar, new n(pVar, outputStream));
            }
            throw new IllegalArgumentException("out == null");
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    public static x a(InputStream inputStream) {
        return a(inputStream, new y());
    }

    public static x a(InputStream inputStream, y yVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (yVar != null) {
            return new a(yVar, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static x b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            p pVar = new p(socket);
            return new b(pVar, a(socket.getInputStream(), pVar));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }
}
