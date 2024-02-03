package Yextras.funcionario.teste;

import Yextras.funcionario.dominio.Endereco;
import Yextras.funcionario.dominio.Funcionario;

public class App {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Heitor Claudino Dantas");
        Endereco endereco = new Endereco();
        
        funcionario.setIdade(20);
        funcionario.setCpf("abc.def.xyz-22");
        funcionario.setSalario(1.425);

        endereco.setCidade("Pau dos Ferros-RN");
        endereco.setCep("xxxxx-xxx");
        endereco.setRua("Independência");
        endereco.setNumeroCasa(23);

        funcionario.setEndereco(endereco);

        funcionario.imprime();
    }
}
