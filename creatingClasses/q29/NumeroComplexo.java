package creatingClasses.q29;

public class NumeroComplexo {
    private double real;
    private double imaginario;

    public NumeroComplexo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public NumeroComplexo(double real) {
        this.real = real;
        this.imaginario = 0.0;
    }

    public NumeroComplexo() {
        this.real = 0.0;
        this.imaginario = 0.0;
    }

    public String toString() {
        return (imaginario < 0) ? "Número complexo: " + real + " + " + (imaginario * (-1)) + "i"
                : "Número complexo: " + real;
    }
}
