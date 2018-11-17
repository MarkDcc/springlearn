package com.example.spring.chineseIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JugglerBike extends Juggler {
    private Ridable ridable;

    public JugglerBike(int ball, Ridable ridable) {
        super(ball);
        this.ridable = ridable;
    }

    public JugglerBike(Ridable ridable) {
        this.ridable = ridable;
    }

    public JugglerBike() {
    }

    @Override
    public void performance() throws PerformEx {
        super.performance();
        System.out.println("while rid...");
        ridable.rid();
    }

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("chineseidol.xml");
        Perform jugglerBike = (Perform) ac.getBean("小张");
        try {
            jugglerBike.performance();
        } catch (PerformEx performEx) {
            performEx.printStackTrace();
        }

    }
}
