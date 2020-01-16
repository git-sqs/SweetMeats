package com.corner.sweet.common.dto.sinology;

import lombok.Data;

import java.util.Date;

/**
 * @program: BabyStudy
 * @description:
 * @author: zy
 * @create: 2020-01-08 15:58
 */
@Data
public class LikeDto {
    private Integer id;
    private Integer pid;
    private String pname;
    private Integer uid;
    private String phone;
    private int flag;
    private Date ctime;
}
