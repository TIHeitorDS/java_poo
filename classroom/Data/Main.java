package classroom.Data;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        data.inicializaData(17, 1, 2024);

        System.out.println("Boas vindas");
        if (data.dataValida()) {
            data.mostraData();
        } else {
            System.out.println("Data inválida!");
        }
    }
}
