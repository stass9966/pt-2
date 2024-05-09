import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayServiceTests {
    @Test
    public void _min_ReturnsMinimalValue() {
        var array = new int[] {1, 4, 2, 3};
        var service = new ArrayService();
        var expected = 1;

        var result = service._min(array);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void _max_ReturnsMaximumValue() {
        var array = new int[] {1, 4, 2, 3};
        var service = new ArrayService();
        var expected = 4;

        var result = service._max(array);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void _sum_ReturnsSumOfValues() {
        var array = new int[] {1, 4, 2, 3};
        var service = new ArrayService();
        var expected = 10;

        var result = service._sum(array);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void _mult_ReturnsMultipleOfValues() {
        var array = new int[] {1, 4, 2, 3};
        var service = new ArrayService();
        var expected = 24;

        var result = service._mult(array);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void _mult_ReturnsZero_When_OneValueIsZero() {
        var array = new int[] {1, 4, 2, 0, 3};
        var service = new ArrayService();
        var expected = 0;

        var result = service._mult(array);
        Assertions.assertEquals(expected, result);
    }

}

