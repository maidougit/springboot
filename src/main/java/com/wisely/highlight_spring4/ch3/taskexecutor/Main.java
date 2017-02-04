package com.wisely.highlight_spring4.ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by maido on 2017/2/3.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        TaskExecutorService taskExecutorService = context.getBean(TaskExecutorService.class);

        for (int i = 0; i < 10 ; i++) {
            taskExecutorService.executeAsyncTask(i);
            taskExecutorService.executecAsyncTaskPlus(i);
        }

        context.close();
    }
}
