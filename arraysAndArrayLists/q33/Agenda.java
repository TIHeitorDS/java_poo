package arraysAndArrayLists.q33;

import java.util.ArrayList;

public class Agenda {
    private static ArrayList<EntradaEmAgenda> entradaEmAgendas;

    public Agenda() {
       entradaEmAgendas = new ArrayList<>();
    }

    public void setCompromisso(EntradaEmAgenda compromisso) {
        entradaEmAgendas.add(compromisso);

        System.out.println("Compromisso adicionado com sucesso!");
    }

    public void listaDia(int dia, int mes, int ano) {
        for (EntradaEmAgenda compromisso : entradaEmAgendas) {
            if (compromisso.ehNoDia(dia, mes, ano)) {
                System.out.println(compromisso.toString());
            }
        }
    }
}
