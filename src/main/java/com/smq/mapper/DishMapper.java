package com.smq.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.smq.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
