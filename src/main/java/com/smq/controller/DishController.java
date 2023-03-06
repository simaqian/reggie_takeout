package com.smq.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.smq.common.Result;
import com.smq.dto.DishDto;
import com.smq.entity.Category;
import com.smq.entity.Dish;
import com.smq.service.CategoryService;
import com.smq.service.DishFlavorService;
import com.smq.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/dish")
@Slf4j
public class DishController {

    @Autowired
    private DishService dishService;
    @Autowired
    private DishFlavorService dishFlavorService;

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public Result<String> save(@RequestBody DishDto dishDto) {
       dishService.saveWithFlavor(dishDto);
       return Result.success("新增菜品成功");
    }

    @GetMapping("/page")
    public Result<Page> page(int page, int pageSize, String name) {
        Page<Dish> pageInfo = new Page<>(page,pageSize);
        Page<DishDto> returnPage = new Page<>();
        LambdaQueryWrapper<Dish> lqw = new LambdaQueryWrapper<>();

        lqw.like(name != null,Dish::getName,name);
        lqw.orderByDesc(Dish::getUpdateTime);

        dishService.page(pageInfo,lqw);

        BeanUtils.copyProperties(pageInfo,returnPage,"records");
        List<Dish> records = pageInfo.getRecords();
        List<DishDto> list = records.stream().map((item) -> {
            DishDto dishDto = new DishDto();
            BeanUtils.copyProperties(item, dishDto);
            Category byId = categoryService.getById(item.getCategoryId());
            if(byId != null){
                dishDto.setCategoryName(byId.getName());
            }

            return dishDto;
        }).collect(Collectors.toList());
        returnPage.setRecords(list);
        return Result.success(returnPage);
    }
    @GetMapping("/{id}")
    public Result<DishDto> getByIdWithFlavor(@PathVariable Long id) {
        DishDto dishDto = dishService.getByIdWithFlavor(id);
        return Result.success(dishDto);
    }

    @PutMapping
    public Result<String> update(@RequestBody DishDto dishDto) {
        log.info("接收到的数据为：{}", dishDto);
        dishService.updateWithFlavor(dishDto);
        return Result.success("修改菜品成功");
    }
    
}