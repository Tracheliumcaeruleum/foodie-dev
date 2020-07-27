package com.imooc.service.impl;

import com.imooc.mapper.ItemsMapper;
import com.imooc.service.itemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class itemsServiceImpl implements itemsService {

        @Autowired
        private ItemsMapper itemsMapper;





}
