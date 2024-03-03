package Xclassroom.abstrato.controle;

public class Barco extends Aquatico {
    private String cadBarco;

    public Barco(int capacidade, int profundidade, String cadBarco) {
        super(capacidade, profundidade);
        this.cadBarco = cadBarco;
    }

    public void moverFrente() {
        System.out.println("avião move para frente...");
    }

    @Override
    public String toString() {
        return super.toString() + ", cadBarco: " + cadBarco;
    }

}
