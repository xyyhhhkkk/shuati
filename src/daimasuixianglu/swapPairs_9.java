package daimasuixianglu;

public class swapPairs_9 {
    public static void main(String[] args) {

    }
    public ListNode swapPairs(ListNode head) {
        //首先使用虚拟节点
        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        //其次定义cur指向head
        ListNode cur = dummyhead;
        while(cur.next!=null && cur.next.next!=null){
            ListNode temp1 = cur.next;
            ListNode temp2 = cur.next.next;

            cur.next = temp2;
            temp1.next = temp2.next;
            temp2.next = temp1;
            cur = temp1;
        }
        return dummyhead.next;
    }
}
