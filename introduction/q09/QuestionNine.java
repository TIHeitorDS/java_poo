// Programa que lê um número que representa o valor da carta, de um (ás) a
// treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e 4 =
// espadas)

package introduction.q09;

import java.util.Scanner;

public class QuestionNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor, naipe;
        String mensagem = "";

        System.out.print("Informe o valor da carta: ");
        valor = input.nextInt();

        System.out.print("Informe o valor do naipe: ");
        naipe = input.nextInt();

        switch (valor) {
            case 1:
                mensagem += "ás de ";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                mensagem = valor + " de ";
                break;
            case 11:
                mensagem += "valete de ";
                break;
            case 12:
                mensagem += "dama de ";
                break;
            case 13:
                mensagem += "rei de ";
                break;
            default:
                break;
        }

        if (naipe == 1) {
            mensagem += "ouros";
        } else if (naipe == 2) {
            mensagem += "paus";
        } else if (naipe == 3) {
            mensagem += "copas";
        } else {
            mensagem += "espadas";
        }

        System.out.println(mensagem);

        input.close();
    }
}
