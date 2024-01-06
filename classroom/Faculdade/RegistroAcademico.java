package classroom.Faculdade;

public class RegistroAcademico {
    String nome;
    String matricula;
    int codigoCurso;
    double percentualCobranca;

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
