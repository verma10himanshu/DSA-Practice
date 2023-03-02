class Solution {
    public void reorderList(ListNode head) {
        ListNode mid = middle(head);
        mid = reverse(mid);
        mergealertnate(head,mid);

        
    }
    public ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = slow.next;
        slow.next = null;
        return fast;
    }
    public ListNode reverse(ListNode head){
        ListNode node = head;
        ListNode new_head = null;
        while(node != null){
            ListNode temp = node;
            node = node.next;
            temp.next = new_head;
            new_head = temp;

        }
        return new_head;

    }
    public ListNode mergealertnate(ListNode old, ListNode news){
        ListNode head = old;
        ListNode prev =null;
        while(old!=null && news!=null){
            ListNode oldNext = old.next;
            ListNode newsNext = news.next;

            old.next = news;
            news.next = oldNext;

            prev = news;
            old = oldNext;
            news = newsNext;
        }

        if (news != null) {
            prev.next = news;
        }

        return head;
    }
}
