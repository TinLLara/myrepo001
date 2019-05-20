package com.szcxsl.springboot;

import com.szcxsl.springboot.dto.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * spring boot 单元测试类，可以自动注入
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
    @Autowired
    private User user;

    @Autowired
    ApplicationContext applicationContext;

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testBeans() {
        boolean b = applicationContext.containsBean("userService");
        System.out.println(b);
    }
    @Test
    public void contextLoads() {
        System.out.println(user);
    }

    @Test
    public void testLogs() {
        /**
         * spring boot 默认日志级别为info，可在配置文件进行调整(可指包)，其他默认使用info级别日志：root日志
         */
        logger.trace("trace日志");
        logger.debug("debug日志");
        logger.info("info日志");
        logger.warn("warn日志");
        logger.error("error日志");
    }
}
