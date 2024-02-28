package DreuseClass.q40;

import java.util.UUID;

public class LivroBiblioteca extends Livro {
    private UUID codigo;
    private boolean estaAlugado;
    private String alugadoPor;
    private int quantidade;

    public LivroBiblioteca(String autor, String nome, String sinopse, int numeroPaginas, String alugadoPor) {
        super(autor, nome, sinopse, numeroPaginas);
        codigo = UUID.randomUUID();
        this.alugadoPor = alugadoPor;
        this.estaAlugado = true;
        this.quantidade = 5;
    }

    public LivroBiblioteca(String autor, String nome, String sinopse, int numeroPaginas) {
        super(autor, nome, sinopse, numeroPaginas);
        codigo = UUID.randomUUID();
        this.alugadoPor = "";
        this.estaAlugado = false;
        this.quantidade = 5;
    }

    public boolean isEstaAlugado() {
        return estaAlugado;
    }

    public void setEstaAlugado(boolean estaAlugado) {
        this.estaAlugado = estaAlugado;
    }

    public String getAlugadoPor() {
        return alugadoPor;
    }

    public void setAlugadoPor(String alugadoPor) {
        this.alugadoPor = alugadoPor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncodigo: " + codigo + "\nesta lugado?"
                + (estaAlugado ? " sim, alugado por: " + alugadoPor : " não")
                + "\nquantidade: " + quantidade;
    }

}
