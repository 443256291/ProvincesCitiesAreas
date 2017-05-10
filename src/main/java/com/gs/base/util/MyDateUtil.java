package com.gs.base.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by GaoShan on 2017/4/11.
 * Description:日期类工具
 */
public class MyDateUtil {

    /**
     *
     * 通过字符串获取
     * @param str_date
     * @return
     * @throws ParseException
     */
    public static Date getDateFormString(String str_date)  {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return sdf.parse(str_date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return new Date();
    }


}
