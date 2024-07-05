package Java.practice;

public class methodReverse {
    static int reveNum (int n) {
        int reverse=0;
        while(n!=0)
        {
            int rem = n%10;
            reverse = ((reverse*10)+rem);
            n = n/10;

        }
        return reverse;
    }

    static void reveNum (int Q[]) {
        int B[] = new int[5];

        for (int i=Q.length-1, j=0; i>=0; i--, j++) {
            B[j]=Q[i];
        }
        Q=B;
        for (int x:B) {
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        int aar[]={5,8,10,12,16};
        int num = 756;

        int revNum = reveNum(num);
//        reveNum(aar);
        System.out.println(revNum);
    }


}
