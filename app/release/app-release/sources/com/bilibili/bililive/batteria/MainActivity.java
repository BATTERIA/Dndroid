package com.bilibili.bililive.batteria;

import a.a.c;
import a.a.o;
import a.g;
import a.q;
import a.w.c.i;
import a.w.c.j;
import a.w.c.s;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.bililive.batteria.Testp2p;
import com.bilibili.bililive.batteria.imageloader.ImageLoaderActivity;
import com.bilibili.bililive.batteria.recycler.RecyclerActivity;
import com.bilibili.bililive.batteria.webview.WebViewActivity;
import com.bilibili.bililive.infra.util.cache.api.CacheActivity;
import com.bilibili.bililive.tests.R;
import d.b.k.h;
import e.b.a.a.b;
import e.b.a.a.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@g(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0002¨\u0006\b"}, d2 = {"Lcom/bilibili/bililive/batteria/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "test", "app_release"}, mv = {1, 1, 16})
public final class MainActivity extends h {

    /* compiled from: com.android.tools.r8.jetbrains.kotlin-style lambda group */
    public static final class a extends j implements a.w.b.a<q> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f2590c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Object f2591d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i, Object obj) {
            super(0);
            this.f2590c = i;
            this.f2591d = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public final q a() {
            T t = null;
            switch (this.f2590c) {
                case 0:
                    Iterator<T> it = e.f.a.g.e((c<?>) s.a(Testp2p.class)).iterator();
                    while (it.hasNext()) {
                        Log.e("p2p-test", String.valueOf(it.next().get()));
                    }
                    Log.e("p2p-test", "static size " + ((ArrayList) e.f.a.g.e((c<?>) s.a(Testp2p.class))).size());
                    StringBuilder sb = new StringBuilder();
                    sb.append("extension size ");
                    c a2 = s.a(Testp2p.class);
                    if (a2 != null) {
                        Collection<a.a.a.a.g<?>> a3 = ((a.a.a.a.a) a2).f0d.a().a();
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it2 = a3.iterator();
                        while (true) {
                            boolean z = true;
                            if (it2.hasNext()) {
                                T next = it2.next();
                                T t2 = next;
                                if (!(t2.e().g0() != null) || !(t2 instanceof o)) {
                                    z = false;
                                }
                                if (z) {
                                    arrayList.add(next);
                                }
                            } else {
                                sb.append(arrayList.size());
                                Log.e("p2p-test", sb.toString());
                                Log.e("p2p-test", "touch size " + ((ArrayList) e.f.a.g.d(s.a(Testp2p.class))).size());
                                Testp2p.Companion companion = Testp2p.Companion;
                                Log.e("p2p-test", "size " + ((ArrayList) e.f.a.g.d(s.a(companion.getClass()))).size());
                                Iterator<T> it3 = e.f.a.g.e((c<?>) s.a(Testp2p.Companion.class)).iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        T next2 = it3.next();
                                        if (i.a((Object) "trackerServer", (Object) next2.d())) {
                                            t = next2;
                                        }
                                    }
                                }
                                T t3 = t;
                                if (t3 instanceof a.a.g) {
                                    t3.i().a(companion, "test");
                                } else {
                                    z = false;
                                }
                                Toast.makeText((MainActivity) this.f2591d, "success: " + z, 0).show();
                                return q.f2100a;
                            }
                        }
                    } else {
                        i.a("$this$memberExtensionProperties");
                        throw null;
                    }
                case 1:
                    ((MainActivity) this.f2591d).startActivity(new Intent((MainActivity) this.f2591d, WebViewActivity.class));
                    return q.f2100a;
                case 2:
                    ((MainActivity) this.f2591d).startActivity(new Intent((MainActivity) this.f2591d, ImageLoaderActivity.class));
                    return q.f2100a;
                case 3:
                    new e().show(((MainActivity) this.f2591d).getFragmentManager(), "socket");
                    return q.f2100a;
                case 4:
                    ((MainActivity) this.f2591d).startActivity(new Intent((MainActivity) this.f2591d, ProgressActivity.class));
                    return q.f2100a;
                case 5:
                    ((MainActivity) this.f2591d).startActivity(new Intent((MainActivity) this.f2591d, ProgressViewActivity.class));
                    return q.f2100a;
                case 6:
                    ((MainActivity) this.f2591d).startActivity(new Intent((MainActivity) this.f2591d, CacheActivity.class));
                    return q.f2100a;
                case 7:
                    ((MainActivity) this.f2591d).startActivity(new Intent((MainActivity) this.f2591d, RecyclerActivity.class));
                    return q.f2100a;
                case 8:
                    ((MainActivity) this.f2591d).startActivity(new Intent((MainActivity) this.f2591d, ImageLoaderActivity.class));
                    return q.f2100a;
                default:
                    throw null;
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, d.b.k.h, d.g.d.b, d.j.d.d
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2228d.a(new MainActivity$onCreate$1());
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        i.a((Object) recyclerView, "recyclerView");
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        b bVar = new b();
        List g2 = e.f.a.g.g(new e.b.a.a.a("WebView", R.drawable.web, new a(1, this)), new e.b.a.a.a("ImageLoader", R.drawable.image, new a(2, this)), new e.b.a.a.a("Socket", R.drawable.network, new a(3, this)), new e.b.a.a.a("Progress", R.drawable.progress, new a(4, this)), new e.b.a.a.a("ProgressView", R.drawable.progress, new a(5, this)), new e.b.a.a.a("Cache", R.drawable.ic_more_cache, new a(6, this)), new e.b.a.a.a("RecyclerView", R.drawable.list, new a(7, this)), new e.b.a.a.a("Fresco", R.drawable.image, new a(8, this)), new e.b.a.a.a("Touch", R.drawable.ic_more_cache, new a(0, this)));
        if (g2 != null) {
            bVar.f3743c.addAll(g2);
            recyclerView.setAdapter(bVar);
            return;
        }
        i.a("items");
        throw null;
    }
}
