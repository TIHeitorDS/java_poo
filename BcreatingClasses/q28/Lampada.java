package BcreatingClasses.q28;

import BcreatingClasses.q27.Contador;

public class Lampada {
    private boolean estadoDaLampada;
    private Contador contador;
    
    Lampada() {
        this.estadoDaLampada = false;
        this.contador = new Contador(0);
    }

    public void acende() {
        estadoDaLampada = true;

        contador.incrementar();
    }

    public void apaga() {
        estadoDaLampada = false;
    }

    public boolean estaLigada() {
        return estadoDaLampada;
    }

    public void mostraEstado() {
        if (estaLigada()) {
            System.out.println("A lâmpada está acesa!");
        } else {
            System.out.println("A lâmpada não está acesa!");
        }
    }

    public void vezesAcesa() {
        System.out.println("A lâmpada foi acesa " + contador.getContador() + " vezes.");
    }
}
