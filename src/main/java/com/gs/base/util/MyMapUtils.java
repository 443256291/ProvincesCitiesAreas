package com.gs.base.util;

import java.util.HashMap;

/**
 * Created by GaoShan on 2017/4/21.
 * 在controller中使用，获取map
 */
public class MyMapUtils {
    /**
     * 根据更新，插入，删除 返回结果放置status
     *
     * @param i
     * @return ：map
     */
    public static HashMap getMapForReturnMsg(int i) {
        HashMap<String, Object> map = new HashMap<>();
        if (i == 0) {
            map.put("status", "1");
            map.put("message","failed");
        } else {
            map.put("status", "0");
            map.put("message","success");

        }
        return map;
    }

    /**
     * 根据查询结果 在map中放置data
     *
     * @param obj
     * @return ：map
     */
    public static HashMap getMapForSelectOne(Object obj) {
        HashMap<String, Object> map = new HashMap<>();
        if (obj == null) {
            map.put("status", "1");
            map.put("message","failed");

        } else {
            map.put("status", "0");
            map.put("message","success");

            map.put("data", obj);
        }
        return map;
    }
}
