package e.h.a;

import java.lang.reflect.Field;
import java.util.Locale;

public enum d implements e {
    IDENTITY {
        @Override // e.h.a.e
        public String a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        @Override // e.h.a.e
        public String a(Field field) {
            return d.a(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        @Override // e.h.a.e
        public String a(Field field) {
            return d.a(d.a(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        @Override // e.h.a.e
        public String a(Field field) {
            return d.a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        @Override // e.h.a.e
        public String a(Field field) {
            return d.a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        @Override // e.h.a.e
        public String a(Field field) {
            return d.a(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    /* access modifiers changed from: public */
    /* synthetic */ d(a aVar) {
    }

    public static String a(String str) {
        int length = str.length() - 1;
        int i2 = 0;
        while (!Character.isLetter(str.charAt(i2)) && i2 < length) {
            i2++;
        }
        char charAt = str.charAt(i2);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i2 == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i2) + upperCase + str.substring(i2 + 1);
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }
}
