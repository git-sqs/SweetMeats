package com.corner.sweet.common.dto.sms;

import lombok.Data;

/**
 * @program: BabyStudy
 * @description:
 * @author: zy
 * @create: 2019-12-30 14:59
 */
@Data
public class SmsCodeDto {
    private String phone;
    private int code;
    private int type;//类型 1 注册验证码 2忘记密码的验证码
}
