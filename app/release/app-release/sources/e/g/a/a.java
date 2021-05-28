package e.g.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class a implements c {

    /* renamed from: e.g.a.a$a  reason: collision with other inner class name */
    public static class C0140a {

        /* renamed from: a  reason: collision with root package name */
        public ZipFile f4671a;
        public ZipEntry b;

        public C0140a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f4671a = zipFile;
            this.b = zipEntry;
        }
    }

    public final C0140a a(Context context, String[] strArr, String str, f fVar) {
        int i;
        ZipFile zipFile;
        String[] a2 = a(context);
        int length = a2.length;
        char c2 = 0;
        int i2 = 0;
        while (i2 < length) {
            String str2 = a2[i2];
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                i = 5;
                if (i3 >= 5) {
                    zipFile = null;
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i3 = i4;
                }
            }
            if (zipFile != null) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    if (i5 < i) {
                        int length2 = strArr.length;
                        int i7 = 0;
                        while (i7 < length2) {
                            String str3 = strArr[i7];
                            StringBuilder a3 = e.a.a.a.a.a("lib");
                            a3.append(File.separatorChar);
                            a3.append(str3);
                            a3.append(File.separatorChar);
                            a3.append(str);
                            String sb = a3.toString();
                            Object[] objArr = new Object[2];
                            objArr[c2] = sb;
                            objArr[1] = str2;
                            if (fVar != null) {
                                String.format(Locale.US, "Looking for %s in APK %s...", objArr);
                                ZipEntry entry = zipFile.getEntry(sb);
                                if (entry != null) {
                                    return new C0140a(zipFile, entry);
                                }
                                i7++;
                                c2 = 0;
                                i = 5;
                            } else {
                                throw null;
                            }
                        }
                        i5 = i6;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i2++;
            c2 = 0;
        }
        return null;
    }

    public final String[] a(Context context) {
        String[] strArr;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (Build.VERSION.SDK_INT < 21 || (strArr = applicationInfo.splitSourceDirs) == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[(strArr.length + 1)];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    public final String[] a(Context context, String str) {
        StringBuilder a2 = e.a.a.a.a.a("lib");
        a2.append(File.separatorChar);
        a2.append("([^\\");
        a2.append(File.separatorChar);
        a2.append("]*)");
        a2.append(File.separatorChar);
        a2.append(str);
        Pattern compile = Pattern.compile(a2.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : a(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(((ZipEntry) entries.nextElement()).getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }
}
