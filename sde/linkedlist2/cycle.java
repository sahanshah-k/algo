package sde.linkedlist2;

public class cycle {
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

    public boolean func(ListNode head) {
        var slow = head;
        var fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast.equals(slow)) {
                return true;
            }
        }
        return false;
    }
}
