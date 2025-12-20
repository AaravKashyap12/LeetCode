class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max_area = 0;
        while (left <= right) {
            int curr_area = Math.min(height[left], height[right]) * (right - left);
            /* here min(left,right) is the height
               right-left  = width of the container
               hence height*width
               */
            max_area = Math.max(curr_area, max_area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max_area;
    }
}