package com.facebook.yoga;

public class YogaValue {
    public static final YogaValue AUTO = new YogaValue(Float.NaN, YogaUnit.AUTO);
    public static final YogaValue UNDEFINED = new YogaValue(Float.NaN, YogaUnit.UNDEFINED);
    public static final YogaValue ZERO = new YogaValue(0.0f, YogaUnit.POINT);
    public final YogaUnit unit;
    public final float value;

    /* renamed from: com.facebook.yoga.YogaValue$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$yoga$YogaUnit;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001d */
        static {
            /*
                com.facebook.yoga.YogaUnit[] r0 = com.facebook.yoga.YogaUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.yoga.YogaValue.AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit = r0
                r1 = 1
                com.facebook.yoga.YogaUnit r2 = com.facebook.yoga.YogaUnit.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x000f }
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                int[] r2 = com.facebook.yoga.YogaValue.AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit     // Catch:{ NoSuchFieldError -> 0x0016 }
                com.facebook.yoga.YogaUnit r3 = com.facebook.yoga.YogaUnit.POINT     // Catch:{ NoSuchFieldError -> 0x0016 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                r1 = 3
                int[] r2 = com.facebook.yoga.YogaValue.AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.yoga.YogaUnit r3 = com.facebook.yoga.YogaUnit.PERCENT     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.facebook.yoga.YogaValue.AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit     // Catch:{ NoSuchFieldError -> 0x0024 }
                com.facebook.yoga.YogaUnit r2 = com.facebook.yoga.YogaUnit.AUTO     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.yoga.YogaValue.AnonymousClass1.<clinit>():void");
        }
    }

    public YogaValue(float f2, int i) {
        this(f2, YogaUnit.fromInt(i));
    }

    public YogaValue(float f2, YogaUnit yogaUnit) {
        this.value = f2;
        this.unit = yogaUnit;
    }

    public static YogaValue parse(String str) {
        if (str == null) {
            return null;
        }
        return "undefined".equals(str) ? UNDEFINED : "auto".equals(str) ? AUTO : str.endsWith("%") ? new YogaValue(Float.parseFloat(str.substring(0, str.length() - 1)), YogaUnit.PERCENT) : new YogaValue(Float.parseFloat(str), YogaUnit.POINT);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof YogaValue)) {
            return false;
        }
        YogaValue yogaValue = (YogaValue) obj;
        YogaUnit yogaUnit = this.unit;
        if (yogaUnit == yogaValue.unit) {
            return yogaUnit == YogaUnit.UNDEFINED || yogaUnit == YogaUnit.AUTO || Float.compare(this.value, yogaValue.value) == 0;
        }
        return false;
    }

    public int hashCode() {
        return this.unit.intValue() + Float.floatToIntBits(this.value);
    }

    public String toString() {
        int ordinal = this.unit.ordinal();
        if (ordinal == 0) {
            return "undefined";
        }
        if (ordinal == 1) {
            return Float.toString(this.value);
        }
        if (ordinal == 2) {
            return this.value + "%";
        } else if (ordinal == 3) {
            return "auto";
        } else {
            throw new IllegalStateException();
        }
    }
}
