/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
       node.val = node.next.val;
       node.next = node.next.next;
    }
}


// Loop lga nhi skte h kyuki head missing h 
// isko dry run krte h 

// [4, 5, 1, 9], Target: node (jiski value 5 hai)

// Line 1: node.val = node.next.val;
// node.next.val ki value 1 hai.
// Ab node 5 ki value badal kar 1 ho gayi.
// List dikh rahi hai: [4, 1, 1, 9]

// Line 2: node.next = node.next.next;
// Ab current node (jo ab 1 ban chuka hai) uska link agle node ko chhod kar seedha 9 se jud gaya.
// List ban gayi: [4, 1, 9]


// --> isme next.val se agli value store ho gyi
// --> node.next = node.next.next se uski agli wali value ka refrence store ho rha jo target tha vo yha miss ho jayega

