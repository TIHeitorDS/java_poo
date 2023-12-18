package creating_classes.q25;

public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(202210203, "Heitor Claudino", 10, 9.1, 7.1);

        double mediaParcial = aluno.media();
        double mediaFinal = aluno.provaFinal(1.5);

        if (mediaParcial >= 7) {
            System.out.printf("%s (%d) APROVADO POR MÉDIA.\n", aluno.mostraNome(), aluno.mostraMatricula());
            System.out.println("Média: " + mediaParcial);
        } else if (mediaParcial < 3) {
            System.out.printf("%s (%d) REPROVADO POR MÉDIA.\n", aluno.mostraNome(), aluno.mostraMatricula());
            System.out.println("Média: " + mediaParcial);
        } 
        else {
            if (mediaFinal >= 5) {
                System.out.printf("%s (%d) APROVADO NO EXAME FINAL.\n", aluno.mostraNome(), aluno.mostraMatricula());
                System.out.println("Média: " + aluno.provaFinal(mediaFinal));
            } else {
                System.out.printf("%s (%d) REPROVADO NO EXAME FINAL.\n", aluno.mostraNome(), aluno.mostraMatricula());
                System.out.println("Média: " + aluno.provaFinal(mediaFinal));
            }
        }
    }
}
