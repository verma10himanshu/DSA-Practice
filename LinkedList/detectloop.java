class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        Node node = head;
        Node node1 =head;
        while(node1!=null && node1.next!=null){
            node1 = node1.next.next;
            node = node.next;
            if(node==node1)return true;
        }
        return false;
    }
}