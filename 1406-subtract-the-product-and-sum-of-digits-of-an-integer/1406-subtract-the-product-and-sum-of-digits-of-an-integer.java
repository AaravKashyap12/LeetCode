class Solution {
    public int subtractProductAndSum(int n) {
        int prod=1,sum=0,m=n;
       while(n>0){
        prod*=n%10;
        n=n/10;
       } 
       while(m>0){
        sum+=m%10;
        m=m/10;
       } 
        return prod-sum;
    }
}