package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;
import e.a.a.a.a;

@DoNotStrip
public enum YogaAlign {
    AUTO(0),
    FLEX_START(1),
    CENTER(2),
    FLEX_END(3),
    STRETCH(4),
    BASELINE(5),
    SPACE_BETWEEN(6),
    SPACE_AROUND(7);
    
    public final int mIntValue;

    /* access modifiers changed from: public */
    YogaAlign(int i) {
        this.mIntValue = i;
    }

    public static YogaAlign fromInt(int i) {
        switch (i) {
            case 0:
                return AUTO;
            case 1:
                return FLEX_START;
            case 2:
                return CENTER;
            case 3:
                return FLEX_END;
            case 4:
                return STRETCH;
            case 5:
                return BASELINE;
            case 6:
                return SPACE_BETWEEN;
            case 7:
                return SPACE_AROUND;
            default:
                throw new IllegalArgumentException(a.a("Unknown enum value: ", i));
        }
    }

    public int intValue() {
        return this.mIntValue;
    }
}
