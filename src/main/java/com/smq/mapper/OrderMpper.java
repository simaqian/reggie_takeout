package com.smq.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.smq.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMpper extends BaseMapper<Orders> {
}