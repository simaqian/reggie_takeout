package com.smq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.smq.entity.Employee;
import com.smq.mapper.EmployeeMapper;
import com.smq.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
