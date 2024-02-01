package BcreatingClasses.q25;

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

    public double provaFinal() {
        double mp = this.media();
        if (mp < 3 || mp >= 7) {
            return 0;
        }
        return (50 - (mp * 6))/4;
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", nome=" + nome + ", prova1=" + prova1 + ", prova2=" + prova2
                + ", trabalho=" + trabalho + ", média: " + media() + (provaFinal() != 0 ? (", media final= " + provaFinal()) : "") + "]";
    }
}
