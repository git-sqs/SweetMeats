package com.corner.sweet.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;

    private Integer openId;

    private String name;

    private String tel;

    private String imgUrl;

    private Integer addressId;


}