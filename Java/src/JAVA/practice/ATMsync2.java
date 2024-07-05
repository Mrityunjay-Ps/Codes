package Java.practice;

class ATM
{

    synchronized public void checkBalance(String name)
    {
        System.out.print(name + " Checking ");

        try{Thread.sleep(1000);}catch(Exception e){}

        System.out.println("Balance");
    }

    synchronized public void withdraw(String name,int amount)
    {
        System.out.print(name + " withdrawing ");

        try{Thread.sleep(1000);}catch(Exception e){}

        System.out.println(amount);

    }
}

class Customer1 extends Thread
{
    String name;
    int amount;
    ATM atm;

    Customer1(String n, ATM a, int amt)
    {
        name=n;
        atm=a;
        amount=amt;
    }
    public void useATM()
    {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
    public void run()
    {
        useATM();
    }
}

public class ATMsync2
{
    public static void main(String[] args)
    {
        ATM atm=new ATM();
        Customer1 c1=new Customer1("Smith",atm,100);
        Customer1 c2=new Customer1("John",atm,200);
        c1.start();
        c2.start();


    }
}