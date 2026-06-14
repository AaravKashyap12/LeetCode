/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
    Stack<Integer> stack = new Stack<>();
    int max = Integer.MIN_VALUE;
    ListNode curr = head;

    while(curr!=null){
        stack.push(curr.val);
        curr=curr.next;
    }    
    int half=stack.size()/2;
    curr=head;
    for(int i=0;i<half;i++){
        max = Math.max(max,curr.val + stack.pop());
        curr=curr.next;
    }
    return max;
    }
}