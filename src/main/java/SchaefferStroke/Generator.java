package SchaefferStroke;
import java.util.*;

public class Generator {

    public static int[] generateNumbers(int count, int min, int max) {
        int[] numbers = new int[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            numbers[i] = random.nextInt(max - min + 1) + min;
        }
        return numbers;
    }

    public static Map<Integer, Integer> aggregate(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : numbers) map.put(num, map.getOrDefault(num, 0) + 1);
        return map;
    }
}