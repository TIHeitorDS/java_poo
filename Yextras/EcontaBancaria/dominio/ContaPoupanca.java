package Yextras.EcontaBancaria.dominio;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;
    private Calendar diaAtual = Calendar.getInstance();

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public boolean calcularNovoSaldo(double taxaRendimento) {
        if (diaRendimento == diaAtual.get(Calendar.DAY_OF_MONTH)) {
            this.saldo += (this.saldo * taxaRendimento);

            return true;
        }

        return false;
    }
}
