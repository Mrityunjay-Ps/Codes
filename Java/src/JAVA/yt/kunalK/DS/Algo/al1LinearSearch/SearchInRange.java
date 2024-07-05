package Java.kkDSAAlgo.Algo.al1LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        String str = "Mrityunjay";
        char target = 't';
        int startR = 0;
        int endR = 2;
        System.out.println(find(str, target, startR, endR));
    }

    static boolean find(String str, int target, int startR, int endR){
        if (str.length()==0)
            return false;

        for (int i = startR; i < endR; i++) {
            if (target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
