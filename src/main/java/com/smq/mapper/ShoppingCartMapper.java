package com.smq.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.smq.entity.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShoppingCartMapper extends BaseMapper<ShoppingCart> {
}