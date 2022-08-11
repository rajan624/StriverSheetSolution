class Solution {
    public ListNode reverse(ListNode head){
        if(head==null){
            return null;
        }
        ListNode cur = head;
        ListNode prev = null;
        ListNode next = head;
        while(cur!=null){
            next= cur.next;
            cur.next= prev;
            prev= cur;
            cur=next;
        }
       head= prev;
        return head;
    }
    public boolean isPalindrome(ListNode head) {
   if(head.next==null){
       return true;
   }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev= null;
        while(fast!=null && fast.next!=null){
             prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        slow= reverse(slow);
        while(slow!=null && head!=null){
            if(slow.val!=head.val){
                return false;
            }
            slow=slow.next;
            head = head.next;
        }
        return true;
    }
}