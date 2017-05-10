package com.gs.base.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * Created by GaoShan on 2017/3/27.
 * D
 */
public class GsonUtil {
    //将Json数据解析成相应的映射对象
    public static <T> T parseJsonObjectWithGson(String jsonData, Class<T> type) {
        Gson gson = new Gson();
        T result = gson.fromJson(jsonData, type);
        return result;
    }

    // 将Json数组解析成相应的映射对象列表
    public static <T> List<T> parseJsonArrayWithGson(String jsonData,
                                                     Class<T> type) {
        Gson gson = new Gson();
        List<T> result = gson.fromJson(jsonData, new TypeToken<List<T>>() {  }.getType());
        return result;
    }

}