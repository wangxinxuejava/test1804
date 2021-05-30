package com.bjpowernode.utils;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 */
@Component
public class DataUtil {

    public DataUtil(){

    }



   public static String  getTime(){
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       Date date=new Date();
       return sdf.format(date);
   }


}
