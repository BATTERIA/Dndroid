package com.didi.hummer;

import android.content.Context;
import android.view.MotionEvent;
import com.didi.hummer.core.engine.jsc.jni.HummerException;
import com.didi.hummer.render.style.HummerLayout;
import d.b.k.h;
import e.c.a.b.l;
import e.e.a.j;
import e.e.a.k;
import e.e.a.n.d.c;
import e.e.a.n.f.d.a;
import e.e.a.q.d.b;
import e.e.a.s.d;
import java.util.Map;

public class HummerActivity extends h {
    public c s;
    public HummerLayout t;
    public j u;

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finish() {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.didi.hummer.HummerActivity.finish():void");
    }

    public c j() {
        return (c) getIntent().getSerializableExtra("PAGE_MODEL");
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        j jVar = this.u;
        if (jVar != null) {
            e.e.a.q.b.c cVar = jVar.f4309a.f4447h;
            boolean z = false;
            if (cVar != null) {
                Object a2 = cVar.a("onBack", new Object[0]);
                if (a2 instanceof Boolean) {
                    z = ((Boolean) a2).booleanValue();
                }
            }
            if (z) {
                return;
            }
        }
        this.f2231g.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0208 A[SYNTHETIC, Splitter:B:105:0x0208] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01f5 A[SYNTHETIC, Splitter:B:96:0x01f5] */
    @Override // androidx.activity.ComponentActivity, d.b.k.h, d.g.d.b, d.j.d.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 682
        */
        throw new UnsupportedOperationException("Method not decompiled: com.didi.hummer.HummerActivity.onCreate(android.os.Bundle):void");
    }

    @Override // d.b.k.h, d.j.d.d
    public void onDestroy() {
        a aVar;
        super.onDestroy();
        j jVar = this.u;
        if (jVar != null) {
            jVar.b.set(true);
            if (b.f4498a) {
                k.a();
                d dVar = jVar.f4310c;
                if (!(dVar == null || (aVar = dVar.f4544a) == null)) {
                    aVar.a(e.e.a.n.f.c.CLOSE_GOING_AWAY.f4365c, "CLOSE_GOING_AWAY");
                    dVar.f4544a = null;
                }
            }
            e.e.a.p.b bVar = jVar.f4309a;
            if (bVar != null) {
                l.f.a("HummerNative", "HummerContext.onDestroy");
                long currentTimeMillis = System.currentTimeMillis();
                e.e.a.q.b.c cVar = bVar.f4447h;
                if (cVar != null) {
                    cVar.a("onDestroy", new Object[0]);
                }
                bVar.f4445f.onDestroy();
                e.e.a.v.t.b.a(bVar.f4446g);
                HummerException.removeJSContextExceptionCallback(bVar.f4446g);
                bVar.a();
                e.e.a.a0.d.a(bVar.f4442c, "HummerContext.onDestroy", (Map<String, Object>) null, currentTimeMillis);
                return;
            }
            throw null;
        }
    }

    @Override // d.j.d.d
    public void onPause() {
        super.onPause();
        j jVar = this.u;
        if (jVar != null) {
            e.e.a.p.b bVar = jVar.f4309a;
            if (bVar != null) {
                l.f.a("HummerNative", "HummerContext.onPause");
                bVar.k = false;
                e.e.a.q.b.c cVar = bVar.f4447h;
                if (cVar != null) {
                    cVar.a("onDisappear", new Object[0]);
                }
                bVar.f4445f.onPause();
                return;
            }
            throw null;
        }
    }

    @Override // d.j.d.d
    public void onResume() {
        super.onResume();
        j jVar = this.u;
        if (jVar != null) {
            e.e.a.p.b bVar = jVar.f4309a;
            if (bVar != null) {
                l.f.a("HummerNative", "HummerContext.onResume");
                bVar.k = true;
                bVar.b();
                return;
            }
            throw null;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            l.f.a((Context) this);
        }
        return super.onTouchEvent(motionEvent);
    }
}
