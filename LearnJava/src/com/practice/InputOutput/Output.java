package com.practice.InputOutput;

import java.io.FileInputStream;

public class Output {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("E:/test.txt")){

            byte[] b = new byte[fis.available()];
            fis.read(b);
            String str = new String(b);
            System.out.println(str);


        }catch (Exception e){
            System.out.println(e);
        }


    }
}
