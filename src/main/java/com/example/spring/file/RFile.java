package com.example.spring.file;

import java.io.File;
import java.io.IOException;

public class RFile {
    public static void main(String[] args) {
        File file = new File("books1.txt");
    if(!file.exists()){
//        File dir = new File(file.getParent());
//        dir.mkdirs();
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        XiaoQiang xiaoQiang = new XiaoQiang(file);
        xiaoQiang.readBooks(file, "三国");
        System.out.println(xiaoQiang.canReadBooks(file));

    }
}
