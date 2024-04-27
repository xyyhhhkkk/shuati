package daimasuixianglu;

// 使用快慢指针, 因为删除节点需要在前面一个节点，所以要多走n+1步
public class removeNthFromEnd_10 {
    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0,head);
        ListNode fast = dummy;
        ListNode slow = dummy;
        n = n+1;
        while(n-->0 && fast!=null){
            fast = fast.next;
        }
        while (fast!=null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}
