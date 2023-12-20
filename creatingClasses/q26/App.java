package creatingClasses.q26;

public class App {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(7, 4);

        elevador.entra();
        elevador.entra();
        elevador.sobe();
        elevador.sobe();
        elevador.entra();
        elevador.entra();
        elevador.sobe();
        elevador.entra();

        elevador.sobe();
        elevador.sobe();
        elevador.desce();
        elevador.desce();
        elevador.sai();
    }
}
