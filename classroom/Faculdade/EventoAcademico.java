package classroom.Faculdade;

public class EventoAcademico {
    String nomeEvento;
    String localEvento;
    int numeroParticiopantes;

    EventoAcademico(String nomeEvento, String localEvento, int numeroParticipantes) {
        this.nomeEvento = nomeEvento;
        this.localEvento = localEvento;
        this.numeroParticiopantes = numeroParticipantes;
    }

    void mostraEvento() {
        System.out.println("nome: "+nomeEvento+"\nlocal do evento: "+localEvento+"\nnumero de participantes: "+numeroParticiopantes);
    }
}
