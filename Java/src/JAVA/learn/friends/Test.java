package JAVA.learn.friends;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        
        Bmw m3 = new Bmw();



    }
}


class Car {

//    Member Variable
    String name;
    int model;

//    Member Methods
    void acc(){
        System.out.println("Human is runn...");
    }

}

class Bmw extends Car {

    int seats = 2;

}

class Coupe extends Bmw {

}


