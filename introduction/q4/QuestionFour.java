// Programa que receba uma temperatura em graus centígrados e a apresente em graus Fahrenheit

package introduction.q4;

import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double temperature;
        double tempInFahrenheit;

        System.out.print("Informe a temperatura em Celsius: ");
        temperature = input.nextDouble();

        tempInFahrenheit = temperature * 1.8 + 32;

        System.out.printf("%.2f°C = %.2f°F", temperature, tempInFahrenheit);

        input.close();
    }
}
