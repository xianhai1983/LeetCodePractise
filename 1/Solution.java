class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) return new int[]{};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(target - nums[i], i);
            } else {
                return new int[] {i, map.get(nums[i])};
            }
        }
        return new int[]{};
    }
}
