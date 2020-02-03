package com.corner.sweet.goods.provider.service.impl;

import com.corner.sweet.common.vo.R;
import com.corner.sweet.entity.Goods;
import com.corner.sweet.goods.provider.config.GoodsCountDto;
import com.corner.sweet.goods.provider.dao.GoodsDao;
import com.corner.sweet.goods.provider.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PROJECT_NAME: SweetMeats
 * @DESCRIPTION:
 * @USER: Ming
 * @DATE: 2020/2/3 10:21:30
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public R selectAll() {
        return R.ok(goodsDao.selectAll());
    }

    @Override
    public R selectType(int gtid) {
        if (goodsDao.selectType(gtid) != null) {
            return R.ok();
        } else {
            return R.fail("你查找的商品类型不存在");
        }
    }

}
