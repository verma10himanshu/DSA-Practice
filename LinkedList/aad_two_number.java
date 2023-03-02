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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node1 = reverse(l1);
        ListNode node2 = reverse(l2);
        ListNode result = new ListNode(0);
        ListNode curr = result;
        int carry = 0;
        while (node1 != null || node2 != null) {
            int sum = carry;
            if (node1 != null) {
                sum += node1.val;
                node1 = node1.next;
            }
            if (node2 != null) {
                sum += node2.val;
                node2 = node2.next;
            }
            carry = sum / 10;
            sum %= 10;
            curr.next = new ListNode(sum);
            curr = curr.next;
        }
        if (carry != 0) {
            curr.next = new ListNode(carry);
        }
        return reverse(reverse(result.next));
    }
    
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}


//  9 9 1
// 5 6 6
// sum-1557