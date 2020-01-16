package com.corner.sweet.entity;

import lombok.Data;

@Data
public class Order {
    private Integer oId;

    private Integer gId;

    private Integer uId;

    private Integer tId;

    private Integer oPrice;

    private Integer oCount;

    private Integer statusId;

}