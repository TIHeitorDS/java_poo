package BcreatingClasses.q30;

public class MaiorNumero {
    // integer numbers
    public static int maior(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static int maior(int num1, int num2, int num3) {
        return Math.max(maior(num1, num2), num3);
    }

    public static int maior(int num1, int num2, int num3, int num4) {
        return Math.max(maior(num1, num2, num3), num4);
    }

    public static int maior(int num1, int num2, int num3, int num4, int num5) {
        return Math.max(maior(num1, num2, num3, num4), num5);
    }

    // double numbers
    public static double maior(double num1, double num2) {
        return Math.max(num1, num2);
    }

    public static double maior(double num1, double num2, double num3) {
        return Math.max(maior(num1, num2), num3);
    }

    public static double maior(double num1, double num2, double num3, double num4) {
        return Math.max(maior(num1, num2, num3), num4);
    }

    public static double maior(double num1, double num2, double num3, double num4, double num5) {
        return Math.max(maior(num1, num2, num3, num4), num5);
    }
}
