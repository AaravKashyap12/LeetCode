class Solution {
    public int minOperations(String s) {
        int countA = 0;

        for (int i = 0; i < s.length(); i++) {
            char expectedA = (i % 2 == 0) ? '0' : '1';

            if (s.charAt(i) != expectedA) {
                countA++;
            }

        }
        return Math.min(countA, s.length() - countA);
    }
}