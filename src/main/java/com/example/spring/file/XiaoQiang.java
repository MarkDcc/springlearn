package com.example.spring.file;

import java.io.*;

public class XiaoQiang {
    private File file;

    public void read() throws SelfException {
        System.out.println("我是小强");
//        throw new SelfException();
    }

    public void readBooks(File file,String book){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            PrintWriter pw = new PrintWriter(fileOutputStream);
            pw.write(book);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public StringBuilder canReadBooks(File file){
        StringBuilder books = new StringBuilder();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            int d = -1;
            while(( d = inputStreamReader.read()) != -1){
                books.append((char) d);
            }
            inputStreamReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }


    public XiaoQiang(File file) {
        this.file = file;
    }

    public XiaoQiang() {
    }

}
