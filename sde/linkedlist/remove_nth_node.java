package sde.linkedlist;

public class remove_nth_node {

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode func(ListNode head, int n) {
        var temp = head;
        var count = 0;
        while (temp != null) {
            count ++;
            temp = temp.next;
        }
        var diff = count - n;
        temp = head;
        ListNode prev = null;
        while (temp != null && diff > 0) {
            prev = temp;
            diff --;
            temp = temp.next;
        }
        if (prev == null) {
            head = head.next;
        } else {
            prev.next = temp.next;
        }
        return head;
    }

    public ListNode func1(ListNode head, int n) {
        var first = head;
        var second = head;

        for (var i = 0; i < n; i ++) {
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        System.out.println();

        return head;
    }

}
