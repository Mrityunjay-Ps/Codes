package JAVA.practice.abstractclasses;

abstract class Hospital {
    abstract void admit();
    abstract void appointment();
    abstract void billing();
    abstract void emergency();
}

class MyHospital extends Hospital{
    public void admit(){
        System.out.println("Admit");
    }
    public void appointment(){
        System.out.println("Appointment");
    }
    public void billing(){
        System.out.println("Billing");
    }
    public void emergency(){
        System.out.println("Emergency");
    }
}

class example1{
    public static void main(String[] args) {
        Hospital h = new MyHospital();
        h.admit();
        h.appointment();
        h.billing();
        h.emergency();
    }
}