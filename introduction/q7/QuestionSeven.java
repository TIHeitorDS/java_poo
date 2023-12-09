// Programa que lê três números e determina qual número é o menor

package introduction.q7;

import java.util.Scanner;

public class QuestionSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2, number3;
        int menor;

        System.out.print("Informe o primeiro número: ");
        number1 = input.nextInt();

        System.out.print("Informe o segundo número: ");
        number2 = input.nextInt();

        System.out.print("Informe o terceiro número: ");
        number3 = input.nextInt();

        if ((number1 < number2) && (number1 < number3)) menor = number1;
        else if((number2 < number1) && (number2 < number3)) menor = number2;
        else menor = number3;

        System.err.println("\nO menor número é: " + menor);

        input.close();
    }
}
