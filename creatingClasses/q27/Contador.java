package creatingClasses.q27;

public class Contador {
    private int counter;

    public Contador(int counter) {
        this.counter = counter;
    }

    public void zerar() {
        counter = 0;
        System.out.println("Contador zerado!");
    }

    public void incrementar() {
        counter++;
    }

    public int getContador() {
        return counter;
    }
}
