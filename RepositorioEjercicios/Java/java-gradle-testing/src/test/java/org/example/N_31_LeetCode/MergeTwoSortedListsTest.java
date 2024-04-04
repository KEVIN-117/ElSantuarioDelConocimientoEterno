package org.example.N_31_LeetCode;

import junit.framework.TestCase;

public class MergeTwoSortedListsTest extends TestCase {
    MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
    public void testMergeTwoLists() {
        ListNode list1 = new ListNode(2);
        ListNode list2 = new ListNode(1);
        ListNode listNode = mergeTwoSortedLists.mergeTwoLists(list1, list2);
        ListNode result = new ListNode(1, new ListNode(2));
        testRunner(listNode, result);
    }
    public void testTwo(){
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode listNode = mergeTwoSortedLists.mergeTwoLists(list1, list2);
        ListNode result = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
        testRunner(listNode, result);
    }
    public void testThree(){
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();
        ListNode listNode = mergeTwoSortedLists.mergeTwoLists(list1, list2);
        ListNode result = new ListNode();
        testRunner(listNode, result);
    }
    public void testFour(){
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode(0);
        ListNode listNode = mergeTwoSortedLists.mergeTwoLists(list1, list2);
        ListNode result = new ListNode(0);
        testRunner(listNode, result);
    }
    public void testRunner(ListNode listNode, ListNode result){
        while (listNode != null && result != null) {
            assertEquals(listNode.val, result.val);
            listNode = listNode.next;
            result = result.next;
        }
    }
}