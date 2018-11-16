package com.example.spring.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExam {
    public static void main(String[] args) {
        File file = new File("file3333.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(file.exists()){
            try (RandomAccessFile randomAccessFile = new RandomAccessFile(file,"rw")){

                String str = "A";
                randomAccessFile.write(str.getBytes());
                randomAccessFile.seek(0);
                int i = randomAccessFile.read();
                System.out.println(i);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("文件不存在");
        }
    }
}
