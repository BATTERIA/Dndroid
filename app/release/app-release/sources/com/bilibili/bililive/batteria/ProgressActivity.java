package com.bilibili.bililive.batteria;

import a.g;
import a.w.c.i;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import com.bilibili.bililive.tests.R;
import d.b.k.h;

@g(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lcom/bilibili/bililive/batteria/ProgressActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, mv = {1, 1, 16})
public final class ProgressActivity extends h {

    /* compiled from: java-style lambda group */
    public static final class a implements View.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f2594c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Object f2595d;

        public a(int i, Object obj) {
            this.f2594c = i;
            this.f2595d = obj;
        }

        public final void onClick(View view) {
            int i = this.f2594c;
            if (i == 0) {
                ((ProgressBar) this.f2595d).incrementProgressBy(-10);
            } else if (i == 1) {
                ((ProgressBar) this.f2595d).incrementProgressBy(10);
            } else if (i == 2) {
                ProgressBar progressBar = (ProgressBar) this.f2595d;
                i.a((Object) progressBar, "progress");
                progressBar.setProgress(80);
            } else if (i == 3) {
                ProgressBar progressBar2 = (ProgressBar) this.f2595d;
                i.a((Object) progressBar2, "progress");
                progressBar2.setProgress(30);
            } else {
                throw null;
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, d.b.k.h, d.g.d.b, d.j.d.d
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_progress);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress);
        ((Button) findViewById(R.id.bt1)).setOnClickListener(new a(0, progressBar));
        ((Button) findViewById(R.id.bt2)).setOnClickListener(new a(1, progressBar));
        ((Button) findViewById(R.id.bt3)).setOnClickListener(new a(2, progressBar));
        ((Button) findViewById(R.id.bt4)).setOnClickListener(new a(3, progressBar));
    }
}
