// Métodos da classe Arrays e System.arraycopy
package extras.arrays;

import java.util.Arrays;

public class ArraysManipulations {
    public static void main(String[] args) {
        // classifica doubleArray em ordem crescente
        double[] doubleArray = { 8.4, 9.3, 0.2, 7.9, 3.4 };
        Arrays.sort(doubleArray);
        System.out.print("\ndoubleArray: ");
        for (double value : doubleArray) {
            System.out.printf("%.1f ", value);
        }

        // preenche o array de 10 elementos com 7s
        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);
        displayArray(filledIntArray, "filledIntArray");

        // copia o array intArray em array intArrayCopy
        int[] intArray = { 1, 2, 3, 4, 5 };
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "initArray");
        displayArray(intArrayCopy, "initArrayCopy");

        // verifica a igualdade de initArray e initArrayCopy
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("\nintArray %s intArrayCopy!\n", (b ? "==" : "!="));

        // verifica a igualdade de initArray e filledIntArray
        b = Arrays.equals(intArray, filledIntArray);
        System.out.printf("intArray %s filledIntArray!\n", (b ? "==" : "!="));

        // pesquisa o valor 5 em intArray
        int location = Arrays.binarySearch(intArray, 5);

        if (location >= 0) {
            System.out.printf("Found 5 at element %d in intArray\n", location);
        }

        location = Arrays.binarySearch(intArray, 875);
        if (location >= 0) {
            System.out.printf("Found 875 at element %d in intArray", location);
        } else {
            System.out.println("8763 not found in intArray");
        }
    }

    public static void displayArray(int[] array, String description) {
        System.out.print("\n" + description + ": ");

        for (int i : array) {
            System.out.printf("%d ", i);
        }
    }
}
