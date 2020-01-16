package com.corner.sweet.common.dto.sinology;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @program: BabyStudy
 * @description:
 * @author: zy
 * @create: 2020-01-07 14:59
 */
@Data
public class PoetryDetailDto {
    private Integer id;
    private String title;
    private String type;
    private String paragraph;
    private String author;
    private String notes;
    private int flag;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ctime;
    private int lookcount;
}
