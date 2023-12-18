package creating_classes.q24;

public class FaturaTeste {
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura(010203, "Processador Ryzen 5 4600G", 1, 739.99);
        Fatura fatura2 = new Fatura(141516, "Memória RAM 8gb", 2, 329.40);

        System.out.println("Valor da fatura 1: R$" + fatura1.calculaTotal());
        System.out.println("Valor da fatura 2: R$" + fatura2.calculaTotal());
    }
}
