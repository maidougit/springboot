package com.wisely.highlight_spring4.ch1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by maido on 2017/2/2.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UserFunctionService service = context.getBean(UserFunctionService.class);
        System.out.println(service.sayHello("java config"));
        context.close();
    }
}
