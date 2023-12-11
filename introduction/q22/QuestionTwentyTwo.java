// Sendo Pn (x) = x * Pn−1(x) + an, escreva uma função recursiva para calcular Pn (x)

package introduction.q22;

import java.util.Scanner;

public class QuestionTwentyTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int grauN;
        double x;
        double[] coeficientes;

        System.out.print("Informe o grau do polinômio: ");
        grauN = input.nextInt();

        coeficientes = new double[grauN + 1];

        for (int i = 0; i <= grauN; i++) {
            System.err.print("a" + i + ": ");
            coeficientes[i] = input.nextDouble();
        }

        System.out.print("Informe o valor de x: ");
        x = input.nextDouble();

        System.out.println("O valor do polinômio é: " + polinomio(grauN, coeficientes, x));

        input.close();
    }

    public static double polinomio(int n, double[] coeficientes, double x) {
        if (n == 0) {
            return coeficientes[0];
        } else {
            return x * polinomio(n - 1, coeficientes, x) + coeficientes[n];
        }
    }
}
