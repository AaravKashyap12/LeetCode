class Solution {
    public int jump(int[] nums) {
        int max = 0, curr = 0, count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i > max)
                return -1;
            max = Math.max(max, nums[i] + i);
            if (curr == i) {
                count++;
                curr = max;
            }
        }
        return count;

    }

}
