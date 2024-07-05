package Java.learn.langPack;
import java.lang.reflect.*;

class MY {
    private int a;
    protected int b;
    public int c;
    int d;

    public MY() {}
    public MY(int x, int z) {}
    public void display(String s1, String s2) {}
    public int show(int q, int w) {return 0;}
}

class reflectDemo{
    public static void main(String[] args) {
        //getting the defination of class...
//  1:)
        Class c = MY.class;
//  2:)
//        MY m = new MY();
//        Class c1 = m.getClass();

        //to display all the decleared variable
        Field field[]=c.getDeclaredFields();
        for(Field x:field){
            System.out.println(x);
        }

        System.out.println();
        //to display all the constructor
        Constructor con[]=c.getConstructors();
        for(Constructor co:con)
            System.out.println(co);
 
        System.out.println();
        //to display methods
        Method meth[] = c.getMethods();
        for(Method m:meth)
            System.out.println(m);

        System.out.println();
        //to display parameter
        Parameter []params = meth[0].getParameters();
        for (Parameter p:params)
            System.out.println(p);
    }
}