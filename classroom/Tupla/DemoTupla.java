package classroom.Tupla;

public class DemoTupla {
    public static void main(String[] args) {
        Tupla<String, Integer> tupla1 = new Tupla<String,Integer>("Heitor", 4);
        Tupla<Double, Boolean> tupla2 = new Tupla<Double,Boolean>(2.4, true);

        System.out.println("Tupla 1: (" + tupla1.getPrimeiro() + ", " + tupla1.getSegundo() + ").");
        System.out.println("Tupla 2: (" + tupla2.getPrimeiro() + ", " + tupla2.getSegundo() + ").");
    }
}
