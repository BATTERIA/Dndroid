package e.d.a.m.h;

import android.content.res.AssetManager;
import java.io.InputStream;

public class h extends a<InputStream> {
    public h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // e.d.a.m.h.a
    public void a(InputStream inputStream) {
        inputStream.close();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.d.a.m.h.a
    public InputStream a(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
