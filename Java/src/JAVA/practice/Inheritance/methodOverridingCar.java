package Java.practice.Inheritance;

class Car {
    public void start(){System.out.println("Car is start");}
    public void acclerate(){System.out.println("Car is acclerating");}
    public void changeGear(){System.out.println("Car gear is chnaged");}
}

class luxaryCar extends Car{
    @java.lang.Override
    public void changeGear(){System.out.println("Gear chnaged automaticly");}
    public void ac(){System.out.println("AC is on");}
    public void music(){System.out.println("Radio is on");}
}

class Override2{
    public static void main(String[] args) {
        Car cr = new luxaryCar();
//        cr.ac();//this will not execute as it is not present in car class
        cr.start();
        cr.acclerate();
        cr.changeGear();
    }


}