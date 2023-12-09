// Programa que calcule a soma e a média aritmética de 3 números

package introduction.q2;

import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float numero;
        float soma = 0.0f, media;

        for (int i = 1; i <= 3; i++) {
            System.out.printf("Informe o %dº numero: ", i);
            numero = input.nextFloat();

            soma += numero;
        }

        media = soma / 3;

        System.out.printf("Valor da soma: %f\nValor da média: %.1f", soma, media);

        input.close();
    }
}
