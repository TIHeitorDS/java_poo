package Eabstract.q45;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();
        Quadrado quadrado = new Quadrado();

        circulo.desenha();
        triangulo.desenha();
        quadrado.desenha();
    }
}
