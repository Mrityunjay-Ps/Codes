import java.util.*;
import java.lang.*;

public class AreaOFTRIANGLE {

    public static void main(String[] args) {

        
        //1)-- By using 1/2*base*height FORMULA....
        
        //Initalization...
//        float HeightOFTRIA, BaseOFTRIA, areaOFTRIA;
//        Scanner inpt = new Scanner(System.in);
//        
//        //Taking Input...
//        System.out.println("Enter Height and Base of the Triangle: ");
//        HeightOFTRIA = inpt.nextFloat();
//        BaseOFTRIA = inpt.nextFloat();
        
        //expression...
        
//        areaOFTRIA = (HeightOFTRIA*BaseOFTRIA)/2;
//        System.out.print("Area of a Triangle is: ");
//        System.out.println(areaOFTRIA);
        
        //2)-- First we have to get the S that is sum of all sides divide by 1/2 and then,
        //     Area = sqrt of S(s-a)*(s-b)*(s-c)...
        
        //Initilaztion...
        float S, side1, side2, side3, areaOFTRIA;
        //S = allSideOFTRIA
        Scanner inpt = new Scanner(System.in);
        
        //input...
        System.out.println("Enter all sides of the Triangle: ");
        side1 = inpt.nextFloat();
        side2 = inpt.nextFloat();
        side3 = inpt.nextFloat();

        //expression
        S = (side1*side2*side3)/2;
        System.out.print("Area of a Triangle is: ");
        areaOFTRIA = (float) Math.sqrt(S*(S-side1)*(S-side2)*(S-side3));
        System.out.println(areaOFTRIA);
    }
    
}
