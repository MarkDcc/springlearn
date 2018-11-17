package com.example.spring.chineseIdol;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Juggler implements Perform  {
    private int ball = 5;

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    public Juggler(int ball) {
        this.ball = ball;
    }

    public Juggler() {
    }

    @Override
    public void performance() throws PerformEx {
        System.out.println("Juggler can play" + " "+ ball + " " + "balls");
    }

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("chineseidol.xml");
        Perform perform = (Perform) ac.getBean("小李");
        try {
            perform.performance();
        } catch (PerformEx performEx) {
            performEx.printStackTrace();
        }
        ((ClassPathXmlApplicationContext) ac).close();
    }
}
