LOCAL_PATH := $(call my-dir)

APP_PLATFORM := android-23

include $(CLEAR_VARS)
LOCAL_SRC_FILES := ../Glue/Glue/src/NativeLibraryGlue.cpp
LOCAL_MODULE := NativeLibraryGlue
LOCAL_LDLIBS += -llog
include $(BUILD_SHARED_LIBRARY)