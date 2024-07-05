package Java.learn.lamdaExpression;
// 211
//Parametrise Functional Interface


@FunctionalInterface
interface Lamda{
//    public void show(String na);
    public int add(int a, int b);
}

public class parametriseLamdaExp {
    public static void main(String[] args) {

        Lamda la = (a,b)->{return a+b;};
//        this is also allowed...
//        Lamda la = (a,b)->a+b;
        System.out.println(la.add(10,20));

    }
}
