class Solution {
    public int maxProduct(int n) {
       String s = Integer.toString(n);
        int[] arr = new int[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }
        Arrays.sort(arr);
        int len = arr.length;
        int max1 = arr[len - 1];      
        int max2 = arr[len - 2];      

        int product = max1 * max2; 
        return product;
    }
}