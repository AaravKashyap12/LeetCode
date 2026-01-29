/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
    node.val = node.next.val; //replace curr value with the next value
    node.next = node.next.next; ///replace the curr next with the next value's next
    }
}