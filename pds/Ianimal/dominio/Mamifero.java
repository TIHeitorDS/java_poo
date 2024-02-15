package Yextras.Ianimal.dominio;

public class Mamifero extends Animal {
    private String alimento;

    public Mamifero() {
        super();
        this.setAmbiente("Terra");
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
}
