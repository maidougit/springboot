package com.wisely.highlight_spring4.ch1.javaconfig;

import org.springframework.context.annotation.Bean;

/**
 * Created by maido on 2017/2/2.
 */
public class JavaConfig {

    public FunctionService functionService() {
        return new FunctionService();
    }

    /**
     * 无参构造
     * @return
     */
    @Bean
    public UserFunctionService userFunctionService() {
        UserFunctionService userFunctionService = new UserFunctionService();
        userFunctionService.setFunctionService(functionService());
        return  userFunctionService;
    }

    /**
     * 有参构造
     * @param functionService
     * @return
     */
    @Bean
    public UserFunctionService userFunctionService(FunctionService functionService) {
        UserFunctionService userFunctionService = new UserFunctionService();
        userFunctionService.setFunctionService(functionService);
        return userFunctionService;
    }
}
