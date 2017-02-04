package com.wisely.highlight_spring4.ch3.taskschedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by maido on 2017/2/3.
 */
@Service
public class ScheduleTaskService {

 public  static  final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

 @Scheduled(fixedRate =  5000)
 public void reportCurrentTime() {
     System.out.println("每隔五秒执行一次 : " + dateFormat.format(new Date()));
 }
 @Scheduled(cron = "0 28 11 ? * *")
 public void fixTimeExecution() {
     System.out.println("在指定的时间执行 : " + dateFormat.format(new Date()) + "执行");
 }
}
