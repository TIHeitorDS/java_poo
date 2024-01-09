// Utilizando listas de argumentos de comprimento variável.
package extras.arrays;

public class VarargsTest {
    public static double average(double... numbers) {
        double total = 0;

        for (double number : numbers) {
            total += number;
        }

        return total / numbers.length;
    }

    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 20.0;
        double num3 = 30.0;
        double num4 = 40.0;

        System.out.println("Average of num1 and num2: " + average(num1, num2));
        System.out.println("Average of num1, num2 and num3: " + average(num1, num2, num3));
        System.out.println("Average of num1, num2, num3 and num4: " + average(num1, num2, num3, num4));

    }
}
