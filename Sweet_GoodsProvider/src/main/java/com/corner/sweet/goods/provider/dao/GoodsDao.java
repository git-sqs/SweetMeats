package com.corner.sweet.goods.provider.dao;

import com.corner.sweet.entity.Goods;
import com.corner.sweet.goods.provider.config.GoodsCountDto;

import java.util.List;

/**
 * @PROJECT_NAME: SweetMeats
 * @DESCRIPTION:
 * @USER: Ming
 * @DATE: 2020/2/3 9:49:48
 */
public interface GoodsDao {

    List<Goods> selectAll();

     List<GoodsCountDto> selectCount();
    
    List<Goods> selectType(int gtid);


    
}

