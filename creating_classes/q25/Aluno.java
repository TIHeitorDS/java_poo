package creating_classes.q25;

public class Aluno {
    private int matricula;
    private String nome;
    private double prova1;
    private double prova2;
    private double trabalho;

    public Aluno(int matricula, String nome, double prova1, double prova2, double trabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.trabalho = trabalho;
    }

    public double media() {
        return (2.5 * prova1 + 2.5 * prova2 + 2 * trabalho) / 7;
    }

    public double provaFinal(double exameFinal) {
        double media = this.media();
        if (media < 3 || media >= 7) {
            return 0;
        }

        return (media * 6 + exameFinal * 4) / 10;
    }

    public String mostraNome() {
        return nome;
    }

    public int mostraMatricula() {
        return this.matricula;
    }

}
