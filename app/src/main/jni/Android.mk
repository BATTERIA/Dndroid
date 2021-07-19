LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

# 生成so文件名称
LOCAL_MODULE    := hello
# cpp文件
LOCAL_SRC_FILES := hello.cpp
LOCAL_LDLIBS := -lm -llog
include $(BUILD_SHARED_LIBRARY)