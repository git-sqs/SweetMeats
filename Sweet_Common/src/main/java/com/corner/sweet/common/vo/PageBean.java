package com.corner.sweet.common.vo;

import lombok.Data;

import java.util.List;

/**
 * @program: EatJoke
 * @description:
 * @author: zy
 * @create: 2019-12-25 14:47
 */
@Data
public class PageBean<T> {
    private int code;
    private String msg;
    private long count;
    private List<T> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public PageBean(){

    }
    public PageBean(long c,List<T> list){
        code=0;
        msg="OK";
        count=c;
        data=list;
    }
}
