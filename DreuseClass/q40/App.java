package DreuseClass.q40;

public class App {
    public static void main(String[] args) {
        Livro livro = new Livro("Machado de Assis", "Dom Casmurro",
                "Em Dom Casmurro, o narrador Bento Santiago retoma a infância que passou na Rua de Matacavalos...",
                208);
        LivroLivraria livroLivraria = new LivroLivraria("Geoger Orwell", "1984",
                "Nesta obra magistral, acompanhamos o drama de Winston Smith...", 288, 32.90);

        LivroBiblioteca livroBiblioteca = new LivroBiblioteca("Fiódor Dostoiévski", "Os irmãos Karamázov",
                "Último romance de Dostoiévski, Os irmãos Karamázov...", 1024, "Heitor Claudino");

        System.out.println(livro);
        System.out.println("===========================");
        System.out.println(livroLivraria);
        System.out.println("===========================");
        System.out.println(livroBiblioteca);

    }
}
