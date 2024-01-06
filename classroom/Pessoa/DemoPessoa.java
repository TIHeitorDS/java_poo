package classroom.Pessoa;

public class DemoPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Heitor Claudino", 1.71);
        p.setAltura(1.78);
        
        System.out.println(p.getAltura());
        System.out.println(p);
    }
}
