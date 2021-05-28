package e.f.a;

import android.content.Context;
import e.f.a.o;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class e extends o {

    /* renamed from: f  reason: collision with root package name */
    public final File f4627f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4628g;

    public static final class b extends o.b implements Comparable {

        /* renamed from: e  reason: collision with root package name */
        public final ZipEntry f4629e;

        /* renamed from: f  reason: collision with root package name */
        public final int f4630f;

        public b(String str, ZipEntry zipEntry, int i) {
            super(str, String.format("pseudo-zip-hash-1-%s-%s-%s-%s", zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc())));
            this.f4629e = zipEntry;
            this.f4630f = i;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f4666c.compareTo(((b) obj).f4666c);
        }
    }

    public class c extends o.f {

        /* renamed from: c  reason: collision with root package name */
        public b[] f4631c;

        /* renamed from: d  reason: collision with root package name */
        public final ZipFile f4632d;

        /* renamed from: e  reason: collision with root package name */
        public final o f4633e;

        public final class a extends o.e {

            /* renamed from: c  reason: collision with root package name */
            public int f4635c;

            public /* synthetic */ a(a aVar) {
            }

            @Override // e.f.a.o.e
            public boolean a() {
                c.this.l();
                return this.f4635c < c.this.f4631c.length;
            }

            @Override // e.f.a.o.e
            public o.d k() {
                c.this.l();
                c cVar = c.this;
                b[] bVarArr = cVar.f4631c;
                int i = this.f4635c;
                this.f4635c = i + 1;
                b bVar = bVarArr[i];
                InputStream inputStream = cVar.f4632d.getInputStream(bVar.f4629e);
                try {
                    return new o.d(bVar, inputStream);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }

        public c(o oVar) {
            this.f4632d = new ZipFile(e.this.f4627f);
            this.f4633e = oVar;
        }

        @Override // e.f.a.o.f
        public final o.c a() {
            return new o.c(l());
        }

        public boolean a(ZipEntry zipEntry, String str) {
            throw null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, e.f.a.o.f
        public void close() {
            this.f4632d.close();
        }

        @Override // e.f.a.o.f
        public final o.e k() {
            return new a(null);
        }

        public final b[] l() {
            int i;
            if (this.f4631c == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap hashMap = new HashMap();
                Pattern compile = Pattern.compile(e.this.f4628g);
                String[] b = g.b();
                Enumeration<? extends ZipEntry> entries = this.f4632d.entries();
                while (true) {
                    i = 0;
                    if (!entries.hasMoreElements()) {
                        break;
                    }
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    Matcher matcher = compile.matcher(zipEntry.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        while (true) {
                            if (i >= b.length) {
                                i = -1;
                                break;
                            }
                            if (b[i] != null && group.equals(b[i])) {
                                break;
                            }
                            i++;
                        }
                        if (i >= 0) {
                            linkedHashSet.add(group);
                            b bVar = (b) hashMap.get(group2);
                            if (bVar == null || i < bVar.f4630f) {
                                hashMap.put(group2, new b(group2, zipEntry, i));
                            }
                        }
                    }
                }
                o oVar = this.f4633e;
                String[] strArr = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
                if (oVar != null) {
                    b[] bVarArr = (b[]) hashMap.values().toArray(new b[hashMap.size()]);
                    Arrays.sort(bVarArr);
                    int i2 = 0;
                    for (int i3 = 0; i3 < bVarArr.length; i3++) {
                        b bVar2 = bVarArr[i3];
                        if (a(bVar2.f4629e, bVar2.f4666c)) {
                            i2++;
                        } else {
                            bVarArr[i3] = null;
                        }
                    }
                    b[] bVarArr2 = new b[i2];
                    int i4 = 0;
                    while (i < bVarArr.length) {
                        b bVar3 = bVarArr[i];
                        if (bVar3 != null) {
                            bVarArr2[i4] = bVar3;
                            i4++;
                        }
                        i++;
                    }
                    this.f4631c = bVarArr2;
                } else {
                    throw null;
                }
            }
            return this.f4631c;
        }
    }

    public e(Context context, String str, File file, String str2) {
        super(context, str);
        this.f4627f = file;
        this.f4628g = str2;
    }
}
