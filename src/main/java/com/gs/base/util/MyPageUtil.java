package com.gs.base.util;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;

import java.util.HashMap;
import java.util.List;

/**
 * Created by GaoShan on 2017/4/10.
 * Description:page相关的工具
 */
public class MyPageUtil {




    /**
     * 这是一个关于page属性的偷懒方法
     *
     * @param list
     * @return
     */
    public static HashMap<String, Object> getMapForPageResultInit(List list) {
        HashMap<String, Object> map = new HashMap<>();
        PageInfo page = new PageInfo(list);
        map.put("PageNum", page.getPageNum());
        map.put("PageSize", page.getPageSize());
        map.put("Pages", page.getPages());
        map.put("IsFirstPage", page.isIsFirstPage());
        map.put("IsLastPage", page.isIsLastPage());
        map.put("HasPreviousPage", page.isHasPreviousPage());
        map.put("HasNextPage", page.isHasNextPage());
        map.put("Total",page.getTotal());
        map.put("data", list);
        return map;
    }


    /**
     * 获取页码,获取页条目总数
     * @param sPageNum
     * @param sPageSize
     * @return
     */
    public static int[] getPageStringToIntArray(String sPageNum,String sPageSize) {
        int pageNum = 1;
        int pageSize = 10;
        int[] arr = new int[2];

        if (StringUtil.isNotEmpty(sPageNum)) {
            pageNum = Integer.parseInt(sPageNum);
        }
        if (StringUtil.isNotEmpty(sPageSize)) {
            pageSize = Integer.parseInt(sPageSize);
        }
        arr[0] = pageNum;
        arr[1] = pageSize;
        return arr;
    }
}
