import org.example.SegmentTree.QueryRangeAddition;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueryRangeAdditionTest {
    @Test
    public void testAdditonRange(){
        int[] numbers = {1, 3, 5, 7, 9, 11};
        QueryRangeAddition queryRangeAddition = new QueryRangeAddition(numbers);
        int sum = queryRangeAddition.querySum(1, 4);
        assertEquals(9, sum);
        sum = queryRangeAddition.querySum(1,5);
        assertEquals(36, sum);
    }
}
