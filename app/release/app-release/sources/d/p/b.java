package d.p;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry$1;
import d.l.e;
import d.l.i;
import d.p.a;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final c f3677a;
    public final a b = new a();

    public b(c cVar) {
        this.f3677a = cVar;
    }

    public void a(Bundle bundle) {
        e a2 = this.f3677a.a();
        if (((i) a2).b == e.b.INITIALIZED) {
            a2.a(new Recreator(this.f3677a));
            a aVar = this.b;
            if (!aVar.f3674c) {
                if (bundle != null) {
                    aVar.b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
                a2.a(new SavedStateRegistry$1(aVar));
                aVar.f3674c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void b(Bundle bundle) {
        a aVar = this.b;
        if (aVar != null) {
            Bundle bundle2 = new Bundle();
            Bundle bundle3 = aVar.b;
            if (bundle3 != null) {
                bundle2.putAll(bundle3);
            }
            d.c.a.b.b<K, V>.d a2 = aVar.f3673a.a();
            while (a2.hasNext()) {
                Map.Entry entry = (Map.Entry) a2.next();
                bundle2.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
            }
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
            return;
        }
        throw null;
    }
}
