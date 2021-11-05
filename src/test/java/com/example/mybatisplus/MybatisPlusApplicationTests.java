package com.example.mybatisplus;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.mapper.mapper;
import com.example.mybatisplus.pojo.user;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {
    @Autowired
    private com.example.mybatisplus.mapper.mapper mapper;

    @Test
    void contextLoads() {
        mapper.deleteById(644L);
       /* //分页
       Page<user> page = new Page<>(3,5);
        mapper.selectPage(page,null);
        page.getRecords().forEach(System.out::println);*/
        //继承了BaseMapper
        //所有的方法都来自己父类我们也可以编写自己的扩展方法!

        /*user user = new user();
        user.setId(5);
        user.setName("zzz");
        user.setPassword("123");
        mapper.insert(user);*/
        /*for (int a =1;a<100;a++){
            user user = new user();
            user.setId(545L+a);
            user.setName("zzz");

            user.setPassword("123");
            mapper.insert(user);*/
            /*user user = mapper.selectById(2);
            user.setName("郑青风");
            mapper.updateById(user);*/
        /*List<user> list = mapper.selectList(null);
        list.forEach.(System.out::println);*/
        }



}


