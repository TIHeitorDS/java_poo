package classroom.Caixa;

public class CaixaBanco {
    private int numeroCaixa;
    private static int clientesAtendidos = 0;

    CaixaBanco(int numeroCaixa) {
        this.numeroCaixa = numeroCaixa;

        System.out.println("Caixa " + this.numeroCaixa + " foi inicializado!");
    }

    public void iniciaAtendimento() {
        System.out.println("O caixa " + numeroCaixa + " atendeu o cliente " + (++clientesAtendidos));
    }
}
