LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE := native_audio

LOCAL_SRC_FILES := ./libopensl/OpenSLRecorder.cpp \
        OpenSLRecordControl.cpp


LOCAL_LDLIBS := -llog -lOpenSLES
include $(BUILD_SHARED_LIBRARY)