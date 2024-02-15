package Yextras.Ianimal.dominio;

public class Peixe extends Animal {
    private String caracteristica;

    public Peixe() {
        super();
        this.setPatas(0);
        this.setAmbiente("Mar");
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", comprimento=" + comprimento + ", patas=" + patas + ", cor=" + cor
                + ", ambiente=" + ambiente + ", velocidade=" + velocidade + ", caracteristica=" + caracteristica + "]";
    }
    
}
