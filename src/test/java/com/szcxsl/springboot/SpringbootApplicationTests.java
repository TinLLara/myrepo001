package com.szcxsl.springboot;

import com.szcxsl.springboot.dto.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * spring boot 单元测试类，可以自动注入
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
    @Autowired
    private User user;
    @Test
    public void contextLoads() {
        System.out.println(user);
    }
}
