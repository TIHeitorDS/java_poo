package Xclassroom.jogoDeDama;

public class Tabuleiro {
    private char[][] tabela;

    public Tabuleiro() {
        tabela = new char[8][8];

        // inicializando o array 2D
        for (int i = 0; i < tabela.length; i++) {
            for (int j = 0; j < tabela[i].length; j++) {
                tabela[i][j] = '.';
            }
        }

        // time preto ('0')
        for (int i = 0; i <= 2; i++) {
            for (int j = 1 - i % 2; j < tabela.length; j+=2) {
                tabela[i][j] = 'o';
            }
        }

        // time branco ('x')
        for (int i = 5; i <= 7; i++) {
            for (int j = 1 - i % 2; j < tabela.length; j+=2) {
                tabela[i][j] = 'x';
            }
        }
    }

    public String toString() {
        String res = "";
        for (char[] cs : tabela) { // percorrendo as linhas
            for (char c : cs) { // percorrendo as colunas
                res += c;
                res+="\t";
            }
            res += '\n';
        }
        return res;
    }
}