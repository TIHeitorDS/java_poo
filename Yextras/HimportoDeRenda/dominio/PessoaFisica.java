package Yextras.HimportoDeRenda.dominio;

public class PessoaFisica extends Contribuinte {
    private String cpf;

    public PessoaFisica(String nome, double rendaBruta, String cpf) {
        super(nome, rendaBruta);
        this.cpf = cpf;
    }

    public double calcularImposto() {
        if (this.rendaBruta <= 1400) {
            return this.rendaBruta;
        } else if (this.rendaBruta <= 2100) {
            return this.rendaBruta * 0.1;
        } else if (this.rendaBruta <= 2800) {
            return this.rendaBruta * 0.15;
        } else if (this.rendaBruta <= 3600) {
            return this.rendaBruta * 0.25;
        } else {
            return this.rendaBruta * 0.3;
        }
    }

    @Override
    public String toString() {
        return "PessoaFisica [cpf=" + cpf + ", valor do imposto a ser pago=" + calcularImposto() + "]";
    }
}
