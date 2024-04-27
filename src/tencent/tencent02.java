package tencent;

import java.util.ArrayList;
import java.util.List;

public class tencent02 {
    public static void main(String[] args) {
        List<ListNode> lists = new ArrayList<ListNode>();
        boolean[] result = LinkedlistSort(lists);
        for (boolean b : result) {
            System.out.println(b);
        }
    }
    public static boolean[] LinkedlistSort(ListNode[] lists){
        List<ListNode> list = new ArrayList<ListNode>();
        for(ListNode node: lists){
            list.add(node);
        }
        return LinkedlistSort(list);
    }
    public static boolean[] LinkedlistSort(List<ListNode> lists){
        int num = lists.size();
        boolean[] arr = new boolean[num];

        for (int i = 0; i < num; i++) {
            ListNode head = lists.get(i);
            ListNode mid = findMid(head);
            ListNode half = reverse(mid.next);
            mid.next = null;

            arr[i] = isSorted(head) && isSorted(half);
        }
        return arr;
    }

    //使用快慢指针寻找中间节点
    public static ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //实现链表反转
    public static ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
    //实现排序
    public static boolean isSorted(ListNode head){
        ListNode cur = head;
        while(cur != null && cur.next != null){
            if(cur.val>=cur.next.val){
                return false;
            }
            cur = cur.next;
        }
        return true;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
