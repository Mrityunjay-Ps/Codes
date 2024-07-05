package Java.practice.Interfaces;

interface Member{
    void callback();
}

class Store {
    Member []mem = new Member[100];
    int count = 0;

    void registerMember(Member m){
        mem[count++]=m;
    }
    void inviteSale(){
        for (int i = 0; i < count; i++) {
            mem[i].callback();
        }
    }
}

class customer implements Member{
    String name;
    customer(String n){
        name=n;
    }
    public void callback(){
        System.out.println("Ok , I will visit,"+name);
    }
}

class example{
    public static void main(String[] args) {
        Store s = new Store();
        customer c1 = new customer("Jay");
        customer c2 = new customer("Micle");
        s.registerMember(c1);
        s.registerMember(c2);
        s.inviteSale();
    }
}