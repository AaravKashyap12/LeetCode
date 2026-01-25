class Solution {
    public int minimumDifference(int[] nums, int k) {
    int minDiff = Integer.MAX_VALUE;
    Arrays.sort(nums);
    int n = nums.length;
    if(k==1){
        return 0;
    }
    for(int i=0;i<=n-k;i++){
        int curr = nums[i+k-1]-nums[i];
        minDiff = Math.min(minDiff,curr);
    }  
    return minDiff;  
    }
}