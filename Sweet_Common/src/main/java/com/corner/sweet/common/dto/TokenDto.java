package com.corner.sweet.common.dto;

import lombok.Data;

/**
 * @program: EatJoke
 * @description:
 * @author: zy
 * @create: 2019-12-25 14:37
 */
@Data
public class TokenDto {
    private int uid;
    private int type;//类型 1手机号 2邮箱
    private String phone;
    private String email;

    public TokenDto() {
    }

    public TokenDto(int uid, int type, String phone, String email) {
        this.uid = uid;
        this.type = type;
        this.phone = phone;
        this.email = email;
    }
}