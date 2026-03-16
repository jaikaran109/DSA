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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode y1 = dummy1;  // for smaller
        ListNode y2 = dummy2;  // for greater
        ListNode temp = head;
        while(temp != null){
            if(temp.val < x){
                y1.next = temp;
                y1 = y1.next;
            }else{
                y2.next = temp;
                y2 = y2.next;
            }
            temp = temp.next;
        }
        y2.next = null;
        y1.next = dummy2.next;
        return dummy1.next;
    }
}
