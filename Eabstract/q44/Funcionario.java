package Eabstract.q44;

import java.util.UUID;

public class Funcionario {
    private String nome;
    private int idade;
    private UUID id;
    private double salarioPorHora;

    public Funcionario(String nome) {
        this.nome = nome;
        this.idade = 18;
        this.id = UUID.randomUUID();
        this.salarioPorHora = 2.00;
    }

    public Funcionario(String nome, double salarioPorHora) {
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
        this.idade = 18;
        this.id = UUID.randomUUID();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public double salario() {
        int horasPorMes = 160; // 8 horas por dia, 5 dias por semanas e mês com 4 semanas
        return this.salarioPorHora * horasPorMes;
    }

    @Override
    public String toString() {
        return "nome: " + nome + ", idade: " + idade + ", id: " + id + ", salario por hora: R$" + salarioPorHora;
    }

}
