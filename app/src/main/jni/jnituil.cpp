//
// Created by 鲍骞月 on 2017/4/19.
//

#include "com_example_ndktest_JniUtil.h"


JNIEXPORT jint JNICALL Java_com_example_ndktest_JniUtil_add
  (JNIEnv *env, jobject obj, jint a, jint b) {
    return a + b;
  }
