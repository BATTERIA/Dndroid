package d.b.n.i;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import d.b.n.i.k;
import d.g.l.b;

public class l extends k {

    public class a extends k.a implements ActionProvider.VisibilityListener {

        /* renamed from: d  reason: collision with root package name */
        public b.a f2839d;

        public a(l lVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // d.g.l.b
        public View a(MenuItem menuItem) {
            return this.b.onCreateActionView(menuItem);
        }

        @Override // d.g.l.b
        public void a(b.a aVar) {
            this.f2839d = aVar;
            this.b.setVisibilityListener(aVar != null ? this : null);
        }

        @Override // d.g.l.b
        public boolean a() {
            return this.b.isVisible();
        }

        @Override // d.g.l.b
        public boolean b() {
            return this.b.overridesItemVisibility();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            b.a aVar = this.f2839d;
            if (aVar != null) {
                h hVar = j.this.n;
                hVar.f2824h = true;
                hVar.b(true);
            }
        }
    }

    public l(Context context, d.g.g.a.b bVar) {
        super(context, bVar);
    }

    @Override // d.b.n.i.k
    public k.a a(ActionProvider actionProvider) {
        return new a(this, this.b, actionProvider);
    }
}
