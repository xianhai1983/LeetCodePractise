class Solution {
    public int removeDuplicates(int[] nums) {
       if (nums == null || nums.length == 0) return 0;
        int count = 0;
        int last = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == last) {
                count++;
            } else {
                nums[i-count] = nums[i];
            }
            last = nums[i];
        }
        return nums.length - count;
    }
}
