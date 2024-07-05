import java.util.*;
import java.lang.*;

public class quadraticEQUATION {

    public static void main(String args[]) {
        
        //intialize...
        System.out.println("Program from quadratic equation....");
        Scanner inpt = new Scanner(System.in);
        int a, b, c;
        double r1, r2, sq;
        
        //inputs...
        System.out.println("Enter any 3 number's: ");
        a = inpt.nextInt();
        b = inpt.nextInt();
        c = inpt.nextInt();
        
        //sqrt equation
        sq = Math.sqrt((b*b)-(4*a*c)); 
        if(sq < 0){
            System.out.println("Not Allowed Number");
            System.out.println("Change values of a, b, c as sq is negative...");
        }else{
            //roots of r1 and r2....
            r1 = ((-b+sq)/(2*a));
            r2 = ((-b-sq)/(2*a));
            System.out.println("The two roots are: "+r1+" "+r2);
            
        }
    }
}
