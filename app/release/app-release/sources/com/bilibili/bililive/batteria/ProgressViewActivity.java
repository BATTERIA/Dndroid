package com.bilibili.bililive.batteria;

import a.g;
import android.os.Bundle;
import com.bilibili.bililive.batteria.view.ProgressView;
import com.bilibili.bililive.tests.R;
import d.b.k.h;

@g(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lcom/bilibili/bililive/batteria/ProgressViewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, mv = {1, 1, 16})
public final class ProgressViewActivity extends h {
    @Override // androidx.activity.ComponentActivity, d.b.k.h, d.g.d.b, d.j.d.d
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_progress_view);
        if (((ProgressView) findViewById(R.id.test)) != null) {
            System.out.print(1);
            return;
        }
        throw null;
    }
}
