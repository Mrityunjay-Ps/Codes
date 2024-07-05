package Java.learn.lamdaExpression;

//section:- 22
//Lecture:- 210

@FunctionalInterface
interface MyLamda
{
    public void display();
}

class My implements MyLamda{
    @Override
    public void display() {
        System.out.print("Hello World!!!");
    }
}


public class Main {
    public static void main(String[] args) {
//        My m = new My();
//              or
//        MyLamda m = new My();
//              or

        //this an anyonums class...
//        MyLamda m = new MyLamda(){
//            @Override
//            public void display() {
//                System.out.println("hello world");
//            }
//        };

        //now let see how we can convert this in lamda expression
        //this is lamda expression....
        MyLamda m =()->{System.out.println("Hello World");};
        //this is referening to this display method only as it has MyLamda reference
        m.display();


    }
}
