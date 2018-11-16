package com.example.spring.eeThread;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread threadEntity  = new ThreadEntity();
        threadEntity.start();
        Thread threadRunable = new Thread(new ThreadRunable());
        threadRunable.run();
        Runnable runnable = new Runnable(){
            public void run(){
                System.out.println("我是线程3");
            }
        };
        Thread thread  = new Thread(runnable);
        threadEntity.join();
        thread.start();
    }
}
