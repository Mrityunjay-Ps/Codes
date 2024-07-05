package Java.practice.section16;

class account {
    private double accountNo;
    private static int count = 1;

    private double genrateAccountNum(){
        return Math.random();
    }

    account(){
        accountNo=genrateAccountNum();
    }
    public double getAccountNo(){
        return accountNo;
    }
}

class Maain{
    public static void main(String[] args) {
        account a1 = new account();
        account a2 = new account();
        System.out.println(a1.getAccountNo());
        System.out.println(a2.getAccountNo());
    }
}
