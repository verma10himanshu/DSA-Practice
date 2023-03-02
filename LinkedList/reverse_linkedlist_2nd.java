public /**
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
   public ListNode reverseList(ListNode head) {
       ListNode node = head;
       ListNode new_node = null;
       while(node != null){
           ListNode temp = node;
           node = node.next;
           temp.next = new_node;
           new_node = temp;
       }
       return new_node;
       
    
}
