package Linked_List_Problems;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode current1 = list1;
        // ListNode next1 = current1.next;
        ListNode current2 = list2;
        // ListNode next2 = current2.next;

        ListNode newHead = null;
        ListNode newCurrent = new ListNode();

        while(current1 != null && current2 != null) {
            if (current1.val > current2.val) {
                if(newHead == null) {
                    newHead = current2;
                    newCurrent = newHead;
                } else {
                    newCurrent.next = current2;
                    current2 = current2.next;
                    newCurrent = newCurrent.next;
                }
            } else if (current1.val < current2.val) {
                if(newHead == null) {
                    newHead = current1;
                    newCurrent = newHead;
                } else {
                    newCurrent.next = current1;
                    current1 = current1.next;
                    newCurrent = newCurrent.next;
                }
            } else {
                if(newHead == null) {
                    newHead = current1;
                    newHead.next = current2;
                } else {
                    newCurrent.next = current1;
                    newCurrent.next.next = current2;
                    newCurrent = newCurrent.next.next;
                }

                current1 = current1.next;
                current2 = current2.next;
            }
        }
        return newHead;
    }
}
