class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Map<Integer,Integer> map = new HashMap<>();
    Stack<Integer> stack = new Stack<>();

    for(int nums:nums2){
        while(!stack.isEmpty() && stack.peek()<nums){
            int smaller = stack.pop();
            map.put(smaller,nums);
        }
        stack.push(nums);
    }    
    int[] result = new int[nums1.length];
    for(int i = 0;i<nums1.length;i++){
        result[i] = map.getOrDefault(nums1[i],-1);
    }
    return result;
    }
}