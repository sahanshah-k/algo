package sde.linkedlist;

public class reverse {

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
//  1 > 2 > 3 > 3 > 5 > null
//  null < 1 < 2 < 3 < 4 < 5
//
    public ListNode func(ListNode head) {
        ListNode prev = null;
        var temp = head;
        while (temp != null) {
            var front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

}
