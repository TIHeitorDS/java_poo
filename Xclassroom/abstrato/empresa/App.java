package Xclassroom.abstrato.empresa;

public class App {
    public static void main(String[] args) {
        Fatura fatura = new Fatura(23.43, 3);
        EmpregadoAssalariado empregadoAssalariado = new EmpregadoAssalariado("Heitor", "0258741", 5234);

        custoPagamento(empregadoAssalariado);
        custoPagamento(fatura);
    }

    public static void custoPagamento(Pagavel pagavel) {
        System.out.println("Custo do pagamento: " + pagavel.getPagamento());
    }
}
