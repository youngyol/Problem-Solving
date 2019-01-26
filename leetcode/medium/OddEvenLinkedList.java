// https://leetcode.com/problems/odd-even-linked-list/

class Solution {
    public ListNode oddEvenList(ListNode head) { 
        if(head==null || head.next==null) return head;
        ListNode oddPoint=head;
        ListNode evenPoint=head.next; 
        ListNode evenStartPoint=evenPoint;
        
        while(oddPoint!=null && evenPoint != null){ 
            if(evenPoint.next==null)break;
            oddPoint.next=evenPoint.next;
            oddPoint=oddPoint.next;
            evenPoint.next=oddPoint.next;
            evenPoint=evenPoint.next;
        }
        
        oddPoint.next=evenStartPoint;
        return head;  
    }
} 
