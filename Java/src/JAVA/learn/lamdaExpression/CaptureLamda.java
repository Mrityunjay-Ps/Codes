package JAVA.learn.lamdaExpression;

@FunctionalInterface
interface HLamda{
    public void show();
}

class UseLamda{
    public void callLamda(HLamda m1){
        m1.show();
    }
}
class Demo{

    public void method1(){
        UseLamda l1 = new UseLamda();
        l1.callLamda(()-> System.out.println("Hello jay!!!!"));
    }

//    int count = 0;
//    public void meth1(){
//        int c = 20;
//        MyLamda m = ()->{
//            int a = 10;
//            System.out.println("Hello!!"+count++);
//            System.out.println("Byee!!"+a);
//            System.out.println("Ciao!!"+c);
//        };
//    }
}



class CaptureLamda {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.method1();
    }
}
