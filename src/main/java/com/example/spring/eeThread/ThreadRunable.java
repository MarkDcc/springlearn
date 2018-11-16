package com.example.spring.eeThread;

public class ThreadRunable implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i< 100; i++){
            System.out.println("我是Runable");
        }
    }
}
