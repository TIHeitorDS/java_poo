// Inicializando um array com argumentos de linha de comando.
package extras.arrays;

public class InitArray {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println(
                    "ERROR! Please re-enter the entire command, including an array size, initial value and increment.");
        } else {
            int arraySize = Integer.parseInt(args[0]);
            int[] array = new int[arraySize];

            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            for (int counter = 0; counter < array.length; counter++) {
                array[counter] = initialValue + increment * counter;
            }

            System.out.printf("%s%8s%n", "Index", "Value");

            for (int counter = 0; counter < array.length; counter++) {
                System.out.printf("%5d%8d%n", counter, array[counter]);
            }
        }
    }
}