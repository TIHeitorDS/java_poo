package DreuseClass.q41;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Robson", 19);
        Politico politico = new Politico("Davi", 29, "PCdoB");
        Prefeito prefeito = new Prefeito("Raphael Lima", 35, "NOVO", "Paraná (RN)");
        Governador governador = new Governador("Heitor Claudino", 27, "Partido Informal da Causa Anárquica",
                "Rio Grande do Norte");

        System.out.println(pessoa);
        System.out.println(politico);
        System.out.println(prefeito);
        System.out.println(governador);
    }
}
