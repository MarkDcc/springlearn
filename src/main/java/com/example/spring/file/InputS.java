package com.example.spring.file;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class InputS {
    public static void main(String[] args) throws IOException {
//        File file = new File("file3333.txt");
//
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        byte[] bytes = new byte[10];
//        bytes = new String("AB").getBytes();
//        fileOutputStream.write(bytes);
////        byte[] bytes1 = new byte[10];
////        int lengthValue = fileInputStream.read(bytes1);
////        System.out.println(Arrays.toString(bytes1));
////        for(int i = 0;i<lengthValue;i++ ){
////            System.out.println(bytes[i]);
////        }
////        fileInputStream.reset();
//        FileInputStream fileInputStream = new FileInputStream(file);
////        System.out.println(fileInputStream.read()+"sss");
//        int d = -1;
//        while((d=fileInputStream.read()) != -1){
//            System.out.println((char)d+"SSSS");
//        }

        //实现一个文件的copy---FOS/FIS
//        File fileSource = new File("fileSource.txt");
//        FileOutputStream fileOutputStream1 = new FileOutputStream(fileSource,true);
//        System.out.println("请输入需要保存的内容：");
//        Scanner in = new Scanner(System.in);
//        String input = in.nextLine();
//        fileOutputStream1.write(input.getBytes());
//        FileInputStream fileInputStream1 = new FileInputStream(fileSource);
//        FileOutputStream fileOutputStream2 = new FileOutputStream("fileOut.txt",true);
//        int date = -1;
//        while((date = fileInputStream1.read()) != -1){
//            fileOutputStream2.write(date);
//        }
        //实现copy，BOS/BIS
        File file = new File("BfileSource.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        System.out.println("请输入需要保存的内容，采用BOS");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        bufferedOutputStream.write(input.getBytes());
        bufferedOutputStream.flush();
        int d = -1;
        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream("BfileOut.txt"));

        while ((d = bufferedInputStream.read()) != -1) {
            bufferedOutputStream2.write(d);
        }
        bufferedOutputStream2.flush();
    }
}
