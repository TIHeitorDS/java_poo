package Xclassroom.Data;

class Data {
    private int dia;
    private int mes;
    private int ano;

    public boolean dataValida() {
        return (dia>=1 && dia<=30 && mes>=1 && mes<=12 && ano >= 0);
    }

    public void inicializaData(int d, int m, int a) {
        dia = d;
        mes = m;
        ano = a;
    }

    public void mostraData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
