
class Solution
{
    void deleteNode(Node del)
    {
         // Your code here
         Node curr = del.next;
         if(del != null && curr!=null){
             del.data= curr.data;
             del.next= curr.next;
         }
    }
}