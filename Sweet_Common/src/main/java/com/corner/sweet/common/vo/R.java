package com.corner.sweet.common.vo;

import com.corner.sweet.common.result.ResultCode;
import lombok.Data;

/**
 * @program: CarSys
 * @description:
 * @author: zy
 * @create: 2019-12-10 11:03
 */
@Data
public class R {
    private int code;//结果码
    private String msg;//字符串
    private Object data;//携带数据

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static R setResult(boolean issucc, String data){
        if(issucc){
            return R.ok(data);
        }else {
            return R.fail(data);
        }
    }
    public static R setR(int code,String msg,Object data){
        R r=new R();
        r.setCode(code);
        r.setData(data);
        r.setMsg(msg);
        return r;
    }
    public static R ok(Object data){
        return setR(ResultCode.OK.getVal(),"OK",data);
    }
    public static R ok(){
        return setR(ResultCode.OK.getVal(),"OK",null);
    }
    public static R ok(String msg){
        return setR(ResultCode.OK.getVal(),msg,null);
    }
    public static R fail(){
        return setR(ResultCode.ERROR.getVal(),"Error",null);
    }
    public static R fail(String msg){
        return setR(ResultCode.ERROR.getVal(),msg,null);
    }

}
