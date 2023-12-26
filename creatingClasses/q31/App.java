package creatingClasses.q31;

public class App {
    public static void main(String[] args) {
        RegistroAcademico aluno1 = new RegistroAcademico("Heitor", 121, 0.15);
        RegistroAcademico aluno2 = new RegistroAcademico("Grego", 471, 0.75);

        System.out.println(aluno1.toString());
        System.out.println(aluno2.toString());
    }
}
