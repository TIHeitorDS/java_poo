package BcreatingClasses.q27;

public class App {
    public static void main(String[] args) {
        Contador cont = new Contador(0);

        cont.incrementar();
        cont.incrementar();

        System.out.println("Valor do contado: " + cont.getContador());
        cont.zerar();

        cont.incrementar();
        cont.incrementar();

        cont.incrementar();
        cont.incrementar();
        cont.incrementar();
        cont.incrementar();
        cont.incrementar();

        System.out.println("Valor do contado: " + cont.getContador());
    }
}
