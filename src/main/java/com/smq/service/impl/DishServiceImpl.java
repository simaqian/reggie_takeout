package com.smq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.smq.entity.Dish;
import com.smq.mapper.DishMapper;
import com.smq.service.DishService;
import org.springframework.stereotype.Service;

@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements DishService {
}
