package com.corner.sweet.goods.provider.service;

import com.corner.sweet.common.vo.R;

/**
 * @PROJECT_NAME: SweetMeats
 * @DESCRIPTION:
 * @USER: Ming
 * @DATE: 2020/2/3 10:19:28
 */
public interface GoodsService {
    R selectAll();

    R selectType(int gtid);

}
