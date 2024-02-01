package BcreatingClasses.q25;

public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(202210203, "Heitor Claudino", 10, 9.1, 7.1);
        Aluno aluno2 = new Aluno(2021011213, "Clarêncio", 5.3, 2, 4);

        System.out.println(aluno1.toString());
        System.out.println(aluno2.toString());
    }
}
