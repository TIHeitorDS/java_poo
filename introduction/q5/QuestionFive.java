import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int ucd;
        int centena, dezena, unidade;

        System.out.print("Informe um número de três dígitos: ");
        number = input.nextInt();

        // unidade vira centana
        unidade = number % 10;
        ucd = unidade * 100;

        number /= 10;

        // dezena vira unidade
        dezena = number % 10;
        ucd += dezena;

        number /= 10;

        // centena vira dezena
        centena = number * 10;
        ucd += centena;

        System.out.println("UCD = " + ucd);

        input.close();
    }
}
