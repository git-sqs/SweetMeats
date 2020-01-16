package com.corner.sweet.common.dto.user;

import lombok.Data;

/**
 * @program: BabyStudy
 * @description:
 * @author: zy
 * @create: 2019-12-31 11:24
 */
@Data
public class UserLoginDto {
    private int type;//类型：1手机号 2邮箱
    private String name;//账号:手机号 邮箱
    private String pwd;//密码
    private String deviceName;//设备名称 PC Android IOS Pad
    private String model;//型号
    private String address;//地址
}