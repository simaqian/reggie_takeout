package com.smq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.smq.entity.Setmeal;
import com.smq.mapper.SetmealMapper;
import com.smq.service.SetmealService;
import org.springframework.stereotype.Service;

@Service
public class SetmealServiceImpl extends ServiceImpl<SetmealMapper, Setmeal> implements SetmealService {
}
