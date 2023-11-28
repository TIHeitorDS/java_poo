import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float mass;
        float height;
        float bmi;

        System.out.print("Enter your mass (kg): ");
        mass = input.nextFloat();

        System.out.print("Enter yout height (m): ");
        height = input.nextFloat();

        bmi = mass / (height * height);

        if (bmi < 18.5)
            System.out.println("You are underweight!");
        
        if (bmi >= 18.5 && bmi < 24.9)
            System.out.println("You are normal!");

        if (bmi >= 25 && bmi < 29.9)
            System.out.println("You are overweight!");

        if (bmi >= 30)
            System.out.println("You are obese!");

        input.close();
    }
}
