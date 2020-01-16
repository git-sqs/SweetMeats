package com.corner.sweet.common.util;


/**
 * @program: BabyStudy
 * @description:
 * @author: zy
 * @create: 2019-12-30 12:23
 */
public class ZhLauConvertUtil {
    public static String  traditionalSrc = "出門在外租屋，民眾總希望可以住到舒適的環境，也期盼能遇到一個好房東。不過，若遇到租屋處的家電產品損壞，究竟該怎麼處理呢？近日一名女網友就碰上租屋處的熱水器壞掉了，但告知房東後，得到的回應卻是「熱水器是日常消費（耗）品，自己想辦法解決」，讓她相當傻眼，不禁感嘆「被她這麼一說，我都不知道什麼才是日常消耗品了」。";
    /**
     * 简体转换为繁体
     * @param str  要转换的简体字符串*/
//    public static String simToTra(String str){
//        ZHConverter converter = ZHConverter.getInstance(ZHConverter.SIMPLIFIED);
//        //繁体转换简体
//        return ZHConverter.convert(str,ZHConverter.SIMPLIFIED);
//    }
    /**
     * 繁体转换为简体
     * 要转换的繁体字符串*/
//    public static String traToSim(String str){
//        ZHConverter converter = ZHConverter.getInstance(ZHConverter.TRADITIONAL);
//       return converter.convert(str);
//    }

    public static void main(String[] args)
    {
        System.out.println(ZHConvert.parseText("民眾總希望可以住到舒適的環境", ZHConvert.ZHType.简体));
        System.out.println(ZHConvert.parseText("民众总希望可以住到舒适的环境", ZHConvert.ZHType.繁体));
    }
}
