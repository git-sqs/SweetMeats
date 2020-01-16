package com.corner.sweet.common.exception;

/**
 * @program: EatJoke
 * @description: 会员异常
 * @author: zy
 * @create: 2019-12-25 09:46
 */
public class UserException extends Exception {
    public UserException(){
        super();
    }
    public UserException(String msg){
        super(msg);
    }

}
