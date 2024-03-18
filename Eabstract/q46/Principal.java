package Eabstract.q46;

import Eabstract.q45.Circulo;
import Eabstract.q45.Quadrado;
import Eabstract.q45.Triangulo;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();

        Desenho desenho1 = new Desenho(circulo, quadrado, 5, 4.8, 4, 4);
        Desenho desenho2 = new Desenho(quadrado, triangulo, 10, -10, 6, 6);

        desenho1.apresenta();
        desenho2.apresenta();

    }
}
