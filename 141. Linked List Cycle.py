def hasCycle(self, head: Optional[ListNode]) -> bool:
        if head==None or head.next==None:
             return False
        fast= head
        slow= head

        while fast.next!=None and fast.next.next!=None:
            fast= fast.next.next
            slow= slow.next
            if(fast==slow):
                return True
        
        return False