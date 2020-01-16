package com.corner.sweet.common.result;

/**
 * @program: BabyStudy
 * @description:
 * @author: zy
 * @create: 2020-01-02 16:06
 */
public enum  LevelName {
    TongSheng("童生"),XiuCai("秀才"),JuRen("举人"),JinShi("进士"),DingJia("鼎甲");
    private String name;
    private LevelName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }

}
