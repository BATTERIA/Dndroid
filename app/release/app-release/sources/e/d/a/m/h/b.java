package e.d.a.m.h;

import e.d.a.g;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class b implements c<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f3943a;
    public final String b;

    public b(byte[] bArr, String str) {
        this.f3943a = bArr;
        this.b = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.d.a.m.h.c
    public InputStream a(g gVar) {
        return new ByteArrayInputStream(this.f3943a);
    }

    @Override // e.d.a.m.h.c
    public String a() {
        return this.b;
    }

    @Override // e.d.a.m.h.c
    public void b() {
    }

    @Override // e.d.a.m.h.c
    public void cancel() {
    }
}
