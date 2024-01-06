package extras.arrays;

public class PassArray {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        System.out.print("original values of the array: ");
        for (int number : numbers) {
            System.out.printf(" %d ", number);
        }
        System.out.println();

        modifyArray(numbers);

        System.out.print("values of the array times 2: ");
        for (int number : numbers) {
            System.out.printf(" %d ", number);
        }
        System.out.println();

        modifyElement(numbers[2]);
        System.out.println("number in index 2 modified to: " + numbers[2]);
    }

    public static void modifyArray(int[] num) {
        for (int i = 0; i < num.length; i++) {
            num[i] *= 2;
        }
    }

    public static void modifyElement(int element) {
        element += 2;
    }
}
