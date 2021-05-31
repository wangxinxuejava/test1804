package com.bjpowernode.utils;

import java.util.UUID;

/**
 * 设置主键
 */

public class UUIDUtil {
  public static String getUUID(){
      return UUID.randomUUID().toString().replaceAll("-","");
  }

}
