// Programa para imprimir uma versão aproximada de um cartão da Mega-Sena
// (somente com os números, respeitando o número de linhas e a distribuição dos números
// nas linhas)

package Aintroduction.q13;

public class QuestionThirteen {
    public static void main(String[] args) {
        final int ROW = 10, COLUMN = 6;

        generateBord(ROW, COLUMN);
    }

    public static void generateBord(int row, int column) {
        int number = 0;;

        for (int i = 0; i < row; i++) {
            for (int k = 0; k < column; k++) {
                System.out.print("[" + ++number + "]" + "\t");
            }
            System.out.print("\n");
        }
    }
}