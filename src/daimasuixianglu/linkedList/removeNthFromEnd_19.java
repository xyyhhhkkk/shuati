package daimasuixianglu.linkedList;

public class removeNthFromEnd_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1,head);
        ListNode fast = dummy;
        n++;
        while(n-->0 && fast != null ){
            fast = fast.next;
        }
        ListNode slow = dummy;
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
