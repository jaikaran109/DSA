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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy1 = new ListNode(-1)   ;
        ListNode dummy2 = new ListNode(-1);
        ListNode odd = dummy1;
        ListNode even = dummy2;
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            if(count % 2 != 0){
                odd.next = temp;
                odd = odd.next;
            }else{
                even.next = temp;
                even = even.next;
            }
            temp = temp.next;
        }
        even.next = null;
        odd.next = dummy2.next;
        return dummy1.next;

    }
}
