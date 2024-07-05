package com.practice.Multi;

//Multi Threading using Monitor
public class Prac4 {
    synchronized void display(String s){
//        We can synchronize by adding synchronized block or making the method synchronize
//        synchronized (this){
            for (int i = 0; i < s.length(); i++) {
                System.out.print(s.charAt(i));
            }
//        }
    }
}

class MThread extends Thread {
    Prac4 d;
    MThread(Prac4 p) {
        d = p;
    }

    public void run() {
        d.display("Hello World");
    }
}

class NThread extends Thread {
    Prac4 data;
    NThread(Prac4 p) {
        data = p;
    }

    public void run() {
        data.display(" Welcome");
    }
}

class Test1 {

    public static void main(String[] args) {
        Prac4 mydata = new Prac4();
        MThread t1 = new MThread(mydata);
        NThread t2 = new NThread(mydata);
        t1.start();
        t2.start();
    }

}

