package Xclassroom.Triangulo;

public class Triangulo {
    private double l1;
    private double l2;
    private double l3;
    private String descricao;

    public void inicializaTriangulo(double lado1, double lado2, double lado3, String mensagem) {
        l1 = lado1;
        l2 = lado2;
        l3 = lado3;
        descricao = mensagem;
    }

    public double perimetro() {
        return l1 + l2 + l3;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
}
