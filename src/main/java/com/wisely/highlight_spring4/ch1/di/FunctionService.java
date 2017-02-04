package com.wisely.highlight_spring4.ch1.di;

import org.springframework.stereotype.Service;

/**
 * Created by maido on 2017/2/2.
 */
@Service
public class FunctionService
{
    public  String sayHello(String word) {
        return "Hello " + word + " !";
    }
}
