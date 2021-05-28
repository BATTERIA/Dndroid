package f;

import f.o0.e;
import f.o0.h.d;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class p {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    public final String f5381a;
    public final String b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5382c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5383d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5384e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5385f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5386g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5387h;
    public final boolean i;

    public p(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f5381a = str;
        this.b = str2;
        this.f5382c = j2;
        this.f5383d = str3;
        this.f5384e = str4;
        this.f5385f = z;
        this.f5386g = z2;
        this.i = z3;
        this.f5387h = z4;
    }

    public static int a(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static long a(String str, int i2, int i3) {
        int a2 = a(str, i2, i3, false);
        Matcher matcher = m.matcher(str);
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        while (a2 < i3) {
            int a3 = a(str, a2 + 1, i3, true);
            matcher.region(a2, a3);
            if (i5 == -1 && matcher.usePattern(m).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
                i8 = Integer.parseInt(matcher.group(2));
                i9 = Integer.parseInt(matcher.group(3));
            } else if (i6 == -1 && matcher.usePattern(l).matches()) {
                i6 = Integer.parseInt(matcher.group(1));
            } else if (i7 == -1 && matcher.usePattern(k).matches()) {
                i7 = k.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
            } else if (i4 == -1 && matcher.usePattern(j).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            }
            a2 = a(str, a3 + 1, i3, false);
        }
        if (i4 >= 70 && i4 <= 99) {
            i4 += 1900;
        }
        if (i4 >= 0 && i4 <= 69) {
            i4 += 2000;
        }
        if (i4 < 1601) {
            throw new IllegalArgumentException();
        } else if (i7 == -1) {
            throw new IllegalArgumentException();
        } else if (i6 < 1 || i6 > 31) {
            throw new IllegalArgumentException();
        } else if (i5 < 0 || i5 > 23) {
            throw new IllegalArgumentException();
        } else if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        } else if (i9 < 0 || i9 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(e.f5089h);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i4);
            gregorianCalendar.set(2, i7 - 1);
            gregorianCalendar.set(5, i6);
            gregorianCalendar.set(11, i5);
            gregorianCalendar.set(12, i8);
            gregorianCalendar.set(13, i9);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01b4, code lost:
        if (r3 == false) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0215, code lost:
        if (r0 == null) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d7, code lost:
        if (r19 <= 0) goto L_0x00ec;
     */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0259 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<f.p> a(f.y r33, f.x r34) {
        /*
        // Method dump skipped, instructions count: 617
        */
        throw new UnsupportedOperationException("Method not decompiled: f.p.a(f.y, f.x):java.util.List");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return pVar.f5381a.equals(this.f5381a) && pVar.b.equals(this.b) && pVar.f5383d.equals(this.f5383d) && pVar.f5384e.equals(this.f5384e) && pVar.f5382c == this.f5382c && pVar.f5385f == this.f5385f && pVar.f5386g == this.f5386g && pVar.f5387h == this.f5387h && pVar.i == this.i;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.f5383d.hashCode();
        int hashCode3 = this.f5384e.hashCode();
        long j2 = this.f5382c;
        return ((((((((((hashCode3 + ((hashCode2 + ((hashCode + ((this.f5381a.hashCode() + 527) * 31)) * 31)) * 31)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (!this.f5385f ? 1 : 0)) * 31) + (!this.f5386g ? 1 : 0)) * 31) + (!this.f5387h ? 1 : 0)) * 31) + (!this.i ? 1 : 0);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5381a);
        sb.append('=');
        sb.append(this.b);
        if (this.f5387h) {
            if (this.f5382c == Long.MIN_VALUE) {
                str = "; max-age=0";
            } else {
                sb.append("; expires=");
                str = d.f5157a.get().format(new Date(this.f5382c));
            }
            sb.append(str);
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.f5383d);
        }
        sb.append("; path=");
        sb.append(this.f5384e);
        if (this.f5385f) {
            sb.append("; secure");
        }
        if (this.f5386g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
