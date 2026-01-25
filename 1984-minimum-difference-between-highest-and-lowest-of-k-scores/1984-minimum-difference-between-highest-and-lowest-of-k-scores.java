class Solution {
    public int minimumDifference(int[] nums, int k) {
    int minDiff = Integer.MAX_VALUE;
    Arrays.sort(nums);
    int n = nums.length;
    if(n==1){
        return 0;
    }
    for(int i=0;i<n-k+1;i++){
        int curr = nums[i+k-1]-nums[i];
        if(curr<minDiff){
            minDiff = curr;
        }
    }  
    return minDiff;  
    }
}