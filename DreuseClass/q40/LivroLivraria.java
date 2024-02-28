package DreuseClass.q40;

public class LivroLivraria extends Livro {
    private int quantidade;
    private double preco;

    public LivroLivraria(String autor, String nome, String sinopse, int numeroPaginas, double preco) {
        super(autor, nome, sinopse, numeroPaginas);
        this.preco = preco;
        this.quantidade = 5;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return super.toString() + "\nquantidade: " + quantidade + "\npreco: R$" + preco;
    }

}
