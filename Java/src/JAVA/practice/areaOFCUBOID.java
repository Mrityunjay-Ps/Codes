import java.util.*;
public class areaOFCUBOID {

    public static void main(String args[]) {
        
        //intilize
        int height, length, breath;
        int totalArea, volume;
        //input...
        System.out.println("Enter Height, Length, Breath: ");
        Scanner inpt = new Scanner(System.in);
        height = inpt.nextInt();
        length = inpt.nextInt();
        breath = inpt.nextInt();
        
        //code..
        int frontBACK = 2*(length*height);
        int rigthLEFT = 2*(breath*height);
        int topBottom = 2*(length*breath);
        
        //AREA
        totalArea = (frontBACK + rigthLEFT + topBottom);
        System.out.println("The Total Area of the cuboid is: " + totalArea);
        
        //VOLUME
        volume = (length * breath * height);
        System.out.println("The Total Volume of the cuboid is: " + volume);
        
    }
}
