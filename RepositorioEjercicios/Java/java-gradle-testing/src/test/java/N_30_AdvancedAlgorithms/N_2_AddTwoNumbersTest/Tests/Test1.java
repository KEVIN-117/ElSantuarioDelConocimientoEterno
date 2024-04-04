package N_30_AdvancedAlgorithms.N_2_AddTwoNumbersTest.Tests;

import org.example.N_31_LeetCode.Estructures.ListNode;
import org.example.N_31_LeetCode.N_2_AddTwoNumbers;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test1 {
    @Test

    public void test1() {
        ListNode h1 = new ListNode(2);
        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(3);

        h1.next = n1;
        n1.next = n2;

        ListNode h2 = new ListNode(5);
        ListNode n21 = new ListNode(6);
        ListNode n22 = new ListNode(4);

        h2.next = n21;
        n21.next = n22;

        N_2_AddTwoNumbers sum = new N_2_AddTwoNumbers();
        ListNode current = sum.addTwoNumbers(h1, h2);


        ListNode expected = new ListNode(7);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(8);

        expected.next = n3;
        n3.next = n4;

        while (current != null) {
            assertEquals(expected.val, current.val);
            expected = expected.next;
            current = current.next;
        }

    }
}
