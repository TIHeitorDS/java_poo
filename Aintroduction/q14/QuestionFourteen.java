// Escreva um programa que apresente a série de Fibonacci até o n-ézimo termo. Assuma que n > 0

package Aintroduction.q14;

import java.util.Scanner;

public class QuestionFourteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, count = 0;
        int prev = 0, current = 1, aux;

        System.out.print("Informe o n-ézimo termo: ");
        n = input.nextInt();

        while (count < n) {
            System.out.printf("%d ", current);

            aux = current;
            current = prev + current;
            prev = aux;

            count++;
        }

        input.close();
    }
}
