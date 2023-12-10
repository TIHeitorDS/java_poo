// Crie uma função recursiva que verifique se um dado número é primo

package introduction.q21;

import java.util.Scanner;

public class QuestionTwentyOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, resultado, aux = 0;

        System.out.print("Informe um número inteiro: ");
        num = input.nextInt();

        resultado = divisao(num, num, aux);

        if (resultado == 2) {
            System.out.printf("O número %d é primo.\n", num);
        } else {
            System.out.printf("O número %d não é primo.\n", num);
        }

        input.close();
    }

    public static int divisao(int numerador, int denominador, int aux) {
        if (denominador == 0) {
            return aux;
        } else if (numerador % denominador == 0){
            return numerador / divisao(numerador, denominador - 1, aux + 1);
        } else {
            return numerador / divisao(numerador, denominador - 1, aux);
        }
    } 
}
