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
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode curr = head;
        while (curr != null && count < k) { // find the kth node
            curr = curr.next;
            count++;
        }
        if (count == k) { // if k nodes are present, reverse them
            ListNode reversedHead = reverse(head, k);
            head.next = reverseKGroup(curr, k); // recursive call to reverse next k nodes
            return reversedHead;
        }
        return head; // base case: return original head
        
    }
    public ListNode reverse(ListNode head, int k){
        ListNode prev = head;
        ListNode curr = null;
        while(k>0){
            ListNode temp = prev;
            prev = prev.next;
            temp.next = curr;
            curr = temp;
            k--;
        }
        return curr;
    }
}