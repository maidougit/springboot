package com.wisely.highlight_spring4.ch3.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 条件判断
 * Created by maido on 2017/2/3.
 */
@Configuration
public class ConditionalConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService() {
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public  ListService linuxListService() {
        return  new LinuxListService();
    }
}
