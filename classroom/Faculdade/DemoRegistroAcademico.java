package classroom.Faculdade;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico michael = new RegistroAcademico();

        michael.inicializaMatricula("michael douglas", "010203", 3, 0.75);
        
        System.out.println(michael.calculaMensalidade());

        RegistroAcademico roberto = new RegistroAcademico();
        
        System.out.println(roberto.calculaMensalidade());
    }
}
