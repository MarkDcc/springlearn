package com.example.spring.Thread;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ThreadConfig.class);
        ThreadBean threadBean = ac.getBean(ThreadBean.class);
        for(int j = 1;j<10;j++){
            threadBean.executeTask1(j);
            threadBean.executeTask2(j);
        }
//        ac.close();
    }
}
