package com.bilibili.bililive.batteria.recycler;

import a.g;
import a.w.c.i;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.bililive.tests.R;
import d.b.k.h;
import d.j.d.q;
import d.j.d.v;
import e.b.a.a.g.b;
import java.util.List;

@g(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\u0006H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bilibili/bililive/batteria/recycler/RecyclerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "app_release"}, mv = {1, 1, 16})
public final class RecyclerActivity extends h {
    public ViewPager s;

    public static final class a extends v {

        /* renamed from: g  reason: collision with root package name */
        public final List<Fragment> f2602g = e.f.a.g.g(new InteractionFragment(), new e.b.a.a.g.g(), new b("B"));

        public a(RecyclerActivity recyclerActivity, q qVar) {
            super(qVar);
        }

        @Override // d.s.a.a
        public int a() {
            return this.f2602g.size();
        }
    }

    @Override // androidx.activity.ComponentActivity, d.b.k.h, d.g.d.b, d.j.d.d
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_recycler);
        i.a((Object) getBaseContext(), "baseContext");
        ViewPager viewPager = (ViewPager) findViewById(R.id.vp);
        this.s = viewPager;
        if (viewPager != null) {
            viewPager.setAdapter(new a(this, f()));
        }
    }

    @Override // d.b.k.h, d.j.d.d
    public void onDestroy() {
        super.onDestroy();
    }
}
