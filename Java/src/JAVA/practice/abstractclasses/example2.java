package JAVA.practice.abstractclasses;

abstract class KFC {
    KFC(){
        System.out.println("KFC");
    }
    void makeItem(){
        System.out.println("Make Item");
    }
    abstract void billing();
    abstract void offers();
}

class MyKfc extends KFC{
    public MyKfc(){
        System.out.println("KFC");
    }
    @Override
    public void billing(){
        System.out.println("Billing");
    }
    @Override
    public void offers(){
        System.out.println("Offers");
    }
    public void festOffers(){
        System.out.println("Festival Offers");
    }
}

class example2{
    public static void main(String[] args) {
        KFC k = new MyKfc();
        k.makeItem();
        k.billing();
        k.offers();
    }
}
