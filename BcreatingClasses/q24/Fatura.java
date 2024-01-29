package BcreatingClasses.q24;

public class Fatura {
    private int numeroIdentificacao;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public Fatura(int numeroIdentificacao, String descricao, int quantidade, double precoUnitario) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
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

    public void mostraFatura() {
        System.out.printf("Número da identificação: %s\ndescrição: %s\nquantidade: %d\npreço unitário: %f", numeroIdentificacao, descricao, quantidade, precoUnitario);
    }
}
