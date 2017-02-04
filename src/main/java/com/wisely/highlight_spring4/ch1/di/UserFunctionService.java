package com.wisely.highlight_spring4.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by maido on 2017/2/2.
 */
@Service
public class UserFunctionService {
    @Autowired
   FunctionService functionService;
    public  String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
