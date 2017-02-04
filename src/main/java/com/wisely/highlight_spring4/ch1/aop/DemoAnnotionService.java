package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by maido on 2017/2/2.
 */
@Service
public class DemoAnnotionService {
    @Action(name="注解式拦截的add模式")
    public  void add() {

    }
}
