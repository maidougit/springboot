package com.wisely.highlight_spring4.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by maido on 2017/2/2.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletionService s1 = context.getBean(DemoSingletionService.class);
        DemoSingletionService s2 = context.getBean(DemoSingletionService.class);
        PropertyService p1 = context.getBean(PropertyService.class);
        PropertyService p2 = context.getBean(PropertyService.class);

        System.out.println("s1 与 s2是否相等 : " + s1.equals(s2));
        System.out.println("p1 与 p2 是否相等 : " + p1.equals(p2));
    }
}
