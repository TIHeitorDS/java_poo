package Eabstract.q47;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int anoDeEdicao;

    public Livro(String titulo, String autor, int numeroDePaginas, int anoDeEdicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDeEdicao = anoDeEdicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "titulo: " + titulo + ", autor: " + autor + ", numero de paginas: " + numeroDePaginas
                + ", ano de edicao: " + anoDeEdicao;
    }

}
