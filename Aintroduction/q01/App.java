// Programa que calcule a área de um quadrado

package Aintroduction.q01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float numero;
        float area;

        System.out.print("Informe o valor da área do quadrado: ");
        numero = input.nextFloat();

        area = numero * numero;

        System.out.printf("A área do quadrado é %.1f.", area);

        input.close();
    }
}
