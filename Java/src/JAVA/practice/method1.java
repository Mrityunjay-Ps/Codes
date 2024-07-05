package Java.practice;

public class method1 {
    
    static int max(int a, int b)
    {
        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    static int max(int a, int b, int c){
        return a + b + c;
    }
    
    public static void main(String args[]){
        
        int a = 10, b = 20, c;
        c=max(a,b);
    
    
        
    }
}
