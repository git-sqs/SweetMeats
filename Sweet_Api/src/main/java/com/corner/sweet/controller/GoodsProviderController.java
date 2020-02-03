package com.corner.sweet.controller;

import com.corner.sweet.common.vo.R;
import com.corner.sweet.service.GoodsProviderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PROJECT_NAME: SweetMeats
 * @DESCRIPTION:
 * @USER: Ming
 * @DATE: 2020/2/3 11:51:34
 */
@RestController
@Api(value = "实现商品的相关操作",tags = "实现商品的相关操作")
public class GoodsProviderController {
    @Autowired
    private GoodsProviderService providerService;

    @ApiOperation(value = "查看所有商品信息",notes = "查看所有商品信息")
    @PostMapping("/api/goods/selectall")
    public R selectAll(){
        return providerService.selectAll();
    }

    @ApiOperation(value = "根据类型查看商品信息",notes = "根据类型查看商品信息")
    @PostMapping("/api/goods/selecttype")
    public R selectType(int gtid){
        return providerService.selectType(gtid);
    }

}
