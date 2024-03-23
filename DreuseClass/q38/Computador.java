package DreuseClass.q38;

public class Computador extends Equipamento {
    private String memoriaSecundaria;
    private String ram;
    private String placaDeVideo;

    public Computador(String teclado, String mouse, String headSet, String monitor, String memoriaSecundaria, String ram, String placaDeVideo) {
        super(teclado, mouse, headSet, monitor);
        this.memoriaSecundaria = memoriaSecundaria;
        this.ram = ram;
        this.placaDeVideo = placaDeVideo;
    }

    public String getMemoriaSecundaria() {
        return memoriaSecundaria;
    }

    public void setMemoriaSecundaria(String memoriaSecundaria) {
        this.memoriaSecundaria = memoriaSecundaria;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    @Override
    public String toString() {
        return  "memoria secundaria='" + memoriaSecundaria + '\'' +
                ", ram='" + ram + '\'' +
                ", placa de video='" + placaDeVideo + '\'' +
                ", " + super.toString();
    }
}
