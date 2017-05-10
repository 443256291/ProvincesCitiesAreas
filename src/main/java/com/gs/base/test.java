package com.gs.base;

import com.gs.base.util.MyUUIDUtil;

/**
 * Created by GaoShan on 2017/4/14.
 */
public class test {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(MyUUIDUtil.getUUID());
        }
    }
}
