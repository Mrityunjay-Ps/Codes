package Java.practice;

import java.util.Scanner;

public class typeWebsite {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter url: ");
        String url = in.nextLine();
        
        //Get Protocol...
        if(url.startsWith("http")){
            System.out.println("It is a hyper text transfer protocol.");
        }else if(url.startsWith("ftp")){
            System.out.println("It is a file transfer protocol.");
        }else{
            System.out.println("Invalid protocol.");
        }
        
        //Get Domain name...
        if(url.endsWith("com")){
            System.out.println("It is a .com website.");
        }else if(url.endsWith(".org")){
            System.out.println("This website is .org website.");
        }else{
            System.out.println("This website is .net website.");
        }
    }
}
