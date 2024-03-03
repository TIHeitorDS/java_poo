package DreuseClass.q41;

public class Prefeito extends Politico {
    private String cidade;

    public Prefeito(String nome, int idade, String partido, String cidade) {
        super(nome, idade, partido);
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", cidade: " + cidade;
    }

}
