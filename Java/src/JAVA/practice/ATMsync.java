package Java.practice;

//class for Atm Machine
class  AtmMachine{
    //check balance method
    synchronized public void checkBalance(String name){
        System.out.print(name+" is checking ");
        try{Thread.sleep(1000);}catch (Exception e){}
        System.out.println("Balance");
    }
    //money withdraw method
    synchronized public void moneyWithdraw(String name, int amt){
        System.out.print(name+" is Withdrawing ");
        try{Thread.sleep(1000);}catch (Exception e){}
        System.out.println(amt);
    }
}

//class for Customer2...
class Customer extends Thread{
    //reference of atm machine class
    AtmMachine atMach1;
    String name;
    int amount;

    //constructor for Customer2...
    Customer(AtmMachine a1, String name, int amount){
        atMach1=a1;
        this.name=name;
        this.amount=amount;
    }
    @Override
    public void run() {
        useAtm();
    }

    public void useAtm() {
        //calling the methods...
        atMach1.checkBalance(name);
        atMach1.moneyWithdraw(name,amount);
    }
}

public class ATMsync {
    public static void main(String[] args) {
        //Atm Object
        AtmMachine atm1 = new AtmMachine();

        //Customer2 object...
        Customer p1 = new Customer(atm1,"Jay",2500);
        Customer p2 = new Customer(atm1,"Smith",5000);

        p1.start();
        p2.start();

    }
}
