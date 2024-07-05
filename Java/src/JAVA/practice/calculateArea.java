package Java.practice;

import java.util.Scanner;

public class calculateArea {

    static int area(int x, int y) {
        int z = 0;
        z = x*y;
        return z;
    }

    static double area(int q) {
        double w = 0;
        w = Math.PI*q*q;
        return w;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, areaRectangle;

        areaRectangle=area(a=in.nextInt(),b=in.nextInt());
//        double areaCircle=area(a=in.nextInt());
        System.out.println(areaRectangle);



    }
}
