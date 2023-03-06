package com.smq.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.smq.common.Result;
import com.smq.entity.Category;
import com.smq.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public Result<String> save(@RequestBody Category category) {
        categoryService.save(category);
        return Result.success("新增分类成功");
    }

    @GetMapping("/page")
    public Result<Page> page(int page, int pageSize) {
        Page<Category> categoryPage = new Page<>(page, pageSize);
        LambdaQueryWrapper<Category> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.orderByAsc(Category::getSort);

        categoryService.page(categoryPage, queryWrapper);
        return Result.success(categoryPage);
    }

    @DeleteMapping
    public Result<String> delete(Long ids){
        categoryService.remove(ids);
        return Result.success("删除成功");
    }

    @PutMapping
    public Result<String> update(@RequestBody Category category) {
        log.info("修改分类信息为：{}", category);
        categoryService.updateById(category);
        return Result.success("修改分类信息成功");
    }
}
