class Solution {
    public int maxProduct(int n) {

        int max = Integer.MIN_VALUE;
        int maxSecond = Integer.MIN_VALUE;

        while (n > 0) {
            int digit = n % 10;

            if (digit > max) {
                maxSecond = max;
                max = digit;
            } else if (digit > maxSecond) {
                maxSecond = digit;
            }
            n = n / 10;

        }

        return max * maxSecond;

    }
}