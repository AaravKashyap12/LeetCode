class Solution {
    public int mySqrt(int x) {
        int l=1;
        int r=x;
        int s=0;
        
        while(l<=r){
            int mid=l+(r-l)/2;
            if(x/mid==mid) return mid;
            else if(x/mid < mid) r=mid-1;
            else {
                l=mid+1;
                s=mid;
            }
            

        }
        return s;
    }
}