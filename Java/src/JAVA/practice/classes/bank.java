package Java.practice.classes;

class bank {
    public long accNumber;
    public String name;
    public int bal;
    public String ifscCode;
    public String bname;
    public int balance() {
        return bal;
    }
    public long AccNum() {
        return accNumber;
    }
    public String bName() {
        return bname;
    }
    public String AccName() {
        return name;
    }
}

class bankOutput {
    public static void main(String[] args) {
        bank b1 = new bank();

        b1.accNumber = 874569856;
        b1.name = "Mrityunjay Singh";
        b1.bal = 845000;
        b1.ifscCode = "SBIN002485";
        b1.bname = "SBI";

        System.out.println(b1.balance());
        System.out.println(b1.AccName());
        System.out.println(b1.AccNum());
        System.out.println(b1.bName());
    }
}
