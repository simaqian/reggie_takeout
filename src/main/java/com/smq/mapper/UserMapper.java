package com.smq.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.smq.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}