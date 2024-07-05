package com.practice.Multi;

public class Prac2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(i+"Hello");
            i++;
        }
    }
}

class Main {
    public static void main(String[] args) {

        Prac2 p = new Prac2();
        p.start();
        int i = 0;
        while (true) {
            System.out.println(i+"World");
            i++;
        }
    }
}
