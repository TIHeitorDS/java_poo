import java.util.Scanner;

public class Double {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int result;

        System.out.print("Enter a interger number: ");
        number = input.nextInt();

        result = number * 2;

        System.out.printf("The double of %d is %d.", number, result);

        input.close();
    }
}
