package Eabstract.q47;

public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca livroDeBiblioteca1 = new LivroDeBiblioteca("Berserk", "Kentaro Miura", 112, 2013,
                false, "corredor 2, prateleira D", "abcd");
        LivroDeBiblioteca livroDeBiblioteca2 = new LivroDeBiblioteca("Metamoforse", "Franz Kafka", 61, 2012, true,
                "corredor 1, prateleira A", "dcadad");

        livroDeBiblioteca1.empresta();
        livroDeBiblioteca1.descricao();
        System.out.println(livroDeBiblioteca1);
        System.out.println("=================== \n");
        livroDeBiblioteca2.empresta();
        System.out.println(livroDeBiblioteca2);
        livroDeBiblioteca2.devolve();
        System.out.println(livroDeBiblioteca2);

    }
}
