// Desenhando um arco-íris com arcos e um array de cores
package extras.drawRainbowGUI;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawRainbow extends JPanel {
    private final static Color VIOLET = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75, 0, 138);

    // cores utilizadas no arco-íris
    private Color[] colors = {
            Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED
    };

    // construtor
    public DrawRainbow() {
        setBackground(Color.WHITE); // configura o fundo como branco
    }

    // desenha o arco-íris
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int radius = 20;

        // desenha o arco-íris perto da parte central inferior
        int centerX = getWidth() / 2;
        int centerY = getHeight() - 10;

        for (int counter = colors.length; counter > 0; counter--) {
            g.setColor(colors[counter - 1]);

            g.fillArc(centerX - counter * radius, centerY - counter * radius, counter * radius * 2, counter * radius * 2, 0, 180);
        }
    }
}
