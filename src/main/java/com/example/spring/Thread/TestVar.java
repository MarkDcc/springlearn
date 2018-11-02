package com.example.spring.Thread;

public class TestVar {
    private int i;
    private String str = "111";
    public void change1(){
        String str = null;
        str = "222222" + this.str;
        System.out.println(str);
    }
    public void change2(){
        String str = null;
        str = "3333333"+ this.str;
        System.out.println(str);
    }

    public static void main(String[] args) {
        TestVar testVar = new TestVar();
        testVar.change1();
//        System.out.println();
        testVar.change2();
    }
}
