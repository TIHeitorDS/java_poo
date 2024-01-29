package BcreatingClasses.q28;

public class App {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.acende();
        lampada.apaga();
        lampada.acende();

        lampada.mostraEstado();

        lampada.vezesAcesa();
    }
}
