package com.example.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class user {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private  String password;
    //创建时添加
    @TableField(fill = FieldFill.INSERT)
    private Date createtime;
    //修改时更改
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updatetime;
    @Version
    private int version;
}
