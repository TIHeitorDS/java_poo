package classroom.Tupla;

public class Tupla<F, S> {
    private F primeiro;
    private S segundo;

    public Tupla(F primeiro, S segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }

    public F getPrimeiro() {
        return primeiro;
    }

    public S getSegundo() {
        return segundo;
    }

    public void setPrimeiro(F primeiro) {
        this.primeiro = primeiro;
    }

    public void setSegundo(S segundo) {
        this.segundo = segundo;
    }

}
