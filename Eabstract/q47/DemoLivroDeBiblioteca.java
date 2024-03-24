package Eabstract.q47;

public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca livroDeBiblioteca1 = new LivroDeBiblioteca("Berserk", "Kentaro Miura", 112, 2013,
                false, "corredor 2, prateleira D", "abcd");

        livroDeBiblioteca1.empresta();
        livroDeBiblioteca1.descricao();
        System.out.println(livroDeBiblioteca1);
    }
}
