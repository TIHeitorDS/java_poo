// Classe para representar a entrada em uma agência
package arraysAndArrayLists.q33;

public class EntradaEmAgenda {
    private String hora;
    private int dia;
    private int mes;
    private int ano;
    private String assunto;

    public EntradaEmAgenda(String hora, int dia, int mes, int ano, String assunto) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    public boolean ehNoDia(int dia, int mes, int ano) {
        if (this.dia == dia && this.mes == mes && this.ano == ano) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Agenda marcada para " + dia + "/" + mes + "/" + ano + ", às " + hora + ".\nAssunto: " + assunto;
    }
}
