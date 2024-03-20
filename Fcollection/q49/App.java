package Fcollection.q49;

import java.util.TreeMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeMap<Character, Integer> mapa = new TreeMap<>();
        String texto;
        char letra;
        int qnt = 0;

        System.out.print("informe um texto: ");
        texto = input.nextLine();
        texto = texto.toUpperCase();

        for (int i = 0; i < texto.length(); i++) {
            letra = texto.charAt(i);

            if (letra != ' ' && mapa.containsKey(letra)) {
                qnt = mapa.get(letra);
                mapa.put(letra, qnt + 1);
            } else if (letra != ' ' && !mapa.containsKey(letra)){
                mapa.put(letra, 1);
            }
        }

        for (Character value : mapa.keySet()) {
            System.out.println(value + ": " + mapa.get(value));
        }

        input.close();
    }
}
