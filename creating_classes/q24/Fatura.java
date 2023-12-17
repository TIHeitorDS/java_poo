package creating_classes.q24;

public class Fatura {
    private int numeroIdentificacao;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public void cadastraItem(int numeroIdentificacao, String descricao, int quantidade, double precoUnitario) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.descricao = descricao;
        this.quantidade = 0;
        this.precoUnitario = 0.0; 
        if (quantidade > 0) {
            this.quantidade = quantidade;
        }
        if (precoUnitario > 0.0) {
            this.precoUnitario = precoUnitario;
        }
    }

    public double calculaTotal() {
        return precoUnitario * quantidade;
    }
}
