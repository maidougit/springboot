package com.wisely.highlight_spring4.ch3.taskschedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by maido on 2017/2/3.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskScheduleConfig.class);

        //ScheduleTaskService scheduleTaskService = context.getBean(ScheduleTaskService.class);


    }
}
