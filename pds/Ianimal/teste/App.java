package Yextras.Ianimal.teste;

import Yextras.Ianimal.dominio.Animal;
import Yextras.Ianimal.dominio.Mamifero;
import Yextras.Ianimal.dominio.Peixe;

public class App {
    public static void main(String[] args) {
        Animal camelo = new Animal();
        Peixe tubarao = new Peixe();
        Mamifero urso = new Mamifero();

        Animal[] animais = new Animal[3];

        camelo.setNome("Camelo");
        camelo.setAmbiente("Terra");
        camelo.setComprimento(150);
        camelo.setCor("Amarelo");
        camelo.setVelocidade(2.0);

        animais[0] = camelo;

        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setCor("Cinzento");
        tubarao.setAmbiente("Mar");
        tubarao.setVelocidade(1.5);
        tubarao.setCaracteristica("Barbatanas e cauda");

        animais[1] = tubarao;

        urso.setNome("Urso-do-Canadá");
        urso.setComprimento(180);
        urso.setCor("Vermelho");
        urso.setAmbiente("Terra");
        urso.setVelocidade(0.5);

        animais[2] = urso;
        for (Animal animal : animais) {
            System.out.println(animal.toString());
        }

    }
}
