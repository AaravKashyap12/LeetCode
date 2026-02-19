class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        int prod1 = (nums[n] * (nums[n - 1]) * (nums[n - 2]));
        int prod2 = (nums[n] * nums[0] * nums[1]);
        return Math.max(prod1, prod2);
    }
}