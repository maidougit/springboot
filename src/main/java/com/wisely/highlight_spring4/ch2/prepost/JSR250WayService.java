package com.wisely.highlight_spring4.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by maido on 2017/2/3.
 */
public class JSR250WayService {
    @PostConstruct
    public  void init() {
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-jsr250WayService");
    }

    @PreDestroy
    public void destory() {
        System.out.println("jsr250-destory-method");
    }
}
