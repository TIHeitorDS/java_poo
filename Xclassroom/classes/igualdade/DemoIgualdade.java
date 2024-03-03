// demonstração do método genérico da classe Igualdade
package Xclassroom.classes.igualdade;

public class DemoIgualdade {
    public static void main(String[] args) {
        System.out.println(Igualdade.ehIgual(2, 2));
        System.out.println(Igualdade.ehIgual(2, -2));
        System.out.println(Igualdade.ehIgual(3, "3"));
        System.out.println(Igualdade.ehIgual(3.4, 3.4));
        System.out.println(Igualdade.ehIgual(true, false));
    }
}
