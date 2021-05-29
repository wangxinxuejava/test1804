package com.bjpowernode.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 */
public class DataUtil {

    public DataUtil(){
    }



   public static String  getTime(){
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       Date date=new Date();
       return sdf.format(date);
   }


}
