package com.wisely.highlight_spring4.ch2.prepost;

/**
 * Created by maido on 2017/2/3.
 */
public class BeanWayService {
    public void init() {
        System.out.println("@Bean-init-method");
    }
    public void destory() {
        System.out.println("@Bean-destory-method");
    }

    public BeanWayService() {
        super();
        System.out.println("初始化构造函数 - BeanWayService");
    }
}
