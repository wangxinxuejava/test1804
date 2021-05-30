package com.bjpowernode.utils;

import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * 设置主键
 */
@Component
public class UUIDUtil {
  public static String getUUID(){
      return UUID.randomUUID().toString().replaceAll("-","");
  }

}
