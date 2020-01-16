package com.corner.sweet.common.dto.sinology;

import lombok.Data;

import java.util.List;

/**
 * @program: BabyStudy
 * @description:
 * @author: zy
 * @create: 2020-01-07 10:57
 */
@Data
public class PoetryBatchDto {
    private String author;
    private String title;
    private List<String> paragraphs;
    private List<String> notes;
}
