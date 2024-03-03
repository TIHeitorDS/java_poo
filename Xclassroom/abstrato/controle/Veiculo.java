package Xclassroom.abstrato.controle;

public abstract class Veiculo {
    private int capacidade;

    public Veiculo(int capacidade) {
        this.capacidade = capacidade;
    }

    public abstract void moverFrente();

    @Override
    public String toString() {
        return "capacidade: " + capacidade;
    }

}
