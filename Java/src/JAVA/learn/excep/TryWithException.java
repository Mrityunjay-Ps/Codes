package Java.practice.excep;
import java.io.*;
import java.util.*;

class TryWithException {
    static Scanner in;
    static void Divide() throws Exception
    {
//        try with resource method....
        try(FileInputStream fi = new FileInputStream("C:/Users/Mrity/OneDrive/Desktop/My.txt");Scanner in = new Scanner(fi);) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            System.out.println(a / c);
        }
    }

    public static void main(String[] args) {
        try{
            Divide();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
