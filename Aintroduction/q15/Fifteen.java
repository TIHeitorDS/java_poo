// Programa que escreve os 4 primeiros números perfeitos

package Aintroduction.q15;

public class Fifteen {
    public static void main(String[] args) {
        int number = 1, divisors = 0, count = 0;
        String mensage = "Números perfeitos: ";

        while (count < 4) {
            divisors = 0;
            for (int i = (number - 1); i >= 1; i--) {
                if (number % i == 0) {
                    divisors += i;
                }
            }
            if (number == divisors) {
                mensage += number + " ";
                count++;
            }
            number++;
        }

        System.out.println(mensage);
    }
}
