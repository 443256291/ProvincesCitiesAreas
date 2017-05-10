package com.gs.base.util;

import java.util.UUID;

/**
 * Created by GaoShan on 2017/3/27.
 * Description:UUID相关
 */
public class MyUUIDUtil {
    /**
     * 获取以及UUID
     * @return
     */
    public static String getUUID(){
        return UUID.randomUUID().toString();
    }
}
