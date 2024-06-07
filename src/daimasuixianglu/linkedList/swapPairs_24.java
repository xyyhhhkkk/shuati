package daimasuixianglu.linkedList;

public class swapPairs_24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while(cur.next != null && cur.next.next!= null){
            ListNode temp1 = cur.next.next;
            ListNode temp2 = cur.next;
            //cur.next = temp1;
            temp2.next = temp1.next;
            temp1.next = temp2;
            cur = temp2;
        }
        return dummy.next;
    }
}
