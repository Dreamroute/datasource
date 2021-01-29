package com.github.dreamroute.datasource.sample.entity;

import com.github.dreamroute.mybatis.pro.core.annotations.Id;
import com.github.dreamroute.mybatis.pro.core.annotations.Table;
import lombok.Data;

@Data
@Table("smart_user")
public class User {

    @Id
    private Long id;
    private String name;
    private String password;

}
