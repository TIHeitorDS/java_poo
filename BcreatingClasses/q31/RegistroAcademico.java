package BcreatingClasses.q31;

public class RegistroAcademico {
    private String nome;
    private String matricula;
    private int codigoCurso;
    private double percentualCobranca;
    private static int numeroDeMatriculas = 1;

    public RegistroAcademico(String nome, int codigoCurso, double percentualCobranca) {
        this.nome = nome;
        this.matricula = numeroDeMatriculas + "";
        this.codigoCurso = codigoCurso;
        this.percentualCobranca = percentualCobranca;
        numeroDeMatriculas++;
    }

    public double calculaMensalidade() {
        return 100 * codigoCurso * percentualCobranca;
    }

    public String toString() {
        return "Nome: " + nome + "\nMatricula: " + matricula + "\nCódigo do curso: " + codigoCurso;
    }
}
