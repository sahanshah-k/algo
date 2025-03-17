package sde.linkedlist2;

public class intersection {

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

    public ListNode func(ListNode headA, ListNode headB) {
        var lenA = 0;
        var lenB = 0;
        var tempA = headA;
        var tempB = headB;
        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }
        while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }
        var diff = Math.abs(lenA - lenB);
        ListNode longest;
        ListNode shortest;
        if (lenA > lenB) {
            longest = headA;
            shortest = headB;
        } else {
            longest = headB;
            shortest = headA;
        }
        while (diff > 0) {
            longest = longest.next;
            diff--;
        }
        while (longest != null && shortest != null) {
            if (longest.equals(shortest)) {
                return longest;
            }
            longest = longest.next;
            shortest = shortest.next;
        }
        return null;
    }

}
