package com.smq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.smq.entity.AddressBook;
import com.smq.mapper.AddressBookMapper;
import com.smq.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}