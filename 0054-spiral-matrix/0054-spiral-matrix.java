class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int top = 0;
        int rc = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int lc = 0;

        while (top <= bottom && rc >= lc) {
            for (int i = lc; i <= rc; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][rc]);
            }
            rc--;
            if (bottom >= top) {
                for (int i = rc; i >= lc; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (rc >= lc) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][lc]);
                }
                lc++;
            }
        }
        return ans;
    }
}