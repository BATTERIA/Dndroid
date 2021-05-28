package e.c.a.b;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import e.c.a.b.l;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class i {
    static {
        System.getProperty("line.separator");
    }

    public static File a(String str) {
        if (w.a(str)) {
            return null;
        }
        return new File(str);
    }

    public static boolean a(File file) {
        return file != null && (!file.exists() ? file.mkdirs() : file.isDirectory());
    }

    public static boolean b(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!a(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean c(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return true;
        }
        String absolutePath = file.getAbsolutePath();
        File file2 = w.a(absolutePath) ? null : new File(absolutePath);
        if (file2 == null) {
            return false;
        }
        if (!file2.exists()) {
            if (Build.VERSION.SDK_INT < 29) {
                return false;
            }
            try {
                AssetFileDescriptor openAssetFileDescriptor = l.f.b().getContentResolver().openAssetFileDescriptor(Uri.parse(absolutePath), "r");
                if (openAssetFileDescriptor == null) {
                    return false;
                }
                try {
                    openAssetFileDescriptor.close();
                } catch (IOException unused) {
                }
            } catch (FileNotFoundException unused2) {
                return false;
            }
        }
        return true;
    }
}
