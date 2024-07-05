package com.practice.Multi;

class Test implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" Hello");
        }
    }
}

public class Prac3 {

    public static void main(String[] args) {
        Test test = new Test();
        Thread T = new Thread(test);
        test.run();
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" World");
        }
    }

}
