package com.gs.base.util;

/**
 * Created by GaoShan on 2017/4/13.
 */
public class MyStringUtil {

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0 || str == "null" || str == "";
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
