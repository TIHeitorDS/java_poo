// classe para usar um método genérico
package Xclassroom.classes.igualdade;

public class Igualdade {
    public static <T>boolean ehIgual(T arg1, T arg2) {
        return arg1.equals(arg2);
    }
}