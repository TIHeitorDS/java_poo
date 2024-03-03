package Xclassroom.abstrato.empresa;

public abstract class Empregado implements Pagavel {
    private String nome;
    private String CTPS;

    public Empregado(String nome, String CTPS) {
        this.nome = nome;
        this.CTPS = CTPS;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCTPS() {
        return CTPS;
    }

    public void setCTPS(String cTPS) {
        CTPS = cTPS;
    }

}
