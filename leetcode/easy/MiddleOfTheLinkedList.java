// https://leetcode.com/problems/middle-of-the-linked-list/description/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode walker=head;
        ListNode runner=head;
        while(true){
            if(runner==null || runner.next==null) break;
            walker=walker.next;
            runner=runner.next.next;
        }
        return walker;
    }
}
