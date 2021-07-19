//
// Created by D on 2021/6/22.
//

#include "com_bilibili_bililive_batteria_NativeTest.h"

extern "C"
JNIEXPORT jstring

JNICALL
Java_com_bilibili_bililive_batteria_NativeTest_hello(JNIEnv *env, jclass clazz) {
    const char *hello = "hello world";
    return env->NewStringUTF(hello);
}