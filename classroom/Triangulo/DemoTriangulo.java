package classroom.Triangulo;

public class DemoTriangulo {
    public static void main(String[] args) {
        Triangulo t1, t2, t3;
        t1 = new Triangulo();
        t1.inicializaTriangulo(2.5, 2.5, 2.5, "equilatero");
        t2 = new Triangulo();
        t2.inicializaTriangulo(2.5, 2.5, 5, "isosceles");
        t3 = new Triangulo();
        t3.inicializaTriangulo(0, 0, 0, null);
        t3 = t1;
        
        System.err.println(t1.l3);
    }
}
