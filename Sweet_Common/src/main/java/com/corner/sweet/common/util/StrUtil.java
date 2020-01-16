package com.corner.sweet.common.util;

/**
 * @program: BabyStudy
 * @description:
 * @author: zy
 * @create: 2019-12-30 14:24
 */
public class StrUtil {
    /**
     * 校验字符串是否为空(null 或长度=0)
     * */
    public static boolean isEmpty(String... strs){
        for(String s:strs){
            if(s==null || s.length()==0){
                return true;
            }
        }
        return false;
    }
}
