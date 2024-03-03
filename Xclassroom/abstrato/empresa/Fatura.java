package Xclassroom.abstrato.empresa;

public class Fatura implements Pagavel {
    private double precoItem;
    private double qtdItem;

    public Fatura(double precoItem, double qtdItem) {
        this.precoItem = precoItem;
        this.qtdItem = qtdItem;
    }

    public double getPagamento() {
        return precoItem * qtdItem;
    }
}
