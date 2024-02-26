package DreuseClass.q38;

public class TesteEquipamento {
    public static void main(String[] args) {
        Equipamento equipamento = new Equipamento("88B", "Intel i5 10a geração");
        Computador computador = new Computador("8GB", "AMD Ryzen 5600G", "Lenovo", "Ideaped 3i");

        System.out.println(equipamento);
        System.out.println(computador);
    }
}