package stringMethods;

public class stringMeUdemy {
    public static void main(String args[]){
        
        String str = "programmer@gmail.com";
        
        int instr = str.indexOf("@");
        String Uname = str.substring(0, instr);
        String Dname = str.substring(instr+1,str.length());
        
        System.out.println("User name is "+Uname);
        System.out.println("Domain name is "+Dname);
        
        System.out.println(Dname.startsWith("gamil"));
        
        
    }
}
