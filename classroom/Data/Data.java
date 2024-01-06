package classroom.Data;

class Data {
    int dia;
    int mes;
    int ano;

    boolean dataValida() {
        return (dia>=1 && dia<=30 && mes>=1 && mes<=12 && ano >= 0);
    }

    void inicializaData(int d, int m, int a) {
        dia = d;
        mes = m;
        ano = a;
    }

    void mostraData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
