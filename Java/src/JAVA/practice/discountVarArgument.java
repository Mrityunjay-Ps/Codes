package Java.practice;

public class discountVarArgument {

    static double discount (double ...price) {
        double s = 0;
        double diAmt = 0;
        for (int i=0; i<price.length; i++)
            s=(int)s+price[i];


        if (s<500){
            diAmt=(s*5)/100;
        } else if (s>=500&&s<=1000) {
            diAmt=(s*10)/100;
        } else if (s>=1000 && s<=1500) {
            diAmt=(s*15)/100;
        }else {
            diAmt=(s*20)/100;
        }
        return diAmt;
    }


    public static void main(String[] args) {
        double disAmt = discount(30.56,500.8);
        System.out.println(disAmt);
    }

}
