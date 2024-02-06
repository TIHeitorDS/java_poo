package Xclassroom.trianguloPascal;

public class Pascal {
    private int[][] triangulo;
    private final int LINHAS = 5;
    public Pascal() {
        triangulo = new int[LINHAS][];
        for (int i = 0; i < triangulo.length; i++) {
            triangulo[i] = new int[i+2];
            triangulo[i][0] = 1;
            triangulo[i][triangulo[i].length-1] = 1;
            for (int j = 1; j < triangulo[i].length-1; j++) {
                triangulo[i][j] = triangulo[i-1][j]+triangulo[i-1][j-1];
            }
        }
    }

    public String toString() {
        String res = "";
        for (int[] is : triangulo) {
            for (int i : is) {
                res+=(" " + i);
            }
            res += "\n";
        }

        return res;
    }
}
