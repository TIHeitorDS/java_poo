package classroom.Faculdade;

public class EventoAcademico {
    private String nomeEvento;
    private String localEvento;
    private int numeroParticiopantes;

    public EventoAcademico(String nomeEvento, String localEvento, int numeroParticipantes) {
        this.nomeEvento = nomeEvento;
        this.localEvento = localEvento;
        this.numeroParticiopantes = numeroParticipantes;
    }

    public void mostraEvento() {
        System.out.println("nome: " + nomeEvento + "\nlocal do evento: " + localEvento + "\nnumero de participantes: "
                + numeroParticiopantes);
    }
}
