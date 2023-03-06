package com.smq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.smq.entity.DishFlavor;
import com.smq.mapper.DishFlavorMapper;
import com.smq.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}