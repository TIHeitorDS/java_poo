package DreuseClass.q38;

public class Equipamento {
    private String memoriaPrincipal;
    private String processador;

    public Equipamento(String memoriaPrincipal, String processador) {
        this.memoriaPrincipal = memoriaPrincipal;
        this.processador = processador;
    }

    public String getMemoriaPrincipal() {
        return memoriaPrincipal;
    }

    public void setMemoriaPrincipal(String memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String memoriaSecundaria) {
        this.processador = memoriaSecundaria;
    }

    @Override
    public String toString() {
        return "memoria principal: " + memoriaPrincipal + ", memoria secundaria: " + processador;
    }

}
