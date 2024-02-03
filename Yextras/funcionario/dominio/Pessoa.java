package Yextras.funcionario.dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private Endereco endereco;

    public Pessoa(String nome) {
        this.nome = nome;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprime() {
        System.out.print("nome: " + nome + ", CPF: " + cpf + ", idade: " + idade + ", cidade: " + endereco.getCidade());
    }
}