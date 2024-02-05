package Yextras.arrays;

public class BarChart {
    public static void main(String[] args) {
        int[] array = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };

        System.out.println("Grade distribution: ");

        for (int i = 0; i < array.length; i++) {
            if (i == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }

            for (int k = 0; k < array[i]; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
