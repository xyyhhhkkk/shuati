package daimasuixianglu.linkedList;

public class removeElements_203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1,head);
        ListNode cur = dummy;
        while(cur.next != null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }
            else cur = cur.next;
        }
        return dummy.next;
    }
}
