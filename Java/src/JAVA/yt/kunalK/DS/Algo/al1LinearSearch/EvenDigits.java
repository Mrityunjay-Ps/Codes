package JAVA.yt.kunalK.DS.Algo.al1LinearSearch;

//Question:-
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
    }

    public int findNumbers(int[] nums) {
        int count = 0;
//      run foreach loop for traversing thorugh array
        for (int num: nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    boolean even(int num) {
        int numOfDigits = digits(num);
        return numOfDigits%2==0;
    }

    int digits(int num) {
        if(num<0){
            num = num * -1;
        }
        return (int)(Math.log10(num))+1;
    }
}
