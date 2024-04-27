//141. Linked List Cycle
public class Solution {
    public boolean hasCycle(ListNode head) {
        //OptimizedApproach: Use Two Pointer and check fast and slow are equal
        //TC:(n) | SC:(1)`
        ListNode slow, fast;
        slow = fast = head;
        //to check linked list has single node or no node
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow)
                return true;
        }
        return false;
        
    }
}