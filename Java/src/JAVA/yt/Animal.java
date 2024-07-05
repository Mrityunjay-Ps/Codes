package JAVA.yt;

public class Animal {
    void bark(){
        System.out.println("Bark : Animal Class");
    }
}

class Dog extends Animal {

}

class Test{
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.bark();
    }
}
