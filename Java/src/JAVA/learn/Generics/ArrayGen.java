package JAVA.learn.Generics;

class ArrayGen<T> {
    T []Arr =(T[]) new Object[10];
    int length = 0;

    public void append(T value) {
        Arr[length++] = value;
    }

    public void display() {
        for (int i = 0; i<length; i++) {
            System.out.println(Arr[i]);
        }
    }

}
