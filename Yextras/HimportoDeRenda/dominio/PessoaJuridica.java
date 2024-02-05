package Yextras.HimportoDeRenda.dominio;

public class PessoaJuridica extends Contribuinte {
    private String cnpj;

    public PessoaJuridica(String nome, double rendaBruta, String cnpj) {
        super(nome, rendaBruta);
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return (rendaBruta*0.1);
    }

    @Override
    public String toString() {
        return "PessoaJuridica [cnpj=" + cnpj + ", valor do imposto a ser pago=" + calcularImposto() + "]";
    }
}
