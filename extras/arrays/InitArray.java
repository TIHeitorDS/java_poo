package extras.arrays;

public class InitArray {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        // declara variável array e o inicializa com objeto array
        int[] array = new int[ARRAY_LENGTH];

        // inicializando o array
        // int[] n = { 10, 22, 55, 47, 14 };

        System.out.println("Index\tValue");

        // atribuindo a cada elemento do array valores pares
        for (int k = 0; k < array.length; k++) {
            array[k] = 2 + 2 * k;
        }

        // gera a saída de cada elemento do array
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d\t%d\n", i, array[i]);
        }
    }
}