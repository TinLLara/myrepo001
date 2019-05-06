package com.szcxsl.springboot.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import java.util.List;

/**
 * spring xml文件配置与注解配置支持如下方式绑定数据：
 * 1、字面量 value=""
 * 2、${}从环境变量读取配置
 * 3、#{SpEL}spring 表达式获取
 */
@Data
@ConfigurationProperties(prefix = "user")
@Configuration
@Validated
//@PropertySource(value = {"classpath:user.properties"})
public class User {
    //@Value("${user.user-name}")
    @Email
    private String userName;
    //@Value("#{16*2}")
    private Integer age;
    //@Value("湖南长沙")
    private String city;
    private List<String> hobbies;
    private Dog dog;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", hobbies=" + hobbies +
                ", dog=" + dog +
                '}';
    }
}
