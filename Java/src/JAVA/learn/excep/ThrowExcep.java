package Java.practice.excep;

class NegativeDimenssionException extends Exception {
    public String toString(){
        return "Dimenssion cannot be negative";
    }
}


class qwert {
    public static void main(String[] args) {
        meth1();
    }
    static void meth1(){
        try {
            int area = area(-5, 8);
            System.out.println(area);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    static int area(int l, int b) throws NegativeDimenssionException {
        if (l<0||b<0) {
            throw new NegativeDimenssionException();
        }else {
            int a = l * b;
            return a;
        }
    }
}
