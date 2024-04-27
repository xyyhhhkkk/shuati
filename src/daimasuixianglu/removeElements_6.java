package daimasuixianglu;
/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}

/**这里统一使用虚拟头节点，这样就可以不用分情况讨论是否为head结点了*/
public class removeElements_6 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;
        while(cur.next!=null){
            if (cur.next.val == val){
                cur.next = cur.next.next;
            }
            else cur = cur.next;
        }
        return dummy.next;
    }

}
