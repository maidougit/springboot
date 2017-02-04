package com.wisely.highlight_spring4.ch3.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by maido on 2017/2/3.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext(ConditionalConfig.class);
        ListService listService = context.getBean(ListService.class);

        System.out.println(context.getEnvironment().getProperty("os.name") + "系统下的列表命令为 : " + listService.showListCmd());
    }
}
