package arraysAndArrayLists.q33;

public class App {
    public static void main(String[] args) {
        EntradaEmAgenda compromisso1 = new EntradaEmAgenda("00:00", 19, 12, 2024, "Meu aniversário.");
        EntradaEmAgenda compromisso2 = new EntradaEmAgenda("18:30", 25, 2, 2024, "Aniversário de Elizabeth.");
        EntradaEmAgenda compromisso3 = new EntradaEmAgenda("10:15", 10, 1, 2024, "Terapia.");
        EntradaEmAgenda compromisso4 = new EntradaEmAgenda("13:30", 22, 1, 2024, "Reunião do projeto.");
        EntradaEmAgenda compromisso5 = new EntradaEmAgenda("05:30", 25, 2, 2024, "Academia.");
        EntradaEmAgenda compromisso6 = new EntradaEmAgenda("15:58", 19, 12, 2024, "O fim de uma jornada.");

        Agenda compromissos = new Agenda();
        compromissos.setCompromisso(compromisso1);
        compromissos.setCompromisso(compromisso2);
        compromissos.setCompromisso(compromisso3);
        compromissos.setCompromisso(compromisso4);
        compromissos.setCompromisso(compromisso5);
        compromissos.setCompromisso(compromisso6);

        compromissos.listaDia(25, 2, 2024);
        compromissos.listaDia(19, 12, 2024);
    }
}
