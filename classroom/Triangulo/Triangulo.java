package classroom.Triangulo;

public class Triangulo {
    double l1;
    double l2;
    double l3;
    String descricao;

    void inicializaTriangulo(double lado1, double lado2, double lado3, String mensagem) {
        l1 = lado1;
        l2 = lado2;
        l3 = lado3;
        descricao = mensagem;
    }

    double perimetro() {
        return l1 + l2 + l3;
    }
}
