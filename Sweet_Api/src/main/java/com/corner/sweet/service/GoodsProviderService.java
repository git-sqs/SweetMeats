package com.corner.sweet.service;

import com.corner.sweet.common.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @PROJECT_NAME: SweetMeats
 * @DESCRIPTION:
 * @USER: Ming
 * @DATE: 2020/2/3 11:49:42
 */
@FeignClient("sweet-shoppingprovider")
public interface GoodsProviderService {
    @GetMapping("provider/goods/selectAll")
    R selectAll();

    @GetMapping("provider/goods/selectType")
    R selectType(int gtid);
}
