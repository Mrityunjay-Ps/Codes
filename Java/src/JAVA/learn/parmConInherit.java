package JAVA.learn;
/*With this example we have Java.learn about parametrice constructor
* When we make the object of child class in main function with no argument then the non-para constructor is called, and
* when we give any argument then the para constructor is called but para const is only called from child class and for
* super class non parametice constructor is called and if you want to call para-constr of super class and child class
* then u have to make another parametice constructor in child class with two argumnets first argument will be for super
* class para-const and second for child class para-const and under curly brackets we have to write super(x) here x is
* variable for super class para constructor...
* */
class parent {
    public parent(){
        System.out.println("Non-Para Parent");
    }
    public parent(int x){
        System.out.println("Para Partent "+x);
    }
}

class child extends parent{
    public child(){
        System.out.println("Non-Para Child");
    }
    public child(int y){
        System.out.println("Para-Child "+y);
    }
    public child (int x, int y){
        super(x);
        System.out.println("2 para child " +y);
    }
}

class te3t{
    public static void main(String[] args) {
        child c = new child(15,12);
    }
}