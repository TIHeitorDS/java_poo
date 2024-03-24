package Fcollection.q51;

import java.security.SecureRandom;

public class Paciente {
    private int idade;
    private long rg;

    private SecureRandom random;

    public Paciente() {
        random = new SecureRandom();

        this.idade = random.nextInt(99);
        this.rg = random.nextLong(100000000, 111111111);
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "idade=" + idade +
                ", rg=" + rg +
                '}';
    }
}
