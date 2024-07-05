package Java.practice.Inheritance;

class TV {
    public void switchON(){System.out.println("Tv is on");}

    public void changeChannel(){System.out.println("Tv Channel is changed");}
}

class SmartTV extends TV{
    @java.lang.Override
    public void switchON(){System.out.println("Smart Tv is on");}
    @java.lang.Override
    public void changeChannel(){System.out.println("Smart Tv Channel is changed");}
    public void browse(){System.out.println("Smart Tv is Browsing");}
}

class Override{
    public static void main(String[] args) {

        TV t = new SmartTV();
        t.switchON();
        t.changeChannel();
//        t.browse();//we cannot call this method because it is not available in Super class
    }
}