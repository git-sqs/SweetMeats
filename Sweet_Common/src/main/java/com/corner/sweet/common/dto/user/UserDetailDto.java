package com.corner.sweet.common.dto.user;

import lombok.Data;

import java.util.Date;

/**
 * @program: BabyStudy
 * @description:
 * @author: zy
 * @create: 2020-01-02 14:23
 */
@Data
public class UserDetailDto {
    private String phone;
    private String email;
    private Integer id;
    private Integer uid;
    private String realname;
    /**
     * 性别 1女 2男
     */
    private Integer sex;
    private Date birthday;
    private String address;
    private String headimg;
}