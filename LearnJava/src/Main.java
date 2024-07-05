private class Human {

    String name;
    int rollNo;

    int add(int a, int b){
        return a+b;
    }

    float add(float a, float b){
        return a+b;
    }

}

class Jay extends Human{

    @java.lang.Override
    float add(float a, float b) {
        System.out.println("jay");
        return super.add(a, b);
    }
}

class Main{
    public static void main(String[] args) {
        Jay j = new Jay();
        j.add(2,4);

    }
}