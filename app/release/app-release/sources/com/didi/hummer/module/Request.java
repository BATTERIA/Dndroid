package com.didi.hummer.module;

import android.text.TextUtils;
import com.didi.hummer.annotation.Component;
import com.didi.hummer.annotation.JsMethod;
import com.didi.hummer.annotation.JsProperty;
import e.e.a.g;
import e.e.a.k;
import e.e.a.n.a.c;
import e.e.a.q.b.a;
import e.e.a.u.b;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

@Component
public class Request implements b {
    @JsProperty
    public Map<String, Object> header;
    public c httpAdapter;
    public AtomicBoolean isDestroyed = new AtomicBoolean(false);
    public e.e.a.q.b.c jsValue;
    @JsProperty
    public String method = "POST";
    @JsProperty
    public Map<String, Object> param;
    @JsProperty
    public int timeout = 10000;
    @JsProperty
    public String url = "";

    public Request(e.e.a.p.b bVar, e.e.a.q.b.c cVar) {
        this.jsValue = cVar;
        g a2 = k.a(bVar.f4442c);
        if (a2.f4297e == null) {
            a2.f4297e = new e.e.a.n.a.d.g();
        }
        this.httpAdapter = a2.f4297e;
    }

    public /* synthetic */ void a(a aVar, e.e.a.n.a.b bVar) {
        if (!this.isDestroyed.get()) {
            if (aVar != null) {
                aVar.a(bVar);
                aVar.d();
            }
            this.jsValue.k();
        }
    }

    @Override // e.e.a.u.b
    public void onCreate() {
    }

    @Override // e.e.a.u.b
    public void onDestroy() {
        this.isDestroyed.set(true);
        this.jsValue.k();
    }

    @JsMethod
    public void send(a aVar) {
        this.jsValue.l();
        ((e.e.a.n.a.d.g) this.httpAdapter).a(this.url, this.method, this.timeout, this.header, this.param, new e.e.a.v.b(this, aVar), Object.class);
    }

    public void setMethod(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.method = str.toUpperCase();
        }
    }

    public void setUrl(String str) {
        c cVar = this.httpAdapter;
        if (cVar != null) {
            if (((e.e.a.n.a.d.g) cVar) == null) {
                throw null;
            } else if (!TextUtils.isEmpty(null)) {
                this.url = null;
                return;
            }
        }
        this.url = str;
    }
}
