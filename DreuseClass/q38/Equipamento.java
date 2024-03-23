package DreuseClass.q38;

public class Equipamento {
    private String teclado;
    private String mouse;
    private String headSet;
    private String monitor;

    public Equipamento(String teclado, String mouse, String headSet, String monitor) {
        this.teclado = teclado;
        this.mouse = mouse;
        this.headSet = headSet;
        this.monitor = monitor;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getHeadSet() {
        return headSet;
    }

    public void setHeadSet(String headSet) {
        this.headSet = headSet;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return  "teclado='" + teclado + '\'' +
                ", mouse='" + mouse + '\'' +
                ", headSet='" + headSet + '\'' +
                ", monitor='" + monitor + '\'';
    }
}
