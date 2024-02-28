package DreuseClass.q40;

public class Livro {
    private String autor;
    private String nome;
    private String sinopse;
    private int numeroPaginas;

    public Livro(String autor, String nome, String sinopse, int numeroPaginas) {
        this.autor = autor;
        this.nome = nome;
        this.sinopse = sinopse;
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "autor: " + autor + "\nnome: " + nome + "\nsinopse: " + sinopse + "\nnumero de páginas: " + numeroPaginas;
    }

}
