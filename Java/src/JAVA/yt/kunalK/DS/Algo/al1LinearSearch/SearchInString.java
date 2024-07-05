package Java.kkDSAAlgo.Algo.al1LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String str = "Mrityunjay";
        char target = 't';
        System.out.println(Search(str, target));
    }

    static boolean Search(String st1, char target)
    {
        if (st1.length()==0)
            return false;

        for (int i = 0; i < st1.length(); i++) {
            if (target==st1.charAt(i))
            {
                return true;
            }
        }

        return false;
    }

    //for each loop...
    static boolean Search2(String st1, char target)
    {
        if (st1.length()==0)
            return false;

        for(char cha:st1.toCharArray()){
            if (cha == target){
                return true;
            }
        }
        return false;
    }
}
