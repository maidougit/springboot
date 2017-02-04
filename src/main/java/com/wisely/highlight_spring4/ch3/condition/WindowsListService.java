package com.wisely.highlight_spring4.ch3.condition;

/**
 * Created by maido on 2017/2/3.
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
