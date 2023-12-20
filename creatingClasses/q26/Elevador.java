package creatingClasses.q26;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int quantidade;

    public Elevador(int capacidade, int totalAndares) {
        andarAtual = 0;
        quantidade = 0;
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
    }

    public void entra() {
        if (quantidade <= capacidade) {
            quantidade++;
            mostraEstado();
        } else {
            System.out.println("Não há mais espaço para entrar!");
        }
    }

    public void sai() {
        if (quantidade != 0) {
            quantidade--;
            mostraEstado();
        } else {
            System.out.println("O elevador está vazio!");
        }
    }

    public void sobe() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            mostraEstado();
        } else {
            System.out.println("O elevador está no último andar!");
        }
    }

    public void desce() {
        if (andarAtual == 0) {
            System.out.println("O elevador está no térreo!");
        } else if (andarAtual > 0) {
            andarAtual--;
            mostraEstado();
        }
    }

    private void mostraEstado() {
        System.out.println("Quandidade de pessoas: " + quantidade);
        System.out.println("Capacidade máxima: " + capacidade);
        System.out.println("Andar atual: " + andarAtual);
        System.out.println("");
    }
}