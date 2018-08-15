package com.breamer.demo.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Auther: 23769
 * @Date: 2018/7/11 17:08
 */
public class MainTest {
    public static void main(String[] args){
        Map<String,Object> map = new HashMap<>(16);
        System.out.println(map.size());
        for(int i=0;i<20;i++){
            map.put(String.valueOf(i),i);
        }
        System.out.println(map.size());
    }
}
