package Java.learn.langPack;

enum deptt{
    CSE("Jhon","Block A"),
    IT("Dave","Block B"),
    ETC("David","Block C"),
    Civil("Harry","Block C");

    String head;
    String location;
    private deptt(String name, String loc){
        this.head=name;
        this.location=loc;
    }

    public String getHeadName(){
        return head;
    }
    public String getLocation(){
        return location;
    }

}


class EnumExample {
    public static void main(String[] args) {
        deptt dt1 = deptt.IT;

        System.out.println(dt1.getHeadName());
        System.out.println(dt1.getLocation());
    }
}
