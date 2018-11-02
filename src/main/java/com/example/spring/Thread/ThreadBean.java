package com.example.spring.Thread;

import org.springframework.scheduling.annotation.Async;

public class ThreadBean {
    @Async
    public void executeTask1(int i){
        System.out.println("执行异步任务1---"+i);
    }

    @Async
    public void executeTask2(int i){
        System.out.println("执行异步任务2---"+(i+1));
    }
}
