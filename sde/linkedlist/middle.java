package sde.linkedlist;

public class middle {
    public static class ListNode {
        int val;
        reverse.ListNode next;

        public ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, reverse.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    //  1 > 2 > 3 > 3 > 5 > null

    public reverse.ListNode func(reverse.ListNode head) {
        var temp = head;
        while (temp != null && temp.next != null) {
            head = head.next;
            temp = temp.next.next;
        }
        return head;
    }
}
