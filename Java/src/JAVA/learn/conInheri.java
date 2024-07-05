package JAVA.learn;
/*In this example we Java.learn how constructor is inhertied in any other class...
In this example the house is child class which inherits model class and model class inherits design class
so when we make object of house class in the main fuction it checks id the class is inherit from any other class if so
then it will go to that class (here model) then if model class is also inherit from any other then it will go to
that one(here design) and start executes from that super class constructor....*/

class design {
    public design(){
        System.out.println("Design");
    }
}

class model extends design{
    public model(){
        System.out.println("Model");
    }
}

class house extends model{
    public house(){
        System.out.println("House");
    }
}

class te5st{
    public static void main(String[] args) {
        house h = new house();
    }
}