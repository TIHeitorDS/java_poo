// Programa que determina quais são todos os números de 3 algarismos cuja
// soma dos cubos de seus algarismos sejam iguais ao próprio número.

package Aintroduction.q16;

public class Sixteen {
    public static void main(String[] args) {
        int number = 100, aux;
        int unidade, centena, dezena, soma;
        String mensagem = "Números que soma dos cubos de seus algarismos são iguais ao próprio número: ";

        for (int i = number; i <= 999; i++) {
            aux = i;
            unidade = aux % 10;
            aux /= 10;
            dezena = aux % 10;
            aux /= 10;
            centena = aux % 10;

            soma = (centena*centena*centena) + (dezena*dezena*dezena) + (unidade*unidade*unidade);
            
            if (soma == i) {
                mensagem += i + " ";
            }
        }

        System.out.println(mensagem);
    }
}
