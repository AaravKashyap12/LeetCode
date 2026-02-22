class Solution {
    public boolean isDigitorialPermutation(int n) {
        int[] fact = { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880 };

        int sum = 0;
        int org = n;

        while (n > 0) {
            sum = sum + fact[n % 10];
            n = n / 10;
        }
        //digit freq
        int[] freq = new int[10];
        int temp = org;

        while (temp > 0) {
            freq[temp % 10]++;
            temp = temp / 10;
        }
        //compare with sum
        while (sum > 0) {
            freq[sum % 10]--;
            sum = sum / 10;
        }
        for (int f : freq) {
            if (f != 0)
                return false;
        }
        return true;

    }
}