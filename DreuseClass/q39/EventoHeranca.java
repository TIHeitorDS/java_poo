package DreuseClass.q39;

public class EventoHeranca extends DataHora {
    private String evento;

    public EventoHeranca(String data, String hora) {
        super(data, hora);
        this.evento = "Herança";
    }

    public String getEvento() {
        return evento;
    }

    @Override
    public String toString() {
        return super.toString() + ", evento: " + evento;
    }

    

}
