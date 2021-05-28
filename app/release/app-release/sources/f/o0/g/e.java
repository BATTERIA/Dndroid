package f.o0.g;

import e.a.a.a.a;
import f.j;
import f.k0;
import f.o0.g.k;
import f.u;
import f.y;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final l f5116a;
    public final f.e b;

    /* renamed from: c  reason: collision with root package name */
    public final h f5117c;

    /* renamed from: d  reason: collision with root package name */
    public final j f5118d;

    /* renamed from: e  reason: collision with root package name */
    public final u f5119e;

    /* renamed from: f  reason: collision with root package name */
    public k.a f5120f;

    /* renamed from: g  reason: collision with root package name */
    public final k f5121g;

    /* renamed from: h  reason: collision with root package name */
    public g f5122h;
    public boolean i;
    public k0 j;

    public e(l lVar, h hVar, f.e eVar, j jVar, u uVar) {
        this.f5116a = lVar;
        this.f5117c = hVar;
        this.b = eVar;
        this.f5118d = jVar;
        this.f5119e = uVar;
        this.f5121g = new k(eVar, hVar.f5134e, jVar, uVar);
    }

    public final g a(int i2, int i3, int i4, int i5, boolean z) {
        Socket e2;
        g gVar;
        g gVar2;
        int i6;
        k0 k0Var;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        Socket socket;
        k.a aVar;
        String str;
        int i7;
        k0 k0Var2;
        synchronized (this.f5117c) {
            if (!this.f5116a.d()) {
                this.i = false;
                g gVar3 = this.f5116a.i;
                e2 = (this.f5116a.i == null || !this.f5116a.i.k) ? null : this.f5116a.e();
                if (this.f5116a.i != null) {
                    gVar2 = this.f5116a.i;
                    gVar = null;
                } else {
                    gVar = gVar3;
                    gVar2 = null;
                }
                i6 = 1;
                if (gVar2 == null) {
                    if (this.f5117c.a(this.b, this.f5116a, null, false)) {
                        gVar2 = this.f5116a.i;
                        z2 = true;
                        k0Var = null;
                    } else {
                        if (this.j != null) {
                            k0Var2 = this.j;
                            this.j = null;
                        } else if (c()) {
                            k0Var2 = this.f5116a.i.f5124c;
                        }
                        k0Var = k0Var2;
                        z2 = false;
                    }
                }
                k0Var2 = null;
                k0Var = k0Var2;
                z2 = false;
            } else {
                throw new IOException("Canceled");
            }
        }
        f.o0.e.a(e2);
        if (gVar != null && this.f5119e == null) {
            throw null;
        } else if (z2 && this.f5119e == null) {
            throw null;
        } else if (gVar2 != null) {
            return gVar2;
        } else {
            if (k0Var != null || ((aVar = this.f5120f) != null && aVar.a())) {
                z3 = false;
            } else {
                k kVar = this.f5121g;
                if (kVar.a()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (kVar.b()) {
                        if (kVar.b()) {
                            List<Proxy> list = kVar.f5142e;
                            int i8 = kVar.f5143f;
                            kVar.f5143f = i8 + 1;
                            Proxy proxy = list.get(i8);
                            kVar.f5144g = new ArrayList();
                            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                y yVar = kVar.f5139a.f4998a;
                                str = yVar.f5405d;
                                i7 = yVar.f5406e;
                            } else {
                                SocketAddress address = proxy.address();
                                if (address instanceof InetSocketAddress) {
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    str = address2 == null ? inetSocketAddress.getHostName() : address2.getHostAddress();
                                    i7 = inetSocketAddress.getPort();
                                } else {
                                    StringBuilder a2 = a.a("Proxy.address() is not an InetSocketAddress: ");
                                    a2.append(address.getClass());
                                    throw new IllegalArgumentException(a2.toString());
                                }
                            }
                            if (i7 < i6 || i7 > 65535) {
                                throw new SocketException("No route to " + str + ":" + i7 + "; port is out of range");
                            }
                            if (proxy.type() == Proxy.Type.SOCKS) {
                                kVar.f5144g.add(InetSocketAddress.createUnresolved(str, i7));
                            } else if (kVar.f5141d != null) {
                                List<InetAddress> a3 = kVar.f5139a.b.a(str);
                                if (a3.isEmpty()) {
                                    throw new UnknownHostException(kVar.f5139a.b + " returned no addresses for " + str);
                                } else if (kVar.f5141d != null) {
                                    int size = a3.size();
                                    for (int i9 = 0; i9 < size; i9++) {
                                        kVar.f5144g.add(new InetSocketAddress(a3.get(i9), i7));
                                    }
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                            int size2 = kVar.f5144g.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                k0 k0Var3 = new k0(kVar.f5139a, proxy, kVar.f5144g.get(i10));
                                if (kVar.b.c(k0Var3)) {
                                    kVar.f5145h.add(k0Var3);
                                } else {
                                    arrayList2.add(k0Var3);
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                break;
                            }
                            i6 = 1;
                        } else {
                            StringBuilder a4 = a.a("No route to ");
                            a4.append(kVar.f5139a.f4998a.f5405d);
                            a4.append("; exhausted proxy configurations: ");
                            a4.append(kVar.f5142e);
                            throw new SocketException(a4.toString());
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2.addAll(kVar.f5145h);
                        kVar.f5145h.clear();
                    }
                    this.f5120f = new k.a(arrayList2);
                    z3 = true;
                } else {
                    throw new NoSuchElementException();
                }
            }
            synchronized (this.f5117c) {
                if (!this.f5116a.d()) {
                    if (z3) {
                        k.a aVar2 = this.f5120f;
                        if (aVar2 != null) {
                            arrayList = new ArrayList(aVar2.f5146a);
                            if (this.f5117c.a(this.b, this.f5116a, arrayList, false)) {
                                gVar2 = this.f5116a.i;
                                z2 = true;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        arrayList = null;
                    }
                    if (!z2) {
                        if (k0Var == null) {
                            k.a aVar3 = this.f5120f;
                            if (aVar3.a()) {
                                List<k0> list2 = aVar3.f5146a;
                                int i11 = aVar3.b;
                                aVar3.b = i11 + 1;
                                k0Var = list2.get(i11);
                            } else {
                                throw new NoSuchElementException();
                            }
                        }
                        gVar2 = new g(this.f5117c, k0Var);
                        this.f5122h = gVar2;
                    }
                } else {
                    throw new IOException("Canceled");
                }
            }
            if (!z2) {
                gVar2.a(i2, i3, i4, i5, z, this.f5118d, this.f5119e);
                this.f5117c.f5134e.a(gVar2.f5124c);
                synchronized (this.f5117c) {
                    this.f5122h = null;
                    if (this.f5117c.a(this.b, this.f5116a, arrayList, true)) {
                        gVar2.k = true;
                        socket = gVar2.f5126e;
                        gVar2 = this.f5116a.i;
                        this.j = k0Var;
                    } else {
                        h hVar = this.f5117c;
                        if (!hVar.f5135f) {
                            hVar.f5135f = true;
                            h.f5130g.execute(hVar.f5132c);
                        }
                        hVar.f5133d.add(gVar2);
                        this.f5116a.a(gVar2);
                        socket = null;
                    }
                }
                f.o0.e.a(socket);
                if (this.f5119e != null) {
                    return gVar2;
                }
                throw null;
            } else if (this.f5119e != null) {
                return gVar2;
            } else {
                throw null;
            }
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this.f5117c) {
            z = this.i;
        }
        return z;
    }

    public final boolean c() {
        g gVar = this.f5116a.i;
        return gVar != null && gVar.l == 0 && f.o0.e.a(gVar.f5124c.f5048a.f4998a, this.b.f4998a);
    }

    public void d() {
        synchronized (this.f5117c) {
            this.i = true;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r0.f5126e.isClosed() != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r0.f5126e.isInputShutdown() != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r0.f5126e.isOutputShutdown() == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        r1 = r0.f5129h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r1 == null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        r2 = r1.f(java.lang.System.nanoTime());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        if (r12 == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3 = r0.f5126e.getSoTimeout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0.f5126e.setSoTimeout(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        if (r0.i.i() == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        r0.f5126e.setSoTimeout(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        r0.f5126e.setSoTimeout(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        r0.f5126e.setSoTimeout(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        throw r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067 A[LOOP:0: B:0:0x0000->B:35:0x0067, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x006b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final f.o0.g.g a(int r7, int r8, int r9, int r10, boolean r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: f.o0.g.e.a(int, int, int, int, boolean, boolean):f.o0.g.g");
    }

    public boolean a() {
        synchronized (this.f5117c) {
            boolean z = true;
            if (this.j != null) {
                return true;
            }
            if (c()) {
                this.j = this.f5116a.i.f5124c;
                return true;
            }
            if (this.f5120f == null || !this.f5120f.a()) {
                if (!this.f5121g.a()) {
                    z = false;
                }
            }
            return z;
        }
    }
}
