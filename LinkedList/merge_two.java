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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) {
            return null;
        }
        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }
        
        ListNode mergedHead = null;
        ListNode mergedTail = null;
        
        while(list1 != null || list2 != null) {
            if(list1 == null) {
                mergedTail.next = list2;
                break;
            }
            if(list2 == null) {
                mergedTail.next = list1;
                break;
            }
            if(list1.val <= list2.val) {
                if(mergedHead == null) {
                    mergedHead = list1;
                    mergedTail = list1;
                } else {
                    mergedTail.next = list1;
                    mergedTail = mergedTail.next;
                }
                list1 = list1.next;
            } else {
                if(mergedHead == null) {
                    mergedHead = list2;
                    mergedTail = list2;
                } else {
                    mergedTail.next = list2;
                    mergedTail = mergedTail.next;
                }
                list2 = list2.next;
            }
        }
        
        return mergedHead;
    }
}
