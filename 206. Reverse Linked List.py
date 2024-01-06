# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
    
        #for no node or single node
        if(head==None or head.next==None) :
            return head
            
        pre=None
        cur=head
        frnt=cur.next
        while (cur!=None) :
            #change pointer to prev node
            cur.next=pre
            
            #move to next node
            pre=cur
            cur=frnt
            if(cur!=None):
               frnt= cur.next
        
        
        return pre
    
        