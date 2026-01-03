class Solution {
    public int numOfWays(int n) {
    final int MOD = 1000000007;
    long x=6,y=6;
    for(int i=2;i<=n;i++){
        long final_x = (3*x + 2*y)%MOD;
        long final_y = (2*x + 2*y)%MOD;
        x=final_x;
        y=final_y;
    }   
    return (int)((x+y)%MOD);
    }
}