package com.bilibili.bililive.batteria;

class NativeTest {
    static {
        System.loadLibrary("hello");
    }
    public static native String hello();
}