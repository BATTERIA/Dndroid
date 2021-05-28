package f;

import e.a.a.a.a;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a0 {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f4966c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f4967d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a  reason: collision with root package name */
    public final String f4968a;
    public final String b;

    public a0(String str, String str2, String str3, String str4) {
        this.f4968a = str;
        this.b = str4;
    }

    public static a0 a(String str) {
        Matcher matcher = f4966c.matcher(str);
        if (matcher.lookingAt()) {
            String lowerCase = matcher.group(1).toLowerCase(Locale.US);
            String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
            String str2 = null;
            Matcher matcher2 = f4967d.matcher(str);
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group = matcher2.group(1);
                    if (group != null && group.equalsIgnoreCase("charset")) {
                        String group2 = matcher2.group(2);
                        if (group2 == null) {
                            group2 = matcher2.group(3);
                        } else if (group2.startsWith("'") && group2.endsWith("'") && group2.length() > 2) {
                            group2 = group2.substring(1, group2.length() - 1);
                        }
                        if (str2 == null || group2.equalsIgnoreCase(str2)) {
                            str2 = group2;
                        } else {
                            throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group2 + "\" for: \"" + str + '\"');
                        }
                    }
                } else {
                    StringBuilder a2 = a.a("Parameter is not formatted correctly: \"");
                    a2.append(str.substring(end));
                    a2.append("\" for: \"");
                    a2.append(str);
                    a2.append('\"');
                    throw new IllegalArgumentException(a2.toString());
                }
            }
            return new a0(str, lowerCase, lowerCase2, str2);
        }
        throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
    }

    public static a0 b(String str) {
        try {
            return a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof a0) && ((a0) obj).f4968a.equals(this.f4968a);
    }

    public int hashCode() {
        return this.f4968a.hashCode();
    }

    public String toString() {
        return this.f4968a;
    }
}
