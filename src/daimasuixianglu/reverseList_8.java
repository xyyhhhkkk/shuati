package daimasuixianglu;
// 反转链表思路：第一种是双指针，第二种是递归
public class reverseList_8 {
    public static void main(String[] args) {

    }

    /*
 对于双指针，设置两个指针，一个是pre一个是cur，cur指针是在pre的后面，初始化时
cur指向head，pre指向null
*/
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while(cur!=null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

 //对于递归，是建立在双指针的基础上来实现的
//    public ListNode reverseList(ListNode head){
//        if(head == null || head.next ==null){
//            return head;
//        }
//        ListNode newHead = reverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return newHead;
//    }
}
