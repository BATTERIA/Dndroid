package com.didi.hummer.component.loading;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.didi.hummer.annotation.Component;
import e.e.a.o.a;
import e.e.a.p.b;
import e.e.a.q.b.c;
import e.e.a.y.a.b.j;

@Component
public class Loading extends j<FrameLayout> {
    public ProgressBar progress;

    public Loading(b bVar, c cVar, String str) {
        super(bVar, cVar, str);
        ProgressBar progressBar = new ProgressBar(getContext());
        this.progress = progressBar;
        progressBar.setIndeterminateDrawable(getContext().getResources().getDrawable(a.loading_anim));
        ((FrameLayout) getView()).addView(this.progress, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // e.e.a.y.a.b.j
    public FrameLayout createViewInstance(Context context) {
        return new FrameLayout(context);
    }
}
