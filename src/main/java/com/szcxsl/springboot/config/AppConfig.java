package com.szcxsl.springboot.config;

import com.szcxsl.springboot.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 标注这是一个配置类
 */
@Configuration
public class AppConfig {
    /** @Bean 将方法的返回值添加到bean容器，容器中该bean默认的id就是方法名 **/
    @Bean
    public UserService userService() {
        System.out.println("spring boot 加载了userService");
        return new UserService();
    }
}
