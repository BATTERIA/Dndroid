package a.a.a.a.v0.h;

import a.a.a.a.v0.h.a;
import a.a.a.a.v0.h.q;
import java.io.IOException;
import java.io.InputStream;

public abstract class b<MessageType extends q> implements s<MessageType> {
    static {
        g gVar = g.b;
    }

    public final MessageType a(MessageType messagetype) {
        v vVar;
        if (messagetype == null || messagetype.g()) {
            return messagetype;
        }
        if (messagetype instanceof a) {
            a aVar = (a) messagetype;
            vVar = new v();
        } else {
            vVar = new v();
        }
        k kVar = new k(vVar.getMessage());
        kVar.f1407c = messagetype;
        throw kVar;
    }

    public MessageType b(InputStream inputStream, g gVar) {
        e eVar = new e(inputStream);
        MessageType messagetype = (MessageType) ((q) a(eVar, gVar));
        try {
            eVar.a(0);
            return messagetype;
        } catch (k e2) {
            e2.f1407c = messagetype;
            throw e2;
        }
    }

    public Object a(InputStream inputStream, g gVar) {
        MessageType messagetype;
        try {
            int read = inputStream.read();
            if (read == -1) {
                messagetype = null;
            } else {
                if ((read & 128) != 0) {
                    read &= 127;
                    int i = 7;
                    while (true) {
                        if (i < 32) {
                            int read2 = inputStream.read();
                            if (read2 != -1) {
                                read |= (read2 & 127) << i;
                                if ((read2 & 128) == 0) {
                                    break;
                                }
                                i += 7;
                            } else {
                                throw k.c();
                            }
                        } else {
                            while (i < 64) {
                                int read3 = inputStream.read();
                                if (read3 == -1) {
                                    throw k.c();
                                } else if ((read3 & 128) != 0) {
                                    i += 7;
                                }
                            }
                            throw new k("CodedInputStream encountered a malformed varint.");
                        }
                    }
                }
                messagetype = b(new a.AbstractC0055a.C0056a(inputStream, read), gVar);
            }
            a(messagetype);
            return messagetype;
        } catch (IOException e2) {
            throw new k(e2.getMessage());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: a.a.a.a.v0.h.b<MessageType extends a.a.a.a.v0.h.q> */
    /* JADX WARN: Multi-variable type inference failed */
    public Object a(d dVar, g gVar) {
        try {
            e e2 = dVar.e();
            q qVar = (q) a(e2, gVar);
            try {
                e2.a(0);
                a(qVar);
                return qVar;
            } catch (k e3) {
                e3.f1407c = qVar;
                throw e3;
            }
        } catch (k e4) {
            throw e4;
        }
    }
}
