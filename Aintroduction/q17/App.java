// Programa que utilize laço(s) para calcular a quantidade de anos necessária para 
// que a população da cidade A seja maior ou igual a população da cidade B

package Aintroduction.q17;

public class App {
    public static void main(String[] args) {
        final double crescimentoA = 0.035, crescimentoB = 0.01;
        int populacaoA = 7000, populacaoB = 20000;
        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA += (populacaoA*crescimentoA);
            populacaoB += (populacaoB*crescimentoB);

            anos++;
        }

        System.out.println("Quantidade de anos para que a Popolução A seja maior que B: " + anos);
    }
}
