package CarraysAndArrayLists.q36;

public class App {
    public static void main(String[] args) {
        Produto prod = new Produto();

        System.out.println("Produto = " + prod.calculaProduto(10, 20));
        System.out.println("Produto = " + prod.calculaProduto(10, 20, 3));
        System.out.println("Produto = " + prod.calculaProduto(7, 8, 7));
    }
}
