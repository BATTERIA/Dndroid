package e.d.a.m.h;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

public class i extends g<InputStream> {
    public i(Context context, Uri uri) {
        super(context, uri);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // e.d.a.m.h.g
    public void a(InputStream inputStream) {
        inputStream.close();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.d.a.m.h.g
    public InputStream a(Uri uri, ContentResolver contentResolver) {
        return contentResolver.openInputStream(uri);
    }
}
