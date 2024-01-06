package extras.arrays;

import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] array2 = new int[3][];
        array2[0] = new int[3];
        array2[1] = new int[2];
        array2[2] = new int[1];

        // preenchendo o array 2
        for (int row = 0; row < array2.length; row++) {
            for (int column = 0; column < array2[row].length; column++) {
                System.out.printf("%dª linha e %dª coluna: ", row + 1, column + 1);
                array2[row][column] = input.nextInt();
            }
        }

        // exibindo os valores do array 1
        System.out.println("valores do arrya1: ");
        getArray(array1);

        // exibindo os valores do array 2
        System.out.println("valores do array2: ");
        getArray(array2);

        input.close();
    }

    public static void getArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.printf("%d ", array[row][column]);
            }
            System.out.println();
        }
    }
}
