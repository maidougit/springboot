package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件通知类
 * Created by maido on 2017/2/3.
 */
@Component
public class DemoLinstener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("我(bean-demoLinstner) 接收到了 bean-publicLisher 发布的消息 : " + msg);
    }
}
