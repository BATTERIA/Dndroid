package a.a0;

import a.a.a.a.v0.m.l1.a;
import a.y.c;
import e.f.a.g;

public class i extends h {
    public static /* synthetic */ int a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3) {
        return a(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    public static /* synthetic */ String a(String str, char c2, String str2, int i) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return a(str, c2, str2);
    }

    public static /* synthetic */ boolean a(CharSequence charSequence, char c2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if (charSequence != null) {
            return a(charSequence, c2, 0, z, 2) >= 0;
        }
        a.w.c.i.a("$this$contains");
        throw null;
    }

    public static /* synthetic */ int b(CharSequence charSequence, char c2, int i, boolean z, int i2) {
        boolean z2;
        if ((i2 & 2) != 0) {
            i = a(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if (charSequence == null) {
            a.w.c.i.a("$this$lastIndexOf");
            throw null;
        } else if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c2, i);
        } else {
            char[] cArr = {c2};
            if (z || !(charSequence instanceof String)) {
                int a2 = a(charSequence);
                if (i > a2) {
                    i = a2;
                }
                while (i >= 0) {
                    char charAt = charSequence.charAt(i);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 1) {
                            z2 = false;
                            break;
                        } else if (a.a(cArr[i3], charAt, z)) {
                            z2 = true;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (z2) {
                        return i;
                    }
                    i--;
                }
                return -1;
            }
            return ((String) charSequence).lastIndexOf(g.a(cArr), i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ boolean a(java.lang.CharSequence r9, java.lang.CharSequence r10, boolean r11, int r12) {
        /*
            r0 = 2
            r12 = r12 & r0
            r1 = 0
            if (r12 == 0) goto L_0x0007
            r6 = 0
            goto L_0x0008
        L_0x0007:
            r6 = r11
        L_0x0008:
            r11 = 0
            if (r9 == 0) goto L_0x0033
            if (r10 == 0) goto L_0x002d
            boolean r11 = r10 instanceof java.lang.String
            r12 = 1
            if (r11 == 0) goto L_0x001b
            java.lang.String r10 = (java.lang.String) r10
            int r9 = a(r9, r10, r1, r6, r0)
            if (r9 < 0) goto L_0x002c
            goto L_0x002b
        L_0x001b:
            r4 = 0
            int r5 = r9.length()
            r7 = 0
            r8 = 16
            r2 = r9
            r3 = r10
            int r9 = a(r2, r3, r4, r5, r6, r7, r8)
            if (r9 < 0) goto L_0x002c
        L_0x002b:
            r1 = 1
        L_0x002c:
            return r1
        L_0x002d:
            java.lang.String r9 = "other"
            a.w.c.i.a(r9)
            throw r11
        L_0x0033:
            java.lang.String r9 = "$this$contains"
            a.w.c.i.a(r9)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a0.i.a(java.lang.CharSequence, java.lang.CharSequence, boolean, int):boolean");
    }

    public static /* synthetic */ int b(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = a(charSequence);
        }
        boolean z2 = (i2 & 4) != 0 ? false : z;
        if (charSequence == null) {
            a.w.c.i.a("$this$lastIndexOf");
            throw null;
        } else if (str != null) {
            return (z2 || !(charSequence instanceof String)) ? a(charSequence, (CharSequence) str, i, 0, z2, true) : ((String) charSequence).lastIndexOf(str, i);
        } else {
            a.w.c.i.a("string");
            throw null;
        }
    }

    public static final int a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.length() - 1;
        }
        a.w.c.i.a("$this$lastIndex");
        throw null;
    }

    public static final int a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        a.y.a aVar;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            aVar = new c(i, i2);
        } else {
            int a2 = a(charSequence);
            if (i > a2) {
                i = a2;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            aVar = new a.y.a(i, i2, -1);
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i3 = aVar.f2152c;
            int i4 = aVar.f2153d;
            int i5 = aVar.f2154e;
            if (i5 < 0 ? i3 >= i4 : i3 <= i4) {
                while (!a(charSequence2, 0, charSequence, i3, charSequence2.length(), z)) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                return i3;
            }
        } else {
            int i6 = aVar.f2152c;
            int i7 = aVar.f2153d;
            int i8 = aVar.f2154e;
            if (i8 < 0 ? i6 >= i7 : i6 <= i7) {
                while (!a.a((String) charSequence2, 0, (String) charSequence, i6, charSequence2.length(), z)) {
                    if (i6 != i7) {
                        i6 += i8;
                    }
                }
                return i6;
            }
        }
        return -1;
    }

    public static /* synthetic */ int a(CharSequence charSequence, char c2, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if (charSequence == null) {
            a.w.c.i.a("$this$indexOf");
            throw null;
        } else if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c2, i);
        } else {
            return a(charSequence, new char[]{c2}, i, z);
        }
    }

    public static /* synthetic */ int a(CharSequence charSequence, String str, int i, boolean z, int i2) {
        int i3 = (i2 & 2) != 0 ? 0 : i;
        boolean z2 = (i2 & 4) != 0 ? false : z;
        if (charSequence == null) {
            a.w.c.i.a("$this$indexOf");
            throw null;
        } else if (str != null) {
            return (z2 || !(charSequence instanceof String)) ? a(charSequence, str, i3, charSequence.length(), z2, false, 16) : ((String) charSequence).indexOf(str, i3);
        } else {
            a.w.c.i.a("string");
            throw null;
        }
    }

    public static final int a(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        if (charSequence == null) {
            a.w.c.i.a("$this$indexOfAny");
            throw null;
        } else if (cArr == null) {
            a.w.c.i.a("chars");
            throw null;
        } else if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i < 0) {
                i = 0;
            }
            int a2 = a(charSequence);
            if (i > a2) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(i);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        break;
                    } else if (a.a(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return i;
                }
                if (i == a2) {
                    return -1;
                }
                i++;
            }
        } else {
            return ((String) charSequence).indexOf(g.a(cArr), i);
        }
    }

    public static final boolean a(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (charSequence == null) {
            a.w.c.i.a("$this$regionMatchesImpl");
            throw null;
        } else if (charSequence2 == null) {
            a.w.c.i.a("other");
            throw null;
        } else if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        } else {
            for (int i4 = 0; i4 < i3; i4++) {
                if (!a.a(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static final String a(String str, CharSequence charSequence) {
        if (str == null) {
            a.w.c.i.a("$this$removePrefix");
            throw null;
        } else if (charSequence != null) {
            if (!(charSequence instanceof String ? a.a(str, (String) charSequence, false, 2) : a((CharSequence) str, 0, charSequence, 0, charSequence.length(), false))) {
                return str;
            }
            String substring = str.substring(charSequence.length());
            a.w.c.i.a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        } else {
            a.w.c.i.a("prefix");
            throw null;
        }
    }

    public static final String a(CharSequence charSequence, c cVar) {
        if (charSequence == null) {
            a.w.c.i.a("$this$substring");
            throw null;
        } else if (cVar != null) {
            return charSequence.subSequence(Integer.valueOf(cVar.f2152c).intValue(), Integer.valueOf(cVar.f2153d).intValue() + 1).toString();
        } else {
            a.w.c.i.a("range");
            throw null;
        }
    }

    public static final String a(String str, String str2, String str3) {
        if (str == null) {
            a.w.c.i.a("$this$substringAfter");
            throw null;
        } else if (str2 == null) {
            a.w.c.i.a("delimiter");
            throw null;
        } else if (str3 != null) {
            int a2 = a((CharSequence) str, str2, 0, false, 6);
            if (a2 == -1) {
                return str3;
            }
            String substring = str.substring(str2.length() + a2, str.length());
            a.w.c.i.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        } else {
            a.w.c.i.a("missingDelimiterValue");
            throw null;
        }
    }

    public static final String a(String str, char c2, String str2) {
        if (str == null) {
            a.w.c.i.a("$this$substringAfterLast");
            throw null;
        } else if (str2 != null) {
            int b = b((CharSequence) str, c2, 0, false, 6);
            if (b == -1) {
                return str2;
            }
            String substring = str.substring(b + 1, str.length());
            a.w.c.i.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        } else {
            a.w.c.i.a("missingDelimiterValue");
            throw null;
        }
    }

    public static /* synthetic */ String a(String str, String str2, String str3, int i) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        if (str == null) {
            a.w.c.i.a("$this$substringBefore");
            throw null;
        } else if (str2 == null) {
            a.w.c.i.a("delimiter");
            throw null;
        } else if (str3 != null) {
            int a2 = a((CharSequence) str, str2, 0, false, 6);
            if (a2 == -1) {
                return str3;
            }
            String substring = str.substring(0, a2);
            a.w.c.i.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        } else {
            a.w.c.i.a("missingDelimiterValue");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer a(java.lang.String r10, int r11) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a0.i.a(java.lang.String, int):java.lang.Integer");
    }
}
