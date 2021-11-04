package com.example.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisplus.pojo.user;
import org.springframework.stereotype.Repository;

//在对应的Mapper上面继承基本的类BaseMapper
@Repository
public interface mapper extends BaseMapper<user> {
    //所有的CRUD操作都己经编写完成了
    //你不需要像以前的配置一大堆文件了
}
