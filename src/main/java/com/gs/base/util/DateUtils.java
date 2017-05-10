package com.gs.base.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 功能概要：日期转换工具
 *
 * Created by GaoShan on 2017/3/7.
 */
public class DateUtils {
    public static Date get(String date){
        Date format = null;
        try {
            format = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return format;
    }
    public static Date sdfDate(Date date){
        String s = date.toString();
        Date format = null;
        try {
            format = new SimpleDateFormat("yyyy-MM-dd").parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return format;
    }
}
