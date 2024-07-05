package Java.practice;

public class sumOfAllVarArgument {

    static int sum(int ...A) {
        int s = 0;
        for (int i=0; i<A.length; i++)
            s=s+A[i];
        return s;
    }
    public static void main(String[] args) {
        int sum = sum(2,5,8);
        System.out.println(sum);
    }


}
