package DreuseClass.q38;

public class Computador extends Equipamento {
    private String marca;
    private String modelo;

    public Computador(String memoriaPrincipal, String processador, String marca, String modelo) {
        super(memoriaPrincipal, processador);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return super.toString() + " marca: " + marca + ", modelo: " + modelo;
    }

}
