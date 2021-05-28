package e.e.a.s;

import android.text.TextUtils;
import e.e.a.n.f.b;
import e.e.a.s.d;
import org.json.JSONException;
import org.json.JSONObject;

public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d.a f4543a;
    public final /* synthetic */ d b;

    public c(d dVar, d.a aVar) {
        this.b = dVar;
        this.f4543a = aVar;
    }

    @Override // e.e.a.n.f.b
    public void a() {
    }

    @Override // e.e.a.n.f.b
    public void a(int i, String str) {
    }

    @Override // e.e.a.n.f.b
    public void a(String str) {
        String str2;
        d.a aVar = this.f4543a;
        String str3 = null;
        if (this.b != null) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    str2 = new JSONObject(str).getJSONObject("params").getString("url");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    if (str2.contains("?")) {
                        str2 = str2.substring(0, str2.indexOf("?"));
                    }
                    str3 = str2;
                }
            }
            aVar.a(str3);
            return;
        }
        throw null;
    }

    @Override // e.e.a.n.f.b
    public void b(String str) {
        this.f4543a.a(null);
    }
}
