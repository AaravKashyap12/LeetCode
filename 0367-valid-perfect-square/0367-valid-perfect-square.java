class Solution {
    public boolean isPerfectSquare(int num) {
    if(num<=2){
        return true;
    }
    long left = 1;
    long right = num; 
    

    while(left<=right){
    long mid = left+(right-left)/2;
        if(mid*mid==num){
            return true;
        }
        if(mid*mid<num){
            left = mid+1;
        }

        if(mid*mid>num){
            right = mid-1;
        }

    }
    return false;
    }
}