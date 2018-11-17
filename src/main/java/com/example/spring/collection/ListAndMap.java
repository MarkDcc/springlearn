package com.example.spring.collection;

import java.util.*;

public class ListAndMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("第一");
        list.add("第二");
        list.add("第三");
        //迭代器
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (String e:list
             ) {
            System.out.println(e);
        }

        Map<String,Integer> map = new HashMap<>();
        map.put("张三",50);
        map.put("李四",60);
        map.put("王五",70);
        //第一种遍历。遍历所有的value
        System.out.println(map.values());
        System.out.println("*****************");
        //keySet()
       Set<String> setValue =  map.keySet();
        for (String e : setValue
                ) {
            System.out.println(map.get(e));
        }
        //entrySet()
        System.out.println("**************");
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        for (Map.Entry<String,Integer> e:set
             ) {
            System.out.println(e.getValue());
        }

    }
//    public  void 小李（）{}
}
