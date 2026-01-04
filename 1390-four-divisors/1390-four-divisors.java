class Solution {
    public int sumFourDivisors(int[] nums) {
        int answer = 0;
        for (int k = 0; k < nums.length; k++) {
            int n = nums[k];
            int sum = 0;
            int count = 0;

            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    int d1 = i;
                    int d2 = n / i;

                    count++;
                    sum = sum + d1;
                    if (d1 != d2) {
                        count++;
                        sum = sum + d2;
                    }
                    if (count > 4)
                        break;
                }

            }
            if (count == 4) {
                answer = answer + sum;
            }
        }
        return answer;
    }
}