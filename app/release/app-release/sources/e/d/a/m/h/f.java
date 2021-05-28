package e.d.a.m.h;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import e.d.a.g;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

public class f implements c<InputStream> {

    /* renamed from: f  reason: collision with root package name */
    public static final c f3944f = new b(null);

    /* renamed from: a  reason: collision with root package name */
    public final e.d.a.m.j.c f3945a;
    public final c b;

    /* renamed from: c  reason: collision with root package name */
    public HttpURLConnection f3946c;

    /* renamed from: d  reason: collision with root package name */
    public InputStream f3947d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f3948e;

    public static class b implements c {
        public b() {
        }

        public /* synthetic */ b(a aVar) {
        }
    }

    public interface c {
    }

    public f(e.d.a.m.j.c cVar) {
        c cVar2 = f3944f;
        this.f3945a = cVar;
        this.b = cVar2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.d.a.m.h.c
    public InputStream a(g gVar) {
        e.d.a.m.j.c cVar = this.f3945a;
        if (cVar.f4058e == null) {
            if (TextUtils.isEmpty(cVar.f4057d)) {
                String str = cVar.f4056c;
                if (TextUtils.isEmpty(str)) {
                    str = cVar.f4055a.toString();
                }
                cVar.f4057d = Uri.encode(str, "@#&=*+-_.,:!?()/~'%");
            }
            cVar.f4058e = new URL(cVar.f4057d);
        }
        return a(cVar.f4058e, 0, null, this.f3945a.b.a());
    }

    @Override // e.d.a.m.h.c
    public String a() {
        return this.f3945a.a();
    }

    @Override // e.d.a.m.h.c
    public void b() {
        InputStream inputStream = this.f3947d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f3946c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // e.d.a.m.h.c
    public void cancel() {
        this.f3948e = true;
    }

    public final InputStream a(URL url, int i, URL url2, Map<String, String> map) {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new IOException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            if (((b) this.b) != null) {
                this.f3946c = (HttpURLConnection) url.openConnection();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    this.f3946c.addRequestProperty(entry.getKey(), entry.getValue());
                }
                this.f3946c.setConnectTimeout(2500);
                this.f3946c.setReadTimeout(2500);
                this.f3946c.setUseCaches(false);
                this.f3946c.setDoInput(true);
                this.f3946c.connect();
                if (this.f3948e) {
                    return null;
                }
                int responseCode = this.f3946c.getResponseCode();
                int i2 = responseCode / 100;
                if (i2 == 2) {
                    HttpURLConnection httpURLConnection = this.f3946c;
                    if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                        this.f3947d = new e.d.a.s.b(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
                    } else {
                        if (Log.isLoggable("HttpUrlFetcher", 3)) {
                            StringBuilder a2 = e.a.a.a.a.a("Got non empty content encoding: ");
                            a2.append(httpURLConnection.getContentEncoding());
                            Log.d("HttpUrlFetcher", a2.toString());
                        }
                        this.f3947d = httpURLConnection.getInputStream();
                    }
                    return this.f3947d;
                } else if (i2 == 3) {
                    String headerField = this.f3946c.getHeaderField("Location");
                    if (!TextUtils.isEmpty(headerField)) {
                        return a(new URL(url, headerField), i + 1, url, map);
                    }
                    throw new IOException("Received empty or null redirect url");
                } else if (responseCode == -1) {
                    throw new IOException("Unable to retrieve response code from HttpUrlConnection.");
                } else {
                    StringBuilder a3 = e.a.a.a.a.a("Request failed ", responseCode, ": ");
                    a3.append(this.f3946c.getResponseMessage());
                    throw new IOException(a3.toString());
                }
            } else {
                throw null;
            }
        } else {
            throw new IOException("Too many (> 5) redirects!");
        }
    }
}
