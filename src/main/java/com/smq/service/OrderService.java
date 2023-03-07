package com.smq.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smq.entity.Orders;

public interface OrderService extends IService<Orders> {
    void submit(Orders orders);
}