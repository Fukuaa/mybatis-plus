package com.example.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mybatisplus.pojo.user;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.bind.annotation.W3CDomHandler;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class wrappertext {


        @Autowired
        private com.example.mybatisplus.mapper.mapper mapper;

        @Test
        void contextLoads() {
            QueryWrapper<user> wrapper = new QueryWrapper<>();
            wrapper.isNotNull("name")
                    .eq("name","zzz");
            mapper.selectList(wrapper).forEach(System.out::println);
        }
        @Test//模糊查询
        void  text(){
            QueryWrapper<user> wrapper = new QueryWrapper<>();
            wrapper.like("name","郑");
            List<Map<String,Object>> maps = mapper.selectMaps(wrapper);
            maps.forEach(System.out::println);

        }
        @Test//排序查询
        void text1(){
            QueryWrapper<user> wrapper = new QueryWrapper<>();
            wrapper.orderByAsc("password");
            List<user> users  = mapper.selectList(wrapper);
            users.forEach(System.out::println);
        }

}
