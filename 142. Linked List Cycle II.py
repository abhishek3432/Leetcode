class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow=head
        fast=head
        entry=head
        if head==None or head.next==None:
            return None

        while fast.next!=None and fast.next.next!=None:
            fast=fast.next.next
            slow=slow.next
            if fast==slow:
                while entry!=slow:
                    entry=entry.next
                    slow=slow.next
                return slow
        return None