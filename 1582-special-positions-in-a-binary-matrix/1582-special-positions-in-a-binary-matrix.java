class Solution {
    public int numSpecial(int[][] mat) {
    
    int[] rowcnt = new int[mat.length];
    int[] colcnt = new int[mat[0].length];
    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            if(mat[i][j]==1){
                rowcnt[i]++;
                colcnt[j]++;
            }
        }
    }  
    int ans = 0; 
    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            if(mat[i][j]==1 && rowcnt[i]==1 && colcnt[j]==1){
                ans++;
            }
        }
    } 
    return ans;
    }
}