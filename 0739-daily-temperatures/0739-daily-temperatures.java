class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<Integer>();
        int warmest = 1;
        int n = temperatures.length;
        int[] days = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int currTemp = temperatures[i];
            if (currTemp >= warmest) {
                warmest = currTemp;
                continue;
            }

            int count = 1;
            while (true) {
                if (temperatures[i + count] > currTemp) {
                    days[i] = count;
                    break;
                } else {
                    count = count + days[i + count];
                }
            }

        }
        return days;
    }
}