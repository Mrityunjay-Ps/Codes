package Java.practice;

import java.util.Scanner;

public class personYoungOrNot {
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter age: ");
        byte personAge = in.nextByte();
        
        //person is young or not...
        if(personAge <=15){
            System.out.println("You are a child.");
        }else if(personAge>=15 && personAge<=55){
            System.out.println("You are a young man.");
        }else{
            System.out.println("You are not young.");
        }
        
    }
}
