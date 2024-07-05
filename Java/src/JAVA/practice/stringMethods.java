package stringMethods;
import java.lang.*;

public class stringMethods {
    
    public static void main(String args[]){
        
        String str = "programmer@gmail.com";
        
        //Find the username of this gmail...
        
        String uname = str.substring(0,str.indexOf("@"));
        System.out.println("The username of this gmail is: "+uname);


        //find domain name from this gmail...
        
        boolean dname = str.endsWith("gmail.com");
        if(dname==true){
            System.out.println("The domain name is gmail.com");
        }else{
            System.out.println("The domain name is not gmail.com");
        }
        
        //find if the email id is on gmail...
        String str3 = str.substring(0);
        System.out.println();
        
        
        
    }
}
