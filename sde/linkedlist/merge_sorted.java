package sde.linkedlist;

public class merge_sorted {

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

    public ListNode func(ListNode list1, ListNode list2) {
        var outNode = new ListNode();
        var head = outNode;
        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                outNode.next = list2;
                list2 = list2.next;
            } else {
                outNode.next = list1;
                list1 = list1.next;
            }
            outNode = outNode.next;
        }
        outNode.next = list1 == null
                ? list2
                : list1;
        return head.next;
    }

}
