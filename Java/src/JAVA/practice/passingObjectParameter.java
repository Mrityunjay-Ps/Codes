package Java.practice;

public class passingObjectParameter {

    static void change(int A[], int index, int value){
        A[index]=value;
    }


    public static void main(String[] args) {
        int aar []= {5,6,8,10,12};
        change(aar,2,20);

        for(int x:aar){
            System.out.println(x);
        }

    }
}
