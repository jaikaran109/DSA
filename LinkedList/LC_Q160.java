//8. Intersection of Two Linked Lists
//        Problem
//Given the heads of two linked lists, return the node where the two lists intersect.
//If no intersection exists, return null.
//Code Stub




/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;
        ListNode B = headB;
        while(A != B){
            if(A == null) A = headB;
            else A = A.next;
            if(B == null) B = headA;
            else B = B.next;
        }
        return A;
    }
}




// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         ListNode x = headA;
//         while(x != null) {
//             ListNode y = headB;
//             while(y != null){
//                 if(x == y) return x;
//                 y = y.next;
//             }
//             x = x.next;
//         }
//         return null;
//     }
// }
