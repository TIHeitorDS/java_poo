package DreuseClass.q39;

public class App {
    public static void main(String[] args) {
        EventoDelegacao eventoDelegacao = new EventoDelegacao("20/06/2024", "15:32");
        EventoHeranca eventoHeranca = new EventoHeranca("27/02/2024", "15:33");

        System.out.println(eventoDelegacao);
        System.out.println(eventoHeranca);
    }
}
