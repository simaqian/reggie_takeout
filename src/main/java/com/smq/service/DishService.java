package com.smq.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smq.dto.DishDto;
import com.smq.entity.Dish;

public interface DishService extends IService<Dish> {
    void saveWithFlavor(DishDto dishDto);

    DishDto getByIdWithFlavor(Long id);

    void updateWithFlavor(DishDto dishDto);
}
