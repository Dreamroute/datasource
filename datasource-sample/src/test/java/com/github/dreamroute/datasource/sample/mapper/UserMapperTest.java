package com.github.dreamroute.datasource.sample.mapper;

import com.github.dreamroute.datasource.sample.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void selectByIdTest() {
        User user = userMapper.selectById(1L);
        assertEquals("w.dehi", user.getName());
    }

}
