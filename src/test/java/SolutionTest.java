import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void shortestPathLengthTest1() {
        int[][] graph = {
                {1, 2, 3},
                {0},
                {0},
                {0}
        };
        int expected = 4;
        int actual = new Solution().shortestPathLength(graph);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shortestPathLengthTest2() {
        int[][] graph = {
                {1},
                {0, 2, 4},
                {1, 3, 4},
                {2},
                {1, 2}
        };
        int expected = 4;
        int actual = new Solution().shortestPathLength(graph);

        Assert.assertEquals(expected, actual);
    }
}
