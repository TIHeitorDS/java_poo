package extras.arrays;

public class sumArray {
    public static void main(String[] args) {
        int[] array = { 87, 84, 51, 65, 12, 47, 11 };
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        System.out.println("Soma dos elementos no array: " + total);
    }
}
