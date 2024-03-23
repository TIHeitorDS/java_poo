package DreuseClass.q38;

public class TesteEquipamento {
    public static void main(String[] args) {
        Equipamento equipamento = new Equipamento("Redragon - Teclado mecânico", "Redragon XYZ RGB Gamer", "Havit Game RGB", "Monitor AOC Gamer 240hz");
        Computador computador = new Computador("Redragon - Teclado mecânico", "Redragon XYZ RGB Gamer", "Havit Game RGB", "Monitor AOC Gamer 240hz", "SSD 512Gb", "16Gb", "RTX 3070");

        System.out.println(equipamento);
        System.out.println();
        System.out.println(computador);
    }
}