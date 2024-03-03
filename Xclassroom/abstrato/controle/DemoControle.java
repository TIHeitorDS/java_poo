package Xclassroom.abstrato.controle;

public class DemoControle {
    public static void main(String[] args) {
        Controle controle = new Controle();
        Aviao aviao = new Aviao(72, "aaaaaaa", "777777");
        Carro carro = new Carro(4, 4, 7777);

        controle.controlar(aviao);
        controle.controlar(carro);

        System.out.println(carro);
    }
}
