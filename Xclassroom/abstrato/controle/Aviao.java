package Xclassroom.abstrato.controle;

public class Aviao extends Areo {
    private String cadAviao;

    public Aviao(int capacidade, String cadANAC, String cadAviao) {
        super(capacidade, cadANAC);
        this.cadAviao = cadAviao;
    }

    public void moverFrente() {
        System.out.println("avião move para frente...");
    }

    @Override
    public String toString() {
        return super.toString() + ", cadAviao: " + cadAviao;
    }

}
