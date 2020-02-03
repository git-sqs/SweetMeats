package com.corner.sweet.goods.provider.controller;

import com.corner.sweet.common.vo.R;
import com.corner.sweet.goods.provider.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PROJECT_NAME: SweetMeats
 * @DESCRIPTION:
 * @USER: Ming
 * @DATE: 2020/2/3 11:29:52
 */
@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping("provider/goods/selectAll")
    public R selectAll() {
        return goodsService.selectAll();
    }

    @GetMapping("provider/goods/selectType")
    public R selectType(int gtid) {
        return goodsService.selectType(gtid);
    }

}
