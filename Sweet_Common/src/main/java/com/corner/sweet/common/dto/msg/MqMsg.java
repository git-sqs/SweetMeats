package com.corner.sweet.common.dto.msg;

import lombok.Data;

/**
 * @program: BabyStudy
 * @description:
 * @author: zy
 * @create: 2020-01-08 16:21
 */
@Data
public class MqMsg {
    private int type;//消息类型 1.点赞消息 新增 2.点赞消息  删除 3.订单消息 等
    private Object msg;
}
