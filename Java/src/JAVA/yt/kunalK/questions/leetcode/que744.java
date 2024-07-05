package Java.kkDSAAlgo.questions.leetcode;
// Find The Smallest Letter Greater Than Target
//Given a characters array letters that is sorted in non-decreasing order and a character target,
//return the smallest character in the array that is larger than target.

public class que744 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char tar = 'v';
        System.out.println(nextGreatestLetter(letters,tar));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;

        while (start<=end){
            //find middle element
            int mid = start + (end-start) / 2;

            if (target < letters[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start  % letters.length];
    }
}
