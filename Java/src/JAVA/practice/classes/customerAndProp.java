package Java.practice.classes;

class product {
    private String itemno;
    private String itemname;
    private double price;
    private short quantity;

    //propertie method...
    //get-method
    public String getItemno() {
        return itemno;
    }
    public String getItemname() {
        return itemname;
    }
    public double getPrice() {
        return price;
    }
    public short getQuantity() {
        return quantity;
    }

    //set-method
    public void setQuantity(short qu) {
        quantity = qu;
    }
    public void setPrice(double p) {
        price = p;
    }

    //constructor..
    public product(String itno, String itname) {
        itemname = itname;
        itemno = itno;
    }
    public product(String iteno, String itename, double pri, short quan) {
        itemname = itename;
        itemno = iteno;
        setPrice(pri);
        setQuantity(quan);

    }
    //methods...

    public double totalPro() {

        return price*quantity;
    }
}

class customer {

    //Properties...
    private String custID;
    private String Name;
    private String Address;
    private int phoneNO;

    //Properties Method...
    //get-method
    public String getCustID() {
        return custID;
    }
    public String getName() {
        return Name;
    }
    public String getAddress() {
        return Address;
    }
    public int getPhoneNO() {
        return phoneNO;
    }

    //set-method
    public void setAddress(String add) {
        Address = add;
    }

    public void setName(String na) {
        Name = na;
    }

    public void setPhoneNO(int phN) {
        phoneNO = phN;
    }

    //constructor...
    public customer(String cust,String n ,String ad, int pn){
        custID = cust;
        setName(n);
        setAddress(ad);
        setPhoneNO(pn);
    }
    public customer(String na, String adre, int pnh){
        setName(na);
        setAddress(adre);
        setPhoneNO(pnh);
    }
    public customer(String cus, String ne){
        custID = cus;
        setName(ne);
    }
}

class outpu{
    public static void main(String[] args) {
        product p1 = new product("Aze21", "Pen", 15.00d, (short) 2);
        customer c1 = new customer("Jay","Nagpur", 586479856);
        System.out.println(p1.totalPro());
//        System.out.println(c1.details());
    }
}