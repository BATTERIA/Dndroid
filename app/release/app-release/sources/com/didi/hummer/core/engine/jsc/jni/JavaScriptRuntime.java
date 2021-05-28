package com.didi.hummer.core.engine.jsc.jni;

public final class JavaScriptRuntime {
    public static long createJSContext() {
        return createJSContextNative();
    }

    public static native long createJSContextNative();

    public static void destroyJSContext(long j) {
        destroyJSContextNative(j);
    }

    public static native void destroyJSContextNative(long j);

    public static long evaluateJavaScript(long j, String str) {
        return evaluateJavaScriptNative(j, str, "");
    }

    public static long evaluateJavaScript(long j, String str, String str2) {
        return evaluateJavaScriptNative(j, str, str2);
    }

    public static native long evaluateJavaScriptNative(long j, String str, String str2);
}
