class Solution {
    String helper(int n){
    if(n==1) return "0";

    String prev = helper(n-1);
    String inverted = invert(prev);
    String reversed = new StringBuilder(inverted).reverse().toString();
    String curr = prev+"1"+reversed;
    return curr;
    }

    public String invert(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '0')
                sb.append('1');
            else
                sb.append('0');
        }

        return sb.toString();
    }

    public char findKthBit(int n, int k) {
        String a = helper(n);
        return a.charAt(k-1);
    }
}