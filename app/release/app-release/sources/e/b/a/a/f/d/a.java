package e.b.a.a.f.d;

import a.w.c.i;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f3752a;

    public a(Context context) {
        if (context != null) {
            File cacheDir = context.getCacheDir();
            i.a((Object) cacheDir, "context.cacheDir");
            String path = cacheDir.getPath();
            i.a((Object) path, "context.cacheDir.path");
            this.f3752a = path;
            return;
        }
        i.a("context");
        throw null;
    }

    @Override // e.b.a.a.f.d.c
    public Bitmap a(String str) {
        if (str != null) {
            Bitmap decodeFile = BitmapFactory.decodeFile(this.f3752a + "url");
            if (decodeFile != null) {
                Log.d("DiskCache", "got bitmap from disk cache");
            }
            return decodeFile;
        }
        i.a("url");
        throw null;
    }

    @Override // e.b.a.a.f.d.c
    public void a(String str, Bitmap bitmap) {
        if (str == null) {
            i.a("url");
            throw null;
        } else if (bitmap != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f3752a + "url");
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
            } catch (Exception e2) {
                Log.d("DiskCache", e2.toString());
            }
        } else {
            i.a("bitmap");
            throw null;
        }
    }
}
