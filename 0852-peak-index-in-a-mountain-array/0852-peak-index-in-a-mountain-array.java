class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int ans = -1;

        int start = 0;
        int end = n-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                ans = mid;
                break;
            } else if (arr[mid] > arr[mid - 1]) {
                start = mid;
            } else if (arr[mid] > arr[mid + 1]) {
                end = mid;

            }
        }
        return ans;

    }
}