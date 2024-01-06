package extras.arrays;

public class EnhancedForTest {
    public static void main(String[] args) {
        int[] array = { 1, 1, 2, 3, 5, 8, 13, 21 };
        int result = 0;

        for (int item : array) {
            result += item;
        }

        System.out.println(result);
    }
}
