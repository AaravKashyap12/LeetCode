class Solution {
    public int peakIndexInMountainArray(int[] arr) {
    int peak = Integer.MIN_VALUE;
    for(int i = 0 ;i<arr.length-1;i++){
        if (arr[i+1]>arr[i]){
            peak = i+1;
        }

    }   
    return peak; 
    }
}