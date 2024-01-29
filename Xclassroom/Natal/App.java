// Usando a fábrica de instância.

package Xclassroom.Natal;

public class App {
    public static void main(String[] args) {
        Natal d1 = Natal.natal(2024);
        Natal d2 = Natal.natal(2025);

        System.out.println(d1.toString());
        System.out.println(d2.toString());
    }
}
