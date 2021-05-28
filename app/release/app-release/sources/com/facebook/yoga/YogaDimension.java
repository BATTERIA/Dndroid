package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;
import e.a.a.a.a;

@DoNotStrip
public enum YogaDimension {
    WIDTH(0),
    HEIGHT(1);
    
    public final int mIntValue;

    /* access modifiers changed from: public */
    YogaDimension(int i) {
        this.mIntValue = i;
    }

    public static YogaDimension fromInt(int i) {
        if (i == 0) {
            return WIDTH;
        }
        if (i == 1) {
            return HEIGHT;
        }
        throw new IllegalArgumentException(a.a("Unknown enum value: ", i));
    }

    public int intValue() {
        return this.mIntValue;
    }
}
