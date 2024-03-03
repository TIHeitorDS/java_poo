package Xclassroom.abstrato.controle;

public abstract class Terrestre extends Veiculo {
    private int qndRodas;

    public Terrestre(int capacidade, int qndRodas) {
        super(capacidade);
        this.qndRodas = qndRodas;
    }

    @Override
    public String toString() {
        return super.toString() + ", quantidade de rodas: " + qndRodas;
    }

    
}
