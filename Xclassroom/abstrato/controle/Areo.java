package Xclassroom.abstrato.controle;

public abstract class Areo extends Veiculo {
    private String cadANAC;

    public Areo(int capacidade, String cadANAC) {
        super(capacidade);
        this.cadANAC = cadANAC;
    }

    @Override
    public String toString() {
        return super.toString() + ", cadANAC: " + cadANAC;
    }

}
