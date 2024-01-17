package classroom.Faculdade;

public class RegistroAcademico {
    private String nome;
    private String matricula;
    private int codigoCurso;
    private double percentualCobranca;

    public void inicializaMatricula(String nome, String matricula, int codigoCurso, double percentualCobranca) {
        this.nome = nome;
        this.matricula = matricula;
        this.codigoCurso = codigoCurso;
        this.percentualCobranca = percentualCobranca;
    }

    public double calculaMensalidade() {
        return 100*codigoCurso*percentualCobranca;
    }
}
