package arraysAndArrayLists.q34;

public class Array2D {
    private float[][] matriz;

    public Array2D(float[][] array) {
        matriz = array;
    }

    public float determinante() {
        return (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
    }

    public void getMatriz() {
        for (float[] linhas : matriz) {
            for (float colunas : linhas) {
                System.out.printf("%.2f ", colunas);
            }
            System.out.println();
        }
    }
}
