package com.wisely.highlight_spring4.ch3.taskschedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by maido on 2017/2/3.
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch3.taskschedule")
@EnableScheduling
public class TaskScheduleConfig {
}
