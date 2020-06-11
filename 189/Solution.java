import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k -1);
        reverse(nums, k, nums.length -1);
    }
    
    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int tmp = nums[end];
            nums[end] = nums[start];
            nums[start] = tmp;
            start ++;
            end --;
        }    
    }
    
    public void rotate2(int[] nums, int k) {
        if (nums.length == 0) return;
        k = k %nums.length;
        int[] firstArray = Arrays.copyOfRange(nums, 0, nums.length - k);
        int[] secondArray = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        int secondLength = secondArray.length;
        for (int i = 0; i < secondLength ; i++) {
            nums[i] = secondArray[i];
        }
        for (int i = 0; i < firstArray.length ; i++) {
            nums[i + secondLength] = firstArray[i];
        }
    }
    
    public void rotate1(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int tmp = nums[nums.length -1];
            for (int j = nums.length -1; j > 0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = tmp;
        }
    }
}
