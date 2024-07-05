package Java.kkDSAAlgo.questions.leetcode;
// Find First and Last Position of Element in Sorted Array
//Given an array of integers nums sorted in non-decreasing order,
//find the starting and ending position of a given target value.

public class que34 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 8, 11, 15, 19, 22, 26, 30, 32};
        int target = 20;
        System.out.println(searchRange(nums, target));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        int first = ans[0];
        ans[0] = search(nums, target, true);
        if (ans[0]!=-1){
            int last = ans[1];
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    static int search(int[] nums, int tar, boolean searchFirstIndex)
    {
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while (start<=end){
            int mid = start + (end - start) / 2;

            if (tar < nums[mid]){
                end = mid - 1;
            } else if (tar > nums[mid]) {
                start = mid + 1;
            }else {
                ans = mid;
                if (searchFirstIndex) {
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }

        }
        return ans;
    }

}
