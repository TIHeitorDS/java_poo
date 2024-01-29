package Xclassroom.Banco;

public class App {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Heitor Pressão");
        ContaBancaria conta2 = new ContaBancaria("Doquinha", 13.751, true);

        System.out.println(conta1);
        System.out.println(conta2);
    }
}
