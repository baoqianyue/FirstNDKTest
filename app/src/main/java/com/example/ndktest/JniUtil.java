package com.example.ndktest;

/**
 * Created by 鲍骞月 on 2017/4/19.
 */

/**
 * 存放native方法
 */
public class JniUtil {

    static {
        System.loadLibrary("Barack");
    }

    public native int add(int a, int b);

}
