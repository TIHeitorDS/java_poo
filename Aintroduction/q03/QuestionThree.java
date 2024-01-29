// Programa que receba um ângulo em graus e o converta para sua representação em radianos

package Aintroduction.q03;

import java.util.Scanner;
import java.lang.Math;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double angle;

        System.out.print("Informe o valor do ângulo em graus: ");
        angle = input.nextDouble();

        System.out.printf("%.2f° em radianos é %.2frad.\n", angle, Math.toRadians(angle));

        System.out.printf("o seno do ângulo %.2f é %.2f.\n", angle, Math.sin(angle));
        System.out.printf("o cosseno do ângulo %.2f é %.2f.\n", angle, Math.cos(angle));
        System.out.printf("a tangente do ângulo %.2f é %.2f.\n\n", angle, Math.tan(angle));

        System.out.printf("o cossecante do ângulo %.2f é %.2f.\n", angle, 1/Math.sin(angle));
        System.out.printf("a secante do ângulo %.2f é %.2f.\n", angle, 1/Math.cos(angle));
        System.out.printf("a cotangente do ângulo %.2f é %.2f.", angle, 1/Math.tan(angle));

        input.close();
    }
}
