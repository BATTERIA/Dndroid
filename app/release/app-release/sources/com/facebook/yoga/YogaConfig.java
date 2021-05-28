package com.facebook.yoga;

public class YogaConfig {
    public static int SPACING_TYPE = 1;
    public YogaLogger mLogger;
    public long mNativePointer;
    public YogaNodeCloneFunction mYogaNodeCloneFunction;

    public YogaConfig() {
        long jni_YGConfigNew = YogaNative.jni_YGConfigNew();
        this.mNativePointer = jni_YGConfigNew;
        if (jni_YGConfigNew == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    public void finalize() {
        try {
            YogaNative.jni_YGConfigFree(this.mNativePointer);
        } finally {
            super.finalize();
        }
    }

    public YogaLogger getLogger() {
        return this.mLogger;
    }

    public void setExperimentalFeatureEnabled(YogaExperimentalFeature yogaExperimentalFeature, boolean z) {
        YogaNative.jni_YGConfigSetExperimentalFeatureEnabled(this.mNativePointer, yogaExperimentalFeature.intValue(), z);
    }

    public void setLogger(YogaLogger yogaLogger) {
        this.mLogger = yogaLogger;
        YogaNative.jni_YGConfigSetLogger(this.mNativePointer, yogaLogger);
    }

    public void setPointScaleFactor(float f2) {
        YogaNative.jni_YGConfigSetPointScaleFactor(this.mNativePointer, f2);
    }

    public void setPrintTreeFlag(boolean z) {
        YogaNative.jni_YGConfigSetPrintTreeFlag(this.mNativePointer, z);
    }

    public void setShouldDiffLayoutWithoutLegacyStretchBehaviour(boolean z) {
        YogaNative.jni_YGConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviour(this.mNativePointer, z);
    }

    public void setUseLegacyStretchBehaviour(boolean z) {
        YogaNative.jni_YGConfigSetUseLegacyStretchBehaviour(this.mNativePointer, z);
    }

    public void setUseWebDefaults(boolean z) {
        YogaNative.jni_YGConfigSetUseWebDefaults(this.mNativePointer, z);
    }
}
