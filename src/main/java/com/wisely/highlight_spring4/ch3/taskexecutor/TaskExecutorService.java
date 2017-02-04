package com.wisely.highlight_spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by maido on 2017/2/3.
 */
@Service
public class TaskExecutorService {

    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务: " + i);
    }

    @Async
    public void executecAsyncTaskPlus(Integer i) {
        System.out.println("执行异步任务+1: " +  i);
    }
}
