package Java.kkDSAAlgo.Algo.al1LinearSearch;

//Question:-
//https://leetcode.com/problems/richest-customer-wealth/

public class RichWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3}, {3,2,1}};
//        maximumWealth(accounts);

        int[][] accounts2 = {{1,5},{7,3},{3,5}};
        maximumWealth(accounts2);
    }

    static int maximumWealth(int[][] accounts) {
        int mostWealthy = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int customerWealth = 0;
            for (int i : account) {
                customerWealth = customerWealth + i;
            }

            if (customerWealth > mostWealthy) {
                mostWealthy = customerWealth;
            }
        }
        return mostWealthy;
    }
}
