import java.math.BigInteger;

public class ArrayService {
    int _min(int[] source) {
        var result = source[0];
        for (int i = 0; i < source.length; i++) {
            var current = source[i];
            if (current < result) {
                result = current;
            }
        }
        return result;
    }
    int _max(int[] source) {
        var result = source[0];
        for (int i = 0; i < source.length; i++) {
            var current = source[i];
            if (current > result) {
                result = current;
            }
        }
        return result;
    }
    int _sum(int[] source) {
        var result = 0;
        for (int i = 0; i < source.length; i++) {
            result += source[i];
        }
        return result;
    }
    BigInteger _mult(int[] source) {
        var result = BigInteger.valueOf(1);
        for (int i = 0; i < source.length; i++) {
            result = BigInteger.valueOf(source[i]).multiply(result);
        }
        return result;
    }
}
