class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if(n==0) return 0;
        int[] leftmax = new int[n];
        int[] rightmax = new int[n];

        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        int sum = 0;
        for(int i =0;i<n;i++){
            sum=sum+Math.min(leftmax[i],rightmax[i])-height[i];
        }
        return sum;
    }
}

/* 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 = height 
   0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3 = left max
   3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 1 = right max

   water level = 0, 1, 1, 2, 2, 2, 2, 3, 2, 2, 2, 1 
    height =     0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 [original array]
 final array  =  0, 0, 1, 0, 1, 2, 1, 0, 0, 1, 0, 0

 now sum final array = 6 */
