package com.wisely.highlight_spring4.ch1.javaconfig;

/**
 * Created by maido on 2017/2/2.
 */
public class UserFunctionService {
    FunctionService functionService;
    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
