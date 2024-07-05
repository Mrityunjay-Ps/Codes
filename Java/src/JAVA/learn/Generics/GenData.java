package JAVA.learn.Generics;

class GenData <T>{
    private T obj; //An object of generic type will be stored...

    public void setData(T v) {
        this.obj = v;
    }

    public T getData() {
        return obj;
    }
}

class GeDemo {
    public static void main(String[] args) {
        GenData<Integer> GInt = new GenData<>();
        GInt.setData(10);
    }
}
