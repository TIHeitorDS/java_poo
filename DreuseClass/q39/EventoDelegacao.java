package DreuseClass.q39;

public class EventoDelegacao {
    private DataHora dataHora;
    private String evento;

    public EventoDelegacao(String data, String hora) {
        this.dataHora = new DataHora(data, hora);
        this.evento = "Delegação";
    }

    @Override
    public String toString() {
        return "data: " + dataHora.getData() + ", hora: " + dataHora.getHora() + "h, evento: " + evento;
    }
}
