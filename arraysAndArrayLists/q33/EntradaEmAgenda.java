// classe para representar a entrada em uma agenda.
package arraysAndArrayLists.q33;

class EntradaEmAgenda {
    String hora;
    int dia;
    int mes;
    int ano;
    String assunto;

    EntradaEmAgenda(String hora, int dia, int mes, int ano, String assunto) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    boolean ehNoDia(int dia, int mes, int ano) {
        if (this.dia == dia && this.mes == mes && this.ano == ano) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return (String.format(
                "Compromisso marcado para %d/%d/%d às %s horas(s). Assunto: %s.",
                (dia <= 9 ? "0" + dia : dia), (mes <= 9 ? "0" + mes : mes), ano, hora, assunto));
    }
}