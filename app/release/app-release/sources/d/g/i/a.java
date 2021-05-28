package d.g.i;

import android.util.Base64;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f3284a;
    public final String b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3285c;

    /* renamed from: d  reason: collision with root package name */
    public final List<List<byte[]>> f3286d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3287e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3288f;

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        if (str != null) {
            this.f3284a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.f3285c = str3;
                    if (list != null) {
                        this.f3286d = list;
                        this.f3287e = 0;
                        this.f3288f = str + "-" + this.b + "-" + this.f3285c;
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder a2 = e.a.a.a.a.a("FontRequest {mProviderAuthority: ");
        a2.append(this.f3284a);
        a2.append(", mProviderPackage: ");
        a2.append(this.b);
        a2.append(", mQuery: ");
        a2.append(this.f3285c);
        a2.append(", mCertificates:");
        sb.append(a2.toString());
        for (int i = 0; i < this.f3286d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f3286d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f3287e);
        return sb.toString();
    }
}
