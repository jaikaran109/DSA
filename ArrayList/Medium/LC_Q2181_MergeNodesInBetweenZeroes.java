class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        int sum = 0;
        while(head != null){
            if(head.val == 0 && sum > 0){
                temp.next = new ListNode(sum);
                sum = 0;
                temp = temp.next;
            }
            sum += head.val;
            head = head.next;
        }
        return ans.next;
    }
}
