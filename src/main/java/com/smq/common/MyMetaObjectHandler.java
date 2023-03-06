package com.smq.common;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

@Component
@Slf4j
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("公共字段自动填充(insert)...");
        log.info(metaObject.toString());
        metaObject.setValue("createTime", new Date(System.currentTimeMillis()));
        metaObject.setValue("updateTime",new Date(System.currentTimeMillis()));
        metaObject.setValue("createUser",BaseContext.getCurrentId());
        metaObject.setValue("updateUser",BaseContext.getCurrentId());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("公共字段自动填充(update)...");
        log.info(metaObject.toString());
        metaObject.setValue("updateTime",new Date(System.currentTimeMillis()));
        metaObject.setValue("updateUser",BaseContext.getCurrentId());
    }
}