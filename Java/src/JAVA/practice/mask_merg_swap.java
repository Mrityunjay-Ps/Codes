public class mask_merg_swap {

    public static void main(String args[]) {

        // Swap 2 number's without using another variable bitwise...

        int a = 9, b = 12;
        System.out.println("Number before swapping: "+a+" "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("Number after swapping: "+a+" "+b);

        // Merg 2 number's bitwise...

    }
}
