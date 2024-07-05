package Java.practice;

import java.util.Scanner;

public class gradesForMarks {
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in); //Scanner class
        System.out.println("Enter marks for 3 subjects:");
        float marks1 = in.nextFloat();
        float marks2 = in.nextFloat();
        float marks3 = in.nextFloat();
        
        //total of all subjects
        float totalMarks = marks1+marks2+marks3;
        System.out.println("Total marks of all subjects is: " + totalMarks);
        
        //average marks
        float avgMarks = totalMarks/3;
        System.out.println("Average marks is: " + avgMarks);
        
        //display grades
        if(avgMarks>=70){
            System.out.println("Grade is A.");
        }else if(60>=avgMarks && avgMarks<70){
            System.out.println("Grade is B.");
        }else if(50>=avgMarks && avgMarks<60){
            System.out.println("Grade is C.");
        }else{
            System.out.println("Grade is D.");
        }
    }
}
