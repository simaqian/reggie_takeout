package com.smq.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smq.dto.SetmealDto;
import com.smq.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    void saveWithDish(SetmealDto setmealDto);

    void removeWithDish(List<Long> ids);
}
