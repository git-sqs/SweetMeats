package com.corner.sweet.entity;

import lombok.Data;

import java.util.Date;

@Data
public class OssUrl {
    private Integer id;

    private String objName;

    private String url;

    private Date startTime;

    private Date endTime;
}