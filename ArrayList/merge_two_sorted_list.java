package ArrayList;

import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class merge_two_sorted_list {
    // ..............................................................
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        if (list1 != null)
            current.next = list1;

        if (list2 != null)
            current.next = list2;

        return dummy.next;
    }

    // recursion
    /*
     * public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
     * 
     * if (list1 == null)
     * return list2;
     * 
     * if (list2 == null)
     * return list1;
     * 
     * if (list1.val < list2.val) {
     * list1.next = mergeTwoLists(list1.next, list2);
     * return list1;
     * } else {
     * list2.next = mergeTwoLists(list1, list2.next);
     * return list2;
     * }
     * }
     */
    // ...........................................................
    public static ListNode createList(Scanner sc, int n) {

        if (n == 0)
            return null;

        ListNode head = new ListNode(sc.nextInt());
        ListNode current = head;

        for (int i = 1; i < n; i++) {
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }

        return head;
    }

    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        ListNode list1 = createList(sc, n1);

        int n2 = sc.nextInt();
        ListNode list2 = createList(sc, n2);

        ListNode result = mergeTwoLists(list1, list2);

        printList(result);

        sc.close();
    }
}