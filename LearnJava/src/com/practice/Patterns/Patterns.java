package com.practice.Patterns;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

//        Pattern 1 :
        System.out.println("Pattern 1");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();


//        Pattern 2 :
        System.out.println("Pattern 2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }

        System.out.println();

//        Pattern 3 :
        System.out.println("Pattern 3");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }

        System.out.println();

//        Pattern 4 :
        System.out.println("Pattern 4");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(n-j+1);
            }
            System.out.println();
        }

        System.out.println();

//        Pattern 5 :
        System.out.println("Pattern 5");
        int c1 = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(c1 + " ");
                c1++;
            }
            System.out.println();
        }

        System.out.println();

//        Pattern 6 :
        System.out.println("Pattern 6");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

//        Pattern 7 :
        System.out.println("Pattern 7");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((i+1)+" ");
            }
            System.out.println();
        }

        System.out.println();

//        Pattern 8 :
        System.out.println("Pattern 8");
        int c2 = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c2+" ");
                c2++;
            }
            System.out.println();
        }

        System.out.println();

//        Pattern 9 :
        System.out.println("Pattern 9-a");
        for (int i = 0; i < n; i++) {
            int val = i;
            for (int j = 0; j <= i; j++) {
                System.out.print(val+1);
                val++;
            }
            System.out.println();
        }

        System.out.println("Pattern 9-b");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i+j+1);
            }
            System.out.println();
        }

        System.out.println();

//        Pattern 10 :
        System.out.println("Pattern 10");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i-j+1);
            }
            System.out.println();
        }

    }
}
