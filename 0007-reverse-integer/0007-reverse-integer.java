class Solution {
    public int rev(int num) {
        int reverse = 0;
        while (num != 0) {
            int rem = num % 10;

            // Check for overflow before multiplying by 10
            if (reverse > (Integer.MAX_VALUE - rem) / 10) {
                return 0; // Overflow
            }

            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        return reverse;
    }

    public int reverse(int x) {
        if (x < 0) {
            int n = -1 * x;
            return -1 * rev(n);
        }
        return rev(x);
    }
}
