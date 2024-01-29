package CarraysAndArrayLists.q33;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> entradaEmAgendas;

    Agenda() {
        entradaEmAgendas = new ArrayList<>();
    }

    void novoCompromisso(EntradaEmAgenda compromisso) {
        entradaEmAgendas.add(compromisso);

        System.out.println("Compromisso adicionado com sucesso!");
    }

    void listaDia(int dia, int mes, int ano) {
        for (EntradaEmAgenda compromisso : entradaEmAgendas) {
            if (compromisso.ehNoDia(dia, mes, ano)) {
                System.out.println(compromisso.toString());
            }
        }
    }
}