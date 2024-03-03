package Xclassroom.classes.faculdade;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }    
}
