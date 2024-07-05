package Java.learn;

class Super{
    public void meth1(){
        System.out.println("Super Method 1");
    }
    public void meth2(){
        System.out.println("Super Method 2");
    }
}

class Sub extends Super{
    @Override
    public void meth2(){
        System.out.println("Sub Method 2");
    }
    public void meth3(){
        System.out.println("Sub Method 3");
    }
}
class dyanamicDispatch {
    public static void main(String[] args) {
        Super su = new Sub();
        su.meth1();
        su.meth2();
//        su.meth3();
    }
}
