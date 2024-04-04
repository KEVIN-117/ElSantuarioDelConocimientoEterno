package N_30_AdvancedAlgorithms.N_2_AddTwoNumbersTest.Tests;

import org.example.N_31_LeetCode.Estructures.ListNode;
import org.example.N_31_LeetCode.N_2_AddTwoNumbers;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test3 {
    @Test
    public void test() {
        N_2_AddTwoNumbers sum = new N_2_AddTwoNumbers();
        ListNode h = new ListNode(0);
        ListNode h1 = new ListNode(7);
        ListNode h2 = new ListNode(3);
        h1.next = h2;

        ListNode current = sum.addTwoNumbers(h, h1);

        ListNode expected = new ListNode(7);
        ListNode expected1 = new ListNode(3);

        expected.next = expected1;

        while (current != null) {
            assertEquals(expected.val, current.val);
            current = current.next;
            expected = expected.next;
        }
    }
}
