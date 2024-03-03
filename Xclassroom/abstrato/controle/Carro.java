package Xclassroom.abstrato.controle;

public class Carro extends Terrestre {
    private int placa;

    public Carro(int capacidade, int qndRodas, int placa) {
        super(capacidade, qndRodas);
        this.placa = placa;
    }

    public Carro(int placa) {
        super(5, 4);
        this.placa = placa;
    }

    public void moverFrente() {
        System.out.println("carro move para frente...");
    }

    @Override
    public String toString() {
        return super.toString() + ", placa: " + placa;
    }

}
