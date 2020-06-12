import java.util.Arrays;

public class Exist {
    public static boolean exist(String x, String[] array) {
        return Arrays.asList(array).contains(x);
    }
}
