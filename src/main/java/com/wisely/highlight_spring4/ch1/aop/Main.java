package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by maido on 2017/2/2.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotionService demoAnnotionService = context.getBean(DemoAnnotionService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoAnnotionService.add();
        demoMethodService.add();
        context.close();
    }
}
