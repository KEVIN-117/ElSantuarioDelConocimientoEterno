package N_30_AdvancedAlgorithms.N_2_AddTwoNumbersTest.Tests;

import org.example.N_31_LeetCode.Estructures.ListNode;
import org.example.N_31_LeetCode.N_2_AddTwoNumbers;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test2 {
    @Test
    public void test2() {
        N_2_AddTwoNumbers sum = new N_2_AddTwoNumbers();
        ListNode h9 = new ListNode(9);
        ListNode h91 = new ListNode(9);
        ListNode h92 = new ListNode(9);
        ListNode h93 = new ListNode(9);
        ListNode h94 = new ListNode(9);
        ListNode h95 = new ListNode(9);
        ListNode h96 = new ListNode(9);
        h9.next = h91;
        h91.next = h92;
        h92.next = h93;
        h93.next = h94;
        h94.next = h95;
        h95.next = h96;



        ListNode h5 = new ListNode(9);
        ListNode h51 = new ListNode(9);
        ListNode h52 = new ListNode(9);
        ListNode h53 = new ListNode(9);
        h5.next = h51;
        h51.next = h52;
        h52.next = h53;
        ListNode current = sum.addTwoNumbers(h9, h5);

        ListNode expected = new ListNode(8);
        ListNode expected1 = new ListNode(9);
        ListNode expected2 = new ListNode(9);
        ListNode expected3 = new ListNode(9);
        ListNode expected4 = new ListNode(0);
        ListNode expected5 = new ListNode(0);
        ListNode expected6 = new ListNode(0);
        ListNode expected7 = new ListNode(1);
        expected.next = expected1;
        expected1.next = expected2;
        expected2.next = expected3;
        expected3.next = expected4;
        expected4.next = expected5;
        expected5.next = expected6;
        expected6.next = expected7;
        while (current != null) {
            assertEquals(expected.val, current.val);
            expected = expected.next;
            current = current.next;
        }
    }
}
