package com.example.spring.extend;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static int i;
    public static void main(String[] args) {
//        Father f = new Child();
//        Monther m = null;
//        Child c = null ;
//        if(f instanceof  Child){
//             c = (Child) f;
//        }
////        c =(Child) m;
//        c.sayHello();
//        f.sayHello();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        Integer[] intg = new Integer[arr.size()];
        intg = arr.toArray(intg);
        String str1 = "12";
        int str1in = Integer.parseInt(str1);
        for(Integer e: arr){
            System.out.println(e);
        }
        System.out.println(Arrays.toString(intg));
    }
    public static void ss(int x){
        x *= 2;
    }
}
