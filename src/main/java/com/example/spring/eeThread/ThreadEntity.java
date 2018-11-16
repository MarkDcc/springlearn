package com.example.spring.eeThread;

public class ThreadEntity extends Thread {
    @Override
    public void run() {
        super.run();
        for(int i = 0; i<100;i++){
            System.out.println("我是线程1");
        }
    }
}
