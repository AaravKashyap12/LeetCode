class Solution {
    public int removeDuplicates(int[] nums) {
    int j = 1 ;
    int val = nums[0];
    
    for (int i=0;i<nums.length;i++){
        // int val = nums[0];
       
        if(nums[i]!=val){
            nums[j]=nums[i];
            j++;
            val=nums[i];
        }
        
    }   
    return  j; 
    }
}